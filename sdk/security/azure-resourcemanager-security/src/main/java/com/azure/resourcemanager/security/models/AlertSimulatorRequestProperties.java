// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Describes properties of an alert simulation request. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = AlertSimulatorRequestProperties.class)
@JsonTypeName("AlertSimulatorRequestProperties")
@JsonSubTypes({@JsonSubTypes.Type(name = "Bundles", value = AlertSimulatorBundlesRequestProperties.class)})
@Fluent
public class AlertSimulatorRequestProperties {
    /*
     * Describes properties of an alert simulation request
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of AlertSimulatorRequestProperties class. */
    public AlertSimulatorRequestProperties() {
    }

    /**
     * Get the additionalProperties property: Describes properties of an alert simulation request.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Describes properties of an alert simulation request.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the AlertSimulatorRequestProperties object itself.
     */
    public AlertSimulatorRequestProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
