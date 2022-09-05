SYNCTHING_USER = "printnanny"
SYSTEMD_SERVICE:${PN} = "\
    syncthing-resume.service \
    syncthing@${SYNCTHING_USER}.service \
"
SYSTEMD_AUTO_ENABLE = "enable"
