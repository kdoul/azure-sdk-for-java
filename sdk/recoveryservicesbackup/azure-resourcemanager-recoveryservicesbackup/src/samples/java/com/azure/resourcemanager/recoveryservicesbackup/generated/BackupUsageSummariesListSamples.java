// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for BackupUsageSummaries List. */
public final class BackupUsageSummariesListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-09-01-preview/examples/Common/BackupProtectedItem_UsageSummary_Get.json
     */
    /**
     * Sample code: Get Protected Items Usages Summary.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedItemsUsagesSummary(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupUsageSummaries()
            .list("testVault", "testRG", "type eq 'BackupProtectedItemCountSummary'", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/preview/2022-09-01-preview/examples/Common/BackupProtectionContainers_UsageSummary_Get.json
     */
    /**
     * Sample code: Get Protected Containers Usages Summary.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedContainersUsagesSummary(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .backupUsageSummaries()
            .list("testVault", "testRG", "type eq 'BackupProtectionContainerCountSummary'", null, Context.NONE);
    }
}
