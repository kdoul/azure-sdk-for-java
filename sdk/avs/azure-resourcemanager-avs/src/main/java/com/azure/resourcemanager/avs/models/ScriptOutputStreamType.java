// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScriptOutputStreamType. */
public final class ScriptOutputStreamType extends ExpandableStringEnum<ScriptOutputStreamType> {
    /** Static value Information for ScriptOutputStreamType. */
    public static final ScriptOutputStreamType INFORMATION = fromString("Information");

    /** Static value Warning for ScriptOutputStreamType. */
    public static final ScriptOutputStreamType WARNING = fromString("Warning");

    /** Static value Output for ScriptOutputStreamType. */
    public static final ScriptOutputStreamType OUTPUT = fromString("Output");

    /** Static value Error for ScriptOutputStreamType. */
    public static final ScriptOutputStreamType ERROR = fromString("Error");

    /**
     * Creates or finds a ScriptOutputStreamType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScriptOutputStreamType.
     */
    @JsonCreator
    public static ScriptOutputStreamType fromString(String name) {
        return fromString(name, ScriptOutputStreamType.class);
    }

    /**
     * Gets known ScriptOutputStreamType values.
     *
     * @return known ScriptOutputStreamType values.
     */
    public static Collection<ScriptOutputStreamType> values() {
        return values(ScriptOutputStreamType.class);
    }
}
