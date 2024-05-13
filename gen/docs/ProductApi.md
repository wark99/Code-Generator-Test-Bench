# ProductApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProduct**](ProductApi.md#addProduct) | **POST** /product | Add a new product to the  Inventory |
| [**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /product/{productId} | Deletes a product |
| [**findProductsByTags**](ProductApi.md#findProductsByTags) | **GET** /product/findByTags | Finds Products by tags |
| [**getProductById**](ProductApi.md#getProductById) | **GET** /product/{productId} | Find product by ID |
| [**updateProduct**](ProductApi.md#updateProduct) | **PUT** /product | Update an existing product |
| [**updateProductWithForm**](ProductApi.md#updateProductWithForm) | **POST** /product/{productId} | Updates a product in the store with form data |



## addProduct

> Product addProduct(product)

Add a new product to the  Inventory

Add a new product to the  Inventory

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        Product product = new Product(); // Product | Create a new product in the  Inventory
        try {
            Product result = apiInstance.addProduct(product);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#addProduct");
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
| **product** | [**Product**](Product.md)| Create a new product in the  Inventory | |

### Return type

[**Product**](Product.md)

### Authorization

[Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Invalid input |  -  |


## deleteProduct

> deleteProduct(productId, apiKey)

Deletes a product

delete a product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        Long productId = 56L; // Long | Product id to delete
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deleteProduct(productId, apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#deleteProduct");
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
| **productId** | **Long**| Product id to delete | |
| **apiKey** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid product value |  -  |


## findProductsByTags

> List&lt;Product&gt; findProductsByTags(tags)

Finds Products by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        List<String> tags = Arrays.asList(); // List<String> | Tags to filter by
        try {
            List<Product> result = apiInstance.findProductsByTags(tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#findProductsByTags");
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
| **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by | [optional] |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid tag value |  -  |


## getProductById

> Product getProductById(productId)

Find product by ID

Returns a single product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        Long productId = 56L; // Long | ID of product to return
        try {
            Product result = apiInstance.getProductById(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#getProductById");
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
| **productId** | **Long**| ID of product to return | |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key), [Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Product not found |  -  |


## updateProduct

> Product updateProduct(product)

Update an existing product

Update an existing product by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        Product product = new Product(); // Product | Update an existent product in the  Inventory
        try {
            Product result = apiInstance.updateProduct(product);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#updateProduct");
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
| **product** | [**Product**](Product.md)| Update an existent product in the  Inventory | |

### Return type

[**Product**](Product.md)

### Authorization

[Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Product not found |  -  |
| **405** | Validation exception |  -  |


## updateProductWithForm

> updateProductWithForm(productId, name, price)

Updates a product in the store with form data



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: Inventory_auth
        OAuth Inventory_auth = (OAuth) defaultClient.getAuthentication("Inventory_auth");
        Inventory_auth.setAccessToken("YOUR ACCESS TOKEN");

        ProductApi apiInstance = new ProductApi(defaultClient);
        Long productId = 56L; // Long | ID of product that needs to be updated
        String name = "name_example"; // String | Name of product that needs to be updated
        Integer price = 56; // Integer | price of product that needs to be updated
        try {
            apiInstance.updateProductWithForm(productId, name, price);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#updateProductWithForm");
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
| **productId** | **Long**| ID of product that needs to be updated | |
| **name** | **String**| Name of product that needs to be updated | [optional] |
| **price** | **Integer**| price of product that needs to be updated | [optional] |

### Return type

null (empty response body)

### Authorization

[Inventory_auth](../README.md#Inventory_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |

