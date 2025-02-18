// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.SkuChangeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SkuChangeInfoTests {
    @Test
    public void testDeserialize() {
        SkuChangeInfo model =
            BinaryData
                .fromString(
                    "{\"countOfDowngrades\":94.32142,\"countOfUpgradesAfterDowngrades\":35.12105,\"lastChangeDate\":\"atscmd\"}")
                .toObject(SkuChangeInfo.class);
        Assertions.assertEquals(94.32142F, model.countOfDowngrades());
        Assertions.assertEquals(35.12105F, model.countOfUpgradesAfterDowngrades());
        Assertions.assertEquals("atscmd", model.lastChangeDate());
    }

    @Test
    public void testSerialize() {
        SkuChangeInfo model =
            new SkuChangeInfo()
                .withCountOfDowngrades(94.32142F)
                .withCountOfUpgradesAfterDowngrades(35.12105F)
                .withLastChangeDate("atscmd");
        model = BinaryData.fromObject(model).toObject(SkuChangeInfo.class);
        Assertions.assertEquals(94.32142F, model.countOfDowngrades());
        Assertions.assertEquals(35.12105F, model.countOfUpgradesAfterDowngrades());
        Assertions.assertEquals("atscmd", model.lastChangeDate());
    }
}
