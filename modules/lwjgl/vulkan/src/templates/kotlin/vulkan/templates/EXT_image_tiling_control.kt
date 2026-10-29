/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_tiling_control = "EXTImageTilingControl".nativeClassVK("EXT_image_tiling_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_TILING_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_TILING_CONTROL_EXTENSION_NAME".."VK_EXT_image_tiling_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_TILING_CONTROL_FEATURES_EXT".."1000687000",
        "STRUCTURE_TYPE_IMAGE_TILING_CONTROL_CREATE_INFO_EXT".."1000687001"
    )

    EnumConstant(
        "IMAGE_TILING_CONTROL_DEFAULT_EXT".."0",
        "IMAGE_TILING_CONTROL_MIN_SIZE_EXT".."1",
        "IMAGE_TILING_CONTROL_MAX_PERFORMANCE_EXT".."2"
    )
}