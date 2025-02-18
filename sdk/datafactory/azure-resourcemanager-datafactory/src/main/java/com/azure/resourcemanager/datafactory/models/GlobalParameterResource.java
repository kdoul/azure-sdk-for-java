// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.GlobalParameterResourceInner;
import java.util.Map;

/** An immutable client-side representation of GlobalParameterResource. */
public interface GlobalParameterResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Properties of the global parameter.
     *
     * @return the properties value.
     */
    Map<String, GlobalParameterSpecification> properties();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.GlobalParameterResourceInner object.
     *
     * @return the inner object.
     */
    GlobalParameterResourceInner innerModel();

    /** The entirety of the GlobalParameterResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The GlobalParameterResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the GlobalParameterResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the GlobalParameterResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @return the next definition stage.
             */
            WithProperties withExistingFactory(String resourceGroupName, String factoryName);
        }
        /** The stage of the GlobalParameterResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the global parameter..
             *
             * @param properties Properties of the global parameter.
             * @return the next definition stage.
             */
            WithCreate withProperties(Map<String, GlobalParameterSpecification> properties);
        }
        /**
         * The stage of the GlobalParameterResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GlobalParameterResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GlobalParameterResource create(Context context);
        }
    }
    /**
     * Begins update for the GlobalParameterResource resource.
     *
     * @return the stage of resource update.
     */
    GlobalParameterResource.Update update();

    /** The template for GlobalParameterResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GlobalParameterResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GlobalParameterResource apply(Context context);
    }
    /** The GlobalParameterResource update stages. */
    interface UpdateStages {
        /** The stage of the GlobalParameterResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the global parameter..
             *
             * @param properties Properties of the global parameter.
             * @return the next definition stage.
             */
            Update withProperties(Map<String, GlobalParameterSpecification> properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GlobalParameterResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GlobalParameterResource refresh(Context context);
}
