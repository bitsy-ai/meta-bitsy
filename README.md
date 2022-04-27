# meta-bitsy

The **meta-bitsy project** provides *recipes* for building [Embedded Linux](https://elinux.org) distributions with the [OpenEmbedded](https://www.openembedded.org) and [Yocto Project](https://www.yoctoproject.org/) frameworks.

Bitsy distros are designed for computer vision and machine learning applications.

### Supported Yocto Project Releases

<table>
<tr><th>Release branch <a href="https://wiki.yoctoproject.org/wiki/Releases" target="none" title="What is this?">(?)</a></th><th>Layer integrity check <a href="https://www.yoctoproject.org/docs/2.5/dev-manual/dev-manual.html#making-sure-your-layer-is-compatible-with-yocto-project" target="none" title="What is this?">(?)</a></th></tr>
<tr><td>honister 3.4.x</td><td>🚧</td></tr>
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
