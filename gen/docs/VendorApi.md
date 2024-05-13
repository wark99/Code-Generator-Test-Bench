# VendorApi

All URIs are relative to *https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVendor**](VendorApi.md#createVendor) | **POST** /vendor | Create a new vendor |
| [**deleteVendor**](VendorApi.md#deleteVendor) | **DELETE** /Vendor/{vendor_id} | Delete a vendor |
| [**getAllVendors**](VendorApi.md#getAllVendors) | **GET** /vendor | Get all vendors |
| [**getVendorById**](VendorApi.md#getVendorById) | **GET** /Vendor/{vendor_id} | Get vendor by ID |
| [**partialUpdateVendor**](VendorApi.md#partialUpdateVendor) | **PATCH** /Vendor/{vendor_id} | Update an existing vendor partially |
| [**updateVendor**](VendorApi.md#updateVendor) | **PUT** /Vendor/{vendor_id} | Update an existing vendor |



## createVendor

> createVendor(vendor)

Create a new vendor

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        Vendor vendor = new Vendor(); // Vendor | Vendor object to be created
        try {
            apiInstance.createVendor(vendor);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#createVendor");
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
| **vendor** | [**Vendor**](Vendor.md)| Vendor object to be created | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vendor created successfully |  -  |
| **201** | created |  -  |


## deleteVendor

> deleteVendor(vendorId)

Delete a vendor

Delete a vendor by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        Integer vendorId = 56; // Integer | ID of the vendor to delete
        try {
            apiInstance.deleteVendor(vendorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#deleteVendor");
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
| **vendorId** | **Integer**| ID of the vendor to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vendor deleted successfully |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Vendor not found |  -  |


## getAllVendors

> List&lt;Vendor&gt; getAllVendors()

Get all vendors

Returns all registered vendors

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        try {
            List<Vendor> result = apiInstance.getAllVendors();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getAllVendors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Vendor&gt;**](Vendor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## getVendorById

> Vendor getVendorById(vendorId)

Get vendor by ID

Returns a single vendor based on the provided ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        Integer vendorId = 56; // Integer | ID of the vendor to retrieve
        try {
            Vendor result = apiInstance.getVendorById(vendorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getVendorById");
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
| **vendorId** | **Integer**| ID of the vendor to retrieve | |

### Return type

[**Vendor**](Vendor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | Vendor not found |  -  |


## partialUpdateVendor

> partialUpdateVendor(vendorId, vendor)

Update an existing vendor partially

Update an existing vendor partially by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        Integer vendorId = 56; // Integer | ID of the vendor to update
        Vendor vendor = new Vendor(); // Vendor | Partially updated vendor information
        try {
            apiInstance.partialUpdateVendor(vendorId, vendor);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#partialUpdateVendor");
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
| **vendorId** | **Integer**| ID of the vendor to update | |
| **vendor** | [**Vendor**](Vendor.md)| Partially updated vendor information | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vendor updated successfully |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Vendor not found |  -  |
| **422** | Validation exception |  -  |


## updateVendor

> updateVendor(vendorId, vendor)

Update an existing vendor

Update an existing vendor by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VendorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        VendorApi apiInstance = new VendorApi(defaultClient);
        Integer vendorId = 56; // Integer | ID of the vendor to update
        Vendor vendor = new Vendor(); // Vendor | Updated vendor information
        try {
            apiInstance.updateVendor(vendorId, vendor);
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#updateVendor");
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
| **vendorId** | **Integer**| ID of the vendor to update | |
| **vendor** | [**Vendor**](Vendor.md)| Updated vendor information | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vendor updated successfully |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Vendor not found |  -  |
| **422** | Validation exception |  -  |

