# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get printnanny-nats-apps could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/printnanny-nats-apps/0.33.1"
SRC_URI = "git://git@github.com/bitsy-ai/printnanny-rs.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=26bc145b58bd4e5d617276478377373f \
"

SRC_URI += " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/ahash/0.8.3 \
    crate://crates.io/aho-corasick/1.0.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anstyle/1.0.0 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/array-init-cursor/0.2.0 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/arrow-buffer/23.0.0 \
    crate://crates.io/arrow-format/0.7.0 \
    crate://crates.io/arrow/23.0.0 \
    crate://crates.io/arrow2/0.14.2 \
    crate://crates.io/assert_cmd/2.0.11 \
    crate://crates.io/async-broadcast/0.5.1 \
    crate://crates.io/async-channel/1.8.0 \
    crate://crates.io/async-compression/0.3.15 \
    crate://crates.io/async-executor/1.5.1 \
    crate://crates.io/async-fs/1.6.0 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.7.0 \
    crate://crates.io/async-nats/0.26.0 \
    crate://crates.io/async-process/1.7.0 \
    crate://crates.io/async-recursion/1.0.4 \
    crate://crates.io/async-stream-impl/0.3.5 \
    crate://crates.io/async-stream/0.3.5 \
    crate://crates.io/async-task/4.4.0 \
    crate://crates.io/async-tempfile/0.2.0 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/atomic-waker/1.1.1 \
    crate://crates.io/atomic/0.5.1 \
    crate://crates.io/atomic_refcell/0.1.10 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/base64-url/1.4.13 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.0 \
    crate://crates.io/base64ct/1.1.1 \
    crate://crates.io/bigdecimal/0.3.0 \
    crate://crates.io/binascii/0.1.4 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.2.1 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/blocking/1.3.1 \
    crate://crates.io/bstr/1.4.0 \
    crate://crates.io/bumpalo/3.12.1 \
    crate://crates.io/byte-slice-cast/1.2.2 \
    crate://crates.io/bytemuck/1.13.1 \
    crate://crates.io/bytemuck_derive/1.4.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfb/0.7.3 \
    crate://crates.io/cfg-expr/0.15.1 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.24 \
    crate://crates.io/clap/3.2.25 \
    crate://crates.io/clap_derive/3.2.25 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/comfy-table/5.0.1 \
    crate://crates.io/concurrent-queue/2.2.0 \
    crate://crates.io/config/0.11.0 \
    crate://crates.io/console/0.14.1 \
    crate://crates.io/const-oid/0.6.2 \
    crate://crates.io/const-random-macro/0.1.15 \
    crate://crates.io/const-random/0.1.15 \
    crate://crates.io/cookie/0.17.0 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.14 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/crossterm/0.23.2 \
    crate://crates.io/crossterm_winapi/0.9.0 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/csv-core/0.1.10 \
    crate://crates.io/csv/1.2.1 \
    crate://crates.io/curve25519-dalek/3.2.0 \
    crate://crates.io/cxx-build/1.0.94 \
    crate://crates.io/cxx/1.0.94 \
    crate://crates.io/cxxbridge-flags/1.0.94 \
    crate://crates.io/cxxbridge-macro/1.0.94 \
    crate://crates.io/data-encoding/2.3.3 \
    crate://crates.io/der/0.4.5 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/derive_more/0.99.17 \
    crate://crates.io/devise/0.4.1 \
    crate://crates.io/devise_codegen/0.4.1 \
    crate://crates.io/devise_core/0.4.1 \
    crate://crates.io/dialoguer/0.8.0 \
    crate://crates.io/diesel/2.0.4 \
    crate://crates.io/diesel_derives/2.0.2 \
    crate://crates.io/diesel_migrations/2.0.0 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/doc-comment/0.3.3 \
    crate://crates.io/downcast/0.10.0 \
    crate://crates.io/dyn-clone/1.0.11 \
    crate://crates.io/ed25519-dalek/1.0.1 \
    crate://crates.io/ed25519/1.5.3 \
    crate://crates.io/educe/0.4.22 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/enum-ordinalize/3.1.12 \
    crate://crates.io/enumflags2/0.7.7 \
    crate://crates.io/enumflags2_derive/0.7.7 \
    crate://crates.io/env_logger/0.9.3 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/ethnum/1.3.2 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fallible-streaming-iterator/0.1.9 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/figment/0.10.8 \
    crate://crates.io/file-lock/2.1.9 \
    crate://crates.io/flatbuffers/2.1.2 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/float-cmp/0.8.0 \
    crate://crates.io/float-cmp/0.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign_vec/0.1.0 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/fragile/1.2.2 \
    crate://crates.io/fragile/2.0.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/function_name-proc-macro/0.2.3 \
    crate://crates.io/function_name/0.2.3 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/fxhash/0.2.1 \
    crate://crates.io/generator/0.7.4 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.9 \
    crate://crates.io/gimli/0.27.2 \
    crate://crates.io/gio-sys/0.16.3 \
    crate://crates.io/git-version-macro/0.3.5 \
    crate://crates.io/git-version/0.3.5 \
    crate://crates.io/git2/0.15.0 \
    crate://crates.io/glib-macros/0.16.8 \
    crate://crates.io/glib-sys/0.16.3 \
    crate://crates.io/glib/0.16.7 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.16.3 \
    crate://crates.io/gst-plugin-version-helper/0.7.5 \
    crate://crates.io/gstreamer-app-sys/0.19.2 \
    crate://crates.io/gstreamer-app/0.19.6 \
    crate://crates.io/gstreamer-base-sys/0.19.3 \
    crate://crates.io/gstreamer-base/0.19.3 \
    crate://crates.io/gstreamer-check-sys/0.19.2 \
    crate://crates.io/gstreamer-check/0.19.2 \
    crate://crates.io/gstreamer-sys/0.19.4 \
    crate://crates.io/gstreamer-video-sys/0.19.5 \
    crate://crates.io/gstreamer-video/0.19.5 \
    crate://crates.io/gstreamer/0.19.8 \
    crate://crates.io/h2/0.3.18 \
    crate://crates.io/half/2.2.1 \
    crate://crates.io/halfbrown/0.1.18 \
    crate://crates.io/hash_hasher/2.0.3 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.13.2 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.26 \
    crate://crates.io/iana-time-zone-haiku/0.1.1 \
    crate://crates.io/iana-time-zone/0.1.56 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/infer/0.13.0 \
    crate://crates.io/inlinable_string/0.1.15 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.10 \
    crate://crates.io/ipnet/2.7.2 \
    crate://crates.io/ipnetwork/0.20.0 \
    crate://crates.io/is-terminal/0.4.7 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/jobserver/0.1.26 \
    crate://crates.io/js-sys/0.3.61 \
    crate://crates.io/json-deserializer/0.4.4 \
    crate://crates.io/json/0.12.4 \
    crate://crates.io/jsonwebtoken/7.2.0 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lexical-core/0.7.6 \
    crate://crates.io/lexical-core/0.8.5 \
    crate://crates.io/lexical-parse-float/0.8.5 \
    crate://crates.io/lexical-parse-integer/0.8.6 \
    crate://crates.io/lexical-util/0.8.5 \
    crate://crates.io/lexical-write-float/0.8.5 \
    crate://crates.io/lexical-write-integer/0.8.5 \
    crate://crates.io/lexical/6.1.1 \
    crate://crates.io/libc/0.2.142 \
    crate://crates.io/libgit2-sys/0.14.2+1.5.1 \
    crate://crates.io/libm/0.2.6 \
    crate://crates.io/libsqlite3-sys/0.26.0 \
    crate://crates.io/libssh2-sys/0.2.23 \
    crate://crates.io/libz-sys/1.1.9 \
    crate://crates.io/link-cplusplus/1.0.8 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.3.7 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/lz4-sys/1.9.4 \
    crate://crates.io/lz4/1.24.0 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matrixmultiply/0.3.7 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memmap2/0.5.10 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/memoffset/0.8.0 \
    crate://crates.io/migrations_internals/2.0.0 \
    crate://crates.io/migrations_macros/2.0.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/mime_serde_shim/0.2.2 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.6 \
    crate://crates.io/mockall/0.10.2 \
    crate://crates.io/mockall_derive/0.10.2 \
    crate://crates.io/muldiv/1.0.1 \
    crate://crates.io/multer/2.1.0 \
    crate://crates.io/multiversion-macros/0.6.1 \
    crate://crates.io/multiversion/0.6.1 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nats/0.23.1 \
    crate://crates.io/ndarray/0.15.6 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nkeys/0.2.0 \
    crate://crates.io/nom/5.1.3 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/ntapi/0.4.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/nuid/0.3.2 \
    crate://crates.io/num-bigint/0.2.6 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-complex/0.4.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num/0.4.0 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.3 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-sys/0.9.87 \
    crate://crates.io/openssl/0.10.52 \
    crate://crates.io/option-operations/0.5.0 \
    crate://crates.io/ordered-stream/0.2.0 \
    crate://crates.io/os_str_bytes/6.5.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking/2.1.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/pear/0.2.4 \
    crate://crates.io/pear_codegen/0.2.4 \
    crate://crates.io/pem-rfc7468/0.2.4 \
    crate://crates.io/pem/0.8.3 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-internal/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.12 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkcs8/0.7.6 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/planus/0.3.1 \
    crate://crates.io/polars-algo/0.24.3 \
    crate://crates.io/polars-arrow/0.24.4 \
    crate://crates.io/polars-core/0.24.3 \
    crate://crates.io/polars-io/0.24.3 \
    crate://crates.io/polars-lazy/0.24.3 \
    crate://crates.io/polars-ops/0.24.3 \
    crate://crates.io/polars-time/0.24.3 \
    crate://crates.io/polars-utils/0.24.4 \
    crate://crates.io/polars/0.24.3 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/predicates-core/1.0.6 \
    crate://crates.io/predicates-tree/1.0.9 \
    crate://crates.io/predicates/1.0.8 \
    crate://crates.io/predicates/2.1.5 \
    crate://crates.io/predicates/3.0.3 \
    crate://crates.io/pretty-hex/0.3.0 \
    crate://crates.io/printnanny-api-client/0.132.3 \
    crate://crates.io/printnanny-octoprint-models/0.1.9 \
    crate://crates.io/printnanny-os-models/0.1.1 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.20+deprecated \
    crate://crates.io/proc-macro2-diagnostics/0.10.0 \
    crate://crates.io/proc-macro2/1.0.56 \
    crate://crates.io/procfs/0.12.0 \
    crate://crates.io/quote/1.0.26 \
    crate://crates.io/r2d2/0.8.10 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_distr/0.4.3 \
    crate://crates.io/rawpointer/0.2.1 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/ref-cast-impl/1.0.16 \
    crate://crates.io/ref-cast/1.0.16 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.7.1 \
    crate://crates.io/regex/1.8.1 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.17 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rocket/0.5.0-rc.3 \
    crate://crates.io/rocket_codegen/0.5.0-rc.3 \
    crate://crates.io/rocket_http/0.5.0-rc.3 \
    crate://crates.io/rust-ini/0.13.0 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.19 \
    crate://crates.io/rustls-native-certs/0.5.0 \
    crate://crates.io/rustls-native-certs/0.6.2 \
    crate://crates.io/rustls-pemfile/0.2.1 \
    crate://crates.io/rustls-pemfile/1.0.2 \
    crate://crates.io/rustls/0.19.1 \
    crate://crates.io/rustls/0.20.8 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scheduled-thread-pool/0.2.7 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scratch/1.0.5 \
    crate://crates.io/sct/0.6.1 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/security-framework-sys/2.8.0 \
    crate://crates.io/security-framework/2.8.2 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde-hjson/0.9.1 \
    crate://crates.io/serde-reflection/0.3.6 \
    crate://crates.io/serde/0.8.23 \
    crate://crates.io/serde/1.0.162 \
    crate://crates.io/serde_bytes/0.11.9 \
    crate://crates.io/serde_derive/1.0.162 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_nanos/0.1.3 \
    crate://crates.io/serde_repr/0.1.12 \
    crate://crates.io/serde_spanned/0.6.1 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_variant/0.1.2 \
    crate://crates.io/serde_yaml/0.9.21 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/signal-hook-mio/0.2.3 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/signal-hook/0.3.15 \
    crate://crates.io/signatory/0.23.2 \
    crate://crates.io/signature/1.6.4 \
    crate://crates.io/simd-json/0.6.0 \
    crate://crates.io/simdutf8/0.1.4 \
    crate://crates.io/simple_asn1/0.4.1 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/smartstring/1.0.1 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/spki/0.4.1 \
    crate://crates.io/stable-pattern/0.1.0 \
    crate://crates.io/state/0.5.3 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/streaming-iterator/0.1.9 \
    crate://crates.io/strength_reduce/0.2.4 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strum/0.23.0 \
    crate://crates.io/strum_macros/0.23.1 \
    crate://crates.io/subslice/0.2.3 \
    crate://crates.io/subtle/2.5.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.15 \
    crate://crates.io/sys-info/0.9.1 \
    crate://crates.io/sysinfo/0.26.9 \
    crate://crates.io/system-deps/6.0.5 \
    crate://crates.io/target-lexicon/0.12.7 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.5.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/terminal_size/0.1.17 \
    crate://crates.io/terminal_size/0.2.6 \
    crate://crates.io/termtree/0.4.1 \
    crate://crates.io/test-log/0.2.11 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.8 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time/0.3.20 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-native-tls/0.3.1 \
    crate://crates.io/tokio-retry/0.3.0 \
    crate://crates.io/tokio-rustls/0.22.0 \
    crate://crates.io/tokio-rustls/0.23.4 \
    crate://crates.io/tokio-serde/0.8.0 \
    crate://crates.io/tokio-stream/0.1.14 \
    crate://crates.io/tokio-tungstenite/0.18.0 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.28.0 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.7.3 \
    crate://crates.io/toml_datetime/0.6.1 \
    crate://crates.io/toml_edit/0.19.8 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.24 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.17 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/tungstenite/0.18.0 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/ubyte/0.10.3 \
    crate://crates.io/uds_windows/1.0.2 \
    crate://crates.io/uncased/0.9.7 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/unsafe-libyaml/0.2.8 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/uuid/1.3.2 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/value-trait/0.4.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/warp/0.3.5 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.84 \
    crate://crates.io/wasm-bindgen-futures/0.4.34 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.84 \
    crate://crates.io/wasm-bindgen-macro/0.2.84 \
    crate://crates.io/wasm-bindgen-shared/0.2.84 \
    crate://crates.io/wasm-bindgen/0.2.84 \
    crate://crates.io/wasm-streams/0.2.3 \
    crate://crates.io/web-sys/0.3.61 \
    crate://crates.io/webpki/0.21.4 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows/0.48.0 \
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
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/xdg-home/1.0.0 \
    crate://crates.io/yaml-rust/0.4.5 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zbus/3.12.0 \
    crate://crates.io/zbus_macros/3.12.0 \
    crate://crates.io/zbus_names/2.5.0 \
    crate://crates.io/zbus_systemd/0.0.8 \
    crate://crates.io/zeroize/1.6.0 \
    crate://crates.io/zeroize_derive/1.4.2 \
    crate://crates.io/zip/0.6.4 \
    crate://crates.io/zstd-safe/5.0.2+zstd.1.5.2 \
    crate://crates.io/zstd-sys/2.0.8+zstd.1.5.5 \
    crate://crates.io/zstd/0.11.2+zstd.1.5.2 \
    crate://crates.io/zvariant/3.12.0 \
    crate://crates.io/zvariant_derive/3.12.0 \
    crate://crates.io/zvariant_utils/1.0.0 \
"

SRC_URI[addr2line-0.19.0.sha256sum] = "a76fd60b23679b7d19bd066031410fb7e458ccc5e958eb5c325888ce4baedc97"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.7.6.sha256sum] = "fcb51a0695d8f838b1ee009b3fbf66bda078cd64590202a864a8f3e8c4315c47"
SRC_URI[ahash-0.8.3.sha256sum] = "2c99f64d1e06488f620f932677e24bc6e2897582980441ae90a671415bd7ec2f"
SRC_URI[aho-corasick-1.0.1.sha256sum] = "67fc08ce920c31afb70f013dcce1bfc3a3195de6a228474e45e1f145b36f8d04"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anstyle-1.0.0.sha256sum] = "41ed9a86bf92ae6580e0a31281f65a1b1d867c0cc68d5346e2ae128dddfa6a7d"
SRC_URI[anyhow-1.0.71.sha256sum] = "9c7d0618f0e0b7e8ff11427422b64564d5fb0be1940354bfe2e0529b18a9d9b8"
SRC_URI[array-init-cursor-0.2.0.sha256sum] = "bf7d0a018de4f6aa429b9d33d69edf69072b1c5b1cb8d3e4a5f7ef898fc3eb76"
SRC_URI[arrayvec-0.5.2.sha256sum] = "23b62fc65de8e4e7f52534fb52b0f3ed04746ae267519eef2a83941e8085068b"
SRC_URI[arrow-buffer-23.0.0.sha256sum] = "d290050c6e12a81a24ad08525cef2203c4156a6350f75508d49885d677e88ea9"
SRC_URI[arrow-format-0.7.0.sha256sum] = "8df5d25bc6d676271277120c41ef28760fe0a9f070677a58db621c0f983f9c20"
SRC_URI[arrow-23.0.0.sha256sum] = "fedc767fbaa36ea50f086215f54f1a007d22046fc4754b0448c657bcbe9f8413"
SRC_URI[arrow2-0.14.2.sha256sum] = "ee6f62e41078c967a4c063fcbdfd3801a2a9632276402c045311c4d73d0845f3"
SRC_URI[assert_cmd-2.0.11.sha256sum] = "86d6b683edf8d1119fe420a94f8a7e389239666aa72e65495d91c00462510151"
SRC_URI[async-broadcast-0.5.1.sha256sum] = "7c48ccdbf6ca6b121e0f586cbc0e73ae440e56c67c30fa0873b4e110d9c26d2b"
SRC_URI[async-channel-1.8.0.sha256sum] = "cf46fee83e5ccffc220104713af3292ff9bc7c64c7de289f66dae8e38d826833"
SRC_URI[async-compression-0.3.15.sha256sum] = "942c7cd7ae39e91bde4820d74132e9862e62c2f386c3aa90ccf55949f5bad63a"
SRC_URI[async-executor-1.5.1.sha256sum] = "6fa3dc5f2a8564f07759c008b9109dc0d39de92a88d5588b8a5036d286383afb"
SRC_URI[async-fs-1.6.0.sha256sum] = "279cf904654eeebfa37ac9bb1598880884924aab82e290aa65c9e77a0e142e06"
SRC_URI[async-io-1.13.0.sha256sum] = "0fc5b45d93ef0529756f812ca52e44c221b35341892d3dcc34132ac02f3dd2af"
SRC_URI[async-lock-2.7.0.sha256sum] = "fa24f727524730b077666307f2734b4a1a1c57acb79193127dcc8914d5242dd7"
SRC_URI[async-nats-0.26.0.sha256sum] = "0b0e90b3cd41350d89a242b981fb888f0eb8e3cb81c0fcb4563338f7e96a1084"
SRC_URI[async-process-1.7.0.sha256sum] = "7a9d28b1d97e08915212e2e45310d47854eafa69600756fc735fb788f75199c9"
SRC_URI[async-recursion-1.0.4.sha256sum] = "0e97ce7de6cf12de5d7226c73f5ba9811622f4db3a5b91b55c53e987e5f91cba"
SRC_URI[async-stream-impl-0.3.5.sha256sum] = "16e62a023e7c117e27523144c5d2459f4397fcc3cab0085af8e2224f643a0193"
SRC_URI[async-stream-0.3.5.sha256sum] = "cd56dd203fef61ac097dd65721a419ddccb106b2d2b70ba60a6b529f03961a51"
SRC_URI[async-task-4.4.0.sha256sum] = "ecc7ab41815b3c653ccd2978ec3255c81349336702dfdf62ee6f7069b12a3aae"
SRC_URI[async-tempfile-0.2.0.sha256sum] = "121280bd2055a6bfbc7ff5a14f700a38b2e127cb8b4066b7ef7320421600dff0"
SRC_URI[async-trait-0.1.68.sha256sum] = "b9ccdd8f2a161be9bd5c023df56f1b2a0bd1d83872ae53b71a84a12c9bf6e842"
SRC_URI[atomic-waker-1.1.1.sha256sum] = "1181e1e0d1fce796a03db1ae795d67167da795f9cf4a39c37589e85ef57f26d3"
SRC_URI[atomic-0.5.1.sha256sum] = "b88d82667eca772c4aa12f0f1348b3ae643424c8876448f3f7bd5787032e234c"
SRC_URI[atomic_refcell-0.1.10.sha256sum] = "79d6dc922a2792b006573f60b2648076355daeae5ce9cb59507e5908c9625d31"
SRC_URI[atty-0.2.14.sha256sum] = "d9b39be18770d11421cdb1b9947a45dd3f37e93092cbf377614828a319d5fee8"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[backtrace-0.3.67.sha256sum] = "233d376d6d185f2a3093e58f283f60f880315b6c60075b01f36b3b85154564ca"
SRC_URI[base64-url-1.4.13.sha256sum] = "67a99c239d0c7e77c85dddfa9cebce48704b3c49550fcd3b84dd637e4484899f"
SRC_URI[base64-0.12.3.sha256sum] = "3441f0f7b02788e948e47f457ca01f1d7e6d92c693bc132c22b087d3141c03ff"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[base64-0.21.0.sha256sum] = "a4a4ddaa51a5bc52a6948f74c06d20aaaddb71924eab79b8c97a8c556e942d6a"
SRC_URI[base64ct-1.1.1.sha256sum] = "e6b4d9b1225d28d360ec6a231d65af1fd99a2a095154c8040689617290569c5c"
SRC_URI[bigdecimal-0.3.0.sha256sum] = "6aaf33151a6429fe9211d1b276eafdf70cdff28b071e76c0b0e1503221ea3744"
SRC_URI[binascii-0.1.4.sha256sum] = "383d29d513d8764dcdc42ea295d979eb99c3c9f00607b3692cf68a431f7dca72"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.2.1.sha256sum] = "24a6904aef64d73cf10ab17ebace7befb918b82164785cb89907993be7f83813"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[block-buffer-0.9.0.sha256sum] = "4152116fd6e9dadb291ae18fc1ec3575ed6d84c29642d97890f4b4a3417297e4"
SRC_URI[blocking-1.3.1.sha256sum] = "77231a1c8f801696fc0123ec6150ce92cffb8e164a02afb9c8ddee0e9b65ad65"
SRC_URI[bstr-1.4.0.sha256sum] = "c3d4260bcc2e8fc9df1eac4919a720effeb63a3f0952f5bf4944adfa18897f09"
SRC_URI[bumpalo-3.12.1.sha256sum] = "9b1ce199063694f33ffb7dd4e0ee620741495c32833cde5aa08f02a0bf96f0c8"
SRC_URI[byte-slice-cast-1.2.2.sha256sum] = "c3ac9f8b63eca6fd385229b3675f6cc0dc5c8a5c8a54a59d4f52ffd670d87b0c"
SRC_URI[bytemuck-1.13.1.sha256sum] = "17febce684fd15d89027105661fec94afb475cb995fbc59d2865198446ba2eea"
SRC_URI[bytemuck_derive-1.4.1.sha256sum] = "fdde5c9cd29ebd706ce1b35600920a33550e402fc998a2e53ad3b42c3c47a192"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[bytes-1.4.0.sha256sum] = "89b2fd2a0dcf38d7971e2194b6b6eebab45ae01067456a7fd93d5547a61b70be"
SRC_URI[cc-1.0.79.sha256sum] = "50d30906286121d95be3d479533b458f87493b30a4b5f79a607db8f5d11aa91f"
SRC_URI[cfb-0.7.3.sha256sum] = "d38f2da7a0a2c4ccf0065be06397cc26a81f4e528be095826eee9d4adbb8c60f"
SRC_URI[cfg-expr-0.15.1.sha256sum] = "c8790cf1286da485c72cf5fc7aeba308438800036ec67d89425924c4807268c9"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.24.sha256sum] = "4e3c5919066adf22df73762e50cffcde3a758f2a848b113b586d1f86728b673b"
SRC_URI[clap-3.2.25.sha256sum] = "4ea181bf566f71cb9a5d17a59e1871af638180a18fb0035c92ae62b705207123"
SRC_URI[clap_derive-3.2.25.sha256sum] = "ae6371b8bdc8b7d3959e9cf7b22d4435ef3e79e138688421ec654acf8c81b008"
SRC_URI[clap_lex-0.2.4.sha256sum] = "2850f2f5a82cbf437dd5af4d49848fbdfc27c157c3d010345776f952765261c5"
SRC_URI[codespan-reporting-0.11.1.sha256sum] = "3538270d33cc669650c4b093848450d380def10c331d38c768e34cac80576e6e"
SRC_URI[comfy-table-5.0.1.sha256sum] = "b103d85ca6e209388771bfb7aa6b68a7aeec4afbf6f0a0264bfbf50360e5212e"
SRC_URI[concurrent-queue-2.2.0.sha256sum] = "62ec6771ecfa0762d24683ee5a32ad78487a3d3afdc0fb8cae19d2c5deb50b7c"
SRC_URI[config-0.11.0.sha256sum] = "1b1b9d958c2b1368a663f05538fc1b5975adce1e19f435acceae987aceeeb369"
SRC_URI[console-0.14.1.sha256sum] = "3993e6445baa160675931ec041a5e03ca84b9c6e32a056150d3aa2bdda0a1f45"
SRC_URI[const-oid-0.6.2.sha256sum] = "9d6f2aa4d0537bcc1c74df8755072bd31c1ef1a3a1b85a68e8404a8c353b7b8b"
SRC_URI[const-random-macro-0.1.15.sha256sum] = "9d7d6ab3c3a2282db210df5f02c4dab6e0a7057af0fb7ebd4070f30fe05c0ddb"
SRC_URI[const-random-0.1.15.sha256sum] = "368a7a772ead6ce7e1de82bfb04c485f3db8ec744f72925af5735e29a22cc18e"
SRC_URI[cookie-0.17.0.sha256sum] = "7efb37c3e1ccb1ff97164ad95ac1606e8ccd35b3fa0a7d99a304c7f4a428cc24"
SRC_URI[core-foundation-sys-0.8.4.sha256sum] = "e496a50fda8aacccc86d7529e2c1e0892dbd0f898a6b5645b5561b89c3210efa"
SRC_URI[core-foundation-0.9.3.sha256sum] = "194a7a9e6de53fa55116934067c844d9d749312f75c6f6d0980e8c252f8c2146"
SRC_URI[cpufeatures-0.2.7.sha256sum] = "3e4c1eaa2012c47becbbad2ab175484c2a84d1185b566fb2cc5b8707343dfe58"
SRC_URI[crc32fast-1.3.2.sha256sum] = "b540bd8bc810d3885c6ea91e2018302f68baba2129ab3e88f32389ee9370880d"
SRC_URI[crossbeam-channel-0.5.8.sha256sum] = "a33c2bf77f2df06183c3aa30d1e96c0695a313d4f9c453cc3762a6db39f99200"
SRC_URI[crossbeam-deque-0.8.3.sha256sum] = "ce6fd6f855243022dcecf8702fef0c297d4338e226845fe067f6341ad9fa0cef"
SRC_URI[crossbeam-epoch-0.9.14.sha256sum] = "46bd5f3f85273295a9d14aedfb86f6aadbff6d8f5295c4a9edb08e819dcf5695"
SRC_URI[crossbeam-utils-0.8.15.sha256sum] = "3c063cd8cc95f5c377ed0d4b49a4b21f632396ff690e8470c29b3359b346984b"
SRC_URI[crossterm-0.23.2.sha256sum] = "a2102ea4f781910f8a5b98dd061f4c2023f479ce7bb1236330099ceb5a93cf17"
SRC_URI[crossterm_winapi-0.9.0.sha256sum] = "2ae1b35a484aa10e07fe0638d02301c5ad24de82d310ccbd2f3693da5f09bf1c"
SRC_URI[crunchy-0.2.2.sha256sum] = "7a81dae078cea95a014a339291cec439d2f232ebe854a9d672b796c6afafa9b7"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[csv-core-0.1.10.sha256sum] = "2b2466559f260f48ad25fe6317b3c8dac77b5bdb5763ac7d9d6103530663bc90"
SRC_URI[csv-1.2.1.sha256sum] = "0b015497079b9a9d69c02ad25de6c0a6edef051ea6360a327d0bd05802ef64ad"
SRC_URI[curve25519-dalek-3.2.0.sha256sum] = "0b9fdf9972b2bd6af2d913799d9ebc165ea4d2e65878e329d9c6b372c4491b61"
SRC_URI[cxx-build-1.0.94.sha256sum] = "12cee708e8962df2aeb38f594aae5d827c022b6460ac71a7a3e2c3c2aae5a07b"
SRC_URI[cxx-1.0.94.sha256sum] = "f61f1b6389c3fe1c316bf8a4dccc90a38208354b330925bce1f74a6c4756eb93"
SRC_URI[cxxbridge-flags-1.0.94.sha256sum] = "7944172ae7e4068c533afbb984114a56c46e9ccddda550499caa222902c7f7bb"
SRC_URI[cxxbridge-macro-1.0.94.sha256sum] = "2345488264226bf682893e25de0769f3360aac9957980ec49361b083ddaa5bc5"
SRC_URI[data-encoding-2.3.3.sha256sum] = "23d8666cb01533c39dde32bcbab8e227b4ed6679b2c925eba05feabea39508fb"
SRC_URI[der-0.4.5.sha256sum] = "79b71cca7d95d7681a4b3b9cdf63c8dbc3730d0584c2c74e31416d64a90493f4"
SRC_URI[derivative-2.2.0.sha256sum] = "fcc3dd5e9e9c0b295d6e1e4d811fb6f157d5ffd784b8d202fc62eac8035a770b"
SRC_URI[derive_more-0.99.17.sha256sum] = "4fb810d30a7c1953f91334de7244731fc3f3c10d7fe163338a35b9f640960321"
SRC_URI[devise-0.4.1.sha256sum] = "d6eacefd3f541c66fc61433d65e54e0e46e0a029a819a7dbbc7a7b489e8a85f8"
SRC_URI[devise_codegen-0.4.1.sha256sum] = "9c8cf4b8dd484ede80fd5c547592c46c3745a617c8af278e2b72bea86b2dfed6"
SRC_URI[devise_core-0.4.1.sha256sum] = "35b50dba0afdca80b187392b24f2499a88c336d5a8493e4b4ccfb608708be56a"
SRC_URI[dialoguer-0.8.0.sha256sum] = "c9dd058f8b65922819fabb4a41e7d1964e56344042c26efbccd465202c23fa0c"
SRC_URI[diesel-2.0.4.sha256sum] = "72eb77396836a4505da85bae0712fa324b74acfe1876d7c2f7e694ef3d0ee373"
SRC_URI[diesel_derives-2.0.2.sha256sum] = "0ad74fdcf086be3d4fdd142f67937678fe60ed431c3b2f08599e7687269410c4"
SRC_URI[diesel_migrations-2.0.0.sha256sum] = "e9ae22beef5e9d6fab9225ddb073c1c6c1a7a6ded5019d5da11d1e5c5adc34e2"
SRC_URI[difference-2.0.0.sha256sum] = "524cbf6897b527295dff137cec09ecf3a05f4fddffd7dfcd1585403449e74198"
SRC_URI[difflib-0.4.0.sha256sum] = "6184e33543162437515c2e2b48714794e37845ec9851711914eec9d308f6ebe8"
SRC_URI[digest-0.10.6.sha256sum] = "8168378f4e5023e7218c89c891c0fd8ecdb5e5e4f18cb78f38cf245dd021e76f"
SRC_URI[digest-0.9.0.sha256sum] = "d3dd60d1080a57a05ab032377049e0591415d2b31afd7028356dbf3cc6dcb066"
SRC_URI[dirs-sys-0.3.7.sha256sum] = "1b1d1d91c932ef41c0f2663aa8b0ca0342d444d842c06914aa0a7e352d0bada6"
SRC_URI[dirs-4.0.0.sha256sum] = "ca3aa72a6f96ea37bbc5aa912f6788242832f75369bdfdadcb0e38423f100059"
SRC_URI[doc-comment-0.3.3.sha256sum] = "fea41bba32d969b513997752735605054bc0dfa92b4c56bf1189f2e174be7a10"
SRC_URI[downcast-0.10.0.sha256sum] = "4bb454f0228b18c7f4c3b0ebbee346ed9c52e7443b0999cd543ff3571205701d"
SRC_URI[dyn-clone-1.0.11.sha256sum] = "68b0cf012f1230e43cd00ebb729c6bb58707ecfa8ad08b52ef3a4ccd2697fc30"
SRC_URI[ed25519-dalek-1.0.1.sha256sum] = "c762bae6dcaf24c4c84667b8579785430908723d5c889f469d76a41d59cc7a9d"
SRC_URI[ed25519-1.5.3.sha256sum] = "91cff35c70bba8a626e3185d8cd48cc11b5437e1a5bcd15b9b5fa3c64b6dfee7"
SRC_URI[educe-0.4.22.sha256sum] = "079044df30bb07de7d846d41a184c4b00e66ebdac93ee459253474f3a47e50ae"
SRC_URI[either-1.8.1.sha256sum] = "7fcaabb2fef8c910e7f4c7ce9f67a1283a1715879a7c230ca9d6d1ae31f16d91"
SRC_URI[encode_unicode-0.3.6.sha256sum] = "a357d28ed41a50f9c765dbfe56cbc04a64e53e5fc58ba79fbc34c10ef3df831f"
SRC_URI[encoding_rs-0.8.32.sha256sum] = "071a31f4ee85403370b58aca746f01041ede6f0da2730960ad001edc2b71b394"
SRC_URI[enum-ordinalize-3.1.12.sha256sum] = "a62bb1df8b45ecb7ffa78dca1c17a438fb193eb083db0b1b494d2a61bcb5096a"
SRC_URI[enumflags2-0.7.7.sha256sum] = "c041f5090df68b32bcd905365fd51769c8b9d553fe87fde0b683534f10c01bd2"
SRC_URI[enumflags2_derive-0.7.7.sha256sum] = "5e9a1f9f7d83e59740248a6e14ecf93929ade55027844dfcea78beafccc15745"
SRC_URI[env_logger-0.9.3.sha256sum] = "a12e6657c4c97ebab115a42dcee77225f7f482cdd841cf7088c657a42e9e00e7"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[errno-0.3.1.sha256sum] = "4bcfec3a70f97c962c307b2d2c56e358cf1d00b558d74262b5f929ee8cc7e73a"
SRC_URI[ethnum-1.3.2.sha256sum] = "0198b9d0078e0f30dedc7acbb21c974e838fc8fae3ee170128658a98cb2c1c04"
SRC_URI[event-listener-2.5.3.sha256sum] = "0206175f82b8d6bf6652ff7d71a1e27fd2e4efde587fd368662814d6ec1d9ce0"
SRC_URI[fallible-streaming-iterator-0.1.9.sha256sum] = "7360491ce676a36bf9bb3c56c1aa791658183a54d2744120f27285738d90465a"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[figment-0.10.8.sha256sum] = "4e56602b469b2201400dec66a66aec5a9b8761ee97cd1b8c96ab2483fcc16cc9"
SRC_URI[file-lock-2.1.9.sha256sum] = "f59be9010c5418713a48aac4c1b897d85dafd958055683dc31bdae553536647b"
SRC_URI[flatbuffers-2.1.2.sha256sum] = "86b428b715fdbdd1c364b84573b5fdc0f84f8e423661b9f398735278bc7f2b6a"
SRC_URI[flate2-1.0.26.sha256sum] = "3b9429470923de8e8cbd4d2dc513535400b4b3fef0319fb5c4e1f520a7bef743"
SRC_URI[float-cmp-0.8.0.sha256sum] = "e1267f4ac4f343772758f7b1bdcbe767c218bbab93bb432acbf5162bbf85a6c4"
SRC_URI[float-cmp-0.9.0.sha256sum] = "98de4bbd547a563b716d8dfa9aad1cb19bfab00f4fa09a6a4ed21dbcf44ce9c4"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[foreign_vec-0.1.0.sha256sum] = "ee1b05cbd864bcaecbd3455d6d967862d446e4ebfc3c2e5e5b9841e53cba6673"
SRC_URI[form_urlencoded-1.1.0.sha256sum] = "a9c384f161156f5260c24a097c56119f9be8c798586aecc13afbcbe7b7e26bf8"
SRC_URI[fragile-1.2.2.sha256sum] = "b7464c5c4a3f014d9b2ec4073650e5c06596f385060af740fc45ad5a19f959e8"
SRC_URI[fragile-2.0.0.sha256sum] = "6c2141d6d6c8512188a7891b4b01590a45f6dac67afb4f255c4124dbb86d4eaa"
SRC_URI[fuchsia-cprng-0.1.1.sha256sum] = "a06f77d526c1a601b7c4cdd98f54b5eaabffc14d5f2f0296febdc7f357c6d3ba"
SRC_URI[function_name-proc-macro-0.2.3.sha256sum] = "569d2238870f92cff64fc810013b61edaf446ebcfba36b649b96bc5b4078328a"
SRC_URI[function_name-0.2.3.sha256sum] = "bef632c665dc6e2b99ffa4d913f7160bd902c4d3e4cb732d81dc3d221f848512"
SRC_URI[futures-channel-0.3.28.sha256sum] = "955518d47e09b25bbebc7a18df10b81f0c766eaf4c4f1cccef2fca5f2a4fb5f2"
SRC_URI[futures-core-0.3.28.sha256sum] = "4bca583b7e26f571124fe5b7561d49cb2868d79116cfa0eefce955557c6fee8c"
SRC_URI[futures-executor-0.3.28.sha256sum] = "ccecee823288125bd88b4d7f565c9e58e41858e47ab72e8ea2d64e93624386e0"
SRC_URI[futures-io-0.3.28.sha256sum] = "4fff74096e71ed47f8e023204cfd0aa1289cd54ae5430a9523be060cdb849964"
SRC_URI[futures-lite-1.13.0.sha256sum] = "49a9d51ce47660b1e808d3c990b4709f2f415d928835a17dfd16991515c46bce"
SRC_URI[futures-macro-0.3.28.sha256sum] = "89ca545a94061b6365f2c7355b4b32bd20df3ff95f02da9329b34ccc3bd6ee72"
SRC_URI[futures-sink-0.3.28.sha256sum] = "f43be4fe21a13b9781a69afa4985b0f6ee0e1afab2c6f454a8cf30e2b2237b6e"
SRC_URI[futures-task-0.3.28.sha256sum] = "76d3d132be6c0e6aa1534069c705a74a5997a356c0dc2f86a47765e5617c5b65"
SRC_URI[futures-util-0.3.28.sha256sum] = "26b01e40b772d54cf6c6d721c1d1abd0647a0106a12ecaa1c186273392a69533"
SRC_URI[futures-0.3.28.sha256sum] = "23342abe12aba583913b2e62f22225ff9c950774065e4bfb61a19cd9770fec40"
SRC_URI[fxhash-0.2.1.sha256sum] = "c31b6d751ae2c7f11320402d34e41349dd1016f8d5d45e48c4312bc8625af50c"
SRC_URI[generator-0.7.4.sha256sum] = "f3e123d9ae7c02966b4d892e550bdc32164f05853cd40ab570650ad600596a8a"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.9.sha256sum] = "c85e1d9ab2eadba7e5040d4e09cbd6d072b76a557ad64e797c2cb9d4da21d7e4"
SRC_URI[gimli-0.27.2.sha256sum] = "ad0a93d233ebf96623465aad4046a8d3aa4da22d4f4beba5388838c8a434bbb4"
SRC_URI[gio-sys-0.16.3.sha256sum] = "e9b693b8e39d042a95547fc258a7b07349b1f0b48f4b2fa3108ba3c51c0b5229"
SRC_URI[git-version-macro-0.3.5.sha256sum] = "fe69f1cbdb6e28af2bac214e943b99ce8a0a06b447d15d3e61161b0423139f3f"
SRC_URI[git-version-0.3.5.sha256sum] = "f6b0decc02f4636b9ccad390dcbe77b722a77efedfa393caf8379a51d5c61899"
SRC_URI[git2-0.15.0.sha256sum] = "2994bee4a3a6a51eb90c218523be382fd7ea09b16380b9312e9dbe955ff7c7d1"
SRC_URI[glib-macros-0.16.8.sha256sum] = "fb1a9325847aa46f1e96ffea37611b9d51fc4827e67f79e7de502a297560a67b"
SRC_URI[glib-sys-0.16.3.sha256sum] = "c61a4f46316d06bfa33a7ac22df6f0524c8be58e3db2d9ca99ccb1f357b62a65"
SRC_URI[glib-0.16.7.sha256sum] = "ddd4df61a866ed7259d6189b8bcb1464989a77f1d85d25d002279bbe9dd38b2f"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[gobject-sys-0.16.3.sha256sum] = "3520bb9c07ae2a12c7f2fbb24d4efc11231c8146a86956413fb1a79bb760a0f1"
SRC_URI[gst-plugin-version-helper-0.7.5.sha256sum] = "87921209945e5dc809848a100115fad65bd127671896f0206f45e272080cc4c9"
SRC_URI[gstreamer-app-sys-0.19.2.sha256sum] = "29b0159da8dd0672c1a5507445c70c8dc483abfb63a0295cabaedd396f1d67d1"
SRC_URI[gstreamer-app-0.19.6.sha256sum] = "604836dd21e1c7593743e7de1f95761a5508495dda5ce751a6a89db5face8468"
SRC_URI[gstreamer-base-sys-0.19.3.sha256sum] = "dbc3c4476e1503ae245c89fbe20060c30ec6ade5f44620bcc402cbc70a3911a1"
SRC_URI[gstreamer-base-0.19.3.sha256sum] = "a61a299f9ea2ca892b43e2e428b86c679875e95ba23f8ae06fd730308df630f0"
SRC_URI[gstreamer-check-sys-0.19.2.sha256sum] = "0cda4026eaa1776d7d519dfe4167da25c5ec8710e1cf496afe4bb094f2e746f4"
SRC_URI[gstreamer-check-0.19.2.sha256sum] = "ec26aea8fc815ea7b4ea2533039149aa2f48d779fb3550dcf4a5cceaeab6b7c9"
SRC_URI[gstreamer-sys-0.19.4.sha256sum] = "545f52ad8a480732cc4290fd65dfe42952c8ae374fe581831ba15981fedf18a4"
SRC_URI[gstreamer-video-sys-0.19.5.sha256sum] = "7546bc798c898f2083330d81a7efff48f65a31b03873f410538032d26ec0cdc7"
SRC_URI[gstreamer-video-0.19.5.sha256sum] = "eb19dcbdd5436483e764318bef157070f192acc5b1199e85878723a9ce33d4e3"
SRC_URI[gstreamer-0.19.8.sha256sum] = "85fc926d081923c840403ec5ec3b2157a7cd236a2587c3031a4f0206f13ed500"
SRC_URI[h2-0.3.18.sha256sum] = "17f8a914c2987b688368b5138aa05321db91f4090cf26118185672ad588bce21"
SRC_URI[half-2.2.1.sha256sum] = "02b4af3693f1b705df946e9fe5631932443781d0aabb423b62fcd4d73f6d2fd0"
SRC_URI[halfbrown-0.1.18.sha256sum] = "9e2a3c70a9c00cc1ee87b54e89f9505f73bb17d63f1b25c9a462ba8ef885444f"
SRC_URI[hash_hasher-2.0.3.sha256sum] = "74721d007512d0cb3338cd20f0654ac913920061a4c4d0d8708edb3f2a698c0c"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[hashbrown-0.13.2.sha256sum] = "43a3c133739dddd0d2990f9a4bdf8eb4b21ef50e4851ca85ab661199821d510e"
SRC_URI[headers-core-0.2.0.sha256sum] = "e7f66481bfee273957b1f20485a4ff3362987f85b2c236580d81b4eb7a326429"
SRC_URI[headers-0.3.8.sha256sum] = "f3e372db8e5c0d213e0cd0b9be18be2aca3d44cf2fe30a9d46a65581cd454584"
SRC_URI[heck-0.3.3.sha256sum] = "6d621efb26863f0e9924c6ac577e8275e5e6b77455db64ffa6c65c904e9e132c"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.1.19.sha256sum] = "62b467343b94ba476dcb2500d242dadbb39557df889310ac77c5d99100aaac33"
SRC_URI[hermit-abi-0.2.6.sha256sum] = "ee512640fe35acbfb4bb779db6f0d80704c2cacfa2e39b601ef3e3f47d1ae4c7"
SRC_URI[hermit-abi-0.3.1.sha256sum] = "fed44880c466736ef9a5c5b5facefb5ed0785676d0c02d612db14e54f0d84286"
SRC_URI[hex-0.4.3.sha256sum] = "7f24254aa9a54b5c858eaee2f5bccdb46aaf0e486a595ed5fd8f86ba55232a70"
SRC_URI[http-body-0.4.5.sha256sum] = "d5f38f16d184e36f2408a55281cd658ecbd3ca05cce6d6510a176eca393e26d1"
SRC_URI[http-0.2.9.sha256sum] = "bd6effc99afb63425aff9b05836f029929e345a6148a14b7ecd5ab67af944482"
SRC_URI[httparse-1.8.0.sha256sum] = "d897f394bad6a705d5f4104762e116a75639e470d80901eed05a860a95cb1904"
SRC_URI[httpdate-1.0.2.sha256sum] = "c4a1e36c821dbe04574f602848a19f742f4fb3c98d40449f11bcad18d6b17421"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[hyper-tls-0.5.0.sha256sum] = "d6183ddfa99b85da61a140bea0efc93fdf56ceaa041b37d553518030827f9905"
SRC_URI[hyper-0.14.26.sha256sum] = "ab302d72a6f11a3b910431ff93aae7e773078c769f0a3ef15fb9ec692ed147d4"
SRC_URI[iana-time-zone-haiku-0.1.1.sha256sum] = "0703ae284fc167426161c2e3f1da3ea71d94b21bedbcc9494e92b28e334e3dca"
SRC_URI[iana-time-zone-0.1.56.sha256sum] = "0722cd7114b7de04316e7ea5456a0bbb20e4adb46fd27a3697adb812cff0f37c"
SRC_URI[idna-0.3.0.sha256sum] = "e14ddfc70884202db2244c223200c204c2bda1bc6e0998d11b5e024d657209e6"
SRC_URI[indexmap-1.9.3.sha256sum] = "bd070e393353796e801d209ad339e89596eb4c8d430d18ede6a1cced8fafbd99"
SRC_URI[infer-0.13.0.sha256sum] = "f551f8c3a39f68f986517db0d1759de85881894fdc7db798bd2a9df9cb04b7fc"
SRC_URI[inlinable_string-0.1.15.sha256sum] = "c8fae54786f62fb2918dcfae3d568594e50eb9b5c25bf04371af6fe7516452fb"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-lifetimes-1.0.10.sha256sum] = "9c66c74d2ae7e79a5a8f7ac924adbe38ee42a859c6539ad869eb51f0b52dc220"
SRC_URI[ipnet-2.7.2.sha256sum] = "12b6ee2129af8d4fb011108c73d99a1b83a85977f23b82460c0ae2e25bb4b57f"
SRC_URI[ipnetwork-0.20.0.sha256sum] = "bf466541e9d546596ee94f9f69590f89473455f88372423e0008fc1a7daf100e"
SRC_URI[is-terminal-0.4.7.sha256sum] = "adcf93614601c8129ddf72e2d5633df827ba6551541c6d8c59520a371475be1f"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itoa-1.0.6.sha256sum] = "453ad9f582a441959e5f0d088b02ce04cfe8d51a8eaf077f12ac6d3e94164ca6"
SRC_URI[jobserver-0.1.26.sha256sum] = "936cfd212a0155903bcbc060e316fb6cc7cbf2e1907329391ebadc1fe0ce77c2"
SRC_URI[js-sys-0.3.61.sha256sum] = "445dde2150c55e483f3d8416706b97ec8e8237c307e5b7b4b8dd15e6af2a0730"
SRC_URI[json-deserializer-0.4.4.sha256sum] = "5f63b421e16eb4100beb677af56f0b4f3a4f08bab74ef2af079ce5bb92c2683f"
SRC_URI[json-0.12.4.sha256sum] = "078e285eafdfb6c4b434e0d31e8cfcb5115b651496faca5749b88fafd4f23bfd"
SRC_URI[jsonwebtoken-7.2.0.sha256sum] = "afabcc15e437a6484fc4f12d0fd63068fe457bf93f1c148d3d9649c60b103f32"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lexical-core-0.7.6.sha256sum] = "6607c62aa161d23d17a9072cc5da0be67cdfc89d3afb1e8d9c842bebc2525ffe"
SRC_URI[lexical-core-0.8.5.sha256sum] = "2cde5de06e8d4c2faabc400238f9ae1c74d5412d03a7bd067645ccbc47070e46"
SRC_URI[lexical-parse-float-0.8.5.sha256sum] = "683b3a5ebd0130b8fb52ba0bdc718cc56815b6a097e28ae5a6997d0ad17dc05f"
SRC_URI[lexical-parse-integer-0.8.6.sha256sum] = "6d0994485ed0c312f6d965766754ea177d07f9c00c9b82a5ee62ed5b47945ee9"
SRC_URI[lexical-util-0.8.5.sha256sum] = "5255b9ff16ff898710eb9eb63cb39248ea8a5bb036bea8085b1a767ff6c4e3fc"
SRC_URI[lexical-write-float-0.8.5.sha256sum] = "accabaa1c4581f05a3923d1b4cfd124c329352288b7b9da09e766b0668116862"
SRC_URI[lexical-write-integer-0.8.5.sha256sum] = "e1b6f3d1f4422866b68192d62f77bc5c700bee84f3069f2469d7bc8c77852446"
SRC_URI[lexical-6.1.1.sha256sum] = "c7aefb36fd43fef7003334742cbf77b243fcd36418a1d1bdd480d613a67968f6"
SRC_URI[libc-0.2.142.sha256sum] = "6a987beff54b60ffa6d51982e1aa1146bc42f19bd26be28b0586f252fccf5317"
SRC_URI[libgit2-sys-0.14.2+1.5.1.sha256sum] = "7f3d95f6b51075fe9810a7ae22c7095f12b98005ab364d8544797a825ce946a4"
SRC_URI[libm-0.2.6.sha256sum] = "348108ab3fba42ec82ff6e9564fc4ca0247bdccdc68dd8af9764bbc79c3c8ffb"
SRC_URI[libsqlite3-sys-0.26.0.sha256sum] = "afc22eff61b133b115c6e8c74e818c628d6d5e7a502afea6f64dee076dd94326"
SRC_URI[libssh2-sys-0.2.23.sha256sum] = "b094a36eb4b8b8c8a7b4b8ae43b2944502be3e59cd87687595cf6b0a71b3f4ca"
SRC_URI[libz-sys-1.1.9.sha256sum] = "56ee889ecc9568871456d42f603d6a0ce59ff328d291063a45cbdf0036baf6db"
SRC_URI[link-cplusplus-1.0.8.sha256sum] = "ecd207c9c713c34f95a097a5b029ac2ce6010530c7b49d7fea24d977dede04f5"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[linux-raw-sys-0.3.7.sha256sum] = "ece97ea872ece730aed82664c424eb4c8291e1ff2480247ccf7409044bc6479f"
SRC_URI[lock_api-0.4.9.sha256sum] = "435011366fe56583b16cf956f9df0095b405b82d76425bc8981c0e22e60ec4df"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[loom-0.5.6.sha256sum] = "ff50ecb28bb86013e935fb6683ab1f6d3a20016f123c76fd4c27470076ac30f5"
SRC_URI[lz4-sys-1.9.4.sha256sum] = "57d27b317e207b10f69f5e75494119e391a96f48861ae870d1da6edac98ca900"
SRC_URI[lz4-1.24.0.sha256sum] = "7e9e2dd86df36ce760a60f6ff6ad526f7ba1f14ba0356f8254fb6905e6494df1"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[matrixmultiply-0.3.7.sha256sum] = "090126dc04f95dc0d1c1c91f61bdd474b3930ca064c1edc8a849da2c6cbe1e77"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memmap2-0.5.10.sha256sum] = "83faa42c0a078c393f6b29d5db232d8be22776a891f8f56e5284faee4a20b327"
SRC_URI[memoffset-0.7.1.sha256sum] = "5de893c32cde5f383baa4c04c5d6dbdd735cfd4a794b0debdb2bb1b421da5ff4"
SRC_URI[memoffset-0.8.0.sha256sum] = "d61c719bcfbcf5d62b3a09efa6088de8c54bc0bfcd3ea7ae39fcc186108b8de1"
SRC_URI[migrations_internals-2.0.0.sha256sum] = "c493c09323068c01e54c685f7da41a9ccf9219735c3766fbfd6099806ea08fbc"
SRC_URI[migrations_macros-2.0.0.sha256sum] = "8a8ff27a350511de30cdabb77147501c36ef02e0451d957abea2f30caffb2b58"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[mime_guess-2.0.4.sha256sum] = "4192263c238a5f0d0c6bfd21f336a313a4ce1c450542449ca191bb657b4642ef"
SRC_URI[mime_serde_shim-0.2.2.sha256sum] = "ab9c5b33b135e34aab675cef7f678c688b30740ba299d75e3a8c0af89b5d5cea"
SRC_URI[miniz_oxide-0.6.2.sha256sum] = "b275950c28b37e794e8c55d88aeb5e139d0ce23fdbbeda68f8d7174abdf9e8fa"
SRC_URI[miniz_oxide-0.7.1.sha256sum] = "e7810e0be55b428ada41041c41f32c9f1a42817901b4ccf45fa3d4b6561e74c7"
SRC_URI[mio-0.8.6.sha256sum] = "5b9d9a46eff5b4ff64b45a9e316a6d1e0bc719ef429cbec4dc630684212bfdf9"
SRC_URI[mockall-0.10.2.sha256sum] = "6ab571328afa78ae322493cacca3efac6a0f2e0a67305b4df31fd439ef129ac0"
SRC_URI[mockall_derive-0.10.2.sha256sum] = "e7e25b214433f669161f414959594216d8e6ba83b6679d3db96899c0b4639033"
SRC_URI[muldiv-1.0.1.sha256sum] = "956787520e75e9bd233246045d19f42fb73242759cc57fba9611d940ae96d4b0"
SRC_URI[multer-2.1.0.sha256sum] = "01acbdc23469fd8fe07ab135923371d5f5a422fbf9c522158677c8eb15bc51c2"
SRC_URI[multiversion-macros-0.6.1.sha256sum] = "a8a3e2bde382ebf960c1f3e79689fa5941625fe9bf694a1cb64af3e85faff3af"
SRC_URI[multiversion-0.6.1.sha256sum] = "025c962a3dd3cc5e0e520aa9c612201d127dcdf28616974961a649dca64f5373"
SRC_URI[native-tls-0.2.11.sha256sum] = "07226173c32f2926027b63cce4bcd8076c3552846cbe7925f3aaffeac0a3b92e"
SRC_URI[nats-0.23.1.sha256sum] = "b3d877cd2e71146efa7065300fc5f5da967f938694b4d65e8bc64cc4a409092c"
SRC_URI[ndarray-0.15.6.sha256sum] = "adb12d4e967ec485a5f71c6311fe28158e9d6f4bc4a447b474184d0f91a8fa32"
SRC_URI[nix-0.26.2.sha256sum] = "bfdda3d196821d6af13126e40375cdf7da646a96114af134d5f417a9a1dc8e1a"
SRC_URI[nkeys-0.2.0.sha256sum] = "0e66a7cd1358277b2a6f77078e70aea7315ff2f20db969cc61153103ec162594"
SRC_URI[nom-5.1.3.sha256sum] = "08959a387a676302eebf4ddbcbc611da04285579f76f88ee0506c63b1a61dd4b"
SRC_URI[normalize-line-endings-0.3.0.sha256sum] = "61807f77802ff30975e01f4f071c8ba10c022052f98b3294119f3e615d13e5be"
SRC_URI[ntapi-0.4.1.sha256sum] = "e8a3895c6391c39d7fe7ebc444a87eb2991b2a0bc718fdabd071eec617fc68e4"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[nuid-0.3.2.sha256sum] = "20c1bb65186718d348306bf1afdeb20d9ab45b2ab80fb793c0fdcf59ffbb4f38"
SRC_URI[num-bigint-0.2.6.sha256sum] = "090c7f9998ee0ff65aa5b723e4009f7b217707f1fb5ea551329cc4d6231fb304"
SRC_URI[num-bigint-0.4.3.sha256sum] = "f93ab6289c7b344a8a9f60f88d80aa20032336fe78da341afc91c8a2341fc75f"
SRC_URI[num-complex-0.4.3.sha256sum] = "02e0d21255c828d6f128a1e41534206671e8c3ea0c62f32291e808dc82cff17d"
SRC_URI[num-integer-0.1.45.sha256sum] = "225d3389fb3509a24c93f5c29eb6bde2586b98d9f016636dff58d7c6f7569cd9"
SRC_URI[num-iter-0.1.43.sha256sum] = "7d03e6c028c5dc5cac6e2dec0efda81fc887605bb3d884578bb6d6bf7514e252"
SRC_URI[num-rational-0.4.1.sha256sum] = "0638a1c9d0a3c0914158145bc76cff373a75a627e6ecbfb71cbe6f453a5a19b0"
SRC_URI[num-traits-0.1.43.sha256sum] = "92e5113e9fd4cc14ded8e499429f396a20f98c772a47cc8622a736e1ec843c31"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[num-0.4.0.sha256sum] = "43db66d1170d347f9a065114077f7dccb00c1b9478c89384490a3425279a4606"
SRC_URI[num_cpus-1.15.0.sha256sum] = "0fac9e2da13b5eb447a6ce3d392f23a29d8694bff781bf03a16cd9ac8697593b"
SRC_URI[object-0.30.3.sha256sum] = "ea86265d3d3dcb6a27fc51bd29a4bf387fae9d2986b823079d4986af253eb439"
SRC_URI[once_cell-1.17.1.sha256sum] = "b7e5500299e16ebb147ae15a00a942af264cf3688f47923b8fc2cd5858f23ad3"
SRC_URI[opaque-debug-0.3.0.sha256sum] = "624a8340c38c1b80fd549087862da4ba43e08858af025b236e509b6649fc13d5"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.5.sha256sum] = "ff011a302c396a5197692431fc1948019154afc178baf7d8e37367442a4601cf"
SRC_URI[openssl-sys-0.9.87.sha256sum] = "8e17f59264b2809d77ae94f0e1ebabc434773f370d6ca667bd223ea10e06cc7e"
SRC_URI[openssl-0.10.52.sha256sum] = "01b8574602df80f7b85fdfc5392fa884a4e3b3f4f35402c070ab34c3d3f78d56"
SRC_URI[option-operations-0.5.0.sha256sum] = "7c26d27bb1aeab65138e4bf7666045169d1717febcc9ff870166be8348b223d0"
SRC_URI[ordered-stream-0.2.0.sha256sum] = "9aa2b01e1d916879f73a53d01d1d6cee68adbb31d6d9177a8cfce093cced1d50"
SRC_URI[os_str_bytes-6.5.0.sha256sum] = "ceedf44fb00f2d1984b0bc98102627ce622e083e49a5bacdb3e514fa4238e267"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking-2.1.0.sha256sum] = "14f2252c834a40ed9bb5422029649578e63aa341ac401f74e719dd1afda8394e"
SRC_URI[parking_lot-0.12.1.sha256sum] = "3742b2c103b9f06bc9fff0a37ff4912935851bee6d36f3c02bcc755bcfec228f"
SRC_URI[parking_lot_core-0.9.7.sha256sum] = "9069cbb9f99e3a5083476ccb29ceb1de18b9118cafa53e90c9551235de2b9521"
SRC_URI[paste-1.0.12.sha256sum] = "9f746c4065a8fa3fe23974dd82f15431cc8d40779821001404d10d2e79ca7d79"
SRC_URI[pear-0.2.4.sha256sum] = "0ec95680a7087503575284e5063e14b694b7a9c0b065e5dceec661e0497127e8"
SRC_URI[pear_codegen-0.2.4.sha256sum] = "9661a3a53f93f09f2ea882018e4d7c88f6ff2956d809a276060476fd8c879d3c"
SRC_URI[pem-rfc7468-0.2.4.sha256sum] = "84e93a3b1cc0510b03020f33f21e62acdde3dcaef432edc95bea377fbd4c2cd4"
SRC_URI[pem-0.8.3.sha256sum] = "fd56cbd21fea48d0c440b41cd69c589faacade08c992d9a54e471b79d0fd13eb"
SRC_URI[percent-encoding-2.2.0.sha256sum] = "478c572c3d73181ff3c2539045f6eb99e5491218eae919370993b890cdbdd98e"
SRC_URI[pin-project-internal-1.0.12.sha256sum] = "069bdb1e05adc7a8990dce9cc75370895fbe4e3d58b9b73bf1aee56359344a55"
SRC_URI[pin-project-lite-0.2.9.sha256sum] = "e0a7ae3ac2f1173085d398531c705756c94a4c56843785df85a60c1a0afac116"
SRC_URI[pin-project-1.0.12.sha256sum] = "ad29a609b6bcd67fee905812e544992d216af9d755757c05ed2d0e15a74c6ecc"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkcs8-0.7.6.sha256sum] = "ee3ef9b64d26bad0536099c816c6734379e45bbd5f14798def6809e5cc350447"
SRC_URI[pkg-config-0.3.27.sha256sum] = "26072860ba924cbfa98ea39c8c19b4dd6a4a25423dbdf219c1eca91aa0cf6964"
SRC_URI[planus-0.3.1.sha256sum] = "fc1691dd09e82f428ce8d6310bd6d5da2557c82ff17694d2a32cad7242aea89f"
SRC_URI[polars-algo-0.24.3.sha256sum] = "d11cae87ee57fd459488735bf3bede77eeadf65b237753f15bff3c729878d80c"
SRC_URI[polars-arrow-0.24.4.sha256sum] = "932e2474040e28459b9790d86730ea5f92165a4f5630c9d36366b9d3a6128eb1"
SRC_URI[polars-core-0.24.3.sha256sum] = "d72cc715f79e808a18c46bd28b3e03b63f710a03acd2f03dbb5c22e2c7d192a5"
SRC_URI[polars-io-0.24.3.sha256sum] = "a1ef64ab407a16876b6cbd26c3ac50901b7f848970e709d7aef11fe3fcfa70dc"
SRC_URI[polars-lazy-0.24.3.sha256sum] = "c96ff67f24c8e0ae9155d9edf9d6980b51b414b73066238a702d31f0d9a26288"
SRC_URI[polars-ops-0.24.3.sha256sum] = "96f6d31360dffec97537b31a6f32ac189d43095c29ac1956ac20a88d82f57946"
SRC_URI[polars-time-0.24.3.sha256sum] = "e2f38a9cad199a992d04fd8e68d49a45f2996928dd769966b14f9da3aa71ba7e"
SRC_URI[polars-utils-0.24.4.sha256sum] = "c5eca881853f14d7130406652f19c0f1281349647aea4ec2473fc6ff4303cff1"
SRC_URI[polars-0.24.3.sha256sum] = "dcc28d562d296e586634c7efa9468f5fe43e81c20c572f8d1d4542f273db9e27"
SRC_URI[polling-2.8.0.sha256sum] = "4b2d323e8ca7996b3e23126511a523f7e62924d93ecd5ae73b333815b0eb3dce"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[predicates-core-1.0.6.sha256sum] = "b794032607612e7abeb4db69adb4e33590fa6cf1149e95fd7cb00e634b92f174"
SRC_URI[predicates-tree-1.0.9.sha256sum] = "368ba315fb8c5052ab692e68a0eefec6ec57b23a36959c14496f0b0df2c0cecf"
SRC_URI[predicates-1.0.8.sha256sum] = "f49cfaf7fdaa3bfacc6fa3e7054e65148878354a5cfddcf661df4c851f8021df"
SRC_URI[predicates-2.1.5.sha256sum] = "59230a63c37f3e18569bdb90e4a89cbf5bf8b06fea0b84e65ea10cc4df47addd"
SRC_URI[predicates-3.0.3.sha256sum] = "09963355b9f467184c04017ced4a2ba2d75cbcb4e7462690d388233253d4b1a9"
SRC_URI[pretty-hex-0.3.0.sha256sum] = "c6fa0831dd7cc608c38a5e323422a0077678fa5744aa2be4ad91c4ece8eec8d5"
SRC_URI[printnanny-api-client-0.132.3.sha256sum] = "069d2d4ec11079102763d48906776ff3248cc9841ab20796fee72091921015b4"
SRC_URI[printnanny-octoprint-models-0.1.9.sha256sum] = "72836d92e1897dad506e0751f1a88bcf470ce3bb1ed6d813cb01a2cc32de411f"
SRC_URI[printnanny-os-models-0.1.1.sha256sum] = "ef871049d952181ed73dfb4c4a7f59353f07b9d43d27a7cff380737e645c0a19"
SRC_URI[proc-macro-crate-0.1.5.sha256sum] = "1d6ea3c4595b96363c13943497db34af4460fb474a95c43f4446ad341b8c9785"
SRC_URI[proc-macro-crate-1.3.1.sha256sum] = "7f4c021e1093a56626774e81216a4ce732a735e5bad4868a03f3ed65ca0c3919"
SRC_URI[proc-macro-error-attr-1.0.4.sha256sum] = "a1be40180e52ecc98ad80b184934baf3d0d29f979574e439af5a55274b35f869"
SRC_URI[proc-macro-error-1.0.4.sha256sum] = "da25490ff9892aab3fcf7c36f08cfb902dd3e71ca0f9f9517bea02a73a5ce38c"
SRC_URI[proc-macro-hack-0.5.20+deprecated.sha256sum] = "dc375e1527247fe1a97d8b7156678dfe7c1af2fc075c9a4db3690ecd2a148068"
SRC_URI[proc-macro2-diagnostics-0.10.0.sha256sum] = "606c4ba35817e2922a308af55ad51bab3645b59eae5c570d4a6cf07e36bd493b"
SRC_URI[proc-macro2-1.0.56.sha256sum] = "2b63bdb0cd06f1f4dedf69b254734f9b45af66e4a031e42a7480257d9898b435"
SRC_URI[procfs-0.12.0.sha256sum] = "0941606b9934e2d98a3677759a971756eb821f75764d0e0d26946d08e74d9104"
SRC_URI[quote-1.0.26.sha256sum] = "4424af4bf778aae2051a77b60283332f386554255d722233d09fbfc7e30da2fc"
SRC_URI[r2d2-0.8.10.sha256sum] = "51de85fb3fb6524929c8a2eb85e6b6d363de4e8c48f9e2c2eac4944abc181c93"
SRC_URI[rand-0.4.6.sha256sum] = "552840b97013b1a26992c11eac34bdd778e464601a4c2054b5f0bff7c6761293"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.3.1.sha256sum] = "7a6fdeb83b075e8266dcc8762c22776f6877a63111121f5f8c7411e5be7eed4b"
SRC_URI[rand_core-0.4.2.sha256sum] = "9c33a3c44ca05fa6f1807d8e6743f3824e8509beca625669633be0acbdf509dc"
SRC_URI[rand_core-0.5.1.sha256sum] = "90bde5296fc891b0cef12a6d03ddccc162ce7b2aff54160af9338f8d40df6d19"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rand_distr-0.4.3.sha256sum] = "32cb0b9bc82b0a0876c2dd994a7e7a2683d3e7390ca40e6886785ef0c7e3ee31"
SRC_URI[rawpointer-0.2.1.sha256sum] = "60a357793950651c4ed0f3f52338f53b2f809f32d83a07f72909fa13e4c6c1e3"
SRC_URI[rayon-core-1.11.0.sha256sum] = "4b8f95bd6966f5c87776639160a66bd8ab9895d9d4ab01ddba9fc60661aebe8d"
SRC_URI[rayon-1.7.0.sha256sum] = "1d2df5196e37bcc87abebc0053e20787d73847bb33134a69841207dd0a47f03b"
SRC_URI[rdrand-0.4.0.sha256sum] = "678054eb77286b51581ba43620cc911abf02758c91f93f479767aed0f90458b2"
SRC_URI[redox_syscall-0.2.16.sha256sum] = "fb5a58c1855b4b6819d59012155603f0b22ad30cad752600aadfcb695265519a"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[redox_users-0.4.3.sha256sum] = "b033d837a7cf162d7993aded9304e30a83213c648b6e389db233191f891e5c2b"
SRC_URI[ref-cast-impl-1.0.16.sha256sum] = "8d2275aab483050ab2a7364c1a46604865ee7d6906684e08db0f090acf74f9e7"
SRC_URI[ref-cast-1.0.16.sha256sum] = "f43faa91b1c8b36841ee70e97188a869d37ae21759da6846d4be66de5bf7b12c"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[regex-syntax-0.7.1.sha256sum] = "a5996294f19bd3aae0453a862ad728f60e6600695733dd5df01da90c54363a3c"
SRC_URI[regex-1.8.1.sha256sum] = "af83e617f331cc6ae2da5443c602dfa5af81e517212d9d611a5b3ba1777b5370"
SRC_URI[remove_dir_all-0.5.3.sha256sum] = "3acd125665422973a33ac9d3dd2df85edad0f4ae9b00dafb1a05e43a9f5ef8e7"
SRC_URI[reqwest-0.11.17.sha256sum] = "13293b639a097af28fc8a90f22add145a9c954e49d77da06263d58cf44d5fb91"
SRC_URI[ring-0.16.20.sha256sum] = "3053cf52e236a3ed746dfc745aa9cacf1b791d846bdaf412f60a8d7d6e17c8fc"
SRC_URI[rocket-0.5.0-rc.3.sha256sum] = "58734f7401ae5cfd129685b48f61182331745b357b96f2367f01aebaf1cc9cc9"
SRC_URI[rocket_codegen-0.5.0-rc.3.sha256sum] = "7093353f14228c744982e409259fb54878ba9563d08214f2d880d59ff2fc508b"
SRC_URI[rocket_http-0.5.0-rc.3.sha256sum] = "936012c99162a03a67f37f9836d5f938f662e26f2717809761a9ac46432090f4"
SRC_URI[rust-ini-0.13.0.sha256sum] = "3e52c148ef37f8c375d49d5a73aa70713125b7f19095948a923f80afdeb22ec2"
SRC_URI[rustc-demangle-0.1.23.sha256sum] = "d626bb9dae77e28219937af045c257c28bfd3f69333c512553507f5f9798cb76"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.37.19.sha256sum] = "acf8729d8542766f1b2cf77eb034d52f40d375bb8b615d0b147089946e16613d"
SRC_URI[rustls-native-certs-0.5.0.sha256sum] = "5a07b7c1885bd8ed3831c289b7870b13ef46fe0e856d288c30d9cc17d75a2092"
SRC_URI[rustls-native-certs-0.6.2.sha256sum] = "0167bac7a9f490495f3c33013e7722b53cb087ecbe082fb0c6387c96f634ea50"
SRC_URI[rustls-pemfile-0.2.1.sha256sum] = "5eebeaeb360c87bfb72e84abdb3447159c0eaececf1bef2aecd65a8be949d1c9"
SRC_URI[rustls-pemfile-1.0.2.sha256sum] = "d194b56d58803a43635bdc398cd17e383d6f71f9182b9a192c127ca42494a59b"
SRC_URI[rustls-0.19.1.sha256sum] = "35edb675feee39aec9c99fa5ff985081995a06d594114ae14cbe797ad7b7a6d7"
SRC_URI[rustls-0.20.8.sha256sum] = "fff78fc74d175294f4e83b28343315ffcfb114b156f0185e9741cb5570f50e2f"
SRC_URI[rustversion-1.0.12.sha256sum] = "4f3208ce4d8448b3f3e7d168a73f5e0c43a61e32930de3bceeccedb388b6bf06"
SRC_URI[ryu-1.0.13.sha256sum] = "f91339c0467de62360649f8d3e185ca8de4224ff281f66000de5eb2a77a79041"
SRC_URI[schannel-0.1.21.sha256sum] = "713cfb06c7059f3588fb8044c0fad1d09e3c01d225e25b9220dbfdcf16dbb1b3"
SRC_URI[scheduled-thread-pool-0.2.7.sha256sum] = "3cbc66816425a074528352f5789333ecff06ca41b36b0b0efdfbb29edc391a19"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[scratch-1.0.5.sha256sum] = "1792db035ce95be60c3f8853017b3999209281c24e2ba5bc8e59bf97a0c590c1"
SRC_URI[sct-0.6.1.sha256sum] = "b362b83898e0e69f38515b82ee15aa80636befe47c3b6d3d89a911e78fc228ce"
SRC_URI[sct-0.7.0.sha256sum] = "d53dcdb7c9f8158937a7981b48accfd39a43af418591a5d008c7b22b5e1b7ca4"
SRC_URI[security-framework-sys-2.8.0.sha256sum] = "31c9bb296072e961fcbd8853511dd39c2d8be2deb1e17c6860b1d30732b323b4"
SRC_URI[security-framework-2.8.2.sha256sum] = "a332be01508d814fed64bf28f798a146d73792121129962fdf335bb3c49a4254"
SRC_URI[semver-1.0.17.sha256sum] = "bebd363326d05ec3e2f532ab7660680f3b02130d780c299bca73469d521bc0ed"
SRC_URI[serde-hjson-0.9.1.sha256sum] = "6a3a4e0ea8a88553209f6cc6cfe8724ecad22e1acf372793c27d995290fe74f8"
SRC_URI[serde-reflection-0.3.6.sha256sum] = "f05a5f801ac62a51a49d378fdb3884480041b99aced450b28990673e8ff99895"
SRC_URI[serde-0.8.23.sha256sum] = "9dad3f759919b92c3068c696c15c3d17238234498bbdcc80f2c469606f948ac8"
SRC_URI[serde-1.0.162.sha256sum] = "71b2f6e1ab5c2b98c05f0f35b236b22e8df7ead6ffbf51d7808da7f8817e7ab6"
SRC_URI[serde_bytes-0.11.9.sha256sum] = "416bda436f9aab92e02c8e10d49a15ddd339cea90b6e340fe51ed97abb548294"
SRC_URI[serde_derive-1.0.162.sha256sum] = "a2a0814352fd64b58489904a44ea8d90cb1a91dcb6b4f5ebabc32c8318e93cb6"
SRC_URI[serde_json-1.0.96.sha256sum] = "057d394a50403bcac12672b2b18fb387ab6d289d957dab67dd201875391e52f1"
SRC_URI[serde_nanos-0.1.3.sha256sum] = "8ae801b7733ca8d6a2b580debe99f67f36826a0f5b8a36055dc6bc40f8d6bc71"
SRC_URI[serde_repr-0.1.12.sha256sum] = "bcec881020c684085e55a25f7fd888954d56609ef363479dc5a1305eb0d40cab"
SRC_URI[serde_spanned-0.6.1.sha256sum] = "0efd8caf556a6cebd3b285caf480045fcc1ac04f6bd786b09a6f11af30c4fcf4"
SRC_URI[serde_urlencoded-0.7.1.sha256sum] = "d3491c14715ca2294c4d6a88f15e84739788c1d030eed8c110436aafdaa2f3fd"
SRC_URI[serde_variant-0.1.2.sha256sum] = "47a8ec0b2fd0506290348d9699c0e3eb2e3e8c0498b5a9a6158b3bd4d6970076"
SRC_URI[serde_yaml-0.9.21.sha256sum] = "d9d684e3ec7de3bf5466b32bd75303ac16f0736426e5a4e0d6e489559ce1249c"
SRC_URI[sha1-0.10.5.sha256sum] = "f04293dc80c3993519f2d7f6f511707ee7094fe0c6d3406feb330cdb3540eba3"
SRC_URI[sha2-0.9.9.sha256sum] = "4d58a1e1bf39749807d89cf2d98ac2dfa0ff1cb3faa38fbb64dd88ac8013d800"
SRC_URI[sharded-slab-0.1.4.sha256sum] = "900fba806f70c630b0a382d0d825e17a0f19fcd059a2ade1ff237bcddf446b31"
SRC_URI[signal-hook-mio-0.2.3.sha256sum] = "29ad2e15f37ec9a6cc544097b78a1ec90001e9f71b81338ca39f430adaca99af"
SRC_URI[signal-hook-registry-1.4.1.sha256sum] = "d8229b473baa5980ac72ef434c4415e70c4b5e71b423043adb4ba059f89c99a1"
SRC_URI[signal-hook-0.3.15.sha256sum] = "732768f1176d21d09e076c23a93123d40bba92d50c4058da34d45c8de8e682b9"
SRC_URI[signatory-0.23.2.sha256sum] = "5dfecc059e81632eef1dd9b79e22fc28b8fe69b30d3357512a77a0ad8ee3c782"
SRC_URI[signature-1.6.4.sha256sum] = "74233d3b3b2f6d4b006dc19dee745e73e2a6bfb6f93607cd3b02bd5b00797d7c"
SRC_URI[simd-json-0.6.0.sha256sum] = "9bd78b840b9de64fa3f7d72909b76343849f68e8c3d32608db8d38e4e5481f84"
SRC_URI[simdutf8-0.1.4.sha256sum] = "f27f6278552951f1f2b8cf9da965d10969b2efdea95a6ec47987ab46edfe263a"
SRC_URI[simple_asn1-0.4.1.sha256sum] = "692ca13de57ce0613a363c8c2f1de925adebc81b04c923ac60c5488bb44abe4b"
SRC_URI[slab-0.4.8.sha256sum] = "6528351c9bc8ab22353f9d776db39a20288e8d6c37ef8cfe3317cf875eecfc2d"
SRC_URI[smallvec-1.10.0.sha256sum] = "a507befe795404456341dfab10cef66ead4c041f62b8b11bbb92bffe5d0953e0"
SRC_URI[smartstring-1.0.1.sha256sum] = "3fb72c633efbaa2dd666986505016c32c3044395ceaf881518399d2f4127ee29"
SRC_URI[socket2-0.4.9.sha256sum] = "64a4a911eed85daf18834cfaa86a79b7d266ff93ff5ba14005426219480ed662"
SRC_URI[spin-0.5.2.sha256sum] = "6e63cff320ae2c57904679ba7cb63280a3dc4613885beafb148ee7bf9aa9042d"
SRC_URI[spin-0.9.8.sha256sum] = "6980e8d7511241f8acf4aebddbb1ff938df5eebe98691418c4468d0b72a96a67"
SRC_URI[spki-0.4.1.sha256sum] = "5c01a0c15da1b0b0e1494112e7af814a678fec9bd157881b49beac661e9b6f32"
SRC_URI[stable-pattern-0.1.0.sha256sum] = "4564168c00635f88eaed410d5efa8131afa8d8699a612c80c455a0ba05c21045"
SRC_URI[state-0.5.3.sha256sum] = "dbe866e1e51e8260c9eed836a042a5e7f6726bb2b411dffeaa712e19c388f23b"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[streaming-iterator-0.1.9.sha256sum] = "2b2231b7c3057d5e4ad0156fb3dc807d900806020c5ffa3ee6ff2c8c76fb8520"
SRC_URI[strength_reduce-0.2.4.sha256sum] = "fe895eb47f22e2ddd4dabc02bce419d2e643c8e3b585c78158b349195bc24d82"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[strum-0.23.0.sha256sum] = "cae14b91c7d11c9a851d3fbc80a963198998c2a64eec840477fa92d8ce9b70bb"
SRC_URI[strum_macros-0.23.1.sha256sum] = "5bb0dc7ee9c15cea6199cde9a127fa16a4c5819af85395457ad72d68edc85a38"
SRC_URI[subslice-0.2.3.sha256sum] = "e0a8e4809a3bb02de01f1f7faf1ba01a83af9e8eabcd4d31dd6e413d14d56aae"
SRC_URI[subtle-2.5.0.sha256sum] = "81cdd64d312baedb58e21336b31bc043b77e01cc99033ce76ef539f78e965ebc"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.15.sha256sum] = "a34fcf3e8b60f57e6a14301a2e916d323af98b0ea63c599441eec8558660c822"
SRC_URI[sys-info-0.9.1.sha256sum] = "0b3a0d0aba8bf96a0e1ddfdc352fc53b3df7f39318c71854910c3c4b024ae52c"
SRC_URI[sysinfo-0.26.9.sha256sum] = "5c18a6156d1f27a9592ee18c1a846ca8dd5c258b7179fc193ae87c74ebb666f5"
SRC_URI[system-deps-6.0.5.sha256sum] = "d0fe581ad25d11420b873cf9aedaca0419c2b411487b134d4d21065f3d092055"
SRC_URI[target-lexicon-0.12.7.sha256sum] = "fd1ba337640d60c3e96bc6f0638a939b9c9a7f2c316a1598c279828b3d1dc8c5"
SRC_URI[tempdir-0.3.7.sha256sum] = "15f2b5fb00ccdf689e0149d1b1b3c03fead81c2b37735d812fa8bddbbf41b6d8"
SRC_URI[tempfile-3.5.0.sha256sum] = "b9fbec84f381d5795b08656e4912bec604d162bff9291d6189a78f4c8ab87998"
SRC_URI[termcolor-1.2.0.sha256sum] = "be55cf8942feac5c765c2c993422806843c9a9a45d4d5c407ad6dd2ea95eb9b6"
SRC_URI[terminal_size-0.1.17.sha256sum] = "633c1a546cee861a1a6d0dc69ebeca693bf4296661ba7852b9d21d159e0506df"
SRC_URI[terminal_size-0.2.6.sha256sum] = "8e6bf6f19e9f8ed8d4048dc22981458ebcf406d67e94cd422e5ecd73d63b3237"
SRC_URI[termtree-0.4.1.sha256sum] = "3369f5ac52d5eb6ab48c6b4ffdc8efbcad6b89c765749064ba298f2c68a16a76"
SRC_URI[test-log-0.2.11.sha256sum] = "38f0c854faeb68a048f0f2dc410c5ddae3bf83854ef0e4977d58306a5edef50e"
SRC_URI[textwrap-0.16.0.sha256sum] = "222a222a5bfe1bba4a77b45ec488a741b3cb8872e5e499451fd7d0129c9c7c3d"
SRC_URI[thiserror-impl-1.0.40.sha256sum] = "f9456a42c5b0d803c8cd86e73dd7cc9edd429499f37a3550d286d5e86720569f"
SRC_URI[thiserror-1.0.40.sha256sum] = "978c9a314bd8dc99be594bc3c175faaa9794be04a5a5e153caba6915336cebac"
SRC_URI[thread_local-1.1.7.sha256sum] = "3fdd6f064ccff2d6567adcb3873ca630700f00b5ad3f060c25b5dcfd9a4ce152"
SRC_URI[time-core-0.1.0.sha256sum] = "2e153e1f1acaef8acc537e68b44906d2db6436e2b35ac2c6b42640fff91f00fd"
SRC_URI[time-macros-0.2.8.sha256sum] = "fd80a657e71da814b8e5d60d3374fc6d35045062245d80224748ae522dd76f36"
SRC_URI[time-0.1.45.sha256sum] = "1b797afad3f312d1c66a56d11d0316f916356d11bd158fbc6ca6389ff6bf805a"
SRC_URI[time-0.3.20.sha256sum] = "cd0cbfecb4d19b5ea75bb31ad904eb5b9fa13f21079c3b92017ebdf4999a5890"
SRC_URI[tiny-keccak-2.0.2.sha256sum] = "2c9d3793400a45f954c52e73d068316d76b6f4e36977e3fcebb13a2721e80237"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[tokio-macros-2.1.0.sha256sum] = "630bdcf245f78637c13ec01ffae6187cca34625e8c63150d424b59e55af2675e"
SRC_URI[tokio-native-tls-0.3.1.sha256sum] = "bbae76ab933c85776efabc971569dd6119c580d8f5d448769dec1764bf796ef2"
SRC_URI[tokio-retry-0.3.0.sha256sum] = "7f57eb36ecbe0fc510036adff84824dd3c24bb781e21bfa67b69d556aa85214f"
SRC_URI[tokio-rustls-0.22.0.sha256sum] = "bc6844de72e57df1980054b38be3a9f4702aba4858be64dd700181a8a6d0e1b6"
SRC_URI[tokio-rustls-0.23.4.sha256sum] = "c43ee83903113e03984cb9e5cebe6c04a5116269e900e3ddba8f068a62adda59"
SRC_URI[tokio-serde-0.8.0.sha256sum] = "911a61637386b789af998ee23f50aa30d5fd7edcec8d6d3dedae5e5815205466"
SRC_URI[tokio-stream-0.1.14.sha256sum] = "397c988d37662c7dda6d2208364a706264bf3d6138b11d436cbac0ad38832842"
SRC_URI[tokio-tungstenite-0.18.0.sha256sum] = "54319c93411147bced34cb5609a80e0a8e44c5999c93903a81cd866630ec0bfd"
SRC_URI[tokio-util-0.7.8.sha256sum] = "806fe8c2c87eccc8b3267cbae29ed3ab2d0bd37fca70ab622e46aaa9375ddb7d"
SRC_URI[tokio-1.28.0.sha256sum] = "c3c786bf8134e5a3a166db9b29ab8f48134739014a3eca7bc6bfa95d673b136f"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml-0.7.3.sha256sum] = "b403acf6f2bb0859c93c7f0d967cb4a75a7ac552100f9322faf64dc047669b21"
SRC_URI[toml_datetime-0.6.1.sha256sum] = "3ab8ed2edee10b50132aed5f331333428b011c99402b5a534154ed15746f9622"
SRC_URI[toml_edit-0.19.8.sha256sum] = "239410c8609e8125456927e6707163a3b1fdb40561e4b803bc041f466ccfdc13"
SRC_URI[tower-service-0.3.2.sha256sum] = "b6bc1c9ce2b5135ac7f93c72918fc37feb872bdc6a5533a8b85eb4b86bfdae52"
SRC_URI[tracing-attributes-0.1.24.sha256sum] = "0f57e3ca2a01450b1a921183a9c9cbfda207fd822cef4ccb00a65402cbba7a74"
SRC_URI[tracing-core-0.1.30.sha256sum] = "24eb03ba0eab1fd845050058ce5e616558e8f8d8fca633e6b163fe25c797213a"
SRC_URI[tracing-log-0.1.3.sha256sum] = "78ddad33d2d10b1ed7eb9d1f518a5674713876e97e5bb9b7345a7984fbb4f922"
SRC_URI[tracing-subscriber-0.3.17.sha256sum] = "30a651bc37f915e81f087d86e62a18eec5f79550c7faff886f7090b4ea757c77"
SRC_URI[tracing-0.1.37.sha256sum] = "8ce8c33a8d48bd45d624a6e523445fd21ec13d3653cd51f681abf67418f54eb8"
SRC_URI[try-lock-0.2.4.sha256sum] = "3528ecfd12c466c6f163363caf2d02a71161dd5e1cc6ae7b34207ea2d42d81ed"
SRC_URI[tungstenite-0.18.0.sha256sum] = "30ee6ab729cd4cf0fd55218530c4522ed30b7b6081752839b68fcec8d0960788"
SRC_URI[typenum-1.16.0.sha256sum] = "497961ef93d974e23eb6f433eb5fe1b7930b659f06d12dec6fc44a8f554c0bba"
SRC_URI[ubyte-0.10.3.sha256sum] = "c81f0dae7d286ad0d9366d7679a77934cfc3cf3a8d67e82669794412b2368fe6"
SRC_URI[uds_windows-1.0.2.sha256sum] = "ce65604324d3cce9b966701489fbd0cf318cb1f7bd9dd07ac9a4ee6fb791930d"
SRC_URI[uncased-0.9.7.sha256sum] = "09b01702b0fd0b3fadcf98e098780badda8742d4f4a7676615cad90e8ac73622"
SRC_URI[unicase-2.6.0.sha256sum] = "50f37be617794602aabbeee0be4f259dc1778fabe05e2d67ee8f79326d5cb4f6"
SRC_URI[unicode-bidi-0.3.13.sha256sum] = "92888ba5573ff080736b3648696b70cafad7d250551175acbaa4e0385b3e1460"
SRC_URI[unicode-ident-1.0.8.sha256sum] = "e5464a87b239f13a63a501f2701565754bae92d243d4bb7eb12f6d57d2269bf4"
SRC_URI[unicode-normalization-0.1.22.sha256sum] = "5c5713f0fc4b5db668a2ac63cdb7bb4469d8c9fed047b1d0292cc7b0ce2ba921"
SRC_URI[unicode-segmentation-1.10.1.sha256sum] = "1dd624098567895118886609431a7c3b8f516e41d30e0643f03d94592a147e36"
SRC_URI[unicode-width-0.1.10.sha256sum] = "c0edd1e5b14653f783770bce4a4dabb4a5108a5370a5f5d8cfe8710c361f6c8b"
SRC_URI[unicode-xid-0.2.4.sha256sum] = "f962df74c8c05a667b5ee8bcf162993134c104e96440b663c8daa176dc772d8c"
SRC_URI[unsafe-libyaml-0.2.8.sha256sum] = "1865806a559042e51ab5414598446a5871b561d21b6764f2eabb0dd481d880a6"
SRC_URI[untrusted-0.7.1.sha256sum] = "a156c684c91ea7d62626509bce3cb4e1d9ed5c4d978f7b4352658f96a4c26b4a"
SRC_URI[url-2.3.1.sha256sum] = "0d68c799ae75762b8c3fe375feb6600ef5602c883c5d21eb51c09f22b83c4643"
SRC_URI[utf-8-0.7.6.sha256sum] = "09cc8ee72d2a9becf2f2febe0205bbed8fc6615b7cb429ad062dc7b7ddd036a9"
SRC_URI[uuid-1.3.2.sha256sum] = "4dad5567ad0cf5b760e5665964bec1b47dfd077ba8a2544b513f3556d3d239a2"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[value-trait-0.4.0.sha256sum] = "c0a635407649b66e125e4d2ffd208153210179f8c7c8b71c030aa2ad3eeb4c8f"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[version-compare-0.1.1.sha256sum] = "579a42fc0b8e0c63b76519a339be31bed574929511fa53c1a3acae26eb258f29"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[wait-timeout-0.2.0.sha256sum] = "9f200f5b12eb75f8c1ed65abd4b2db8a6e1b138a20de009dacee265a2498f3f6"
SRC_URI[waker-fn-1.1.0.sha256sum] = "9d5b2c62b4012a3e1eca5a7e077d13b3bf498c4073e33ccd58626607748ceeca"
SRC_URI[want-0.3.0.sha256sum] = "1ce8a968cb1cd110d136ff8b819a556d6fb6d919363c61534f6860c7eb172ba0"
SRC_URI[warp-0.3.5.sha256sum] = "ba431ef570df1287f7f8b07e376491ad54f84d26ac473489427231e1718e1f69"
SRC_URI[wasi-0.10.0+wasi-snapshot-preview1.sha256sum] = "1a143597ca7c7793eff794def352d41792a93c481eb1042423ff7ff72ba2c31f"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-backend-0.2.84.sha256sum] = "95ce90fd5bcc06af55a641a86428ee4229e44e07033963a2290a8e241607ccb9"
SRC_URI[wasm-bindgen-futures-0.4.34.sha256sum] = "f219e0d211ba40266969f6dbdd90636da12f75bee4fc9d6c23d1260dadb51454"
SRC_URI[wasm-bindgen-macro-support-0.2.84.sha256sum] = "2aff81306fcac3c7515ad4e177f521b5c9a15f2b08f4e32d823066102f35a5f6"
SRC_URI[wasm-bindgen-macro-0.2.84.sha256sum] = "4c21f77c0bedc37fd5dc21f897894a5ca01e7bb159884559461862ae90c0b4c5"
SRC_URI[wasm-bindgen-shared-0.2.84.sha256sum] = "0046fef7e28c3804e5e38bfa31ea2a0f73905319b677e57ebe37e49358989b5d"
SRC_URI[wasm-bindgen-0.2.84.sha256sum] = "31f8dcbc21f30d9b8f2ea926ecb58f6b91192c17e9d33594b3df58b2007ca53b"
SRC_URI[wasm-streams-0.2.3.sha256sum] = "6bbae3363c08332cadccd13b67db371814cd214c2524020932f0804b8cf7c078"
SRC_URI[web-sys-0.3.61.sha256sum] = "e33b99f4b23ba3eec1a53ac264e35a755f00e966e0065077d6027c0f575b0b97"
SRC_URI[webpki-0.21.4.sha256sum] = "b8e38c0608262c46d4a56202ebabdeb094cef7e560ca7a226c6bf055188aa4ea"
SRC_URI[webpki-0.22.0.sha256sum] = "f095d78192e208183081cc07bc5515ef55216397af48b873e5edcd72637fa1bd"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[windows-sys-0.42.0.sha256sum] = "5a3e1820f08b8513f676f7ab6c1f99ff312fb97b553d30ff4dd86f9f15728aa7"
SRC_URI[windows-sys-0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows-targets-0.48.0.sha256sum] = "7b1eb6f0cd7c80c79759c929114ef071b87354ce476d9d94271031c0497adfd5"
SRC_URI[windows-0.48.0.sha256sum] = "e686886bc078bc1b0b600cac0147aadb815089b6e4da64016cbd754b6342700f"
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
SRC_URI[winreg-0.10.1.sha256sum] = "80d0f4e272c85def139476380b12f9ac60926689dd2e01d4923222f40580869d"
SRC_URI[xdg-home-1.0.0.sha256sum] = "2769203cd13a0c6015d515be729c526d041e9cf2c0cc478d57faee85f40c6dcd"
SRC_URI[yaml-rust-0.4.5.sha256sum] = "56c1936c4cc7a1c9ab21a1ebb602eb942ba868cbd44a99cb7cdc5892335e1c85"
SRC_URI[yansi-0.5.1.sha256sum] = "09041cd90cf85f7f8b2df60c646f853b7f535ce68f85244eb6731cf89fa498ec"
SRC_URI[zbus-3.12.0.sha256sum] = "29242fa5ec5693629ae74d6eb1f69622a9511f600986d6d9779bccf36ac316e3"
SRC_URI[zbus_macros-3.12.0.sha256sum] = "537793e26e9af85f774801dc52c6f6292352b2b517c5cf0449ffd3735732a53a"
SRC_URI[zbus_names-2.5.0.sha256sum] = "f34f314916bd89bdb9934154627fab152f4f28acdda03e7c4c68181b214fe7e3"
SRC_URI[zbus_systemd-0.0.8.sha256sum] = "f7681e3440cbd50a17f2979785619b487e197b5e7e375a851702d4d20f3965f0"
SRC_URI[zeroize-1.6.0.sha256sum] = "2a0956f1ba7c7909bfb66c2e9e4124ab6f6482560f6628b5aaeba39207c9aad9"
SRC_URI[zeroize_derive-1.4.2.sha256sum] = "ce36e65b0d2999d2aafac989fb249189a141aee1f53c612c1f37d72631959f69"
SRC_URI[zip-0.6.4.sha256sum] = "0445d0fbc924bb93539b4316c11afb121ea39296f99a3c4c9edad09e3658cdef"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.8+zstd.1.5.5.sha256sum] = "5556e6ee25d32df2586c098bbfa278803692a20d0ab9565e049480d52707ec8c"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zvariant-3.12.0.sha256sum] = "46fe4914a985446d6fd287019b5fceccce38303d71407d9e6e711d44954a05d8"
SRC_URI[zvariant_derive-3.12.0.sha256sum] = "34c20260af4b28b3275d6676c7e2a6be0d4332e8e0aba4616d34007fd84e462a"
SRC_URI[zvariant_utils-1.0.0.sha256sum] = "53b22993dbc4d128a17a3b6c92f1c63872dd67198537ee728d8b5d7c40640a8b"
