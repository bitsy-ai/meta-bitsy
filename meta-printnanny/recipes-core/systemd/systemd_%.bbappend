FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG = " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'acl audit efi ldconfig pam selinux smack usrmerge polkit seccomp', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'rfkill', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xkbcommon', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', '', 'link-udev-shared', d)} \
    backlight \
    binfmt \
    gshadow \
    hibernate \
    hostnamed \
    idn \
    ima \
    kmod \
    localed \
    logind \
    machined \
    myhostname \
    networkd \
    nss \
    nss-mymachines \
    nss-resolve \
    quotacheck \
    randomseed \
    resolved \
    set-time-epoch \
    sysusers \
    sysvinit \
    timedated \
    timesyncd \
    userdb \
    utmp \
    vconsole \
    wheel-group \
    zstd \
    openssl \
    firstboot \
"


SRC_URI += "\
    file://050-wait-for-network-override.conf \
"

do_install:append(){
    install -d "${D}${sysconfdir}/systemd/system/systemd-networkd-wait-online.service.d/"
    install -m 0644 "${WORKDIR}/050-wait-for-network-override.conf" "${D}${sysconfdir}/systemd/system/systemd-networkd-wait-online.service.d/050-override.conf"
}
