do_deploy:append(){
    echo "bootcode_delay=2" >> $CONFIG
    echo "max_framebuffers=2" >> $CONFIG
}
