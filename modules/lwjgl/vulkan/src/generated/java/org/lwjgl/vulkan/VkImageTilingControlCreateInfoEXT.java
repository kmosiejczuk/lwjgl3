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
 * struct VkImageTilingControlCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageTilingControlEXT tilingControl;
 * }}</pre>
 */
public class VkImageTilingControlCreateInfoEXT extends Struct<VkImageTilingControlCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TILINGCONTROL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILINGCONTROL = layout.offsetof(2);
    }

    protected VkImageTilingControlCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageTilingControlCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageTilingControlCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageTilingControlCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageTilingControlCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code tilingControl} field. */
    @NativeType("VkImageTilingControlEXT")
    public int tilingControl() { return ntilingControl(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageTilingControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageTilingControl#VK_STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkImageTilingControlCreateInfoEXT sType$Default() { return sType(EXTImageTilingControl.VK_STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageTilingControlCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tilingControl} field. */
    public VkImageTilingControlCreateInfoEXT tilingControl(@NativeType("VkImageTilingControlEXT") int value) { ntilingControl(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageTilingControlCreateInfoEXT set(
        int sType,
        long pNext,
        int tilingControl
    ) {
        sType(sType);
        pNext(pNext);
        tilingControl(tilingControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageTilingControlCreateInfoEXT set(VkImageTilingControlCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageTilingControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageTilingControlCreateInfoEXT malloc() {
        return new VkImageTilingControlCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageTilingControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageTilingControlCreateInfoEXT calloc() {
        return new VkImageTilingControlCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageTilingControlCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageTilingControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageTilingControlCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageTilingControlCreateInfoEXT} instance for the specified memory address. */
    public static VkImageTilingControlCreateInfoEXT create(long address) {
        return new VkImageTilingControlCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageTilingControlCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageTilingControlCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageTilingControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageTilingControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageTilingControlCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageTilingControlCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageTilingControlCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageTilingControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageTilingControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageTilingControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageTilingControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageTilingControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageTilingControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageTilingControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageTilingControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageTilingControlCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageTilingControlCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageTilingControlCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #tilingControl}. */
    public static int ntilingControl(long struct) { return memGetInt(struct + VkImageTilingControlCreateInfoEXT.TILINGCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageTilingControlCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageTilingControlCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #tilingControl(int) tilingControl}. */
    public static void ntilingControl(long struct, int value) { memPutInt(struct + VkImageTilingControlCreateInfoEXT.TILINGCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkImageTilingControlCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageTilingControlCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageTilingControlCreateInfoEXT ELEMENT_FACTORY = VkImageTilingControlCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageTilingControlCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageTilingControlCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageTilingControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageTilingControlCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageTilingControlCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code tilingControl} field. */
        @NativeType("VkImageTilingControlEXT")
        public int tilingControl() { return VkImageTilingControlCreateInfoEXT.ntilingControl(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageTilingControlCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageTilingControlCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageTilingControl#VK_STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkImageTilingControlCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageTilingControl.VK_STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageTilingControlCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageTilingControlCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tilingControl} field. */
        public VkImageTilingControlCreateInfoEXT.Buffer tilingControl(@NativeType("VkImageTilingControlEXT") int value) { VkImageTilingControlCreateInfoEXT.ntilingControl(address(), value); return this; }

    }

}