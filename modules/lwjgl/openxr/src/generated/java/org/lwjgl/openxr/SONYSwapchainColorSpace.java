/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SONYSwapchainColorSpace {

    public static final int XR_SONY_swapchain_color_space_SPEC_VERSION = 1;

    public static final String XR_SONY_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "XR_SONY_swapchain_color_space";

    public static final int
        XR_TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY       = 1000776000,
        XR_TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY = 1000776001;

    public static final int
        XR_COLOR_SPACE_SRGB_NONLINEAR_SONY       = 0,
        XR_COLOR_SPACE_DISPLAY_P3_LINEAR_SONY    = 1,
        XR_COLOR_SPACE_DISPLAY_P3_NONLINEAR_SONY = 2,
        XR_COLOR_SPACE_DCI_P3_LINEAR_SONY        = 3,
        XR_COLOR_SPACE_DCI_P3_NONLINEAR_SONY     = 4,
        XR_COLOR_SPACE_EXTENDED_SRGB_LINEAR_SONY = 5,
        XR_COLOR_SPACE_BT709_LINEAR_SONY         = 6,
        XR_COLOR_SPACE_BT709_NONLINEAR_SONY      = 7,
        XR_COLOR_SPACE_BT2020_LINEAR_SONY        = 8,
        XR_COLOR_SPACE_BT2020_PQ_SONY            = 9,
        XR_COLOR_SPACE_BT2020_HLG_SONY           = 10;

    protected SONYSwapchainColorSpace() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateColorSpacesSONY ] ---

    /** {@code XrResult xrEnumerateColorSpacesSONY(XrSession session, XrColorSpacesEnumerateInfoSONY const * enumerateInfo, uint32_t colorSpaceCapacityInput, uint32_t * colorSpaceCountOutput, XrColorSpaceSONY * colorSpaces)} */
    public static int nxrEnumerateColorSpacesSONY(XrSession session, long enumerateInfo, int colorSpaceCapacityInput, long colorSpaceCountOutput, long colorSpaces) {
        long __functionAddress = session.getCapabilities().xrEnumerateColorSpacesSONY;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), enumerateInfo, colorSpaceCapacityInput, colorSpaceCountOutput, colorSpaces, __functionAddress);
    }

    /** {@code XrResult xrEnumerateColorSpacesSONY(XrSession session, XrColorSpacesEnumerateInfoSONY const * enumerateInfo, uint32_t colorSpaceCapacityInput, uint32_t * colorSpaceCountOutput, XrColorSpaceSONY * colorSpaces)} */
    @NativeType("XrResult")
    public static int xrEnumerateColorSpacesSONY(XrSession session, @NativeType("XrColorSpacesEnumerateInfoSONY const *") XrColorSpacesEnumerateInfoSONY enumerateInfo, @NativeType("uint32_t *") IntBuffer colorSpaceCountOutput, @NativeType("XrColorSpaceSONY *") @Nullable IntBuffer colorSpaces) {
        if (CHECKS) {
            check(colorSpaceCountOutput, 1);
        }
        return nxrEnumerateColorSpacesSONY(session, enumerateInfo.address(), remainingSafe(colorSpaces), memAddress(colorSpaceCountOutput), memAddressSafe(colorSpaces));
    }

}