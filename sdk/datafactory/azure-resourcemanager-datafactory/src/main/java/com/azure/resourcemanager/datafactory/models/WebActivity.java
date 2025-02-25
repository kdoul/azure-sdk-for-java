// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.WebActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Web activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebActivity")
@Fluent
public final class WebActivity extends ExecutionActivity {
    /*
     * Web activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private WebActivityTypeProperties innerTypeProperties = new WebActivityTypeProperties();

    /** Creates an instance of WebActivity class. */
    public WebActivity() {
    }

    /**
     * Get the innerTypeProperties property: Web activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private WebActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public WebActivityMethod method() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().method();
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withMethod(WebActivityMethod method) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withMethod(method);
        return this;
    }

    /**
     * Get the url property: Web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: Web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().headers();
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withHeaders(Object headers) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withHeaders(headers);
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().body();
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withBody(Object body) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withBody(body);
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     *
     * @return the authentication value.
     */
    public WebActivityAuthentication authentication() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authentication();
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     *
     * @param authentication the authentication value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withAuthentication(WebActivityAuthentication authentication) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the disableCertValidation property: When set to true, Certificate validation will be disabled.
     *
     * @return the disableCertValidation value.
     */
    public Boolean disableCertValidation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().disableCertValidation();
    }

    /**
     * Set the disableCertValidation property: When set to true, Certificate validation will be disabled.
     *
     * @param disableCertValidation the disableCertValidation value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withDisableCertValidation(Boolean disableCertValidation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withDisableCertValidation(disableCertValidation);
        return this;
    }

    /**
     * Get the datasets property: List of datasets passed to web endpoint.
     *
     * @return the datasets value.
     */
    public List<DatasetReference> datasets() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().datasets();
    }

    /**
     * Set the datasets property: List of datasets passed to web endpoint.
     *
     * @param datasets the datasets value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withDatasets(List<DatasetReference> datasets) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withDatasets(datasets);
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services passed to web endpoint.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceReference> linkedServices() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedServices();
    }

    /**
     * Set the linkedServices property: List of linked services passed to web endpoint.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withLinkedServices(List<LinkedServiceReference> linkedServices) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withLinkedServices(linkedServices);
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     *
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference connectVia() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectVia();
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     *
     * @param connectVia the connectVia value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity withConnectVia(IntegrationRuntimeReference connectVia) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new WebActivityTypeProperties();
        }
        this.innerTypeProperties().withConnectVia(connectVia);
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
                    new IllegalArgumentException("Missing required property innerTypeProperties in model WebActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebActivity.class);
}
