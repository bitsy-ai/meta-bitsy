# meta-bitsy

The **meta-octoprint** project provides *recipes* for building [Embedded Linux](https://elinux.org) distributions with [OctoPrint](https://octoprint.org/) pre-installed using the [OpenEmbedded](https://www.openembedded.org) and [Yocto Project](https://www.yoctoproject.org/) frameworks.


### Supported Yocto Project Releases

<table>
<tr><th>Release branch <a href="https://wiki.yoctoproject.org/wiki/Releases" target="none" title="What is this?">(?)</a></th><th>Layer integrity check <a href="https://www.yoctoproject.org/docs/2.5/dev-manual/dev-manual.html#making-sure-your-layer-is-compatible-with-yocto-project" target="none" title="What is this?">(?)</a></th></tr>
<tr><td>honister 3.4.x</td><td>🚧</td></tr>
</table>

## Layer dependencies
This layer depends on:

* URI: git://git.yoctoproject.org/poky
    ** branch: dunfell
* URI: git://git.yoctoproject.org/meta-yocto
    ** branch: dunfell
* URI: git://github.com/openembedded/meta-openembedded
    ** branch: dunfell
    ** layers: meta-oe, meta-python

## Patches

Please open a Github Issue to discuss a patch prior to submission.


## Maintainers

* Leigh Johnson, Bitsy AI Labs <leigh@bitsy.ai>
