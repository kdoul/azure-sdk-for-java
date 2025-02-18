// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.workloads.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.workloads.fluent.models.SapDatabaseInstanceInner;
import com.azure.resourcemanager.workloads.models.UpdateSapDatabaseInstanceRequest;

/** An instance of this class provides access to all the operations defined in SapDatabaseInstancesClient. */
public interface SapDatabaseInstancesClient {
    /**
     * Gets the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner get(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Gets the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SapDatabaseInstanceInner> getWithResponse(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Puts the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginCreate(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        SapDatabaseInstanceInner body);

    /**
     * Puts the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginCreate(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        SapDatabaseInstanceInner body,
        Context context);

    /**
     * Puts the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner create(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        SapDatabaseInstanceInner body);

    /**
     * Puts the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner create(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Puts the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. PUT by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner create(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        SapDatabaseInstanceInner body,
        Context context);

    /**
     * Puts the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginUpdate(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        UpdateSapDatabaseInstanceRequest body);

    /**
     * Puts the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SapDatabaseInstanceInner>, SapDatabaseInstanceInner> beginUpdate(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        UpdateSapDatabaseInstanceRequest body,
        Context context);

    /**
     * Puts the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner update(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        UpdateSapDatabaseInstanceRequest body);

    /**
     * Puts the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner update(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Puts the SAP Database Instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param body The SAP Database Server instance request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the SAP Database Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SapDatabaseInstanceInner update(
        String resourceGroupName,
        String sapVirtualInstanceName,
        String databaseInstanceName,
        UpdateSapDatabaseInstanceRequest body,
        Context context);

    /**
     * Deletes the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Deletes the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the SAP Database Instance. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will
     * return a Bad Request error.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param databaseInstanceName Database Instance string modeled as parameter for auto generation to work correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(
        String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName, Context context);

    /**
     * Lists the SAP Database Instances in an SVI.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SapDatabaseInstanceInner> list(String resourceGroupName, String sapVirtualInstanceName);

    /**
     * Lists the SAP Database Instances in an SVI.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SapDatabaseInstanceInner> list(
        String resourceGroupName, String sapVirtualInstanceName, Context context);
}
