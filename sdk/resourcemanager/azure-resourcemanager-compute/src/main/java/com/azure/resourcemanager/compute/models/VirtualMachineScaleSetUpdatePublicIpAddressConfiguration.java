// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a virtual machines scale set IP Configuration's PublicIPAddress configuration. */
@Fluent
public final class VirtualMachineScaleSetUpdatePublicIpAddressConfiguration {
    /*
     * The publicIP address configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes a virtual machines scale set IP Configuration's PublicIPAddress configuration
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties innerProperties;

    /** Creates an instance of VirtualMachineScaleSetUpdatePublicIpAddressConfiguration class. */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration() {
    }

    /**
     * Get the name property: The publicIP address configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The publicIP address configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetUpdatePublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machines scale set IP Configuration's PublicIPAddress
     * configuration.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the VirtualMachineScaleSetUpdatePublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration withIdleTimeoutInMinutes(
        Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetUpdatePublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration withDnsSettings(
        VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefix();
    }

    /**
     * Set the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the VirtualMachineScaleSetUpdatePublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration withPublicIpPrefix(SubResource publicIpPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetUpdatePublicIpAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
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
