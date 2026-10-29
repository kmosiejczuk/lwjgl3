/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val SONY_swapchain_color_space = "SONYSwapchainColorSpace".nativeClassXR("SONY_swapchain_color_space", type = "instance", postfix = "SONY") {
    IntConstant(
        "SONY_swapchain_color_space_SPEC_VERSION".."1"
    )

    StringConstant(
        "SONY_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME".."XR_SONY_swapchain_color_space"
    )

    EnumConstant(
        "TYPE_COLOR_SPACES_ENUMERATE_INFO_SONY".."1000776000",
        "TYPE_SWAPCHAIN_CREATE_INFO_COLOR_SPACE_SONY".."1000776001"
    )

    EnumConstant(
        "COLOR_SPACE_SRGB_NONLINEAR_SONY".."0",
        "COLOR_SPACE_DISPLAY_P3_LINEAR_SONY".."1",
        "COLOR_SPACE_DISPLAY_P3_NONLINEAR_SONY".."2",
        "COLOR_SPACE_DCI_P3_LINEAR_SONY".."3",
        "COLOR_SPACE_DCI_P3_NONLINEAR_SONY".."4",
        "COLOR_SPACE_EXTENDED_SRGB_LINEAR_SONY".."5",
        "COLOR_SPACE_BT709_LINEAR_SONY".."6",
        "COLOR_SPACE_BT709_NONLINEAR_SONY".."7",
        "COLOR_SPACE_BT2020_LINEAR_SONY".."8",
        "COLOR_SPACE_BT2020_PQ_SONY".."9",
        "COLOR_SPACE_BT2020_HLG_SONY".."10"
    )

    XrResult(
        "EnumerateColorSpacesSONY",

        XrSession("session"),
        XrColorSpacesEnumerateInfoSONY.const.p("enumerateInfo"),
        AutoSize("colorSpaces")..uint32_t("colorSpaceCapacityInput"),
        Check(1)..uint32_t.p("colorSpaceCountOutput"),
        nullable..XrColorSpaceSONY.p("colorSpaces")
    )
}