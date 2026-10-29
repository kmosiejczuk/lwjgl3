/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTCooperativeMatrixMaintenance1 {

    public static final int VK_EXT_COOPERATIVE_MATRIX_MAINTENANCE_1_SPEC_VERSION = 1;

    public static final String VK_EXT_COOPERATIVE_MATRIX_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_cooperative_matrix_maintenance1";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_MAINTENANCE_1_FEATURES_EXT = 1000659000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_INFO_2_EXT                 = 1000659001,
        VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_2_EXT                           = 1000659002;

    public static final int VK_COOPERATIVE_MATRIX_SATURATING_ACCUMULATION_BIT_EXT = 0x1;

    protected EXTCooperativeMatrixMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeMatrixProperties2EXT ] ---

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceCooperativeMatrixInfo2EXT const * pCooperativeMatrixInfo, uint32_t * pPropertyCount, VkCooperativeMatrixProperties2EXT * pProperties)} */
    public static int nvkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, long pCooperativeMatrixInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixProperties2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pCooperativeMatrixInfo, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceCooperativeMatrixInfo2EXT const * pCooperativeMatrixInfo, uint32_t * pPropertyCount, VkCooperativeMatrixProperties2EXT * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceCooperativeMatrixInfo2EXT const *") VkPhysicalDeviceCooperativeMatrixInfo2EXT pCooperativeMatrixInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixProperties2EXT *") VkCooperativeMatrixProperties2EXT.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixProperties2EXT(physicalDevice, pCooperativeMatrixInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceCooperativeMatrixInfo2EXT const * pCooperativeMatrixInfo, uint32_t * pPropertyCount, VkCooperativeMatrixProperties2EXT * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixProperties2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceCooperativeMatrixInfo2EXT const *") VkPhysicalDeviceCooperativeMatrixInfo2EXT pCooperativeMatrixInfo, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixProperties2EXT *") VkCooperativeMatrixProperties2EXT.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixProperties2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pCooperativeMatrixInfo.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}