#!/bin/sh

# configure syncthing via cli

# If syncthing is bound to localhost address, it will reject all requests where Host http header is not localhost
# Since we're using nginx as a reverse-proxy, we want the Host header to be the machine's FQDN. Disable this check.
# see: https://docs.syncthing.net/users/config.html#config-option-gui.insecureskiphostcheck
# and: https://docs.syncthing.net/users/faq.html#why-do-i-get-host-check-error-in-the-gui-api
syncthing cli config gui insecure-skip-host-check true
