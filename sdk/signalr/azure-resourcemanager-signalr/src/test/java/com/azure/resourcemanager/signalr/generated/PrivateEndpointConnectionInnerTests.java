// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.signalr.models.PrivateEndpoint;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{\"id\":\"nxdhbt\"},\"groupIds\":[\"h\",\"wpn\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"nermcl\",\"actionsRequired\":\"lphox\"}},\"id\":\"scrpabgyepsbjt\",\"name\":\"zq\",\"type\":\"gxywpmue\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("nxdhbt", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("nermcl", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lphox", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint().withId("nxdhbt"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                        .withDescription("nermcl")
                        .withActionsRequired("lphox"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("nxdhbt", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("nermcl", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lphox", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
