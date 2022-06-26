
BITSY_TEMPLATE_EXT ?= ".tmpl"
BITSY_TEMPLATE_FILES ?= ""
BITSY_TEMPLATE_ARGS ?= ""

python do_templates() {
    def outfile(infile):
        return infile.replace(d.getVar("BITSY_TEMPLATE_EXT"), '')

    def tmpl(infile, args):
        with open(oe.path.join(d.getVar('WORKDIR'), infile), 'r') as f:
            template = f.read()
        with open(oe.path.join(d.getVar('WORKDIR'), outfile(infile)), 'w+') as f:
            f.write(template.format(**args))
    def args_to_dict():
        return {k: d.getVar(k) for k in d.getVar("BITSY_TEMPLATE_ARGS").strip().split()}

    for t in d.getVar("BITSY_TEMPLATE_FILES").strip().split():
        tmpl(t, args_to_dict())
}

addtask templates before do_install
