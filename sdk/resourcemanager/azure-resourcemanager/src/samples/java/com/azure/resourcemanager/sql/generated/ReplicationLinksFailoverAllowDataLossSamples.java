// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks FailoverAllowDataLoss. */
public final class ReplicationLinksFailoverAllowDataLossSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ReplicationLinkFailover.json
     */
    /**
     * Sample code: Failover a replication link.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void failoverAReplicationLink(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getReplicationLinks()
            .failoverAllowDataLoss(
                "sqlcrudtest-8931", "sqlcrudtest-2137", "testdb", "f0550bf5-07ce-4270-8e4b-71737975973a", Context.NONE);
    }
}
