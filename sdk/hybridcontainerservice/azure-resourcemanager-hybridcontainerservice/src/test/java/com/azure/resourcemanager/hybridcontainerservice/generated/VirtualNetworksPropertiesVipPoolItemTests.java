// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesVipPoolItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworksPropertiesVipPoolItemTests {
    @Test
    public void testDeserialize() {
        VirtualNetworksPropertiesVipPoolItem model =
            BinaryData
                .fromString("{\"endIP\":\"zfoqouicybxar\",\"startIP\":\"szufoxciqopidoa\"}")
                .toObject(VirtualNetworksPropertiesVipPoolItem.class);
        Assertions.assertEquals("zfoqouicybxar", model.endIp());
        Assertions.assertEquals("szufoxciqopidoa", model.startIp());
    }

    @Test
    public void testSerialize() {
        VirtualNetworksPropertiesVipPoolItem model =
            new VirtualNetworksPropertiesVipPoolItem().withEndIp("zfoqouicybxar").withStartIp("szufoxciqopidoa");
        model = BinaryData.fromObject(model).toObject(VirtualNetworksPropertiesVipPoolItem.class);
        Assertions.assertEquals("zfoqouicybxar", model.endIp());
        Assertions.assertEquals("szufoxciqopidoa", model.startIp());
    }
}
