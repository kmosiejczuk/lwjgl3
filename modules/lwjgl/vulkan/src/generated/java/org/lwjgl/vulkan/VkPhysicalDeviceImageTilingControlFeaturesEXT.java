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
 * struct VkPhysicalDeviceImageTilingControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageTilingControl;
 * }}</pre>
 */
public class VkPhysicalDeviceImageTilingControlFeaturesEXT extends Struct<VkPhysicalDeviceImageTilingControlFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGETILINGCONTROL;

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
        IMAGETILINGCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageTilingControlFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageTilingControlFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code imageTilingControl} field. */
    @NativeType("VkBool32")
    public boolean imageTilingControl() { return nimageTilingControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageTilingControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT sType$Default() { return sType(EXTImageTilingControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageTilingControl} field. */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT imageTilingControl(@NativeType("VkBool32") boolean value) { nimageTilingControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean imageTilingControl
    ) {
        sType(sType);
        pNext(pNext);
        imageTilingControl(imageTilingControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageTilingControlFeaturesEXT set(VkPhysicalDeviceImageTilingControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageTilingControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageTilingControlFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageTilingControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #imageTilingControl}. */
    public static int nimageTilingControl(long struct) { return memGetInt(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.IMAGETILINGCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageTilingControl(boolean) imageTilingControl}. */
    public static void nimageTilingControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageTilingControlFeaturesEXT.IMAGETILINGCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageTilingControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageTilingControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageTilingControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageTilingControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageTilingControlFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageTilingControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageTilingControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageTilingControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code imageTilingControl} field. */
        @NativeType("VkBool32")
        public boolean imageTilingControl() { return VkPhysicalDeviceImageTilingControlFeaturesEXT.nimageTilingControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageTilingControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageTilingControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer sType$Default() { return sType(EXTImageTilingControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageTilingControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageTilingControl} field. */
        public VkPhysicalDeviceImageTilingControlFeaturesEXT.Buffer imageTilingControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageTilingControlFeaturesEXT.nimageTilingControl(address(), value ? 1 : 0); return this; }

    }

}