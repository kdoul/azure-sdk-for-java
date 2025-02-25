// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.JobSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A job. */
@Fluent
public final class JobInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private JobProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private JobProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: User-defined description of the job.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: User-defined description of the job.
     *
     * @param description the description value to set.
     * @return the JobInner object itself.
     */
    public JobInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the version property: The job version number.
     *
     * @return the version value.
     */
    public Integer version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the schedule property: Schedule properties of the job.
     *
     * @return the schedule value.
     */
    public JobSchedule schedule() {
        return this.innerProperties() == null ? null : this.innerProperties().schedule();
    }

    /**
     * Set the schedule property: Schedule properties of the job.
     *
     * @param schedule the schedule value to set.
     * @return the JobInner object itself.
     */
    public JobInner withSchedule(JobSchedule schedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobProperties();
        }
        this.innerProperties().withSchedule(schedule);
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
