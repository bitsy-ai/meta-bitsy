# rely on camera_auto_detect=1 to load correct camera dtoverlay (imx219, imx477, imx708)
do_deploy:append(){\
    echo "arm_boost=1" >> $CONFIG
    echo "force_turbo=1" >> $CONFIG
    echo "arm_64bit=1" >> $CONFIG
    echo "max_framebuffers=2" >> $CONFIG
    echo "hdmi_force_hotplug=1" >> $CONFIG
    echo "camera_auto_detect=1" >> $CONFIG
    echo "display_auto_detect=1" >> $CONFIG
}
