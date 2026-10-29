/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSwapchainCreateInfoColorSpaceSONY {
 *     XrStructureType type;
 *     void const * next;
 *     XrColorSpaceSONY colorSpace;
 * }}</pre>
 */
public class XrSwapchainCreateInfoColorSpaceSONY extends Struct<XrSwapchainCreateInfoColorSpaceSONY> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COLORSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COLORSPACE = layout.offsetof(2);
    }

    protected XrSwapchainCreateInfoColorSpaceSONY(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainCreateInfoColorSpaceSONY create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainCreateInfoColorSpaceSONY(address, container);
    }

    /**
     * Creates a {@code XrSwapchainCreateInfoColorSpaceSONY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainCreateInfoColorSpaceSONY(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code colorSpace} field. */
    @NativeType("XrColorSpaceSONY")
    public int colorSpace() { return ncolorSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainCreateInfoColorSpaceSONY type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link SONYSwapchainColorSpace#XR_TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY} value to the {@code type} field. */
    public XrSwapchainCreateInfoColorSpaceSONY type$Default() { return type(SONYSwapchainColorSpace.XR_TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY); }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainCreateInfoColorSpaceSONY next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code colorSpace} field. */
    public XrSwapchainCreateInfoColorSpaceSONY colorSpace(@NativeType("XrColorSpaceSONY") int value) { ncolorSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainCreateInfoColorSpaceSONY set(
        int type,
        long next,
        int colorSpace
    ) {
        type(type);
        next(next);
        colorSpace(colorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainCreateInfoColorSpaceSONY set(XrSwapchainCreateInfoColorSpaceSONY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainCreateInfoColorSpaceSONY malloc() {
        return new XrSwapchainCreateInfoColorSpaceSONY(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainCreateInfoColorSpaceSONY calloc() {
        return new XrSwapchainCreateInfoColorSpaceSONY(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainCreateInfoColorSpaceSONY create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainCreateInfoColorSpaceSONY(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance for the specified memory address. */
    public static XrSwapchainCreateInfoColorSpaceSONY create(long address) {
        return new XrSwapchainCreateInfoColorSpaceSONY(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainCreateInfoColorSpaceSONY createSafe(long address) {
        return address == NULL ? null : new XrSwapchainCreateInfoColorSpaceSONY(address, null);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainCreateInfoColorSpaceSONY.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainCreateInfoColorSpaceSONY malloc(MemoryStack stack) {
        return new XrSwapchainCreateInfoColorSpaceSONY(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainCreateInfoColorSpaceSONY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainCreateInfoColorSpaceSONY calloc(MemoryStack stack) {
        return new XrSwapchainCreateInfoColorSpaceSONY(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfoColorSpaceSONY.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainCreateInfoColorSpaceSONY.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainCreateInfoColorSpaceSONY.NEXT); }
    /** Unsafe version of {@link #colorSpace}. */
    public static int ncolorSpace(long struct) { return memGetInt(struct + XrSwapchainCreateInfoColorSpaceSONY.COLORSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainCreateInfoColorSpaceSONY.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainCreateInfoColorSpaceSONY.NEXT, value); }
    /** Unsafe version of {@link #colorSpace(int) colorSpace}. */
    public static void ncolorSpace(long struct, int value) { memPutInt(struct + XrSwapchainCreateInfoColorSpaceSONY.COLORSPACE, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainCreateInfoColorSpaceSONY} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainCreateInfoColorSpaceSONY, Buffer> implements NativeResource {

        private static final XrSwapchainCreateInfoColorSpaceSONY ELEMENT_FACTORY = XrSwapchainCreateInfoColorSpaceSONY.create(-1L);

        /**
         * Creates a new {@code XrSwapchainCreateInfoColorSpaceSONY.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainCreateInfoColorSpaceSONY#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainCreateInfoColorSpaceSONY getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainCreateInfoColorSpaceSONY.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSwapchainCreateInfoColorSpaceSONY.nnext(address()); }
        /** @return the value of the {@code colorSpace} field. */
        @NativeType("XrColorSpaceSONY")
        public int colorSpace() { return XrSwapchainCreateInfoColorSpaceSONY.ncolorSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainCreateInfoColorSpaceSONY.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainCreateInfoColorSpaceSONY.ntype(address(), value); return this; }
        /** Sets the {@link SONYSwapchainColorSpace#XR_TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY} value to the {@code type} field. */
        public XrSwapchainCreateInfoColorSpaceSONY.Buffer type$Default() { return type(SONYSwapchainColorSpace.XR_TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY); }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainCreateInfoColorSpaceSONY.Buffer next(@NativeType("void const *") long value) { XrSwapchainCreateInfoColorSpaceSONY.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code colorSpace} field. */
        public XrSwapchainCreateInfoColorSpaceSONY.Buffer colorSpace(@NativeType("XrColorSpaceSONY") int value) { XrSwapchainCreateInfoColorSpaceSONY.ncolorSpace(address(), value); return this; }

    }

}