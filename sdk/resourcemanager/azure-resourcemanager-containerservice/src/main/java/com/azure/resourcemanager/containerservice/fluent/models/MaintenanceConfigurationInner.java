// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerservice.models.TimeInWeek;
import com.azure.resourcemanager.containerservice.models.TimeSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Planned maintenance configuration, used to configure when updates can be deployed to a Managed Cluster.
 *
 * <p>See [planned maintenance](https://docs.microsoft.com/azure/aks/planned-maintenance) for more information about
 * planned maintenance.
 */
@Fluent
public final class MaintenanceConfigurationInner extends SubResource {
    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Properties of a default maintenance configuration.
     */
    @JsonProperty(value = "properties")
    private MaintenanceConfigurationProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of MaintenanceConfigurationInner class. */
    public MaintenanceConfigurationInner() {
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Properties of a default maintenance configuration.
     *
     * @return the innerProperties value.
     */
    private MaintenanceConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public MaintenanceConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the timeInWeek property: Time slots during the week when planned maintenance is allowed to proceed.
     *
     * <p>If two array entries specify the same day of the week, the applied configuration is the union of times in both
     * entries.
     *
     * @return the timeInWeek value.
     */
    public List<TimeInWeek> timeInWeek() {
        return this.innerProperties() == null ? null : this.innerProperties().timeInWeek();
    }

    /**
     * Set the timeInWeek property: Time slots during the week when planned maintenance is allowed to proceed.
     *
     * <p>If two array entries specify the same day of the week, the applied configuration is the union of times in both
     * entries.
     *
     * @param timeInWeek the timeInWeek value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withTimeInWeek(List<TimeInWeek> timeInWeek) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withTimeInWeek(timeInWeek);
        return this;
    }

    /**
     * Get the notAllowedTime property: Time slots on which upgrade is not allowed.
     *
     * @return the notAllowedTime value.
     */
    public List<TimeSpan> notAllowedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().notAllowedTime();
    }

    /**
     * Set the notAllowedTime property: Time slots on which upgrade is not allowed.
     *
     * @param notAllowedTime the notAllowedTime value to set.
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withNotAllowedTime(List<TimeSpan> notAllowedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenanceConfigurationProperties();
        }
        this.innerProperties().withNotAllowedTime(notAllowedTime);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
