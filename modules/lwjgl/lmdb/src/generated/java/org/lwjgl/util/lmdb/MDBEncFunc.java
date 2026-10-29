/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke MDB_enc_func *} */
public abstract class MDBEncFunc extends Callback implements MDBEncFuncI {

    /**
     * Creates a {@code MDBEncFunc} instance from the specified function pointer.
     *
     * @return the new {@code MDBEncFunc}
     */
    public static MDBEncFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MDBEncFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MDBEncFunc} instance that delegates to the specified {@code MDBEncFuncI} instance. */
    public static MDBEncFunc create(MDBEncFuncI instance) { return create(instance, instance.address()); }

    private static MDBEncFunc create(MDBEncFuncI instance, long functionPointer) {
        return instance instanceof MDBEncFunc
            ? (MDBEncFunc)instance
            : new MDBEncFunc(functionPointer) {
                @Override public void invoke(long src, long dst, long key, boolean encdec) {
                    instance.invoke(src, dst, key, encdec);
                }
            };
    }

    protected MDBEncFunc() {
        super(DESCRIPTOR);
    }

    MDBEncFunc(long functionPointer) {
        super(functionPointer);
    }

}