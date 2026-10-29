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
 * struct XrColorSpacesEnumerateInfoSONY {
 *     XrStructureType type;
 *     void const * next;
 *     int64_t format;
 * }}</pre>
 */
public class XrColorSpacesEnumerateInfoSONY extends Struct<XrColorSpacesEnumerateInfoSONY> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected XrColorSpacesEnumerateInfoSONY(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColorSpacesEnumerateInfoSONY create(long address, @Nullable ByteBuffer container) {
        return new XrColorSpacesEnumerateInfoSONY(address, container);
    }

    /**
     * Creates a {@code XrColorSpacesEnumerateInfoSONY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColorSpacesEnumerateInfoSONY(ByteBuffer container) {
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
    /** @return the value of the {@code format} field. */
    @NativeType("int64_t")
    public long format() { return nformat(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrColorSpacesEnumerateInfoSONY type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link SONYSwapchainColorSpace#XR_TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY} value to the {@code type} field. */
    public XrColorSpacesEnumerateInfoSONY type$Default() { return type(SONYSwapchainColorSpace.XR_TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY); }
    /** Sets the specified value to the {@code next} field. */
    public XrColorSpacesEnumerateInfoSONY next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public XrColorSpacesEnumerateInfoSONY format(@NativeType("int64_t") long value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColorSpacesEnumerateInfoSONY set(
        int type,
        long next,
        long format
    ) {
        type(type);
        next(next);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColorSpacesEnumerateInfoSONY set(XrColorSpacesEnumerateInfoSONY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColorSpacesEnumerateInfoSONY malloc() {
        return new XrColorSpacesEnumerateInfoSONY(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColorSpacesEnumerateInfoSONY calloc() {
        return new XrColorSpacesEnumerateInfoSONY(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance allocated with {@link BufferUtils}. */
    public static XrColorSpacesEnumerateInfoSONY create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColorSpacesEnumerateInfoSONY(memAddress(container), container);
    }

    /** Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance for the specified memory address. */
    public static XrColorSpacesEnumerateInfoSONY create(long address) {
        return new XrColorSpacesEnumerateInfoSONY(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColorSpacesEnumerateInfoSONY createSafe(long address) {
        return address == NULL ? null : new XrColorSpacesEnumerateInfoSONY(address, null);
    }

    /**
     * Returns a new {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColorSpacesEnumerateInfoSONY.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColorSpacesEnumerateInfoSONY malloc(MemoryStack stack) {
        return new XrColorSpacesEnumerateInfoSONY(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColorSpacesEnumerateInfoSONY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColorSpacesEnumerateInfoSONY calloc(MemoryStack stack) {
        return new XrColorSpacesEnumerateInfoSONY(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColorSpacesEnumerateInfoSONY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColorSpacesEnumerateInfoSONY.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrColorSpacesEnumerateInfoSONY.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrColorSpacesEnumerateInfoSONY.NEXT); }
    /** Unsafe version of {@link #format}. */
    public static long nformat(long struct) { return memGetLong(struct + XrColorSpacesEnumerateInfoSONY.FORMAT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrColorSpacesEnumerateInfoSONY.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrColorSpacesEnumerateInfoSONY.NEXT, value); }
    /** Unsafe version of {@link #format(long) format}. */
    public static void nformat(long struct, long value) { memPutLong(struct + XrColorSpacesEnumerateInfoSONY.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link XrColorSpacesEnumerateInfoSONY} structs. */
    public static class Buffer extends StructBuffer<XrColorSpacesEnumerateInfoSONY, Buffer> implements NativeResource {

        private static final XrColorSpacesEnumerateInfoSONY ELEMENT_FACTORY = XrColorSpacesEnumerateInfoSONY.create(-1L);

        /**
         * Creates a new {@code XrColorSpacesEnumerateInfoSONY.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColorSpacesEnumerateInfoSONY#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColorSpacesEnumerateInfoSONY getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrColorSpacesEnumerateInfoSONY.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrColorSpacesEnumerateInfoSONY.nnext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("int64_t")
        public long format() { return XrColorSpacesEnumerateInfoSONY.nformat(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrColorSpacesEnumerateInfoSONY.Buffer type(@NativeType("XrStructureType") int value) { XrColorSpacesEnumerateInfoSONY.ntype(address(), value); return this; }
        /** Sets the {@link SONYSwapchainColorSpace#XR_TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY} value to the {@code type} field. */
        public XrColorSpacesEnumerateInfoSONY.Buffer type$Default() { return type(SONYSwapchainColorSpace.XR_TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY); }
        /** Sets the specified value to the {@code next} field. */
        public XrColorSpacesEnumerateInfoSONY.Buffer next(@NativeType("void const *") long value) { XrColorSpacesEnumerateInfoSONY.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public XrColorSpacesEnumerateInfoSONY.Buffer format(@NativeType("int64_t") long value) { XrColorSpacesEnumerateInfoSONY.nformat(address(), value); return this; }

    }

}