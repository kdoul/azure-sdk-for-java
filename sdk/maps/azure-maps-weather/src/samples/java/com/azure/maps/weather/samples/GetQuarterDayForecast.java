// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.weather.samples;

import com.azure.core.models.GeoPosition;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.weather.WeatherAsyncClient;
import com.azure.maps.weather.WeatherClient;
import com.azure.maps.weather.WeatherClientBuilder;

public class GetQuarterDayForecast {
    public static void main(String[] args) {
        // Authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));
        // builder.credential(keyCredential);

        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        WeatherClient client = new WeatherClientBuilder() 
            .credential(tokenCredential)
            .weatherClientId(System.getenv("MAPS_CLIENT_ID"))
            .buildClient();

        // Get Quarter Day Forecast -
        // https://docs.microsoft.com/en-us/rest/api/maps/weather/get-quarter-day-forecast
        // Service returns detailed weather forecast by quarter-day for the next 1, 5, 10, or 15 days 
        // for a given location. Response data is presented by quarters of the day - morning, afternoon, evening, and overnight. 
        // Details such as temperature, humidity, wind, precipitation, and UV index are returned.
        // BEGIN: com.azure.maps.weather.sync.get_quarter_day_forecast
        client.getQuarterDayForecast(new GeoPosition(-122.138874, 47.632346), null, 1, null);
        // END: com.azure.maps.weather.sync.get_quarter_day_forecast

        // Authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));
        // builder.credential(keyCredential);

        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential asyncClientTokenCredential = new DefaultAzureCredentialBuilder().build();

        WeatherAsyncClient asyncClient = new WeatherClientBuilder()
            .credential(asyncClientTokenCredential)
            .weatherClientId(System.getenv("MAPS_CLIENT_ID"))
            .buildAsyncClient();

        // Get Quarter Day Forecast -
        // https://docs.microsoft.com/en-us/rest/api/maps/weather/get-quarter-day-forecast
        // Service returns detailed weather forecast by quarter-day for the next 1, 5, 10, or 15 days 
        // for a given location. Response data is presented by quarters of the day - morning, afternoon, evening, and overnight. 
        // Details such as temperature, humidity, wind, precipitation, and UV index are returned.
        // BEGIN: com.azure.maps.weather.async.get_quarter_day_forecast
        asyncClient.getQuarterDayForecast(new GeoPosition(-122.138874, 47.632346), null, 1, null);
        // END: com.azure.maps.weather.async.get_quarter_day_forecast
    }
}
