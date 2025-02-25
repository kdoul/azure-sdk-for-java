// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for DeviceSecurityGroups List. */
public final class DeviceSecurityGroupsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/DeviceSecurityGroups/ListDeviceSecurityGroups_example.json
     */
    /**
     * Sample code: List all device security groups for the specified IoT Hub resource.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listAllDeviceSecurityGroupsForTheSpecifiedIoTHubResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .deviceSecurityGroups()
            .list(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Devices/iotHubs/sampleiothub",
                Context.NONE);
    }
}
