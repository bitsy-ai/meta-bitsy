#
# Writes build/version information to /etc/issue
# Based on issue_txt.bbclass
#
# Copyright (C) 2022 Bitsy AI Labs
# Author: Leigh Johnson <leigh@bitsy.ai>
#
# Copyright (C) 2014 Intel Corporation
# Author: Alejandro Enedino Hernandez Samaniego <alejandro.hernandez@intel.com>
#
# Licensed under the MIT license, see COPYING.MIT for details
#
# Usage: add INHERIT += "issue-txt" to your conf file
#

# Desired variables to display 
# BUILD_ID ??= "${@time.strftime('%Y-%m-%dT%H:%M:%S',time.localtime())}"

ISSUE_TXT_VARS ?= "\    
    IMAGE_NAME DISTRO_PRETTY \
    VARIANT_NAME VARIANT_ID \
    DISTRO DISTRO_NAME DISTRO_VERSION DISTRO_CODENAME ID_LIKE \
    HOME_URL BUG_REPORT_URL \
    YOCTO_VERSION YOCTO_CODENAME \
    MACHINE TUNE_PKGARCH \
"

# Desired location of the output file in the image.
ISSUE_TXT_FILE ??= "${IMAGE_ROOTFS}${sysconfdir}/issue"

# From buildhistory.bbclass
def image_issue_txt_outputvars(vars, d):
    vars = vars.split()
    ret = ""
    for var in vars:
        value = d.getVar(var) or ""
        if (d.getVarFlag(var, 'type') == "list"):
            value = oe.utils.squashspaces(value)
        ret += "%s = %s\n" % (var, value)
    return ret.rstrip('\n')

# Gets git branch's status (clean or dirty)
def get_layer_git_status(path):
    import subprocess
    try:
        subprocess.check_output("""cd %s; export PSEUDO_UNLOAD=1; set -e;
                                git diff --quiet --no-ext-diff
                                git diff --quiet --no-ext-diff --cached""" % path,
                                shell=True,
                                stderr=subprocess.STDOUT)
        return ""
    except subprocess.CalledProcessError as ex:
        # Silently treat errors as "modified", without checking for the
        # (expected) return code 1 in a modified git repo. For example, we get
        # output and a 129 return code when a layer isn't a git repo at all.
        return "-- modified"

# Returns layer revisions along with their respective status
def get_layer_revs(d):
    revisions = oe.buildcfg.get_layer_revisions(d)
    medadata_revs = ["%-17s = %s:%s%s" % (r[1], r[2], r[3], r[4]) for r in revisions]
    return '\n'.join(medadata_revs)
    
def issue_txt_target(d):
        # Get context
        if d.getVar('BB_WORKERCONTEXT') != '1':
                return ""
        # Single and list variables to be read
        vars = (d.getVar("ISSUE_TXT_VARS") or "")
        return image_issue_txt_outputvars(vars, d)

# Write build information to target filesystem
python issue_txt () {
    if not d.getVar('ISSUE_TXT_FILE'):
        return
    with open(d.expand('${ISSUE_TXT_FILE}'), 'w') as build:
        build.writelines((
            '''-----------------------
Build Info:  |
-----------------------
''',
            issue_txt_target(d),
            '''
-----------------------
Layer Revisions:      |
-----------------------
''',
            get_layer_revs(d),
            '''
'''
       ))
}

ROOTFS_POSTPROCESS_COMMAND += "issue_txt;"
