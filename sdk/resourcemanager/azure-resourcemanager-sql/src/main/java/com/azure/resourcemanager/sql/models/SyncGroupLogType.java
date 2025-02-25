// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SyncGroupLogType. */
public final class SyncGroupLogType extends ExpandableStringEnum<SyncGroupLogType> {
    /** Static value All for SyncGroupLogType. */
    public static final SyncGroupLogType ALL = fromString("All");

    /** Static value Error for SyncGroupLogType. */
    public static final SyncGroupLogType ERROR = fromString("Error");

    /** Static value Warning for SyncGroupLogType. */
    public static final SyncGroupLogType WARNING = fromString("Warning");

    /** Static value Success for SyncGroupLogType. */
    public static final SyncGroupLogType SUCCESS = fromString("Success");

    /**
     * Creates or finds a SyncGroupLogType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncGroupLogType.
     */
    @JsonCreator
    public static SyncGroupLogType fromString(String name) {
        return fromString(name, SyncGroupLogType.class);
    }

    /**
     * Gets known SyncGroupLogType values.
     *
     * @return known SyncGroupLogType values.
     */
    public static Collection<SyncGroupLogType> values() {
        return values(SyncGroupLogType.class);
    }
}
