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
 * struct VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeMatrixProperties2;
 *     VkBool32 cooperativeMatrixReductions;
 *     VkBool32 cooperativeMatrixConversions;
 *     VkBool32 cooperativeMatrixPerElementOperations;
 *     VkBool32 cooperativeMatrixGetCoordinate;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT extends Struct<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXPROPERTIES2,
        COOPERATIVEMATRIXREDUCTIONS,
        COOPERATIVEMATRIXCONVERSIONS,
        COOPERATIVEMATRIXPERELEMENTOPERATIONS,
        COOPERATIVEMATRIXGETCOORDINATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXPROPERTIES2 = layout.offsetof(2);
        COOPERATIVEMATRIXREDUCTIONS = layout.offsetof(3);
        COOPERATIVEMATRIXCONVERSIONS = layout.offsetof(4);
        COOPERATIVEMATRIXPERELEMENTOPERATIONS = layout.offsetof(5);
        COOPERATIVEMATRIXGETCOORDINATE = layout.offsetof(6);
    }

    protected VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrixProperties2} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixProperties2() { return ncooperativeMatrixProperties2(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixReductions} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixReductions() { return ncooperativeMatrixReductions(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixConversions} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixConversions() { return ncooperativeMatrixConversions(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixPerElementOperations} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixPerElementOperations() { return ncooperativeMatrixPerElementOperations(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixGetCoordinate} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixGetCoordinate() { return ncooperativeMatrixGetCoordinate(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCooperativeMatrixMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT sType$Default() { return sType(EXTCooperativeMatrixMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixProperties2} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixProperties2(@NativeType("VkBool32") boolean value) { ncooperativeMatrixProperties2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixReductions} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) { ncooperativeMatrixReductions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixConversions} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) { ncooperativeMatrixConversions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixPerElementOperations} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) { ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixGetCoordinate} field. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixGetCoordinate(@NativeType("VkBool32") boolean value) { ncooperativeMatrixGetCoordinate(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT set(
        int sType,
        long pNext,
        boolean cooperativeMatrixProperties2,
        boolean cooperativeMatrixReductions,
        boolean cooperativeMatrixConversions,
        boolean cooperativeMatrixPerElementOperations,
        boolean cooperativeMatrixGetCoordinate
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixProperties2(cooperativeMatrixProperties2);
        cooperativeMatrixReductions(cooperativeMatrixReductions);
        cooperativeMatrixConversions(cooperativeMatrixConversions);
        cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations);
        cooperativeMatrixGetCoordinate(cooperativeMatrixGetCoordinate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT set(VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT malloc() {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT calloc() {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixProperties2}. */
    public static int ncooperativeMatrixProperties2(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXPROPERTIES2); }
    /** Unsafe version of {@link #cooperativeMatrixReductions}. */
    public static int ncooperativeMatrixReductions(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXREDUCTIONS); }
    /** Unsafe version of {@link #cooperativeMatrixConversions}. */
    public static int ncooperativeMatrixConversions(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXCONVERSIONS); }
    /** Unsafe version of {@link #cooperativeMatrixPerElementOperations}. */
    public static int ncooperativeMatrixPerElementOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXPERELEMENTOPERATIONS); }
    /** Unsafe version of {@link #cooperativeMatrixGetCoordinate}. */
    public static int ncooperativeMatrixGetCoordinate(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXGETCOORDINATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrixProperties2(boolean) cooperativeMatrixProperties2}. */
    public static void ncooperativeMatrixProperties2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXPROPERTIES2, value); }
    /** Unsafe version of {@link #cooperativeMatrixReductions(boolean) cooperativeMatrixReductions}. */
    public static void ncooperativeMatrixReductions(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXREDUCTIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixConversions(boolean) cooperativeMatrixConversions}. */
    public static void ncooperativeMatrixConversions(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXCONVERSIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixPerElementOperations(boolean) cooperativeMatrixPerElementOperations}. */
    public static void ncooperativeMatrixPerElementOperations(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXPERELEMENTOPERATIONS, value); }
    /** Unsafe version of {@link #cooperativeMatrixGetCoordinate(boolean) cooperativeMatrixGetCoordinate}. */
    public static void ncooperativeMatrixGetCoordinate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.COOPERATIVEMATRIXGETCOORDINATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrixProperties2} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixProperties2() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixProperties2(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixReductions} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixReductions() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixReductions(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixConversions} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixConversions() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixConversions(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixPerElementOperations} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixPerElementOperations() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixPerElementOperations(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixGetCoordinate} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixGetCoordinate() { return VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixGetCoordinate(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCooperativeMatrixMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer sType$Default() { return sType(EXTCooperativeMatrixMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixProperties2} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer cooperativeMatrixProperties2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixProperties2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixReductions} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixReductions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixConversions} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixConversions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixPerElementOperations} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixGetCoordinate} field. */
        public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.Buffer cooperativeMatrixGetCoordinate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT.ncooperativeMatrixGetCoordinate(address(), value ? 1 : 0); return this; }

    }

}