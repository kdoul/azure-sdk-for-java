// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.cognitiveservices.models.ResourceSkuListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceSkuListResultTests {
    @Test
    public void testDeserialize() {
        ResourceSkuListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"muouqfp\",\"name\":\"zw\",\"tier\":\"g\",\"kind\":\"tnwu\",\"locations\":[\"a\",\"x\"],\"restrictions\":[]},{\"resourceType\":\"uckyf\",\"name\":\"rfidfvzwdz\",\"tier\":\"tymw\",\"kind\":\"dkfthwxmnt\",\"locations\":[\"aop\",\"km\",\"jcmmxdcufufsrp\",\"mzidnsezcxtb\"],\"restrictions\":[]},{\"resourceType\":\"yc\",\"name\":\"newmdwzjeiachbo\",\"tier\":\"flnrosfqpteehzz\",\"kind\":\"pyqr\",\"locations\":[\"inpvswjdkirsoodq\"],\"restrictions\":[]},{\"resourceType\":\"mnoh\",\"name\":\"ckwhds\",\"tier\":\"fiyipjxsqwpgrj\",\"kind\":\"norcjxvsnbyxqab\",\"locations\":[\"cpc\",\"shurzafbljjgpbto\"],\"restrictions\":[]}],\"nextLink\":\"klj\"}")
                .toObject(ResourceSkuListResult.class);
        Assertions.assertEquals("muouqfp", model.value().get(0).resourceType());
        Assertions.assertEquals("zw", model.value().get(0).name());
        Assertions.assertEquals("g", model.value().get(0).tier());
        Assertions.assertEquals("tnwu", model.value().get(0).kind());
        Assertions.assertEquals("a", model.value().get(0).locations().get(0));
        Assertions.assertEquals("klj", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ResourceSkuListResult model =
            new ResourceSkuListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ResourceSkuInner()
                                .withResourceType("muouqfp")
                                .withName("zw")
                                .withTier("g")
                                .withKind("tnwu")
                                .withLocations(Arrays.asList("a", "x"))
                                .withRestrictions(Arrays.asList()),
                            new ResourceSkuInner()
                                .withResourceType("uckyf")
                                .withName("rfidfvzwdz")
                                .withTier("tymw")
                                .withKind("dkfthwxmnt")
                                .withLocations(Arrays.asList("aop", "km", "jcmmxdcufufsrp", "mzidnsezcxtb"))
                                .withRestrictions(Arrays.asList()),
                            new ResourceSkuInner()
                                .withResourceType("yc")
                                .withName("newmdwzjeiachbo")
                                .withTier("flnrosfqpteehzz")
                                .withKind("pyqr")
                                .withLocations(Arrays.asList("inpvswjdkirsoodq"))
                                .withRestrictions(Arrays.asList()),
                            new ResourceSkuInner()
                                .withResourceType("mnoh")
                                .withName("ckwhds")
                                .withTier("fiyipjxsqwpgrj")
                                .withKind("norcjxvsnbyxqab")
                                .withLocations(Arrays.asList("cpc", "shurzafbljjgpbto"))
                                .withRestrictions(Arrays.asList())))
                .withNextLink("klj");
        model = BinaryData.fromObject(model).toObject(ResourceSkuListResult.class);
        Assertions.assertEquals("muouqfp", model.value().get(0).resourceType());
        Assertions.assertEquals("zw", model.value().get(0).name());
        Assertions.assertEquals("g", model.value().get(0).tier());
        Assertions.assertEquals("tnwu", model.value().get(0).kind());
        Assertions.assertEquals("a", model.value().get(0).locations().get(0));
        Assertions.assertEquals("klj", model.nextLink());
    }
}
