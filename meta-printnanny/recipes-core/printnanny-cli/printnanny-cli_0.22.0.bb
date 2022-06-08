# Auto-Generated by cargo-bitbake 0.3.16-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get printnanny-cli could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/printnanny-cli/0.22.0-rc.5"
SRC_URI += "git://git@github.com/bitsy-ai/print-nanny-cli.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "ac5ac4f833294cbcfc7be99598e3189cbf797d9c"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "cli"
PV:append = ".AUTOINC+ac5ac4f833"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.17.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aead/0.4.3 \
    crate://crates.io/aes-gcm/0.9.4 \
    crate://crates.io/aes/0.7.5 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anyhow/1.0.57 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/assert_cmd/2.0.4 \
    crate://crates.io/async-channel/1.6.1 \
    crate://crates.io/async-io/1.7.0 \
    crate://crates.io/async-process/1.4.0 \
    crate://crates.io/async-stream-impl/0.3.3 \
    crate://crates.io/async-stream/0.3.3 \
    crate://crates.io/async-task/4.2.0 \
    crate://crates.io/async-trait/0.1.56 \
    crate://crates.io/atoi/0.4.0 \
    crate://crates.io/atomic-waker/1.0.0 \
    crate://crates.io/atomic/0.5.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.65 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/binascii/0.1.4 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.2 \
    crate://crates.io/block-buffer/0.7.3 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block-padding/0.1.5 \
    crate://crates.io/blocking/1.2.0 \
    crate://crates.io/bstr/0.2.17 \
    crate://crates.io/buf_redux/0.8.4 \
    crate://crates.io/bumpalo/3.10.0 \
    crate://crates.io/byte-tools/0.3.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.1.0 \
    crate://crates.io/cache-padded/1.2.0 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono-tz-build/0.0.2 \
    crate://crates.io/chrono-tz/0.6.1 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/clap/3.1.18 \
    crate://crates.io/clap_derive/3.1.18 \
    crate://crates.io/clap_lex/0.2.0 \
    crate://crates.io/concurrent-queue/1.2.2 \
    crate://crates.io/config/0.11.0 \
    crate://crates.io/console/0.14.1 \
    crate://crates.io/cookie/0.16.0 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.2 \
    crate://crates.io/crc-catalog/1.1.1 \
    crate://crates.io/crc/2.1.0 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-queue/0.3.5 \
    crate://crates.io/crossbeam-utils/0.8.8 \
    crate://crates.io/crypto-common/0.1.3 \
    crate://crates.io/ctr/0.8.0 \
    crate://crates.io/darling/0.13.4 \
    crate://crates.io/darling_core/0.13.4 \
    crate://crates.io/darling_macro/0.13.4 \
    crate://crates.io/deunicode/0.4.3 \
    crate://crates.io/devise/0.3.1 \
    crate://crates.io/devise_codegen/0.3.1 \
    crate://crates.io/devise_core/0.3.1 \
    crate://crates.io/dialoguer/0.8.0 \
    crate://crates.io/diesel/1.4.8 \
    crate://crates.io/diesel_derives/1.4.1 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/digest/0.10.3 \
    crate://crates.io/digest/0.8.1 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/doc-comment/0.3.3 \
    crate://crates.io/dotenv/0.15.0 \
    crate://crates.io/downcast/0.10.0 \
    crate://crates.io/educe/0.4.19 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding_rs/0.8.31 \
    crate://crates.io/enum-ordinalize/3.1.11 \
    crate://crates.io/env_logger/0.9.0 \
    crate://crates.io/event-listener/2.5.2 \
    crate://crates.io/fake-simd/0.1.2 \
    crate://crates.io/fastrand/1.7.0 \
    crate://crates.io/figment/0.10.6 \
    crate://crates.io/filetime/0.2.16 \
    crate://crates.io/flate2/1.0.24 \
    crate://crates.io/float-cmp/0.8.0 \
    crate://crates.io/float-cmp/0.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.0.1 \
    crate://crates.io/fragile/1.2.0 \
    crate://crates.io/fsevent-sys/2.0.1 \
    crate://crates.io/fsevent/0.4.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/function_name-proc-macro/0.2.3 \
    crate://crates.io/function_name/0.2.3 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-intrusive/0.4.0 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/futures/0.3.21 \
    crate://crates.io/generator/0.7.0 \
    crate://crates.io/generic-array/0.12.4 \
    crate://crates.io/generic-array/0.14.5 \
    crate://crates.io/getrandom/0.2.6 \
    crate://crates.io/ghash/0.4.4 \
    crate://crates.io/gimli/0.26.1 \
    crate://crates.io/git-version-macro/0.3.5 \
    crate://crates.io/git-version/0.3.5 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/globset/0.4.8 \
    crate://crates.io/globwalk/0.8.1 \
    crate://crates.io/h2/0.3.13 \
    crate://crates.io/handlebars/4.3.0 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/hashlink/0.7.0 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.7 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hkdf/0.12.3 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.7 \
    crate://crates.io/httparse/1.7.1 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humansize/1.1.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.19 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/ignore/0.4.18 \
    crate://crates.io/indexmap/1.8.2 \
    crate://crates.io/inlinable_string/0.1.15 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.7.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/ipnet/2.5.0 \
    crate://crates.io/itertools/0.10.3 \
    crate://crates.io/itoa/1.0.2 \
    crate://crates.io/js-sys/0.3.57 \
    crate://crates.io/jsonwebtoken/7.2.0 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/lexical-core/0.7.6 \
    crate://crates.io/libc/0.2.126 \
    crate://crates.io/libsqlite3-sys/0.22.2 \
    crate://crates.io/linked-hash-map/0.5.4 \
    crate://crates.io/lock_api/0.4.7 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/maplit/1.0.2 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.9 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.5.3 \
    crate://crates.io/mio-extras/2.0.6 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/mio/0.8.3 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/mockall/0.10.2 \
    crate://crates.io/mockall_derive/0.10.2 \
    crate://crates.io/mqttbytes/0.6.0 \
    crate://crates.io/multer/2.0.2 \
    crate://crates.io/multipart/0.18.0 \
    crate://crates.io/native-tls/0.2.10 \
    crate://crates.io/net2/0.2.37 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/nom/7.1.1 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/normpath/0.3.2 \
    crate://crates.io/notify/4.0.17 \
    crate://crates.io/num-bigint/0.2.6 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.13.1 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/object/0.28.4 \
    crate://crates.io/once_cell/1.12.0 \
    crate://crates.io/opaque-debug/0.2.3 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-sys/0.9.74 \
    crate://crates.io/openssl/0.10.40 \
    crate://crates.io/os_str_bytes/6.1.0 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.8.5 \
    crate://crates.io/parking_lot_core/0.9.3 \
    crate://crates.io/parse-zoneinfo/0.3.0 \
    crate://crates.io/paste/1.0.7 \
    crate://crates.io/pear/0.2.3 \
    crate://crates.io/pear_codegen/0.2.3 \
    crate://crates.io/pem/0.8.3 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pest/2.1.3 \
    crate://crates.io/pest_derive/2.1.0 \
    crate://crates.io/pest_generator/2.1.3 \
    crate://crates.io/pest_meta/2.1.3 \
    crate://crates.io/phf/0.10.1 \
    crate://crates.io/phf_codegen/0.10.0 \
    crate://crates.io/phf_generator/0.10.0 \
    crate://crates.io/phf_shared/0.10.0 \
    crate://crates.io/pin-project-internal/1.0.10 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.10 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/polling/2.2.0 \
    crate://crates.io/pollster/0.2.5 \
    crate://crates.io/polyval/0.5.3 \
    crate://crates.io/ppv-lite86/0.2.16 \
    crate://crates.io/predicates-core/1.0.3 \
    crate://crates.io/predicates-tree/1.0.5 \
    crate://crates.io/predicates/1.0.8 \
    crate://crates.io/predicates/2.1.1 \
    crate://crates.io/printnanny-api-client/0.80.0 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro2-diagnostics/0.9.1 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.39 \
    crate://crates.io/procfs/0.12.0 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/quote/1.0.18 \
    crate://crates.io/r2d2/0.8.9 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/ref-cast-impl/1.0.7 \
    crate://crates.io/ref-cast/1.0.7 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.26 \
    crate://crates.io/regex/1.5.6 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.10 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rocket/0.5.0-rc.2 \
    crate://crates.io/rocket_codegen/0.5.0-rc.2 \
    crate://crates.io/rocket_dyn_templates/0.1.0-rc.2 \
    crate://crates.io/rocket_http/0.5.0-rc.2 \
    crate://crates.io/rocket_sync_db_pools/0.1.0-rc.2 \
    crate://crates.io/rocket_sync_db_pools_codegen/0.1.0-rc.2 \
    crate://crates.io/rumqttc/0.10.0 \
    crate://crates.io/rust-ini/0.13.0 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustls-pemfile/1.0.0 \
    crate://crates.io/rustls/0.19.1 \
    crate://crates.io/rustls/0.20.6 \
    crate://crates.io/rustversion/1.0.6 \
    crate://crates.io/ryu/1.0.10 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.20 \
    crate://crates.io/scheduled-thread-pool/0.2.6 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sct/0.6.1 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/security-framework-sys/2.6.1 \
    crate://crates.io/security-framework/2.6.1 \
    crate://crates.io/semver/1.0.9 \
    crate://crates.io/serde-hjson/0.9.1 \
    crate://crates.io/serde/0.8.23 \
    crate://crates.io/serde/1.0.137 \
    crate://crates.io/serde_derive/1.0.137 \
    crate://crates.io/serde_json/1.0.81 \
    crate://crates.io/serde_prefix/0.1.0 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_with/1.14.0 \
    crate://crates.io/serde_with_macros/1.5.2 \
    crate://crates.io/sha-1/0.10.0 \
    crate://crates.io/sha-1/0.8.2 \
    crate://crates.io/sha-1/0.9.8 \
    crate://crates.io/sha2/0.10.2 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/signal-hook/0.3.14 \
    crate://crates.io/simple_asn1/0.4.1 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/slab/0.4.6 \
    crate://crates.io/slug/0.1.4 \
    crate://crates.io/smallvec/1.8.0 \
    crate://crates.io/socket2/0.4.4 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.3 \
    crate://crates.io/sqlformat/0.1.8 \
    crate://crates.io/sqlx-core/0.5.13 \
    crate://crates.io/sqlx-macros/0.5.13 \
    crate://crates.io/sqlx-rt/0.5.13 \
    crate://crates.io/sqlx/0.5.13 \
    crate://crates.io/stable-pattern/0.1.0 \
    crate://crates.io/state/0.5.3 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/stringprep/0.1.2 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/1.0.96 \
    crate://crates.io/sys-info/0.9.1 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/tera/1.15.0 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/terminal_size/0.1.17 \
    crate://crates.io/termtree/0.2.4 \
    crate://crates.io/test-log/0.2.10 \
    crate://crates.io/textwrap/0.15.0 \
    crate://crates.io/thiserror-impl/1.0.31 \
    crate://crates.io/thiserror/1.0.31 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/time-macros/0.2.4 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/time/0.3.9 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.7.0 \
    crate://crates.io/tokio-native-tls/0.3.0 \
    crate://crates.io/tokio-rustls/0.22.0 \
    crate://crates.io/tokio-rustls/0.23.4 \
    crate://crates.io/tokio-serde/0.8.0 \
    crate://crates.io/tokio-stream/0.1.8 \
    crate://crates.io/tokio-tungstenite/0.15.0 \
    crate://crates.io/tokio-util/0.6.10 \
    crate://crates.io/tokio-util/0.7.2 \
    crate://crates.io/tokio/1.19.0 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/tower-service/0.3.1 \
    crate://crates.io/tracing-attributes/0.1.21 \
    crate://crates.io/tracing-core/0.1.26 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.11 \
    crate://crates.io/tracing/0.1.34 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/tungstenite/0.14.0 \
    crate://crates.io/twoway/0.1.8 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/ubyte/0.10.2 \
    crate://crates.io/ucd-trie/0.1.3 \
    crate://crates.io/uncased/0.9.7 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-segment/0.9.0 \
    crate://crates.io/unic-ucd-segment/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.8 \
    crate://crates.io/unicode-ident/1.0.0 \
    crate://crates.io/unicode-normalization/0.1.19 \
    crate://crates.io/unicode-segmentation/1.9.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.3 \
    crate://crates.io/unicode_categories/0.1.1 \
    crate://crates.io/universal-hash/0.4.1 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.2.2 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/warp/0.3.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.80 \
    crate://crates.io/wasm-bindgen-futures/0.4.30 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.80 \
    crate://crates.io/wasm-bindgen-macro/0.2.80 \
    crate://crates.io/wasm-bindgen-shared/0.2.80 \
    crate://crates.io/wasm-bindgen/0.2.80 \
    crate://crates.io/web-sys/0.3.57 \
    crate://crates.io/webpki-roots/0.21.1 \
    crate://crates.io/webpki/0.21.4 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/wepoll-ffi/0.1.2 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.36.1 \
    crate://crates.io/windows_aarch64_msvc/0.36.1 \
    crate://crates.io/windows_i686_gnu/0.36.1 \
    crate://crates.io/windows_i686_msvc/0.36.1 \
    crate://crates.io/windows_x86_64_gnu/0.36.1 \
    crate://crates.io/windows_x86_64_msvc/0.36.1 \
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
    crate://crates.io/yaml-rust/0.4.5 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zeroize/1.5.5 \
"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SUMMARY = "PrintNanny Command-line Interface"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-cli.git"
LICENSE = "AGPL-3.0-or-later"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
# include printnanny-cli-${PV}.inc
include printnanny-cli.inc
