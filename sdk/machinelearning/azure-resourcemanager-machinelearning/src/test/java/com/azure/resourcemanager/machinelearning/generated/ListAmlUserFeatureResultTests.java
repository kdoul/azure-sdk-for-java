// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ListAmlUserFeatureResult;
import org.junit.jupiter.api.Test;

public final class ListAmlUserFeatureResultTests {
    @Test
    public void testDeserialize() {
        ListAmlUserFeatureResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"cvclxynpdk\",\"displayName\":\"fabuiyjibu\",\"description\":\"hdugneiknpg\"},{\"id\":\"gjiuqhibto\",\"displayName\":\"pqwjedm\",\"description\":\"r\"}],\"nextLink\":\"g\"}")
                .toObject(ListAmlUserFeatureResult.class);
    }

    @Test
    public void testSerialize() {
        ListAmlUserFeatureResult model = new ListAmlUserFeatureResult();
        model = BinaryData.fromObject(model).toObject(ListAmlUserFeatureResult.class);
    }
}
