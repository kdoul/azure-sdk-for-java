// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the rule group. */
@Fluent
public final class VirtualRouterPeeringProperties {
    /*
     * Peer ASN.
     */
    @JsonProperty(value = "peerAsn")
    private Long peerAsn;

    /*
     * Peer IP.
     */
    @JsonProperty(value = "peerIp")
    private String peerIp;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of VirtualRouterPeeringProperties class. */
    public VirtualRouterPeeringProperties() {
    }

    /**
     * Get the peerAsn property: Peer ASN.
     *
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: Peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the VirtualRouterPeeringProperties object itself.
     */
    public VirtualRouterPeeringProperties withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the peerIp property: Peer IP.
     *
     * @return the peerIp value.
     */
    public String peerIp() {
        return this.peerIp;
    }

    /**
     * Set the peerIp property: Peer IP.
     *
     * @param peerIp the peerIp value to set.
     * @return the VirtualRouterPeeringProperties object itself.
     */
    public VirtualRouterPeeringProperties withPeerIp(String peerIp) {
        this.peerIp = peerIp;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
