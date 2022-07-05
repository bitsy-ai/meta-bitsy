GPU_MEM = "128"
GPU_MEM_256 = "64"
GPU_MEM_512 = "128"
GPU_MEM_1024 = "256"

do_deploy:append(){
    echo "bootcode_delay=2" >> $CONFIG
    echo "max_framebuffers=2" >> $CONFIG
    echo "hdmi_force_hotplug=1" >> $CONFIG
}
