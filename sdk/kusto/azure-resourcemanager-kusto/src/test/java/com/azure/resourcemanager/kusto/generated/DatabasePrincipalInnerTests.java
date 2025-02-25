// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabasePrincipalInnerTests {
    @Test
    public void testDeserialize() {
        DatabasePrincipalInner model =
            BinaryData
                .fromString(
                    "{\"role\":\"Monitor\",\"name\":\"eoellwptfdygp\",\"type\":\"Group\",\"fqn\":\"uaceopzfqrhhu\",\"email\":\"pppcqeqxo\",\"appId\":\"dahzxctobg\",\"tenantName\":\"dmoizpostmg\"}")
                .toObject(DatabasePrincipalInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.MONITOR, model.role());
        Assertions.assertEquals("eoellwptfdygp", model.name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.type());
        Assertions.assertEquals("uaceopzfqrhhu", model.fqn());
        Assertions.assertEquals("pppcqeqxo", model.email());
        Assertions.assertEquals("dahzxctobg", model.appId());
    }

    @Test
    public void testSerialize() {
        DatabasePrincipalInner model =
            new DatabasePrincipalInner()
                .withRole(DatabasePrincipalRole.MONITOR)
                .withName("eoellwptfdygp")
                .withType(DatabasePrincipalType.GROUP)
                .withFqn("uaceopzfqrhhu")
                .withEmail("pppcqeqxo")
                .withAppId("dahzxctobg");
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.MONITOR, model.role());
        Assertions.assertEquals("eoellwptfdygp", model.name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.type());
        Assertions.assertEquals("uaceopzfqrhhu", model.fqn());
        Assertions.assertEquals("pppcqeqxo", model.email());
        Assertions.assertEquals("dahzxctobg", model.appId());
    }
}
