### 3.4.3

_Released 2026 Aug 23_

#### Bindings

- bgfx: Updated to API version 156 (up from 149)
  * Added support for Windows ARM64.
- glfw: Updated to 3.5.1 (up from 3.4)
- harfbuzz: Updated to 14.3.1 (up from 14.2.1)
- KTX: Updated to 5.0.0-rc2 (up from 5.0.0-rc1)
- libffi: Updated to 3.8.0 (up from 3.7.1)
- lmdb: Updated to 1.0.1 (up from 0.9.35)
  * LMDB v1.0 is incompatible with earlier versions.
  * Use v0.9 `mdb_dump` with v1.0 `mdb_load` to migrate existing databases.
- mimalloc: Updated to 3.5.0 (up from 3.3.2)
- OpenXR: Updated to 1.1.62 (up from 1.1.61)
- rpmalloc: Updated to 2.0.1 (up from 2.0.0)
- SDL: Updated to 3.4.14 (up from 3.4.12)
- Shaderc: Updated to 2026.3 (up from 2026.2)
  * glslang: Updated to 16.4.0 (up from 16.2.0)
  * SPIRV Tools: Updated to 2026.3.rc1 (up 2026.2.rc1)
- Vulkan: Updated to 1.4.360 (up from 1.4.356)

#### Fixes

- Core: Fixed handling of `long` arguments in runtime-generated downcalls that require wrapping.
- Core: Fixed deadlock that can occur when calling `DetachCurrentThread` on JVM exit. (#1140)
- harfbuzz: Loading an experimental library now also automatically loads the core harfbuzz library. (#1144)
- liburing: Fixed `io_uring_mlock_size(_params)` return type. (#1142)
- mimalloc: `MemoryAllocator::getAlignedAlloc` now returns a compatible function. (#1135)
- SDL: Fixed `SDL_GetDefaultLogOutputFunction` return type.
- SDL: Fixed `SDL_SetCursor` to accept a `NULL` cursor. (#1138)