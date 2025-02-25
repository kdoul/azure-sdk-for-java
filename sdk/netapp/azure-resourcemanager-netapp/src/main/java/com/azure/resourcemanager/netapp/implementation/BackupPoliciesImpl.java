// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPolicies;
import com.azure.resourcemanager.netapp.models.BackupPolicy;

public final class BackupPoliciesImpl implements BackupPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(BackupPoliciesImpl.class);

    private final BackupPoliciesClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public BackupPoliciesImpl(
        BackupPoliciesClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BackupPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<BackupPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new BackupPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<BackupPolicy> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<BackupPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new BackupPolicyImpl(inner1, this.manager()));
    }

    public BackupPolicy get(String resourceGroupName, String accountName, String backupPolicyName) {
        BackupPolicyInner inner = this.serviceClient().get(resourceGroupName, accountName, backupPolicyName);
        if (inner != null) {
            return new BackupPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupPolicy> getWithResponse(
        String resourceGroupName, String accountName, String backupPolicyName, Context context) {
        Response<BackupPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, backupPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String backupPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, backupPolicyName);
    }

    public void delete(String resourceGroupName, String accountName, String backupPolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, backupPolicyName, context);
    }

    public BackupPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String backupPolicyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, backupPolicyName, Context.NONE).getValue();
    }

    public Response<BackupPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String backupPolicyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, backupPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String backupPolicyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        this.delete(resourceGroupName, accountName, backupPolicyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String backupPolicyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (backupPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        this.delete(resourceGroupName, accountName, backupPolicyName, context);
    }

    private BackupPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public BackupPolicyImpl define(String name) {
        return new BackupPolicyImpl(name, this.manager());
    }
}
