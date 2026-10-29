/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceCooperativeMatrixInfo2EXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkScopeKHR scope;
 *     uint32_t invocations;
 *     uint32_t subgroupSize;
 *     VkCooperativeMatrixFlagsEXT flags;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrixInfo2EXT extends Struct<VkPhysicalDeviceCooperativeMatrixInfo2EXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCOPE,
        INVOCATIONS,
        SUBGROUPSIZE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCOPE = layout.offsetof(2);
        INVOCATIONS = layout.offsetof(3);
        SUBGROUPSIZE = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceCooperativeMatrixInfo2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrixInfo2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code scope} field. */
    @NativeType("VkScopeKHR")
    public int scope() { return nscope(address()); }
    /** @return the value of the {@code invocations} field. */
    @NativeType("uint32_t")
    public int invocations() { return ninvocations(address()); }
    /** @return the value of the {@code subgroupSize} field. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkCooperativeMatrixFlagsEXT")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCooperativeMatrixMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT sType$Default() { return sType(EXTCooperativeMatrixMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code scope} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT scope(@NativeType("VkScopeKHR") int value) { nscope(address(), value); return this; }
    /** Sets the specified value to the {@code invocations} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT invocations(@NativeType("uint32_t") int value) { ninvocations(address(), value); return this; }
    /** Sets the specified value to the {@code subgroupSize} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT subgroupSize(@NativeType("uint32_t") int value) { nsubgroupSize(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT flags(@NativeType("VkCooperativeMatrixFlagsEXT") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT set(
        int sType,
        long pNext,
        int scope,
        int invocations,
        int subgroupSize,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        scope(scope);
        invocations(invocations);
        subgroupSize(subgroupSize);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT set(VkPhysicalDeviceCooperativeMatrixInfo2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT malloc() {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT calloc() {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrixInfo2EXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrixInfo2EXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixInfo2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.PNEXT); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.SCOPE); }
    /** Unsafe version of {@link #invocations}. */
    public static int ninvocations(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.INVOCATIONS); }
    /** Unsafe version of {@link #subgroupSize}. */
    public static int nsubgroupSize(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.SUBGROUPSIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.PNEXT, value); }
    /** Unsafe version of {@link #scope(int) scope}. */
    public static void nscope(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.SCOPE, value); }
    /** Unsafe version of {@link #invocations(int) invocations}. */
    public static void ninvocations(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.INVOCATIONS, value); }
    /** Unsafe version of {@link #subgroupSize(int) subgroupSize}. */
    public static void nsubgroupSize(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.SUBGROUPSIZE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixInfo2EXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixInfo2EXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixInfo2EXT ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixInfo2EXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixInfo2EXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceCooperativeMatrixInfo2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.npNext(address()); }
        /** @return the value of the {@code scope} field. */
        @NativeType("VkScopeKHR")
        public int scope() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.nscope(address()); }
        /** @return the value of the {@code invocations} field. */
        @NativeType("uint32_t")
        public int invocations() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.ninvocations(address()); }
        /** @return the value of the {@code subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.nsubgroupSize(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkCooperativeMatrixFlagsEXT")
        public int flags() { return VkPhysicalDeviceCooperativeMatrixInfo2EXT.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCooperativeMatrixMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer sType$Default() { return sType(EXTCooperativeMatrixMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code scope} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer scope(@NativeType("VkScopeKHR") int value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.nscope(address(), value); return this; }
        /** Sets the specified value to the {@code invocations} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer invocations(@NativeType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.ninvocations(address(), value); return this; }
        /** Sets the specified value to the {@code subgroupSize} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer subgroupSize(@NativeType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.nsubgroupSize(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPhysicalDeviceCooperativeMatrixInfo2EXT.Buffer flags(@NativeType("VkCooperativeMatrixFlagsEXT") int value) { VkPhysicalDeviceCooperativeMatrixInfo2EXT.nflags(address(), value); return this; }

    }

}