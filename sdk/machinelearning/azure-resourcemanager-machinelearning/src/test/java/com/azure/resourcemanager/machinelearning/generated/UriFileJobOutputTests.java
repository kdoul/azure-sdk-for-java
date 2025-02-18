// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.UriFileJobOutput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UriFileJobOutputTests {
    @Test
    public void testDeserialize() {
        UriFileJobOutput model =
            BinaryData
                .fromString(
                    "{\"jobOutputType\":\"uri_file\",\"mode\":\"Upload\",\"uri\":\"dfj\",\"description\":\"esocwiqbuou\"}")
                .toObject(UriFileJobOutput.class);
        Assertions.assertEquals("esocwiqbuou", model.description());
        Assertions.assertEquals(OutputDeliveryMode.UPLOAD, model.mode());
        Assertions.assertEquals("dfj", model.uri());
    }

    @Test
    public void testSerialize() {
        UriFileJobOutput model =
            new UriFileJobOutput().withDescription("esocwiqbuou").withMode(OutputDeliveryMode.UPLOAD).withUri("dfj");
        model = BinaryData.fromObject(model).toObject(UriFileJobOutput.class);
        Assertions.assertEquals("esocwiqbuou", model.description());
        Assertions.assertEquals(OutputDeliveryMode.UPLOAD, model.mode());
        Assertions.assertEquals("dfj", model.uri());
    }
}
