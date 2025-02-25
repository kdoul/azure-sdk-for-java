// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WebPubSubsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"fgmjzrwrdgrt\",\"tier\":\"Standard\",\"size\":\"u\",\"family\":\"kopbminrf\",\"capacity\":123182613},\"properties\":{\"provisioningState\":\"Succeeded\",\"externalIP\":\"ziuiefozbhdm\",\"hostName\":\"l\",\"publicPort\":1354395459,\"serverPort\":572432734,\"version\":\"trmaequiahxicslf\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"halns\",\"liveTraceConfiguration\":{\"enabled\":\"csphkaiv\",\"categories\":[]},\"resourceLogConfiguration\":{\"categories\":[]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"privateEndpoints\":[]},\"publicNetworkAccess\":\"gwol\",\"disableLocalAuth\":true,\"disableAadAuth\":true},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"rsbrgzdwm\",\"tenantId\":\"eypqwdxggicccn\"},\"location\":\"huexmk\",\"tags\":{\"dtclusiypb\":\"stvlzywemhzrnc\",\"ukyhejhzis\":\"fgytguslfeadcyg\",\"jzraehtwdwrf\":\"gfpelolppvksrpqv\"},\"id\":\"swibyr\",\"name\":\"dl\",\"type\":\"h\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        WebPubSubManager manager =
            WebPubSubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        WebPubSubResource response =
            manager
                .webPubSubs()
                .define("l")
                .withRegion("ztvbtqgsfr")
                .withExistingResourceGroup("dmovsm")
                .withTags(
                    mapOf("dsyuuximerqfob", "zkoowtlmnguxawqa", "utwpfhp", "yznkby", "tdlmkkzevd", "gmhrskdsnfdsdoak"))
                .withSku(new ResourceSku().withName("ab").withTier(WebPubSubSkuTier.BASIC).withCapacity(1601819937))
                .withIdentity(
                    new ManagedIdentity().withType(ManagedIdentityType.NONE).withUserAssignedIdentities(mapOf()))
                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(true))
                .withLiveTraceConfiguration(
                    new LiveTraceConfiguration().withEnabled("szufoxciqopidoa").withCategories(Arrays.asList()))
                .withResourceLogConfiguration(new ResourceLogConfiguration().withCategories(Arrays.asList()))
                .withNetworkACLs(
                    new WebPubSubNetworkACLs().withDefaultAction(AclAction.DENY).withPrivateEndpoints(Arrays.asList()))
                .withPublicNetworkAccess("xkhnzbonlwnto")
                .withDisableLocalAuth(false)
                .withDisableAadAuth(true)
                .create();

        Assertions.assertEquals("huexmk", response.location());
        Assertions.assertEquals("stvlzywemhzrnc", response.tags().get("dtclusiypb"));
        Assertions.assertEquals("fgmjzrwrdgrt", response.sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.STANDARD, response.sku().tier());
        Assertions.assertEquals(123182613, response.sku().capacity());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(true, response.tls().clientCertEnabled());
        Assertions.assertEquals("csphkaiv", response.liveTraceConfiguration().enabled());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().defaultAction());
        Assertions.assertEquals("gwol", response.publicNetworkAccess());
        Assertions.assertEquals(true, response.disableLocalAuth());
        Assertions.assertEquals(true, response.disableAadAuth());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
