// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.LoadBalancerInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list ip configurations API service call. */
@Fluent
public final class NetworkInterfaceLoadBalancerListResult {
    /*
     * A list of load balancers.
     */
    @JsonProperty(value = "value")
    private List<LoadBalancerInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of NetworkInterfaceLoadBalancerListResult class. */
    public NetworkInterfaceLoadBalancerListResult() {
    }

    /**
     * Get the value property: A list of load balancers.
     *
     * @return the value value.
     */
    public List<LoadBalancerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of load balancers.
     *
     * @param value the value value to set.
     * @return the NetworkInterfaceLoadBalancerListResult object itself.
     */
    public NetworkInterfaceLoadBalancerListResult withValue(List<LoadBalancerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
