// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSL-enabled hostname. */
@Fluent
public final class HostnameSslState {
    /*
     * Hostname.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * SSL type.
     */
    @JsonProperty(value = "sslState")
    private SslState sslState;

    /*
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    @JsonProperty(value = "virtualIP")
    private String virtualIp;

    /*
     * SSL certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Set to <code>true</code> to update existing hostname.
     */
    @JsonProperty(value = "toUpdate")
    private Boolean toUpdate;

    /*
     * Indicates whether the hostname is a standard or repository hostname.
     */
    @JsonProperty(value = "hostType")
    private HostType hostType;

    /**
     * Get the name property: Hostname.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Hostname.
     *
     * @param name the name value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sslState property: SSL type.
     *
     * @return the sslState value.
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set the sslState property: SSL type.
     *
     * @param sslState the sslState value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    /**
     * Get the virtualIp property: Virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @return the virtualIp value.
     */
    public String virtualIp() {
        return this.virtualIp;
    }

    /**
     * Set the virtualIp property: Virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @param virtualIp the virtualIp value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * Get the thumbprint property: SSL certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: SSL certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the toUpdate property: Set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     *
     * @return the toUpdate value.
     */
    public Boolean toUpdate() {
        return this.toUpdate;
    }

    /**
     * Set the toUpdate property: Set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     *
     * @param toUpdate the toUpdate value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withToUpdate(Boolean toUpdate) {
        this.toUpdate = toUpdate;
        return this;
    }

    /**
     * Get the hostType property: Indicates whether the hostname is a standard or repository hostname.
     *
     * @return the hostType value.
     */
    public HostType hostType() {
        return this.hostType;
    }

    /**
     * Set the hostType property: Indicates whether the hostname is a standard or repository hostname.
     *
     * @param hostType the hostType value to set.
     * @return the HostnameSslState object itself.
     */
    public HostnameSslState withHostType(HostType hostType) {
        this.hostType = hostType;
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
