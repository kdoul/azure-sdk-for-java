// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.models.WorkspaceInfoProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Log Analytics Workspace. */
@Fluent
public final class WorkspaceInfo {
    /*
     * Azure Resource Manager identifier of the Log Analytics Workspace.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Location of the Log Analytics workspace.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private WorkspaceInfoProperties innerProperties = new WorkspaceInfoProperties();

    /**
     * Get the id property: Azure Resource Manager identifier of the Log Analytics Workspace.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure Resource Manager identifier of the Log Analytics Workspace.
     *
     * @param id the id value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Location of the Log Analytics workspace.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the Log Analytics workspace.
     *
     * @param location the location value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private WorkspaceInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the customerId property: Log Analytics workspace identifier.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.innerProperties() == null ? null : this.innerProperties().customerId();
    }

    /**
     * Set the customerId property: Log Analytics workspace identifier.
     *
     * @param customerId the customerId value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withCustomerId(String customerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceInfoProperties();
        }
        this.innerProperties().withCustomerId(customerId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model WorkspaceInfo"));
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model WorkspaceInfo"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model WorkspaceInfo"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspaceInfo.class);
}
