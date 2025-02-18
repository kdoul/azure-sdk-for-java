// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** AuthenticationType to be used for connection. */
public final class TeradataAuthenticationType extends ExpandableStringEnum<TeradataAuthenticationType> {
    /** Static value Basic for TeradataAuthenticationType. */
    public static final TeradataAuthenticationType BASIC = fromString("Basic");

    /** Static value Windows for TeradataAuthenticationType. */
    public static final TeradataAuthenticationType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a TeradataAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TeradataAuthenticationType.
     */
    @JsonCreator
    public static TeradataAuthenticationType fromString(String name) {
        return fromString(name, TeradataAuthenticationType.class);
    }

    /**
     * Gets known TeradataAuthenticationType values.
     *
     * @return known TeradataAuthenticationType values.
     */
    public static Collection<TeradataAuthenticationType> values() {
        return values(TeradataAuthenticationType.class);
    }
}
