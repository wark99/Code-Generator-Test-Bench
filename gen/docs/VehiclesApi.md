# VehiclesApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVehicles**](VehiclesApi.md#getVehicles) | **GET** /vehicles/ | Retrieve a list of Star Citizen vehicles, including spaceships and ground vehicles. |
| [**getVehiclesLoanersByVehicle**](VehiclesApi.md#getVehiclesLoanersByVehicle) | **GET** /vehicles_loaners/id_vehicle/{id_vehicle}/ | Retrieve a list of Star Citizen vehicles loaners for a specific vehicle ID |
| [**getVehiclesPrices**](VehiclesApi.md#getVehiclesPrices) | **GET** /vehicles_prices/ | Obtain a daily updated list of vehicle prices in CIG&#39;s pledge store, managed either automatically by our bot or manually by the staff. |
| [**getVehiclesPurchasesPricesAll**](VehiclesApi.md#getVehiclesPurchasesPricesAll) | **GET** /vehicles_purchases_prices_all/ | Retrieve a list of prices for all vehicles purchases in all terminals, all at once |
| [**getVehiclesPurchasesPricesByTerminal**](VehiclesApi.md#getVehiclesPurchasesPricesByTerminal) | **GET** /vehicles_purchases_prices/id_terminal/{id_terminal}/ | Retrieve a list of all in-game vehicle purchase prices. |
| [**getVehiclesRentalsPricesAll**](VehiclesApi.md#getVehiclesRentalsPricesAll) | **GET** /vehicles_rentals_prices_all/ | Retrieve a list of prices for all vehicles rentals in all terminals, all at once |
| [**getVehiclesRentalsPricesByTerminal**](VehiclesApi.md#getVehiclesRentalsPricesByTerminal) | **GET** /vehicles_rentals_prices/id_terminal/{id_terminal}/ | Retrieve a list of all in-game vehicle rental prices. |



## getVehicles

> GetVehiclesOkResponse getVehicles(idParent)

Retrieve a list of Star Citizen vehicles, including spaceships and ground vehicles.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        BigDecimal idParent = new BigDecimal(78); // BigDecimal | 
        try {
            GetVehiclesOkResponse result = apiInstance.getVehicles(idParent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehicles");
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
| **idParent** | **BigDecimal**|  | [optional] |

### Return type

[**GetVehiclesOkResponse**](GetVehiclesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesLoanersByVehicle

> GetVehiclesLoanersOkResponse getVehiclesLoanersByVehicle(idVehicle)

Retrieve a list of Star Citizen vehicles loaners for a specific vehicle ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        String idVehicle = "idVehicle_example"; // String | 
        try {
            GetVehiclesLoanersOkResponse result = apiInstance.getVehiclesLoanersByVehicle(idVehicle);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesLoanersByVehicle");
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
| **idVehicle** | **String**|  | |

### Return type

[**GetVehiclesLoanersOkResponse**](GetVehiclesLoanersOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesPrices

> GetVehiclesPricesOkResponse getVehiclesPrices(idVehicle)

Obtain a daily updated list of vehicle prices in CIG&#39;s pledge store, managed either automatically by our bot or manually by the staff.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        BigDecimal idVehicle = new BigDecimal(78); // BigDecimal | 
        try {
            GetVehiclesPricesOkResponse result = apiInstance.getVehiclesPrices(idVehicle);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesPrices");
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
| **idVehicle** | **BigDecimal**|  | [optional] |

### Return type

[**GetVehiclesPricesOkResponse**](GetVehiclesPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesPurchasesPricesAll

> GetVehiclesPurchasesPricesAllOkResponse getVehiclesPurchasesPricesAll()

Retrieve a list of prices for all vehicles purchases in all terminals, all at once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        try {
            GetVehiclesPurchasesPricesAllOkResponse result = apiInstance.getVehiclesPurchasesPricesAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesPurchasesPricesAll");
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

[**GetVehiclesPurchasesPricesAllOkResponse**](GetVehiclesPurchasesPricesAllOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesPurchasesPricesByTerminal

> GetVehiclesPurchasesPricesOkResponse getVehiclesPurchasesPricesByTerminal(idTerminal)

Retrieve a list of all in-game vehicle purchase prices.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        try {
            GetVehiclesPurchasesPricesOkResponse result = apiInstance.getVehiclesPurchasesPricesByTerminal(idTerminal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesPurchasesPricesByTerminal");
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
| **idTerminal** | **String**|  | |

### Return type

[**GetVehiclesPurchasesPricesOkResponse**](GetVehiclesPurchasesPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesRentalsPricesAll

> GetVehiclesRentalsPricesAllOkResponse getVehiclesRentalsPricesAll()

Retrieve a list of prices for all vehicles rentals in all terminals, all at once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        try {
            GetVehiclesRentalsPricesAllOkResponse result = apiInstance.getVehiclesRentalsPricesAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesRentalsPricesAll");
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

[**GetVehiclesRentalsPricesAllOkResponse**](GetVehiclesRentalsPricesAllOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVehiclesRentalsPricesByTerminal

> GetVehiclesRentalsPricesOkResponse getVehiclesRentalsPricesByTerminal(idTerminal)

Retrieve a list of all in-game vehicle rental prices.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        VehiclesApi apiInstance = new VehiclesApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        try {
            GetVehiclesRentalsPricesOkResponse result = apiInstance.getVehiclesRentalsPricesByTerminal(idTerminal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#getVehiclesRentalsPricesByTerminal");
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
| **idTerminal** | **String**|  | |

### Return type

[**GetVehiclesRentalsPricesOkResponse**](GetVehiclesRentalsPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

