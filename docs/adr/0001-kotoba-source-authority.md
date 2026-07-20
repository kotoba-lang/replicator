# ADR 0001: Kotoba source authority

## Status

Accepted.

## Decision

`src/kotoba/replicator.kotoba` is the sole production source for the
Replicator path-reservation metadata. Production `.clj`, `.cljc`, and `.cljs`
sources are forbidden.

This repository does not implement synthetic-data generation. Randomization,
rendering, sensors, GPU execution, and NVIDIA-compatible providers remain
gated Kami responsibilities. The metadata contract exposes closed typed string
getters and is executed through the reference evaluator, restricted
JavaScript, and instantiated typed Wasm.

Compatibility is semantic and ABI-based, not Wasm byte identity. The JVM is
permitted only as compiler/test infrastructure.
