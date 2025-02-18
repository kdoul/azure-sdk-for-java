// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing a single summary with context for given document. */
@Fluent
public final class AbstractiveSummary {
    /*
     * The text of the summary.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The context list of the summary.
     */
    @JsonProperty(value = "contexts")
    private List<SummaryContext> contexts;

    /**
     * Get the text property: The text of the summary.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text of the summary.
     *
     * @param text the text value to set.
     * @return the AbstractiveSummary object itself.
     */
    public AbstractiveSummary setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the contexts property: The context list of the summary.
     *
     * @return the contexts value.
     */
    public List<SummaryContext> getContexts() {
        return this.contexts;
    }

    /**
     * Set the contexts property: The context list of the summary.
     *
     * @param contexts the contexts value to set.
     * @return the AbstractiveSummary object itself.
     */
    public AbstractiveSummary setContexts(List<SummaryContext> contexts) {
        this.contexts = contexts;
        return this;
    }
}
