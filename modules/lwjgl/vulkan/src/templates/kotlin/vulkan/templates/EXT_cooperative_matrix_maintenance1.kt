/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_cooperative_matrix_maintenance1 = "EXTCooperativeMatrixMaintenance1".nativeClassVK("EXT_cooperative_matrix_maintenance1", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_COOPERATIVE_MATRIX_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_COOPERATIVE_MATRIX_MAINTENANCE_1_EXTENSION_NAME".."VK_EXT_cooperative_matrix_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT".."1000659000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT".."1000659001",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_2_EXT".."1000659002"
    )

    EnumConstant(
        "COOPERATIVE_MATRIX_SATURATING_ACCUMULATION_BIT_EXT".enum(0x00000001)
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixProperties2EXT",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceCooperativeMatrixInfo2EXT.const.p("pCooperativeMatrixInfo"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkCooperativeMatrixProperties2EXT.p("pProperties")
    )
}