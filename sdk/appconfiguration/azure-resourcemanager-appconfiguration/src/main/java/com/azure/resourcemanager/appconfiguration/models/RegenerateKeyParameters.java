// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to regenerate an API key. */
@Fluent
public final class RegenerateKeyParameters {
    /*
     * The id of the key to regenerate.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The id of the key to regenerate.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the key to regenerate.
     *
     * @param id the id value to set.
     * @return the RegenerateKeyParameters object itself.
     */
    public RegenerateKeyParameters withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
