// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;

/** Samples for TransparentDataEncryptionActivities ListByConfiguration. */
public final class TransparentDataEncryptionActivitiesListByConfigurationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DatabaseTransparentDataEncryptionActivityList.json
     */
    /**
     * Sample code: List a database's transparent data encryption activities.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listADatabaseSTransparentDataEncryptionActivities(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getTransparentDataEncryptionActivities()
            .listByConfiguration(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-9187",
                TransparentDataEncryptionName.CURRENT,
                Context.NONE);
    }
}
