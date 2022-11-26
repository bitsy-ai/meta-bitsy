# meta-bitsy

The **meta-bitsy project** provides *recipes* for building [Embedded Linux](https://elinux.org) distributions with the [OpenEmbedded](https://www.openembedded.org) and [Yocto Project](https://www.yoctoproject.org/) frameworks.

Bitsy distros are designed for computer vision and machine learning applications.

## Building

`build.sh` is provided as a wrapper around the various components used to build
an image. It uses Docker to manage these components, and so requires that the
`docker` command be installed on your system.

### Manual Process

```sh
# Install prerequisities

sudo apt-get update
sudo apt-get -y install git cpio git python3-full binutils bzip2 chrpath \
                        build-essential diffstat file gawk lz4 zstd wget \
                        locales vim tini

# ensure en_US.UTF-8 locale is generated

grep -q '^en_US.UTF-8 UTF-8' || echo 'en_US.UTF-8 UTF-8' | sudo tee -a /etc/locale.gen

# Obtain the langdale branch of poky
git clone -b langdale git://git.yoctoproject.org/poky poky
cd poky

# Obtain other dependencies
git clone             https://github.com/agherzan/meta-raspberrypi.git
git clone -b langdale https://github.com/openembedded/meta-openembedded.git
git clone             https://github.com/nnstreamer/meta-neural-network.git
git clone             https://github.com/sbabic/meta-swupdate.git
git clone             https://github.com/schnitzeltony/meta-microcontroller.git

# Obtain meta-bitsy
git clone             https://github.com/bitsy-ai/meta-bitsy.git

# Populate bblayers.conf
mkdir -p build/conf
cat > build/conf/bblayers.conf <<EOF
  POKY_BBLAYERS_CONF_VERSION = "2"

  BBPATH = "\${TOPDIR}"
  BBFILES ?= ""

  BBLAYERS ?= " \
    /poky/meta \
    /poky/meta-poky \
    /poky/meta-yocto-bsp \
    /poky/meta-raspberrypi \
    /poky/meta-openembedded/meta-oe \
    /poky/meta-openembedded/meta-python \
    /poky/meta-openembedded/meta-multimedia \
    /poky/meta-bitsy \
    /poky/meta-neural-network \
    /poky/meta-bitsy/meta-printnanny \
    /poky/meta-openembedded/meta-networking \
    /poky/meta-openembedded/meta-filesystems \
    /poky/meta-openembedded/meta-initramfs \
    /poky/meta-openembedded/meta-webserver \
    /poky/meta-swupdate \
    /poky/meta-microcontroller \
  "
EOF

# populate locale.conf
cat > build/conf/local.conf <<EOF
  BUILDCFG_VARS = "VARIANT_NAME VARIANT_ID BB_VERSION BUILD_SYS NATIVELSBSTRING TARGET_SYS MACHINE DISTRO DISTRO_VERSION TUNE_FEATURES TARGET_FPU"
  DISTRO = "printnanny"
  IMAGE_FSTYPES = "tar.gz ext4 ext4.gz ext4 wic wic.gz wic.bmap"
  MACHINE ?= "raspberrypi4-64"
  RUST_VERSION ?= "1.64"
  PATCHRESOLVE = "noop"

  BB_DISKMON_DIRS ??= "\
      STOPTASKS,\${TMPDIR},1G,100K \
      STOPTASKS,\${DL_DIR},1G,100K \
      STOPTASKS,\${SSTATE_DIR},1G,100K \
      STOPTASKS,/tmp,100M,100K \
      HALT,\${TMPDIR},100M,1K \
      HALT,\${DL_DIR},100M,1K \
      HALT,\${SSTATE_DIR},100M,1K \
      HALT,/tmp,10M,1K"

  CONF_VERSION = "2"
EOF

# run the build
source oe-init-build-env ./build
bitbake printnanny-release-image
```

### Supported Yocto Project Releases

<table>
<tr><th>Release branch <a href="https://wiki.yoctoproject.org/wiki/Releases" target="none" title="What is this?">(?)</a></th><th>Layer integrity check <a href="https://www.yoctoproject.org/docs/2.5/dev-manual/dev-manual.html#making-sure-your-layer-is-compatible-with-yocto-project" target="none" title="What is this?">(?)</a></th></tr>
<tr><td>honister 3.4.x</td><td>🚧</td></tr>
<tr><td>kirkland 4.0.x</td><td>🚧</td></tr>

</table>

## Layer dependencies
This layer depends on:

* URI: git://git.yoctoproject.org/poky
    ** branch: honister-3.4.3
* URI: git://git.yoctoproject.org/meta-yocto
    ** branch: honister-3.4.3
* URI: git://github.com/openembedded/meta-openembedded
    ** branch: honister
    ** layers: meta-oe, meta-python, meta-multimedia
* URI: git://github.com/bitsyai/meta-neural-network
    ** branch: honister
    ** ORIG: git:://github.com/nnstreamer/meta-neural-network
* URI: git://git.yoctoproject.org/meta-tensorflow


### [recipes-multimedia/janus-gateway/README.md](meta-bitsy/recipes-multimedia/janus-gateway/README.md)

Recipe to build [Janus WebRTC Gateway](https://github.com/meetecho/janus-gateway) 


## Patches

Please open a Github Issue to discuss a patch prior to submission.


## Maintainers

* Leigh Johnson, Bitsy AI Labs <leigh@bitsy.ai>
