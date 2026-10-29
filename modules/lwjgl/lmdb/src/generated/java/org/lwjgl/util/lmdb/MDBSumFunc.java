/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke MDB_sum_func *} */
public abstract class MDBSumFunc extends Callback implements MDBSumFuncI {

    /**
     * Creates a {@code MDBSumFunc} instance from the specified function pointer.
     *
     * @return the new {@code MDBSumFunc}
     */
    public static MDBSumFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MDBSumFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MDBSumFunc} instance that delegates to the specified {@code MDBSumFuncI} instance. */
    public static MDBSumFunc create(MDBSumFuncI instance) { return create(instance, instance.address()); }

    private static MDBSumFunc create(MDBSumFuncI instance, long functionPointer) {
        return instance instanceof MDBSumFunc
            ? (MDBSumFunc)instance
            : new MDBSumFunc(functionPointer) {
                @Override public void invoke(long src, long dst, long key) {
                    instance.invoke(src, dst, key);
                }
            };
    }

    protected MDBSumFunc() {
        super(DESCRIPTOR);
    }

    MDBSumFunc(long functionPointer) {
        super(functionPointer);
    }

}