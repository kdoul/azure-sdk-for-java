// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.FilterActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Filter and return results from input array based on the conditions. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Filter")
@Fluent
public final class FilterActivity extends ControlActivity {
    /*
     * Filter activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private FilterActivityTypeProperties innerTypeProperties = new FilterActivityTypeProperties();

    /** Creates an instance of FilterActivity class. */
    public FilterActivity() {
    }

    /**
     * Get the innerTypeProperties property: Filter activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private FilterActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the items property: Input array on which filter should be applied.
     *
     * @return the items value.
     */
    public Expression items() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().items();
    }

    /**
     * Set the items property: Input array on which filter should be applied.
     *
     * @param items the items value to set.
     * @return the FilterActivity object itself.
     */
    public FilterActivity withItems(Expression items) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FilterActivityTypeProperties();
        }
        this.innerTypeProperties().withItems(items);
        return this;
    }

    /**
     * Get the condition property: Condition to be used for filtering the input.
     *
     * @return the condition value.
     */
    public Expression condition() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().condition();
    }

    /**
     * Set the condition property: Condition to be used for filtering the input.
     *
     * @param condition the condition value to set.
     * @return the FilterActivity object itself.
     */
    public FilterActivity withCondition(Expression condition) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FilterActivityTypeProperties();
        }
        this.innerTypeProperties().withCondition(condition);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model FilterActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilterActivity.class);
}
