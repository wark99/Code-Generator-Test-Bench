# DefaultApi

All URIs are relative to *https://.axiscare.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientsGetSingle**](DefaultApi.md#clientsGetSingle) | **GET** /api/clients/{clientId} | Get Client |
| [**clientsList**](DefaultApi.md#clientsList) | **GET** /api/clients | List Clients |
| [**getApiApplicantApplicantId**](DefaultApi.md#getApiApplicantApplicantId) | **GET** /api/applicants/{applicantId} | Get Applicant |
| [**getApiApplicants**](DefaultApi.md#getApiApplicants) | **GET** /api/applicants | List Applicants |
| [**getApiCaregivers**](DefaultApi.md#getApiCaregivers) | **GET** /api/caregivers | List Caregivers |
| [**getApiCaregiversCaregiverId**](DefaultApi.md#getApiCaregiversCaregiverId) | **GET** /api/caregivers/{caregiverId} | Get Caregiver |
| [**getApiVisits**](DefaultApi.md#getApiVisits) | **GET** /api/visits | List Visits |
| [**patchApiCaregiversCaregiverId**](DefaultApi.md#patchApiCaregiversCaregiverId) | **PATCH** /api/caregivers/{caregiverId} | Update Caregiver |
| [**patchApiClients**](DefaultApi.md#patchApiClients) | **PATCH** /api/clients/{clientId} | Update Client |
| [**patchApiVisitsVisitId**](DefaultApi.md#patchApiVisitsVisitId) | **PATCH** /api/visits/{visitId} | Update Visit |
| [**postApiCaregivers**](DefaultApi.md#postApiCaregivers) | **POST** /api/caregivers | Add Caregiver |
| [**postApiClients**](DefaultApi.md#postApiClients) | **POST** /api/clients | Add Client |
| [**postApiVisits**](DefaultApi.md#postApiVisits) | **POST** /api/visits | Add Visit |



## clientsGetSingle

> ClientsGetSingle200Response clientsGetSingle(xAxisCareApiVersion, clientId, requestedSensitiveFields)

Get Client

This endpoint returns a single client.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        Integer clientId = 56; // Integer | Client ID
        String requestedSensitiveFields = "ssn"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        try {
            ClientsGetSingle200Response result = apiInstance.clientsGetSingle(xAxisCareApiVersion, clientId, requestedSensitiveFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsGetSingle");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **clientId** | **Integer**| Client ID | |
| **requestedSensitiveFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |

### Return type

[**ClientsGetSingle200Response**](ClientsGetSingle200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## clientsList

> ClientsList200Response clientsList(xAxisCareApiVersion, clientIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, externalIds, adminUsernames, startAfterId, limit, requestedSensitiveFields)

List Clients

This endpoint allows you to list clients and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so client must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;clientIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        String clientIds = "clientIds_example"; // String | Comma-delimited string of client IDs to return
        String statuses = "statuses_example"; // String | Comma-delimited string of statuses to filter client result set
        String regionIds = "regionIds_example"; // String | Comma-delimited string of region IDs to filter client result set
        String regionNames = "regionNames_example"; // String | Comma-delimited string of region names to filter client result set
        String classCodes = "classCodes_example"; // String | Comma-delimited string of class codes to filter client result set
        String classLabels = "classLabels_example"; // String | Comma-delimited string of class labels to filter client result set
        String adminIds = "adminIds_example"; // String | Comma-delimited string of administrator IDs to filter client result set
        String externalIds = "externalIds_example"; // String | Comma-delimited string of external IDs to filter client result set
        String adminUsernames = "adminUsernames_example"; // String | Comma-delimited string of administrator usernames to filter client result set
        Integer startAfterId = 56; // Integer | Used in pagination to specify the client ID after which to start the next page
        Integer limit = 100; // Integer | Limit the number of clients returned
        String requestedSensitiveFields = "ssn"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        try {
            ClientsList200Response result = apiInstance.clientsList(xAxisCareApiVersion, clientIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, externalIds, adminUsernames, startAfterId, limit, requestedSensitiveFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsList");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **clientIds** | **String**| Comma-delimited string of client IDs to return | [optional] |
| **statuses** | **String**| Comma-delimited string of statuses to filter client result set | [optional] |
| **regionIds** | **String**| Comma-delimited string of region IDs to filter client result set | [optional] |
| **regionNames** | **String**| Comma-delimited string of region names to filter client result set | [optional] |
| **classCodes** | **String**| Comma-delimited string of class codes to filter client result set | [optional] |
| **classLabels** | **String**| Comma-delimited string of class labels to filter client result set | [optional] |
| **adminIds** | **String**| Comma-delimited string of administrator IDs to filter client result set | [optional] |
| **externalIds** | **String**| Comma-delimited string of external IDs to filter client result set | [optional] |
| **adminUsernames** | **String**| Comma-delimited string of administrator usernames to filter client result set | [optional] |
| **startAfterId** | **Integer**| Used in pagination to specify the client ID after which to start the next page | [optional] |
| **limit** | **Integer**| Limit the number of clients returned | [optional] [default to 100] |
| **requestedSensitiveFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |

### Return type

[**ClientsList200Response**](ClientsList200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## getApiApplicantApplicantId

> GetApiApplicantApplicantId200Response getApiApplicantApplicantId(applicantId, xAxisCareApiVersion, requestedSensitiveFields)

Get Applicant

This endpoint returns a single applicant.  By default, applicant SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String applicantId = "applicantId_example"; // String | 
        String xAxisCareApiVersion = "xAxisCareApiVersion_example"; // String | API version
        String requestedSensitiveFields = "requestedSensitiveFields_example"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        try {
            GetApiApplicantApplicantId200Response result = apiInstance.getApiApplicantApplicantId(applicantId, xAxisCareApiVersion, requestedSensitiveFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiApplicantApplicantId");
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
| **applicantId** | **String**|  | |
| **xAxisCareApiVersion** | **String**| API version | [optional] |
| **requestedSensitiveFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |

### Return type

[**GetApiApplicantApplicantId200Response**](GetApiApplicantApplicantId200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getApiApplicants

> GetApiApplicants200Response getApiApplicants(applicantIds, statuses, requestedSensitiverFields, startAfterId, xAxiscareApiVersion)

List Applicants

This endpoint allows you to list applicants and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so applicants must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;applicantIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some applicants are not found by ID, there is a property called &#x60;applicantsNotFound&#x60; that contains an array of the not found IDs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String applicantIds = "applicantIds_example"; // String | Comma-delimited string of applicant IDs to return
        String statuses = "statuses_example"; // String | Comma-delimited string of statuses to filter applicants result set
        String requestedSensitiverFields = "requestedSensitiverFields_example"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        String startAfterId = "startAfterId_example"; // String | Used in pagination to specify the applicant ID after which to start the next page
        String xAxiscareApiVersion = "xAxiscareApiVersion_example"; // String | API version
        try {
            GetApiApplicants200Response result = apiInstance.getApiApplicants(applicantIds, statuses, requestedSensitiverFields, startAfterId, xAxiscareApiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiApplicants");
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
| **applicantIds** | **String**| Comma-delimited string of applicant IDs to return | [optional] |
| **statuses** | **String**| Comma-delimited string of statuses to filter applicants result set | [optional] |
| **requestedSensitiverFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |
| **startAfterId** | **String**| Used in pagination to specify the applicant ID after which to start the next page | [optional] |
| **xAxiscareApiVersion** | **String**| API version | [optional] |

### Return type

[**GetApiApplicants200Response**](GetApiApplicants200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **207** | Multi-Status (WebDAV) |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getApiCaregivers

> GetApiCaregivers200Response getApiCaregivers(xAxiscareApiVersion, caregiverIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, adminUsernames, startAfterId, limit, requestedSensitiverFields)

List Caregivers

This endpoint allows you to list caregivers and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so caregivers must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;caregiverIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some caregivers are not found by ID, there is a property called &#x60;caregiversNotFound&#x60; that contains an array of the not found IDs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxiscareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        String caregiverIds = "caregiverIds_example"; // String | Comma-delimited string of caregiver IDs to return
        String statuses = "statuses_example"; // String | Comma-delimited string of statuses to filter caregiver result set
        String regionIds = "regionIds_example"; // String | Comma-delimited string of region IDs to filter caregiver result set
        String regionNames = "regionNames_example"; // String | Comma-delimited string of region names to filter caregiver result set
        String classCodes = "classCodes_example"; // String | Comma-delimited string of class codes to filter caregiver result set
        String classLabels = "classLabels_example"; // String | Comma-delimited string of class labels to filter caregiver result set
        String adminIds = "adminIds_example"; // String | Comma-delimited string of administrator IDs to filter caregiver result set
        String adminUsernames = "adminUsernames_example"; // String | Comma-delimited string of administrator usernames to filter caregiver result set
        String startAfterId = "startAfterId_example"; // String | Used in pagination to specify the caregiver ID after which to start the next page
        String limit = "limit_example"; // String | Limit the number of caregiver returned
        String requestedSensitiverFields = "requestedSensitiverFields_example"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        try {
            GetApiCaregivers200Response result = apiInstance.getApiCaregivers(xAxiscareApiVersion, caregiverIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, adminUsernames, startAfterId, limit, requestedSensitiverFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiCaregivers");
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
| **xAxiscareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **caregiverIds** | **String**| Comma-delimited string of caregiver IDs to return | [optional] |
| **statuses** | **String**| Comma-delimited string of statuses to filter caregiver result set | [optional] |
| **regionIds** | **String**| Comma-delimited string of region IDs to filter caregiver result set | [optional] |
| **regionNames** | **String**| Comma-delimited string of region names to filter caregiver result set | [optional] |
| **classCodes** | **String**| Comma-delimited string of class codes to filter caregiver result set | [optional] |
| **classLabels** | **String**| Comma-delimited string of class labels to filter caregiver result set | [optional] |
| **adminIds** | **String**| Comma-delimited string of administrator IDs to filter caregiver result set | [optional] |
| **adminUsernames** | **String**| Comma-delimited string of administrator usernames to filter caregiver result set | [optional] |
| **startAfterId** | **String**| Used in pagination to specify the caregiver ID after which to start the next page | [optional] |
| **limit** | **String**| Limit the number of caregiver returned | [optional] |
| **requestedSensitiverFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |

### Return type

[**GetApiCaregivers200Response**](GetApiCaregivers200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **207** | Multi-Status (WebDAV) |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getApiCaregiversCaregiverId

> GetApiCaregiversCaregiverId200Response getApiCaregiversCaregiverId(xAxisCareApiVersion, caregiverId, requestedSensitiveFields)

Get Caregiver

This endpoint returns a single caregiver.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        Integer caregiverId = 56; // Integer | Caregiver ID
        String requestedSensitiveFields = "requestedSensitiveFields_example"; // String | Comma-delimited string of names of sensitive fields to include in the payload
        try {
            GetApiCaregiversCaregiverId200Response result = apiInstance.getApiCaregiversCaregiverId(xAxisCareApiVersion, caregiverId, requestedSensitiveFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiCaregiversCaregiverId");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **caregiverId** | **Integer**| Caregiver ID | |
| **requestedSensitiveFields** | **String**| Comma-delimited string of names of sensitive fields to include in the payload | [optional] |

### Return type

[**GetApiCaregiversCaregiverId200Response**](GetApiCaregiversCaregiverId200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getApiVisits

> GetApiVisits200Response getApiVisits(xAxisCareApiVersion, clientIds, clientClassCodes, clientClassLabels, clientAdminIds, caregiverIds, caregiverClassCodes, caregiverClassLabels, caregiverAdminIds, caregiverAdminUsernames, regionIds, regionNames, startDate, endDate, clientAdminUsernames, verified, updatedSinceDate, visitIds)

List Visits

This endpoint allows you to list visits and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so the visit must match all the requested filters in order to be returned.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String xAxisCareApiVersion = "2023-10-01"; // String | API Version
        String clientIds = "clientIds_example"; // String | Comma-delimited string of client IDs to filter visit result set
        String clientClassCodes = "clientClassCodes_example"; // String | Comma-delimited string of client class codes to filter visit result set
        String clientClassLabels = "clientClassLabels_example"; // String | Comma-delimited string of client class labels to filter visit result set
        String clientAdminIds = "clientAdminIds_example"; // String | Comma-delimited string of client administrator IDs to filter visit result set
        String caregiverIds = "caregiverIds_example"; // String | Comma-delimited string of caregiver IDs to filter visit result set
        String caregiverClassCodes = "caregiverClassCodes_example"; // String | Comma-delimited string of caregiver class codes to filter visit result set
        String caregiverClassLabels = "caregiverClassLabels_example"; // String | Comma-delimited string of caregiver class labels to filter visit result set
        String caregiverAdminIds = "caregiverAdminIds_example"; // String | Comma-delimited string of caregiver administrator IDs to filter visit result set
        String caregiverAdminUsernames = "caregiverAdminUsernames_example"; // String | Comma-delimited string of caregiver administrator usernames to filter visit result set
        String regionIds = "regionIds_example"; // String | Comma-delimited string of client region IDs to filter visit result set
        String regionNames = "regionNames_example"; // String | Comma-delimited string of client region names to filter visit result set
        LocalDate startDate = LocalDate.parse("2023-10-01"); // LocalDate | Visit start date localized to visit timezone. Required if updatedSinceDate is not used
        LocalDate endDate = LocalDate.parse("2023-10-07"); // LocalDate | Visit end date localized to visit timezone. Required if updatedSinceDate is not used
        String clientAdminUsernames = "clientAdminUsernames_example"; // String | Comma-delimited string of client administrator usernames to filter visit result set
        Boolean verified = true; // Boolean | Verification status of visits, all visits returned by default
        OffsetDateTime updatedSinceDate = OffsetDateTime.parse("2023-12-01T00:00:00Z"); // OffsetDateTime | UTC date to return visits which have been updated since said date
        String visitIds = "visitIds_example"; // String | Comma-delimited string of visit IDs to filter visit result set. If this filter is provided, then no other filters can be used.
        try {
            GetApiVisits200Response result = apiInstance.getApiVisits(xAxisCareApiVersion, clientIds, clientClassCodes, clientClassLabels, clientAdminIds, caregiverIds, caregiverClassCodes, caregiverClassLabels, caregiverAdminIds, caregiverAdminUsernames, regionIds, regionNames, startDate, endDate, clientAdminUsernames, verified, updatedSinceDate, visitIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiVisits");
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
| **xAxisCareApiVersion** | **String**| API Version | [enum: 2023-10-01] |
| **clientIds** | **String**| Comma-delimited string of client IDs to filter visit result set | [optional] |
| **clientClassCodes** | **String**| Comma-delimited string of client class codes to filter visit result set | [optional] |
| **clientClassLabels** | **String**| Comma-delimited string of client class labels to filter visit result set | [optional] |
| **clientAdminIds** | **String**| Comma-delimited string of client administrator IDs to filter visit result set | [optional] |
| **caregiverIds** | **String**| Comma-delimited string of caregiver IDs to filter visit result set | [optional] |
| **caregiverClassCodes** | **String**| Comma-delimited string of caregiver class codes to filter visit result set | [optional] |
| **caregiverClassLabels** | **String**| Comma-delimited string of caregiver class labels to filter visit result set | [optional] |
| **caregiverAdminIds** | **String**| Comma-delimited string of caregiver administrator IDs to filter visit result set | [optional] |
| **caregiverAdminUsernames** | **String**| Comma-delimited string of caregiver administrator usernames to filter visit result set | [optional] |
| **regionIds** | **String**| Comma-delimited string of client region IDs to filter visit result set | [optional] |
| **regionNames** | **String**| Comma-delimited string of client region names to filter visit result set | [optional] |
| **startDate** | **LocalDate**| Visit start date localized to visit timezone. Required if updatedSinceDate is not used | [optional] |
| **endDate** | **LocalDate**| Visit end date localized to visit timezone. Required if updatedSinceDate is not used | [optional] |
| **clientAdminUsernames** | **String**| Comma-delimited string of client administrator usernames to filter visit result set | [optional] |
| **verified** | **Boolean**| Verification status of visits, all visits returned by default | [optional] |
| **updatedSinceDate** | **OffsetDateTime**| UTC date to return visits which have been updated since said date | [optional] |
| **visitIds** | **String**| Comma-delimited string of visit IDs to filter visit result set. If this filter is provided, then no other filters can be used. | [optional] |

### Return type

[**GetApiVisits200Response**](GetApiVisits200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Invalid Input |  -  |
| **500** | Internal Server Error |  -  |


## patchApiCaregiversCaregiverId

> PatchApiCaregiversCaregiverId200Response patchApiCaregiversCaregiverId(xAxisCareApiVersion, caregiverId, patchApiCaregiversCaregiverIdRequest)

Update Caregiver

This endpoint allows you to edit caregivers in AxisCare. You can supply a partial payload of only the keys you want to update.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        Integer caregiverId = 56; // Integer | Caregiver ID
        PatchApiCaregiversCaregiverIdRequest patchApiCaregiversCaregiverIdRequest = new PatchApiCaregiversCaregiverIdRequest(); // PatchApiCaregiversCaregiverIdRequest | 
        try {
            PatchApiCaregiversCaregiverId200Response result = apiInstance.patchApiCaregiversCaregiverId(xAxisCareApiVersion, caregiverId, patchApiCaregiversCaregiverIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#patchApiCaregiversCaregiverId");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **caregiverId** | **Integer**| Caregiver ID | |
| **patchApiCaregiversCaregiverIdRequest** | [**PatchApiCaregiversCaregiverIdRequest**](PatchApiCaregiversCaregiverIdRequest.md)|  | [optional] |

### Return type

[**PatchApiCaregiversCaregiverId200Response**](PatchApiCaregiversCaregiverId200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Invalid Input |  -  |


## patchApiClients

> PatchApiClients200Response patchApiClients(xAxisCareApiVersion, clientId, patchApiClientsRequest)

Update Client

This endpoint allows you to edit clients in AxisCare. You can supply a partial payload of only the keys you want to update.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        Integer clientId = 56; // Integer | Client ID
        PatchApiClientsRequest patchApiClientsRequest = new PatchApiClientsRequest(); // PatchApiClientsRequest | 
        try {
            PatchApiClients200Response result = apiInstance.patchApiClients(xAxisCareApiVersion, clientId, patchApiClientsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#patchApiClients");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **clientId** | **Integer**| Client ID | |
| **patchApiClientsRequest** | [**PatchApiClientsRequest**](PatchApiClientsRequest.md)|  | [optional] |

### Return type

[**PatchApiClients200Response**](PatchApiClients200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## patchApiVisitsVisitId

> PostApiVisits201Response patchApiVisitsVisitId(xAxisCareApiVersion, visitId, visitId2, patchApiVisitsVisitIdRequest)

Update Visit

This endpoint allows you to modify an existing visit by its ID (e.g. &#x60;s&#x3D;222:d&#x3D;2024-03-04&#x60;). You can supply a partial payload of only the keys you want to update. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        String visitId = "visitId_example"; // String | 
        String visitId2 = "visitId_example"; // String | 
        PatchApiVisitsVisitIdRequest patchApiVisitsVisitIdRequest = new PatchApiVisitsVisitIdRequest(); // PatchApiVisitsVisitIdRequest | 
        try {
            PostApiVisits201Response result = apiInstance.patchApiVisitsVisitId(xAxisCareApiVersion, visitId, visitId2, patchApiVisitsVisitIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#patchApiVisitsVisitId");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **visitId** | **String**|  | |
| **visitId2** | **String**|  | |
| **patchApiVisitsVisitIdRequest** | [**PatchApiVisitsVisitIdRequest**](PatchApiVisitsVisitIdRequest.md)|  | [optional] |

### Return type

[**PostApiVisits201Response**](PostApiVisits201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error. |  -  |


## postApiCaregivers

> PostApiCaregivers201Response postApiCaregivers(xAxisCareApiVersion, postApiCaregiversRequest)

Add Caregiver

This endpoint allows you to add new caregivers to AxisCare. The minimum required information is a first name and last name, and a new caregiver will be created with an Active status.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        PostApiCaregiversRequest postApiCaregiversRequest = new PostApiCaregiversRequest(); // PostApiCaregiversRequest | 
        try {
            PostApiCaregivers201Response result = apiInstance.postApiCaregivers(xAxisCareApiVersion, postApiCaregiversRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postApiCaregivers");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **postApiCaregiversRequest** | [**PostApiCaregiversRequest**](PostApiCaregiversRequest.md)|  | [optional] |

### Return type

[**PostApiCaregivers201Response**](PostApiCaregivers201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **422** | Invalid Input |  -  |


## postApiClients

> PostApiClients200Response postApiClients(xAxisCareApiVersion, postApiClientsRequest)

Add Client

This endpoint allows you to add new clients to AxisCare. The minimum required information is a first name and last name, and a new client will be created with an Active status.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        PostApiClientsRequest postApiClientsRequest = new PostApiClientsRequest(); // PostApiClientsRequest | 
        try {
            PostApiClients200Response result = apiInstance.postApiClients(xAxisCareApiVersion, postApiClientsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postApiClients");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **postApiClientsRequest** | [**PostApiClientsRequest**](PostApiClientsRequest.md)|  | [optional] |

### Return type

[**PostApiClients200Response**](PostApiClients200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## postApiVisits

> PostApiVisits201Response postApiVisits(xAxisCareApiVersion, postApiVisitsRequest)

Add Visit

\&quot;This endpoint allows you to add a visit. The minimum required information is a client ID, a visit date, a start time, and an end time. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://.axiscare.com");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate xAxisCareApiVersion = LocalDate.parse("2023-10-01"); // LocalDate | API version
        PostApiVisitsRequest postApiVisitsRequest = new PostApiVisitsRequest(); // PostApiVisitsRequest | 
        try {
            PostApiVisits201Response result = apiInstance.postApiVisits(xAxisCareApiVersion, postApiVisitsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postApiVisits");
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
| **xAxisCareApiVersion** | **LocalDate**| API version | [enum: 2023-10-01] |
| **postApiVisitsRequest** | [**PostApiVisitsRequest**](PostApiVisitsRequest.md)|  | [optional] |

### Return type

[**PostApiVisits201Response**](PostApiVisits201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error. |  -  |

