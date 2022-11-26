FROM ubuntu:22.04

RUN rm -f /etc/apt/apt.conf.d/docker-clean; echo 'Binary::apt::APT::Keep-Downloaded-Packages "true";' > /etc/apt/apt.conf.d/keep-cache

RUN --mount=type=cache,target=/var/cache/apt \
    --mount=type=cache,target=/var/lib/apt/lists \
    apt-get update

RUN --mount=type=cache,target=/var/cache/apt \
    --mount=type=cache,target=/var/lib/apt/lists \
    apt-get -y install git

RUN useradd -d /work --no-create-home --system yocto; \
    mkdir /poky; \
    chown yocto /poky
WORKDIR /poky

USER yocto
RUN git clone -b langdale git://git.yoctoproject.org/poky /poky

USER root
RUN --mount=type=cache,target=/var/cache/apt \
    --mount=type=cache,target=/var/lib/apt/lists \
    DEBIAN_FRONTEND=noninteractive \
    apt-get -y install cpio git python3-full binutils bzip2 chrpath \
                       build-essential diffstat file gawk lz4 zstd wget \
                       locales vim tini

RUN echo en_US.UTF-8 UTF-8 > /etc/locale.gen; locale-gen

USER yocto
RUN git clone             https://github.com/agherzan/meta-raspberrypi.git          /poky/meta-raspberrypi
RUN git clone -b langdale https://github.com/openembedded/meta-openembedded         /poky/meta-openembedded
RUN git clone             https://github.com/nnstreamer/meta-neural-network.git     /poky/meta-neural-network
RUN git clone             https://github.com/sbabic/meta-swupdate.git               /poky/meta-swupdate
RUN git clone             https://github.com/schnitzeltony/meta-microcontroller.git /poky/meta-microcontroller

COPY .git                 /poky/meta-bitsy/.git
COPY classes              /poky/meta-bitsy/classes
COPY conf                 /poky/meta-bitsy/conf
COPY meta-printnanny      /poky/meta-bitsy/meta-printnanny
COPY recipes-connectivity /poky/meta-bitsy/recipes-connectivity
COPY recipes-core         /poky/meta-bitsy/recipes-core
COPY recipes-extended     /poky/meta-bitsy/recipes-extended
COPY recipes-multimedia   /poky/meta-bitsy/recipes-extended

COPY docker/bblayers.conf docker/local.conf /poky/build/conf/

USER root
RUN chown -R yocto /poky/meta-bitsy /poky/build

COPY docker/entrypoint.sh /

USER yocto
RUN /entrypoint.sh -p
ENTRYPOINT [ "tini", "--", "/entrypoint.sh" ]
