# PlanAConferenceApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1kmeetRoomsPost**](PlanAConferenceApi.md#call1kmeetRoomsPost) | **POST** /1/kmeet/rooms | Plan a conference |



## call1kmeetRoomsPost

> Model1KmeetRoomsPost200Response call1kmeetRoomsPost(plannedConference)

Plan a conference

This endpoint allows you to plan a conference with predefined settings. It will add an event on your Infomaniak Calendar with the meeting url.  If you just want to create a room you don&#39;t need any API calls, you can build a conference URL by adding an unique identifier to your kMeet instance url (eg: kmeet.infomaniak.com/${MY_VERY_SECRET_CONFERENCE_ID})

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlanAConferenceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PlanAConferenceApi apiInstance = new PlanAConferenceApi(defaultClient);
        PlannedConference plannedConference = new PlannedConference(); // PlannedConference | 
        try {
            Model1KmeetRoomsPost200Response result = apiInstance.call1kmeetRoomsPost(plannedConference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlanAConferenceApi#call1kmeetRoomsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **plannedConference** | [**PlannedConference**](PlannedConference.md)|  | [optional] |

### Return type

[**Model1KmeetRoomsPost200Response**](Model1KmeetRoomsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default Response |  -  |
| **422** | Unprocessable Entity |  -  |

