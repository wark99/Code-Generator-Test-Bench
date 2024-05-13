# GameApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCities**](GameApi.md#getCities) | **GET** /cities/ | Retrieve the list of cities within a star system. |
| [**getCompanies**](GameApi.md#getCompanies) | **GET** /companies/ | Retrieve a list of all companies in the Star Citizen universe. |
| [**getFactions**](GameApi.md#getFactions) | **GET** /factions/ | Retrieve a list of all known Star Citizen factions |
| [**getGameVersions**](GameApi.md#getGameVersions) | **GET** /game_versions/ | Obtain the Star Citizen versions currently operated by UEX. It may be out of sync with Star Citizen releases sometimes. |
| [**getItems**](GameApi.md#getItems) | **GET** /items/ | Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more. |
| [**getMoons**](GameApi.md#getMoons) | **GET** /moons/ | Retrieve a list of all moons within a star system. |
| [**getOrbits**](GameApi.md#getOrbits) | **GET** /orbits/ | Retrieve a list of all planets, planetoids and lagrange points orbiting a star. |
| [**getOutposts**](GameApi.md#getOutposts) | **GET** /outposts/ | Retrieve a list of all outposts within a star system. |
| [**getPlanets**](GameApi.md#getPlanets) | **GET** /planets/ | Retrieve a list of all planets within a star system. |
| [**getSpaceStations**](GameApi.md#getSpaceStations) | **GET** /space_stations/ | Retrieve a list of all space stations within a star system. |
| [**getStarSystems**](GameApi.md#getStarSystems) | **GET** /star_systems/ | Retrieve a list of all star systems in the Star Citizen universe. |
| [**getVehicles**](GameApi.md#getVehicles) | **GET** /vehicles/ | Retrieve a list of Star Citizen vehicles, including spaceships and ground vehicles. |



## getCities

> GetCitiesOkResponse getCities(idStarSystem)

Retrieve the list of cities within a star system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idStarSystem = new BigDecimal(78); // BigDecimal | 
        try {
            GetCitiesOkResponse result = apiInstance.getCities(idStarSystem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getCities");
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
| **idStarSystem** | **BigDecimal**|  | [optional] |

### Return type

[**GetCitiesOkResponse**](GetCitiesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCompanies

> GetCompaniesOkResponse getCompanies(isVehicleManufacturer)

Retrieve a list of all companies in the Star Citizen universe.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal isVehicleManufacturer = new BigDecimal(78); // BigDecimal | 
        try {
            GetCompaniesOkResponse result = apiInstance.getCompanies(isVehicleManufacturer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getCompanies");
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
| **isVehicleManufacturer** | **BigDecimal**|  | [optional] |

### Return type

[**GetCompaniesOkResponse**](GetCompaniesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getFactions

> GetFactionsOkResponse getFactions()

Retrieve a list of all known Star Citizen factions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        try {
            GetFactionsOkResponse result = apiInstance.getFactions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getFactions");
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

[**GetFactionsOkResponse**](GetFactionsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGameVersions

> GetGameVersionsOkResponse getGameVersions()

Obtain the Star Citizen versions currently operated by UEX. It may be out of sync with Star Citizen releases sometimes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        try {
            GetGameVersionsOkResponse result = apiInstance.getGameVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getGameVersions");
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

[**GetGameVersionsOkResponse**](GetGameVersionsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItems

> GetItemsOkResponse getItems(idCategory)

Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idCategory = new BigDecimal(78); // BigDecimal | 
        try {
            GetItemsOkResponse result = apiInstance.getItems(idCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getItems");
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
| **idCategory** | **BigDecimal**|  | [optional] |

### Return type

[**GetItemsOkResponse**](GetItemsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMoons

> GetMoonsOkResponse getMoons(idStarSystem)

Retrieve a list of all moons within a star system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idStarSystem = new BigDecimal(78); // BigDecimal | 
        try {
            GetMoonsOkResponse result = apiInstance.getMoons(idStarSystem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getMoons");
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
| **idStarSystem** | **BigDecimal**|  | [optional] |

### Return type

[**GetMoonsOkResponse**](GetMoonsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getOrbits

> GetOrbitsOkResponse getOrbits(idStarSystem)

Retrieve a list of all planets, planetoids and lagrange points orbiting a star.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idStarSystem = new BigDecimal(78); // BigDecimal | 
        try {
            GetOrbitsOkResponse result = apiInstance.getOrbits(idStarSystem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getOrbits");
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
| **idStarSystem** | **BigDecimal**|  | [optional] |

### Return type

[**GetOrbitsOkResponse**](GetOrbitsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getOutposts

> GetOutpostsOkResponse getOutposts(idStarSystem)

Retrieve a list of all outposts within a star system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idStarSystem = new BigDecimal(78); // BigDecimal | 
        try {
            GetOutpostsOkResponse result = apiInstance.getOutposts(idStarSystem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getOutposts");
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
| **idStarSystem** | **BigDecimal**|  | [optional] |

### Return type

[**GetOutpostsOkResponse**](GetOutpostsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getPlanets

> GetPlanetsOkResponse getPlanets(idStarSystem)

Retrieve a list of all planets within a star system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idStarSystem = new BigDecimal(78); // BigDecimal | 
        try {
            GetPlanetsOkResponse result = apiInstance.getPlanets(idStarSystem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getPlanets");
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
| **idStarSystem** | **BigDecimal**|  | [optional] |

### Return type

[**GetPlanetsOkResponse**](GetPlanetsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSpaceStations

> GetSpaceStationsOkResponse getSpaceStations(idPlanet)

Retrieve a list of all space stations within a star system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idPlanet = new BigDecimal(78); // BigDecimal | 
        try {
            GetSpaceStationsOkResponse result = apiInstance.getSpaceStations(idPlanet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getSpaceStations");
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
| **idPlanet** | **BigDecimal**|  | [optional] |

### Return type

[**GetSpaceStationsOkResponse**](GetSpaceStationsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getStarSystems

> GetStarSystemsOkResponse getStarSystems()

Retrieve a list of all star systems in the Star Citizen universe.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        try {
            GetStarSystemsOkResponse result = apiInstance.getStarSystems();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getStarSystems");
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

[**GetStarSystemsOkResponse**](GetStarSystemsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


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
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        GameApi apiInstance = new GameApi(defaultClient);
        BigDecimal idParent = new BigDecimal(78); // BigDecimal | 
        try {
            GetVehiclesOkResponse result = apiInstance.getVehicles(idParent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getVehicles");
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

