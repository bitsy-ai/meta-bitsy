SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/pyo3/maturin"
AUTHOR = "Konstin konstin@mailbox.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license-mit;md5=85fd3b67069cff784d98ebfc7d5c0797"

SRC_URI[sha256sum] = "4650aeaa8debd004b55aae7afb75248cbd4d61cd7da2dcf4ead8b22b58cecae0"
inherit pypi python_setuptools3_rust cargo-update-recipe-crates

PYPI_PACKAGE = "maturin"
BBCLASSEXTEND = "native nativesdk"

SRC_URI += " \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/bstr/1.5.0 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/bytesize/1.2.0 \
    crate://crates.io/bzip2-sys/0.1.11+1.0.8 \
    crate://crates.io/bzip2/0.4.4 \
    crate://crates.io/cab/0.4.1 \
    crate://crates.io/camino/1.1.4 \
    crate://crates.io/cargo-config2/0.1.7 \
    crate://crates.io/cargo-options/0.6.0 \
    crate://crates.io/cargo-platform/0.1.2 \
    crate://crates.io/cargo-xwin/0.14.3 \
    crate://crates.io/cargo-zigbuild/0.16.10 \
    crate://crates.io/cargo_metadata/0.15.4 \
    crate://crates.io/cbindgen/0.24.5 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfb/0.7.3 \
    crate://crates.io/cfg-expr/0.15.2 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/charset/0.1.3 \
    crate://crates.io/chumsky/0.9.2 \
    crate://crates.io/clap/4.1.14 \
    crate://crates.io/clap_builder/4.1.14 \
    crate://crates.io/clap_complete/4.2.3 \
    crate://crates.io/clap_complete_command/0.5.1 \
    crate://crates.io/clap_complete_fig/4.2.0 \
    crate://crates.io/clap_complete_nushell/0.1.11 \
    crate://crates.io/clap_derive/4.1.14 \
    crate://crates.io/clap_lex/0.4.1 \
    crate://crates.io/cli-table/0.4.7 \
    crate://crates.io/concolor-query/0.1.0 \
    crate://crates.io/concolor/0.0.11 \
    crate://crates.io/configparser/3.0.2 \
    crate://crates.io/console/0.15.5 \
    crate://crates.io/content_inspector/0.2.4 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.14 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctor/0.1.26 \
    crate://crates.io/data-encoding/2.4.0 \
    crate://crates.io/dialoguer/0.10.4 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/dunce/1.0.4 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fat-macho/0.4.6 \
    crate://crates.io/filetime/0.2.21 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.2.0 \
    crate://crates.io/fs-err/2.9.0 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.10 \
    crate://crates.io/goblin/0.6.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/home/0.5.4 \
    crate://crates.io/humantime-serde/1.1.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/idna/0.4.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indicatif/0.17.5 \
    crate://crates.io/indoc/2.0.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/is-terminal/0.4.7 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/js-sys/0.3.63 \
    crate://crates.io/keyring/2.0.3 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lddtree/0.3.2 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/linux-keyutils/0.2.3 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.18 \
    crate://crates.io/lzxd/0.1.4 \
    crate://crates.io/mailparse/0.13.8 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.8.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/minijinja/0.34.0 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/msi/0.5.1 \
    crate://crates.io/multipart/0.18.0 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/normpath/1.1.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/111.26.0+1.1.1u \
    crate://crates.io/openssl-sys/0.9.88 \
    crate://crates.io/openssl/0.10.54 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/os_pipe/1.1.4 \
    crate://crates.io/output_vt100/0.1.3 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.6 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pep440_rs/0.3.6 \
    crate://crates.io/pep508_rs/0.2.1 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/platform-info/2.0.1 \
    crate://crates.io/portable-atomic/1.3.3 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty_assertions/1.3.0 \
    crate://crates.io/proc-macro2/1.0.60 \
    crate://crates.io/psm/0.1.21 \
    crate://crates.io/pyproject-toml/0.6.1 \
    crate://crates.io/python-pkginfo/0.5.5 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/quoted_printable/0.4.8 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex/1.7.3 \
    crate://crates.io/rfc2047-decoder/0.2.2 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.19 \
    crate://crates.io/rustls-pemfile/1.0.2 \
    crate://crates.io/rustls/0.20.8 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scroll/0.11.0 \
    crate://crates.io/scroll_derive/0.11.0 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/security-framework-sys/2.9.0 \
    crate://crates.io/security-framework/2.9.1 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_spanned/0.6.2 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shell-escape/0.1.5 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/similar/2.2.1 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/smawk/0.3.1 \
    crate://crates.io/snapbox-macros/0.3.4 \
    crate://crates.io/snapbox/0.4.4 \
    crate://crates.io/socks/0.3.4 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/stacker/0.1.15 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/tar/0.4.38 \
    crate://crates.io/target-lexicon/0.12.7 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/terminal_size/0.2.6 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.8 \
    crate://crates.io/time/0.3.20 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.7.4 \
    crate://crates.io/toml_datetime/0.6.2 \
    crate://crates.io/toml_edit/0.19.10 \
    crate://crates.io/tracing-attributes/0.1.24 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-serde/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.17 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/trycmd/0.14.11 \
    crate://crates.io/twox-hash/1.6.3 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-linebreak/0.1.4 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/2.6.2 \
    crate://crates.io/url/2.4.0 \
    crate://crates.io/uuid/1.3.3 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/versions/4.1.0 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.86 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.86 \
    crate://crates.io/wasm-bindgen-macro/0.2.86 \
    crate://crates.io/wasm-bindgen-shared/0.2.86 \
    crate://crates.io/wasm-bindgen/0.2.86 \
    crate://crates.io/web-sys/0.3.63 \
    crate://crates.io/webpki-roots/0.22.6 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/wild/2.1.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winnow/0.4.6 \
    crate://crates.io/xattr/0.2.3 \
    crate://crates.io/xwin/0.2.12 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zeroize/1.6.0 \
    crate://crates.io/zip/0.6.6 \
"

SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.7.6.sha256sum] = "fcb51a0695d8f838b1ee009b3fbf66bda078cd64590202a864a8f3e8c4315c47"
SRC_URI[aho-corasick-0.7.20.sha256sum] = "cc936419f96fa211c1b9166887b38e5e40b19958e5b895be7c1f93adec7071ac"
SRC_URI[anyhow-1.0.71.sha256sum] = "9c7d0618f0e0b7e8ff11427422b64564d5fb0be1940354bfe2e0529b18a9d9b8"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[base64-0.21.2.sha256sum] = "604178f6c5c21f02dc555784810edfb88d34ac2c73b2eae109655649ee73ce3d"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[bstr-1.5.0.sha256sum] = "a246e68bb43f6cd9db24bea052a53e40405417c5fb372e3d1a8a7f770a564ef5"
SRC_URI[bumpalo-3.13.0.sha256sum] = "a3e2c3daef883ecc1b5d58c15adae93470a91d425f3532ba1695849656af3fc1"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[bytes-1.4.0.sha256sum] = "89b2fd2a0dcf38d7971e2194b6b6eebab45ae01067456a7fd93d5547a61b70be"
SRC_URI[bytesize-1.2.0.sha256sum] = "38fcc2979eff34a4b84e1cf9a1e3da42a7d44b3b690a40cdcb23e3d556cfb2e5"
SRC_URI[bzip2-sys-0.1.11+1.0.8.sha256sum] = "736a955f3fa7875102d57c82b8cac37ec45224a07fd32d58f9f7a186b6cd4cdc"
SRC_URI[bzip2-0.4.4.sha256sum] = "bdb116a6ef3f6c3698828873ad02c3014b3c85cadb88496095628e3ef1e347f8"
SRC_URI[cab-0.4.1.sha256sum] = "ae6b4de23c7d39c0631fd3cc952d87951c86c75a13812d7247cb7a896e7b3551"
SRC_URI[camino-1.1.4.sha256sum] = "c530edf18f37068ac2d977409ed5cd50d53d73bc653c7647b48eb78976ac9ae2"
SRC_URI[cargo-config2-0.1.7.sha256sum] = "7ee1e7a7c5bc8f3389f125fb3da214c86d8e21c2b7259923079e0142ac47ffe4"
SRC_URI[cargo-options-0.6.0.sha256sum] = "9b8e8daa6b2b84aa7cccd57317d9a9b36d969d75bb95923471f4eabbd36f2955"
SRC_URI[cargo-platform-0.1.2.sha256sum] = "cbdb825da8a5df079a43676dbe042702f1707b1109f713a01420fbb4cc71fa27"
SRC_URI[cargo-xwin-0.14.3.sha256sum] = "83f8f065d99c285700e2ea8a10cb7971f59a48c8ec058d2ec2f71ab3f8d692df"
SRC_URI[cargo-zigbuild-0.16.10.sha256sum] = "065d664a006cb0ede5f2ea22a40e71209c68bdd19a5d6a93d546acb1051a703f"
SRC_URI[cargo_metadata-0.15.4.sha256sum] = "eee4243f1f26fc7a42710e7439c149e2b10b05472f88090acce52632f231a73a"
SRC_URI[cbindgen-0.24.5.sha256sum] = "4b922faaf31122819ec80c4047cc684c6979a087366c069611e33649bf98e18d"
SRC_URI[cc-1.0.79.sha256sum] = "50d30906286121d95be3d479533b458f87493b30a4b5f79a607db8f5d11aa91f"
SRC_URI[cfb-0.7.3.sha256sum] = "d38f2da7a0a2c4ccf0065be06397cc26a81f4e528be095826eee9d4adbb8c60f"
SRC_URI[cfg-expr-0.15.2.sha256sum] = "e70d3ad08698a0568b0562f22710fe6bfc1f4a61a367c77d0398c562eadd453a"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[charset-0.1.3.sha256sum] = "18e9079d1a12a2cc2bffb5db039c43661836ead4082120d5844f02555aca2d46"
SRC_URI[chumsky-0.9.2.sha256sum] = "23170228b96236b5a7299057ac284a321457700bc8c41a4476052f0f4ba5349d"
SRC_URI[clap-4.1.14.sha256sum] = "906f7fe1da4185b7a282b2bc90172a496f9def1aca4545fe7526810741591e14"
SRC_URI[clap_builder-4.1.14.sha256sum] = "351f9ad9688141ed83dfd8f5fb998a06225ef444b48ff4dc43de6d409b7fd10b"
SRC_URI[clap_complete-4.2.3.sha256sum] = "1594fe2312ec4abf402076e407628f5c313e54c32ade058521df4ee34ecac8a8"
SRC_URI[clap_complete_command-0.5.1.sha256sum] = "183495371ea78d4c9ff638bfc6497d46fed2396e4f9c50aebc1278a4a9919a3d"
SRC_URI[clap_complete_fig-4.2.0.sha256sum] = "f3af28956330989baa428ed4d3471b853715d445c62de21b67292e22cf8a41fa"
SRC_URI[clap_complete_nushell-0.1.11.sha256sum] = "5d02bc8b1a18ee47c4d2eec3fb5ac034dc68ebea6125b1509e9ccdffcddce66e"
SRC_URI[clap_derive-4.1.14.sha256sum] = "81d7dc0031c3a59a04fc2ba395c8e2dd463cba1859275f065d225f6122221b45"
SRC_URI[clap_lex-0.4.1.sha256sum] = "8a2dd5a6fe8c6e3502f568a6353e5273bbb15193ad9a89e457b9970798efbea1"
SRC_URI[cli-table-0.4.7.sha256sum] = "adfbb116d9e2c4be7011360d0c0bee565712c11e969c9609b25b619366dc379d"
SRC_URI[concolor-query-0.1.0.sha256sum] = "82a90734b3d5dcf656e7624cca6bce9c3a90ee11f900e80141a7427ccfb3d317"
SRC_URI[concolor-0.0.11.sha256sum] = "318d6c16e73b3a900eb212ad6a82fc7d298c5ab8184c7a9998646455bc474a16"
SRC_URI[configparser-3.0.2.sha256sum] = "5458d9d1a587efaf5091602c59d299696a3877a439c8f6d461a2d3cce11df87a"
SRC_URI[console-0.15.5.sha256sum] = "c3d79fbe8970a77e3e34151cc13d3b3e248aa0faaecb9f6091fa07ebefe5ad60"
SRC_URI[content_inspector-0.2.4.sha256sum] = "b7bda66e858c683005a53a9a60c69a4aca7eeaa45d124526e389f7aec8e62f38"
SRC_URI[core-foundation-sys-0.8.4.sha256sum] = "e496a50fda8aacccc86d7529e2c1e0892dbd0f898a6b5645b5561b89c3210efa"
SRC_URI[core-foundation-0.9.3.sha256sum] = "194a7a9e6de53fa55116934067c844d9d749312f75c6f6d0980e8c252f8c2146"
SRC_URI[cpufeatures-0.2.7.sha256sum] = "3e4c1eaa2012c47becbbad2ab175484c2a84d1185b566fb2cc5b8707343dfe58"
SRC_URI[crc32fast-1.3.2.sha256sum] = "b540bd8bc810d3885c6ea91e2018302f68baba2129ab3e88f32389ee9370880d"
SRC_URI[crossbeam-channel-0.5.8.sha256sum] = "a33c2bf77f2df06183c3aa30d1e96c0695a313d4f9c453cc3762a6db39f99200"
SRC_URI[crossbeam-deque-0.8.3.sha256sum] = "ce6fd6f855243022dcecf8702fef0c297d4338e226845fe067f6341ad9fa0cef"
SRC_URI[crossbeam-epoch-0.9.14.sha256sum] = "46bd5f3f85273295a9d14aedfb86f6aadbff6d8f5295c4a9edb08e819dcf5695"
SRC_URI[crossbeam-utils-0.8.15.sha256sum] = "3c063cd8cc95f5c377ed0d4b49a4b21f632396ff690e8470c29b3359b346984b"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[ctor-0.1.26.sha256sum] = "6d2301688392eb071b0bf1a37be05c469d3cc4dbbd95df672fe28ab021e6a096"
SRC_URI[data-encoding-2.4.0.sha256sum] = "c2e66c9d817f1720209181c316d28635c050fa304f9c79e47a520882661b7308"
SRC_URI[dialoguer-0.10.4.sha256sum] = "59c6f2989294b9a498d3ad5491a79c6deb604617378e1cdc4bfc1c1361fe2f87"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dunce-1.0.4.sha256sum] = "56ce8c6da7551ec6c462cbaf3bfbc75131ebbfa1c944aeaa9dab51ca1c5f0c3b"
SRC_URI[either-1.8.1.sha256sum] = "7fcaabb2fef8c910e7f4c7ce9f67a1283a1715879a7c230ca9d6d1ae31f16d91"
SRC_URI[encode_unicode-0.3.6.sha256sum] = "a357d28ed41a50f9c765dbfe56cbc04a64e53e5fc58ba79fbc34c10ef3df831f"
SRC_URI[encoding_rs-0.8.32.sha256sum] = "071a31f4ee85403370b58aca746f01041ede6f0da2730960ad001edc2b71b394"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[errno-0.3.1.sha256sum] = "4bcfec3a70f97c962c307b2d2c56e358cf1d00b558d74262b5f929ee8cc7e73a"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[fat-macho-0.4.6.sha256sum] = "67f07131a2b944c2b42b6a58104600ef049c11df5454478d2b44ff5dfe58d149"
SRC_URI[filetime-0.2.21.sha256sum] = "5cbc844cecaee9d4443931972e1289c8ff485cb4cc2767cb03ca139ed6885153"
SRC_URI[flate2-1.0.26.sha256sum] = "3b9429470923de8e8cbd4d2dc513535400b4b3fef0319fb5c4e1f520a7bef743"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[form_urlencoded-1.2.0.sha256sum] = "a62bc1cf6f830c2ec14a513a9fb124d0a213a629668a4186f329db21fe045652"
SRC_URI[fs-err-2.9.0.sha256sum] = "0845fa252299212f0389d64ba26f34fa32cfe41588355f21ed507c59a0f64541"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.10.sha256sum] = "be4136b2a15dd319360be1c07d9933517ccf0be8f16bf62a3bee4f0d618df427"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[globset-0.4.10.sha256sum] = "029d74589adefde59de1a0c4f4732695c32805624aec7b68d91503d4dba79afc"
SRC_URI[goblin-0.6.1.sha256sum] = "0d6b4de4a8eb6c46a8c77e1d3be942cb9a8bf073c22374578e5ba4b08ed0ff68"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.2.6.sha256sum] = "ee512640fe35acbfb4bb779db6f0d80704c2cacfa2e39b601ef3e3f47d1ae4c7"
SRC_URI[hermit-abi-0.3.1.sha256sum] = "fed44880c466736ef9a5c5b5facefb5ed0785676d0c02d612db14e54f0d84286"
SRC_URI[home-0.5.4.sha256sum] = "747309b4b440c06d57b0b25f2aee03ee9b5e5397d288c60e21fc709bb98a7408"
SRC_URI[humantime-serde-1.1.1.sha256sum] = "57a3db5ea5923d99402c94e9feb261dc5ee9b4efa158b0315f788cf549cc200c"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[idna-0.4.0.sha256sum] = "7d20d6b07bfbc108882d88ed8e37d39636dcc260e15e30c45e6ba089610b917c"
SRC_URI[ignore-0.4.20.sha256sum] = "dbe7873dab538a9a44ad79ede1faf5f30d49f9a5c883ddbab48bce81b64b7492"
SRC_URI[indexmap-1.9.3.sha256sum] = "bd070e393353796e801d209ad339e89596eb4c8d430d18ede6a1cced8fafbd99"
SRC_URI[indicatif-0.17.5.sha256sum] = "8ff8cc23a7393a397ed1d7f56e6365cba772aba9f9912ab968b03043c395d057"
SRC_URI[indoc-2.0.1.sha256sum] = "9f2cb48b81b1dc9f39676bf99f5499babfec7cd8fe14307f7b3d747208fb5690"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[is-terminal-0.4.7.sha256sum] = "adcf93614601c8129ddf72e2d5633df827ba6551541c6d8c59520a371475be1f"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itoa-1.0.6.sha256sum] = "453ad9f582a441959e5f0d088b02ce04cfe8d51a8eaf077f12ac6d3e94164ca6"
SRC_URI[js-sys-0.3.63.sha256sum] = "2f37a4a5928311ac501dee68b3c7613a1037d0edb30c8e5427bd832d55d1b790"
SRC_URI[keyring-2.0.3.sha256sum] = "e319fe0cb5b29a55cdb228df3f651b6c8cdc5b19520f3e62c8f111dc2582026c"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lddtree-0.3.2.sha256sum] = "7580a02d700ecc9e06c72b7aace6e74427a56a69310f18fdd420a5fac3832969"
SRC_URI[libc-0.2.146.sha256sum] = "f92be4933c13fd498862a9e02a3055f8a8d9c039ce33db97306fd5a6caa7f29b"
SRC_URI[linux-keyutils-0.2.3.sha256sum] = "3f27bb67f6dd1d0bb5ab582868e4f65052e58da6401188a08f0da09cf512b84b"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[lock_api-0.4.9.sha256sum] = "435011366fe56583b16cf956f9df0095b405b82d76425bc8981c0e22e60ec4df"
SRC_URI[log-0.4.18.sha256sum] = "518ef76f2f87365916b142844c16d8fefd85039bc5699050210a7778ee1cd1de"
SRC_URI[lzxd-0.1.4.sha256sum] = "784462f20dddd9dfdb45de963fa4ad4a288cb10a7889ac5d2c34fb6481c6b213"
SRC_URI[mailparse-0.13.8.sha256sum] = "8cae768a50835557749599277fc59f7c728118724eb34185e8feb633ef266a32"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memoffset-0.8.0.sha256sum] = "d61c719bcfbcf5d62b3a09efa6088de8c54bc0bfcd3ea7ae39fcc186108b8de1"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[mime_guess-2.0.4.sha256sum] = "4192263c238a5f0d0c6bfd21f336a313a4ce1c450542449ca191bb657b4642ef"
SRC_URI[minijinja-0.34.0.sha256sum] = "75aa91cba87dcad6af3e53bc7adb9c99755eba2d49b6c5f10dbcc79d4727c1bd"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.7.1.sha256sum] = "e7810e0be55b428ada41041c41f32c9f1a42817901b4ccf45fa3d4b6561e74c7"
SRC_URI[msi-0.5.1.sha256sum] = "eaa7bfcd0ffc3b4dc4a555e5ada4d302b4b6b5ce8d6bc07a6ea703ea63aff149"
SRC_URI[multipart-0.18.0.sha256sum] = "00dec633863867f29cb39df64a397cdf4a6354708ddd7759f70c7fb51c5f9182"
SRC_URI[native-tls-0.2.11.sha256sum] = "07226173c32f2926027b63cce4bcd8076c3552846cbe7925f3aaffeac0a3b92e"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[normalize-line-endings-0.3.0.sha256sum] = "61807f77802ff30975e01f4f071c8ba10c022052f98b3294119f3e615d13e5be"
SRC_URI[normpath-1.1.1.sha256sum] = "ec60c60a693226186f5d6edf073232bfb6464ed97eb22cf3b01c1e8198fd97f5"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[num_cpus-1.15.0.sha256sum] = "0fac9e2da13b5eb447a6ce3d392f23a29d8694bff781bf03a16cd9ac8697593b"
SRC_URI[number_prefix-0.4.0.sha256sum] = "830b246a0e5f20af87141b25c173cd1b609bd7779a4617d6ec582abaf90870f3"
SRC_URI[once_cell-1.18.0.sha256sum] = "dd8b5dd2ae5ed71462c540258bedcb51965123ad7e7ccf4b9a8cafaa4a63576d"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.5.sha256sum] = "ff011a302c396a5197692431fc1948019154afc178baf7d8e37367442a4601cf"
SRC_URI[openssl-src-111.26.0+1.1.1u.sha256sum] = "efc62c9f12b22b8f5208c23a7200a442b2e5999f8bdf80233852122b5a4f6f37"
SRC_URI[openssl-sys-0.9.88.sha256sum] = "c2ce0f250f34a308dcfdbb351f511359857d4ed2134ba715a4eadd46e1ffd617"
SRC_URI[openssl-0.10.54.sha256sum] = "69b3f656a17a6cbc115b5c7a40c616947d213ba182135b014d6051b73ab6f019"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[os_pipe-1.1.4.sha256sum] = "0ae859aa07428ca9a929b936690f8b12dc5f11dd8c6992a18ca93919f28bc177"
SRC_URI[output_vt100-0.1.3.sha256sum] = "628223faebab4e3e40667ee0b2336d34a5b960ff60ea743ddfdbcf7770bcfb66"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking_lot-0.12.1.sha256sum] = "3742b2c103b9f06bc9fff0a37ff4912935851bee6d36f3c02bcc755bcfec228f"
SRC_URI[parking_lot_core-0.9.6.sha256sum] = "ba1ef8814b5c993410bb3adfad7a5ed269563e4a2f90c41f5d85be7fb47133bf"
SRC_URI[path-slash-0.2.1.sha256sum] = "1e91099d4268b0e11973f036e885d652fb0b21fedcf69738c627f94db6a44f42"
SRC_URI[pep440_rs-0.3.6.sha256sum] = "3d6f6ead185985925c7e2b5ddb57ed5ef9d95835bf3994a5ce74403653898ab6"
SRC_URI[pep508_rs-0.2.1.sha256sum] = "c0713d7bb861ca2b7d4c50a38e1f31a4b63a2e2df35ef1e5855cc29e108453e2"
SRC_URI[percent-encoding-2.3.0.sha256sum] = "9b2a4787296e9989611394c33f193f676704af1686e70b8f8033ab5ba9a35a94"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pkg-config-0.3.27.sha256sum] = "26072860ba924cbfa98ea39c8c19b4dd6a4a25423dbdf219c1eca91aa0cf6964"
SRC_URI[plain-0.2.3.sha256sum] = "b4596b6d070b27117e987119b4dac604f3c58cfb0b191112e24771b2faeac1a6"
SRC_URI[platform-info-2.0.1.sha256sum] = "827dc4f7a81331d48c8abf11b5ac18673b390d33e9632327e286d940289aefab"
SRC_URI[portable-atomic-1.3.3.sha256sum] = "767eb9f07d4a5ebcb39bbf2d452058a93c011373abf6832e24194a1c3f004794"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[pretty_assertions-1.3.0.sha256sum] = "a25e9bcb20aa780fd0bb16b72403a9064d6b3f22f026946029acb941a50af755"
SRC_URI[proc-macro2-1.0.60.sha256sum] = "dec2b086b7a862cf4de201096214fa870344cf922b2b30c167badb3af3195406"
SRC_URI[psm-0.1.21.sha256sum] = "5787f7cda34e3033a72192c018bc5883100330f362ef279a8cbccfce8bb4e874"
SRC_URI[pyproject-toml-0.6.1.sha256sum] = "ee79feaa9d31e1c417e34219e610b67db4e786ce9b49d77dda549640abb9dc5f"
SRC_URI[python-pkginfo-0.5.5.sha256sum] = "0b8cf2d8981a1c967eebacac69c68a54d9786c1b84b813841d0aab2994705608"
SRC_URI[quote-1.0.28.sha256sum] = "1b9ab9c7eadfd8df19006f1cf1a4aed13540ed5cbc047010ece5826e10825488"
SRC_URI[quoted_printable-0.4.8.sha256sum] = "5a3866219251662ec3b26fc217e3e05bf9c4f84325234dfb96bf0bf840889e49"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rayon-core-1.11.0.sha256sum] = "4b8f95bd6966f5c87776639160a66bd8ab9895d9d4ab01ddba9fc60661aebe8d"
SRC_URI[rayon-1.7.0.sha256sum] = "1d2df5196e37bcc87abebc0053e20787d73847bb33134a69841207dd0a47f03b"
SRC_URI[redox_syscall-0.2.16.sha256sum] = "fb5a58c1855b4b6819d59012155603f0b22ad30cad752600aadfcb695265519a"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[redox_users-0.4.3.sha256sum] = "b033d837a7cf162d7993aded9304e30a83213c648b6e389db233191f891e5c2b"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[regex-1.7.3.sha256sum] = "8b1f693b24f6ac912f4893ef08244d70b6067480d2f1a46e950c9691e6749d1d"
SRC_URI[rfc2047-decoder-0.2.2.sha256sum] = "61fc4b4e52897c3e30b12b7e9b04461215b647fbe66f6def60dd8edbce14ec2e"
SRC_URI[ring-0.16.20.sha256sum] = "3053cf52e236a3ed746dfc745aa9cacf1b791d846bdaf412f60a8d7d6e17c8fc"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.37.19.sha256sum] = "acf8729d8542766f1b2cf77eb034d52f40d375bb8b615d0b147089946e16613d"
SRC_URI[rustls-pemfile-1.0.2.sha256sum] = "d194b56d58803a43635bdc398cd17e383d6f71f9182b9a192c127ca42494a59b"
SRC_URI[rustls-0.20.8.sha256sum] = "fff78fc74d175294f4e83b28343315ffcfb114b156f0185e9741cb5570f50e2f"
SRC_URI[rustversion-1.0.12.sha256sum] = "4f3208ce4d8448b3f3e7d168a73f5e0c43a61e32930de3bceeccedb388b6bf06"
SRC_URI[ryu-1.0.13.sha256sum] = "f91339c0467de62360649f8d3e185ca8de4224ff281f66000de5eb2a77a79041"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schannel-0.1.21.sha256sum] = "713cfb06c7059f3588fb8044c0fad1d09e3c01d225e25b9220dbfdcf16dbb1b3"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[scroll-0.11.0.sha256sum] = "04c565b551bafbef4157586fa379538366e4385d42082f255bfd96e4fe8519da"
SRC_URI[scroll_derive-0.11.0.sha256sum] = "bdbda6ac5cd1321e724fa9cee216f3a61885889b896f073b8f82322789c5250e"
SRC_URI[sct-0.7.0.sha256sum] = "d53dcdb7c9f8158937a7981b48accfd39a43af418591a5d008c7b22b5e1b7ca4"
SRC_URI[security-framework-sys-2.9.0.sha256sum] = "f51d0c0d83bec45f16480d0ce0058397a69e48fcdc52d1dc8855fb68acbd31a7"
SRC_URI[security-framework-2.9.1.sha256sum] = "1fc758eb7bffce5b308734e9b0c1468893cae9ff70ebf13e7090be8dcbcc83a8"
SRC_URI[semver-1.0.17.sha256sum] = "bebd363326d05ec3e2f532ab7660680f3b02130d780c299bca73469d521bc0ed"
SRC_URI[serde-1.0.164.sha256sum] = "9e8c8cf938e98f769bc164923b06dce91cea1751522f46f8466461af04c9027d"
SRC_URI[serde_derive-1.0.164.sha256sum] = "d9735b638ccc51c28bf6914d90a2e9725b377144fc612c49a611fddd1b631d68"
SRC_URI[serde_json-1.0.96.sha256sum] = "057d394a50403bcac12672b2b18fb387ab6d289d957dab67dd201875391e52f1"
SRC_URI[serde_spanned-0.6.2.sha256sum] = "93107647184f6027e3b7dcb2e11034cf95ffa1e3a682c67951963ac69c1c007d"
SRC_URI[sha2-0.10.6.sha256sum] = "82e6b795fe2e3b1e845bafcb27aa35405c4d47cdfc92af5fc8d3002f76cebdc0"
SRC_URI[sharded-slab-0.1.4.sha256sum] = "900fba806f70c630b0a382d0d825e17a0f19fcd059a2ade1ff237bcddf446b31"
SRC_URI[shell-escape-0.1.5.sha256sum] = "45bb67a18fa91266cc7807181f62f9178a6873bfad7dc788c42e6430db40184f"
SRC_URI[shell-words-1.1.0.sha256sum] = "24188a676b6ae68c3b2cb3a01be17fbf7240ce009799bb56d5b1409051e78fde"
SRC_URI[shlex-1.1.0.sha256sum] = "43b2853a4d09f215c24cc5489c992ce46052d359b5109343cbafbf26bc62f8a3"
SRC_URI[similar-2.2.1.sha256sum] = "420acb44afdae038210c99e69aae24109f32f15500aa708e81d46c9f29d55fcf"
SRC_URI[smallvec-1.10.0.sha256sum] = "a507befe795404456341dfab10cef66ead4c041f62b8b11bbb92bffe5d0953e0"
SRC_URI[smawk-0.3.1.sha256sum] = "f67ad224767faa3c7d8b6d91985b78e70a1324408abcb1cfcc2be4c06bc06043"
SRC_URI[snapbox-macros-0.3.4.sha256sum] = "eaaf09df9f0eeae82be96290918520214530e738a7fe5a351b0f24cf77c0ca31"
SRC_URI[snapbox-0.4.4.sha256sum] = "34eced5a65e76d5a00047986a83c65f80dc666faa27b5138f331659e2ca6bcf5"
SRC_URI[socks-0.3.4.sha256sum] = "f0c3dbbd9ae980613c6dd8e28a9407b50509d3803b57624d5dfe8315218cd58b"
SRC_URI[spin-0.5.2.sha256sum] = "6e63cff320ae2c57904679ba7cb63280a3dc4613885beafb148ee7bf9aa9042d"
SRC_URI[stacker-0.1.15.sha256sum] = "c886bd4480155fd3ef527d45e9ac8dd7118a898a46530b7b94c3e21866259fce"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.18.sha256sum] = "32d41677bcbe24c20c52e7c70b0d8db04134c5d1066bf98662e2871ad200ea3e"
SRC_URI[tar-0.4.38.sha256sum] = "4b55807c0344e1e6c04d7c965f5289c39a8d94ae23ed5c0b57aabac549f871c6"
SRC_URI[target-lexicon-0.12.7.sha256sum] = "fd1ba337640d60c3e96bc6f0638a939b9c9a7f2c316a1598c279828b3d1dc8c5"
SRC_URI[tempfile-3.6.0.sha256sum] = "31c0432476357e58790aaa47a8efb0c5138f137343f3b5f23bd36a27e3b0a6d6"
SRC_URI[termcolor-1.2.0.sha256sum] = "be55cf8942feac5c765c2c993422806843c9a9a45d4d5c407ad6dd2ea95eb9b6"
SRC_URI[terminal_size-0.2.6.sha256sum] = "8e6bf6f19e9f8ed8d4048dc22981458ebcf406d67e94cd422e5ecd73d63b3237"
SRC_URI[textwrap-0.16.0.sha256sum] = "222a222a5bfe1bba4a77b45ec488a741b3cb8872e5e499451fd7d0129c9c7c3d"
SRC_URI[thiserror-impl-1.0.40.sha256sum] = "f9456a42c5b0d803c8cd86e73dd7cc9edd429499f37a3550d286d5e86720569f"
SRC_URI[thiserror-1.0.40.sha256sum] = "978c9a314bd8dc99be594bc3c175faaa9794be04a5a5e153caba6915336cebac"
SRC_URI[thread_local-1.1.7.sha256sum] = "3fdd6f064ccff2d6567adcb3873ca630700f00b5ad3f060c25b5dcfd9a4ce152"
SRC_URI[time-core-0.1.0.sha256sum] = "2e153e1f1acaef8acc537e68b44906d2db6436e2b35ac2c6b42640fff91f00fd"
SRC_URI[time-macros-0.2.8.sha256sum] = "fd80a657e71da814b8e5d60d3374fc6d35045062245d80224748ae522dd76f36"
SRC_URI[time-0.3.20.sha256sum] = "cd0cbfecb4d19b5ea75bb31ad904eb5b9fa13f21079c3b92017ebdf4999a5890"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml-0.7.4.sha256sum] = "d6135d499e69981f9ff0ef2167955a5333c35e36f6937d382974566b3d5b94ec"
SRC_URI[toml_datetime-0.6.2.sha256sum] = "5a76a9312f5ba4c2dec6b9161fdf25d87ad8a09256ccea5a556fef03c706a10f"
SRC_URI[toml_edit-0.19.10.sha256sum] = "2380d56e8670370eee6566b0bfd4265f65b3f432e8c6d85623f728d4fa31f739"
SRC_URI[tracing-attributes-0.1.24.sha256sum] = "0f57e3ca2a01450b1a921183a9c9cbfda207fd822cef4ccb00a65402cbba7a74"
SRC_URI[tracing-core-0.1.31.sha256sum] = "0955b8137a1df6f1a2e9a37d8a6656291ff0297c1a97c24e0d8425fe2312f79a"
SRC_URI[tracing-log-0.1.3.sha256sum] = "78ddad33d2d10b1ed7eb9d1f518a5674713876e97e5bb9b7345a7984fbb4f922"
SRC_URI[tracing-serde-0.1.3.sha256sum] = "bc6b213177105856957181934e4920de57730fc69bf42c37ee5bb664d406d9e1"
SRC_URI[tracing-subscriber-0.3.17.sha256sum] = "30a651bc37f915e81f087d86e62a18eec5f79550c7faff886f7090b4ea757c77"
SRC_URI[tracing-0.1.37.sha256sum] = "8ce8c33a8d48bd45d624a6e523445fd21ec13d3653cd51f681abf67418f54eb8"
SRC_URI[trycmd-0.14.11.sha256sum] = "522dcafb4bf113bcf83e4f47a0499ea1f6798877439e6a0e96cf087a2abe97dc"
SRC_URI[twox-hash-1.6.3.sha256sum] = "97fee6b57c6a41524a810daee9286c02d7752c4253064d0b05472833a438f675"
SRC_URI[typenum-1.16.0.sha256sum] = "497961ef93d974e23eb6f433eb5fe1b7930b659f06d12dec6fc44a8f554c0bba"
SRC_URI[unicase-2.6.0.sha256sum] = "50f37be617794602aabbeee0be4f259dc1778fabe05e2d67ee8f79326d5cb4f6"
SRC_URI[unicode-bidi-0.3.13.sha256sum] = "92888ba5573ff080736b3648696b70cafad7d250551175acbaa4e0385b3e1460"
SRC_URI[unicode-ident-1.0.9.sha256sum] = "b15811caf2415fb889178633e7724bad2509101cde276048e013b9def5e51fa0"
SRC_URI[unicode-linebreak-0.1.4.sha256sum] = "c5faade31a542b8b35855fff6e8def199853b2da8da256da52f52f1316ee3137"
SRC_URI[unicode-normalization-0.1.22.sha256sum] = "5c5713f0fc4b5db668a2ac63cdb7bb4469d8c9fed047b1d0292cc7b0ce2ba921"
SRC_URI[unicode-width-0.1.10.sha256sum] = "c0edd1e5b14653f783770bce4a4dabb4a5108a5370a5f5d8cfe8710c361f6c8b"
SRC_URI[untrusted-0.7.1.sha256sum] = "a156c684c91ea7d62626509bce3cb4e1d9ed5c4d978f7b4352658f96a4c26b4a"
SRC_URI[ureq-2.6.2.sha256sum] = "338b31dd1314f68f3aabf3ed57ab922df95ffcd902476ca7ba3c4ce7b908c46d"
SRC_URI[url-2.4.0.sha256sum] = "50bff7831e19200a85b17131d085c25d7811bc4e186efdaf54bbd132994a88cb"
SRC_URI[uuid-1.3.3.sha256sum] = "345444e32442451b267fc254ae85a209c64be56d2890e601a0c37ff0c3c5ecd2"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[versions-4.1.0.sha256sum] = "ee97e1d97bd593fb513912a07691b742361b3dd64ad56f2c694ea2dbfe0665d3"
SRC_URI[wait-timeout-0.2.0.sha256sum] = "9f200f5b12eb75f8c1ed65abd4b2db8a6e1b138a20de009dacee265a2498f3f6"
SRC_URI[walkdir-2.3.3.sha256sum] = "36df944cda56c7d8d8b7496af378e6b16de9284591917d307c9b4d313c44e698"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-backend-0.2.86.sha256sum] = "19b04bc93f9d6bdee709f6bd2118f57dd6679cf1176a1af464fca3ab0d66d8fb"
SRC_URI[wasm-bindgen-macro-support-0.2.86.sha256sum] = "e128beba882dd1eb6200e1dc92ae6c5dbaa4311aa7bb211ca035779e5efc39f8"
SRC_URI[wasm-bindgen-macro-0.2.86.sha256sum] = "14d6b024f1a526bb0234f52840389927257beb670610081360e5a03c5df9c258"
SRC_URI[wasm-bindgen-shared-0.2.86.sha256sum] = "ed9d5b4305409d1fc9482fee2d7f9bcbf24b3972bf59817ef757e23982242a93"
SRC_URI[wasm-bindgen-0.2.86.sha256sum] = "5bba0e8cb82ba49ff4e229459ff22a191bbe9a1cb3a341610c9c33efc27ddf73"
SRC_URI[web-sys-0.3.63.sha256sum] = "3bdd9ef4e984da1187bf8110c5cf5b845fbc87a23602cdf912386a76fcd3a7c2"
SRC_URI[webpki-roots-0.22.6.sha256sum] = "b6c71e40d7d2c34a5106301fb632274ca37242cd0c9d3e64dbece371a40a2d87"
SRC_URI[webpki-0.22.0.sha256sum] = "f095d78192e208183081cc07bc5515ef55216397af48b873e5edcd72637fa1bd"
SRC_URI[which-4.4.0.sha256sum] = "2441c784c52b289a054b7201fc93253e288f094e2f4be9058343127c4226a269"
SRC_URI[wild-2.1.0.sha256sum] = "05b116685a6be0c52f5a103334cbff26db643826c7b3735fc0a3ba9871310a74"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.42.0.sha256sum] = "5a3e1820f08b8513f676f7ab6c1f99ff312fb97b553d30ff4dd86f9f15728aa7"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.48.0.sha256sum] = "7b1eb6f0cd7c80c79759c929114ef071b87354ce476d9d94271031c0497adfd5"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_gnullvm-0.48.0.sha256sum] = "91ae572e1b79dba883e0d315474df7305d12f569b400fcf90581b06062f7e1bc"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_aarch64_msvc-0.48.0.sha256sum] = "b2ef27e0d7bdfcfc7b868b317c1d32c641a6fe4629c171b8928c7b08d98d7cf3"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_gnu-0.48.0.sha256sum] = "622a1962a7db830d6fd0a69683c80a18fda201879f0f447f065a3b7467daa241"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_i686_msvc-0.48.0.sha256sum] = "4542c6e364ce21bf45d69fdd2a8e455fa38d316158cfd43b3ac1c5b1b19f8e00"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnu-0.48.0.sha256sum] = "ca2b8a661f7628cbd23440e50b05d705db3686f894fc9580820623656af974b1"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_gnullvm-0.48.0.sha256sum] = "7896dbc1f41e08872e9d5e8f8baa8fdd2677f29468c4e156210174edc7f7b953"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"
SRC_URI[windows_x86_64_msvc-0.48.0.sha256sum] = "1a515f5799fe4961cb532f983ce2b23082366b898e52ffbce459c86f67c8378a"
SRC_URI[winnow-0.4.6.sha256sum] = "61de7bac303dc551fe038e2b3cef0f571087a47571ea6e79a87692ac99b99699"
SRC_URI[xattr-0.2.3.sha256sum] = "6d1526bbe5aaeb5eb06885f4d987bcdfa5e23187055de9b83fe00156a821fabc"
SRC_URI[xwin-0.2.12.sha256sum] = "1f5f72397389fd26dd36b01f23e19c0608db8e764f7bb65fdc5b1e7e2aa02550"
SRC_URI[yansi-0.5.1.sha256sum] = "09041cd90cf85f7f8b2df60c646f853b7f535ce68f85244eb6731cf89fa498ec"
SRC_URI[zeroize-1.6.0.sha256sum] = "2a0956f1ba7c7909bfb66c2e9e4124ab6f6482560f6628b5aaeba39207c9aad9"
SRC_URI[zip-0.6.6.sha256sum] = "760394e246e4c28189f19d488c058bf16f564016aefac5d32bb1f3b51d5e9261"
