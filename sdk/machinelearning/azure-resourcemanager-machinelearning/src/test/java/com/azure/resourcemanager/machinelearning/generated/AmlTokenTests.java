// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AmlToken;
import org.junit.jupiter.api.Test;

public final class AmlTokenTests {
    @Test
    public void testDeserialize() {
        AmlToken model = BinaryData.fromString("{\"identityType\":\"AMLToken\"}").toObject(AmlToken.class);
    }

    @Test
    public void testSerialize() {
        AmlToken model = new AmlToken();
        model = BinaryData.fromObject(model).toObject(AmlToken.class);
    }
}
