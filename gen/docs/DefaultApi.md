# DefaultApi

All URIs are relative to *https://api.InventoryManagementSysteminventory.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**categoriesGet**](DefaultApi.md#categoriesGet) | **GET** /categories | List all categories |
| [**categoriesIdDelete**](DefaultApi.md#categoriesIdDelete) | **DELETE** /categories/{id} | Delete a category by ID |
| [**categoriesIdGet**](DefaultApi.md#categoriesIdGet) | **GET** /categories/{id} | Get a category by ID |
| [**categoriesIdPatch**](DefaultApi.md#categoriesIdPatch) | **PATCH** /categories/{id} | Partially update a category&#39;s information by ID |
| [**categoriesIdPut**](DefaultApi.md#categoriesIdPut) | **PUT** /categories/{id} | Update a category&#39;s information by ID |
| [**categoriesPost**](DefaultApi.md#categoriesPost) | **POST** /categories | Create a new category |
| [**customersGet**](DefaultApi.md#customersGet) | **GET** /customers | List all customers |
| [**customersIdDelete**](DefaultApi.md#customersIdDelete) | **DELETE** /customers/{id} | Delete a customer by ID |
| [**customersIdGet**](DefaultApi.md#customersIdGet) | **GET** /customers/{id} | Get a customer by ID |
| [**customersIdPatch**](DefaultApi.md#customersIdPatch) | **PATCH** /customers/{id} | Partially update a customer&#39;s information by ID |
| [**customersIdPut**](DefaultApi.md#customersIdPut) | **PUT** /customers/{id} | Update a customer&#39;s information by ID |
| [**customersPost**](DefaultApi.md#customersPost) | **POST** /customers | Create a new customer |
| [**ordersGet**](DefaultApi.md#ordersGet) | **GET** /orders | List all orders |
| [**ordersIdDelete**](DefaultApi.md#ordersIdDelete) | **DELETE** /orders/{id} | Delete an order by ID |
| [**ordersIdGet**](DefaultApi.md#ordersIdGet) | **GET** /orders/{id} | Get an order by ID |
| [**ordersIdPatch**](DefaultApi.md#ordersIdPatch) | **PATCH** /orders/{id} | Partially update an order&#39;s information by ID |
| [**ordersIdPut**](DefaultApi.md#ordersIdPut) | **PUT** /orders/{id} | Update an order&#39;s information by ID |
| [**ordersPost**](DefaultApi.md#ordersPost) | **POST** /orders | Create a new order |
| [**productsGet**](DefaultApi.md#productsGet) | **GET** /products | List all products |
| [**productsIdDelete**](DefaultApi.md#productsIdDelete) | **DELETE** /products/{id} | Delete a product by ID |
| [**productsIdGet**](DefaultApi.md#productsIdGet) | **GET** /products/{id} | Get a product by ID |
| [**productsIdPatch**](DefaultApi.md#productsIdPatch) | **PATCH** /products/{id} | Partially update a product&#39;s information by ID |
| [**productsIdPut**](DefaultApi.md#productsIdPut) | **PUT** /products/{id} | Update a product&#39;s information by ID |
| [**productsPost**](DefaultApi.md#productsPost) | **POST** /products | Create a new product |



## categoriesGet

> List&lt;Category&gt; categoriesGet()

List all categories

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Category> result = apiInstance.categoriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesGet");
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

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of categories is returned |  -  |


## categoriesIdDelete

> categoriesIdDelete(id)

Delete a category by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.categoriesIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesIdDelete");
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
| **id** | **Integer**|  | |

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
| **200** | The category was deleted successfully |  -  |


## categoriesIdGet

> Category categoriesIdGet(id)

Get a category by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Category result = apiInstance.categoriesIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesIdGet");
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
| **id** | **Integer**|  | |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed category information is returned |  -  |


## categoriesIdPatch

> categoriesIdPatch(id, categoriesIdPatchRequest)

Partially update a category&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        CategoriesIdPatchRequest categoriesIdPatchRequest = new CategoriesIdPatchRequest(); // CategoriesIdPatchRequest | 
        try {
            apiInstance.categoriesIdPatch(id, categoriesIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesIdPatch");
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
| **id** | **Integer**|  | |
| **categoriesIdPatchRequest** | [**CategoriesIdPatchRequest**](CategoriesIdPatchRequest.md)|  | |

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
| **200** | The category&#39;s information was partially updated |  -  |


## categoriesIdPut

> categoriesIdPut(id, category)

Update a category&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        Category category = new Category(); // Category | 
        try {
            apiInstance.categoriesIdPut(id, category);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesIdPut");
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
| **id** | **Integer**|  | |
| **category** | [**Category**](Category.md)|  | |

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
| **200** | The category was updated successfully |  -  |


## categoriesPost

> Category categoriesPost(category)

Create a new category

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Category category = new Category(); // Category | 
        try {
            Category result = apiInstance.categoriesPost(category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#categoriesPost");
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
| **category** | [**Category**](Category.md)|  | |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The category was created successfully |  -  |


## customersGet

> List&lt;Customer&gt; customersGet()

List all customers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Customer> result = apiInstance.customersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersGet");
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

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of customers is returned |  -  |


## customersIdDelete

> customersIdDelete(id)

Delete a customer by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.customersIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersIdDelete");
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
| **id** | **Integer**|  | |

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
| **200** | The customer was deleted successfully |  -  |


## customersIdGet

> Customer customersIdGet(id)

Get a customer by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Customer result = apiInstance.customersIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersIdGet");
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
| **id** | **Integer**|  | |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed customer information is returned |  -  |


## customersIdPatch

> customersIdPatch(id, customersIdPatchRequest)

Partially update a customer&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        CustomersIdPatchRequest customersIdPatchRequest = new CustomersIdPatchRequest(); // CustomersIdPatchRequest | 
        try {
            apiInstance.customersIdPatch(id, customersIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersIdPatch");
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
| **id** | **Integer**|  | |
| **customersIdPatchRequest** | [**CustomersIdPatchRequest**](CustomersIdPatchRequest.md)|  | |

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
| **200** | The customer&#39;s information was partially updated |  -  |


## customersIdPut

> customersIdPut(id, customer)

Update a customer&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        Customer customer = new Customer(); // Customer | 
        try {
            apiInstance.customersIdPut(id, customer);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersIdPut");
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
| **id** | **Integer**|  | |
| **customer** | [**Customer**](Customer.md)|  | |

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
| **200** | The customer was updated successfully |  -  |


## customersPost

> Customer customersPost(customer)

Create a new customer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Customer customer = new Customer(); // Customer | 
        try {
            Customer result = apiInstance.customersPost(customer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#customersPost");
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
| **customer** | [**Customer**](Customer.md)|  | |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The customer was created successfully |  -  |


## ordersGet

> List&lt;Order&gt; ordersGet()

List all orders

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Order> result = apiInstance.ordersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersGet");
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

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of orders is returned |  -  |


## ordersIdDelete

> ordersIdDelete(id)

Delete an order by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.ordersIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersIdDelete");
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
| **id** | **Integer**|  | |

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
| **200** | The order was deleted successfully |  -  |


## ordersIdGet

> Order ordersIdGet(id)

Get an order by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Order result = apiInstance.ordersIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersIdGet");
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
| **id** | **Integer**|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed order information is returned |  -  |


## ordersIdPatch

> ordersIdPatch(id, ordersIdPatchRequest)

Partially update an order&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        OrdersIdPatchRequest ordersIdPatchRequest = new OrdersIdPatchRequest(); // OrdersIdPatchRequest | 
        try {
            apiInstance.ordersIdPatch(id, ordersIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersIdPatch");
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
| **id** | **Integer**|  | |
| **ordersIdPatchRequest** | [**OrdersIdPatchRequest**](OrdersIdPatchRequest.md)|  | |

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
| **200** | The order&#39;s information was partially updated |  -  |


## ordersIdPut

> ordersIdPut(id, orderCreate)

Update an order&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        OrderCreate orderCreate = new OrderCreate(); // OrderCreate | 
        try {
            apiInstance.ordersIdPut(id, orderCreate);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersIdPut");
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
| **id** | **Integer**|  | |
| **orderCreate** | [**OrderCreate**](OrderCreate.md)|  | |

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
| **200** | The order was updated successfully |  -  |


## ordersPost

> Order ordersPost(orderCreate)

Create a new order

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        OrderCreate orderCreate = new OrderCreate(); // OrderCreate | 
        try {
            Order result = apiInstance.ordersPost(orderCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ordersPost");
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
| **orderCreate** | [**OrderCreate**](OrderCreate.md)|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The order was created successfully |  -  |


## productsGet

> List&lt;Product&gt; productsGet()

List all products

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Product> result = apiInstance.productsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsGet");
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

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of products is returned |  -  |


## productsIdDelete

> productsIdDelete(id)

Delete a product by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.productsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsIdDelete");
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
| **id** | **Integer**|  | |

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
| **200** | The product was deleted successfully |  -  |


## productsIdGet

> Product productsIdGet(id)

Get a product by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Product result = apiInstance.productsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsIdGet");
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
| **id** | **Integer**|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed product information is returned |  -  |


## productsIdPatch

> productsIdPatch(id, productsIdPatchRequest)

Partially update a product&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        ProductsIdPatchRequest productsIdPatchRequest = new ProductsIdPatchRequest(); // ProductsIdPatchRequest | 
        try {
            apiInstance.productsIdPatch(id, productsIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsIdPatch");
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
| **id** | **Integer**|  | |
| **productsIdPatchRequest** | [**ProductsIdPatchRequest**](ProductsIdPatchRequest.md)|  | |

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
| **200** | The product&#39;s information was partially updated |  -  |


## productsIdPut

> productsIdPut(id, product)

Update a product&#39;s information by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        Product product = new Product(); // Product | 
        try {
            apiInstance.productsIdPut(id, product);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsIdPut");
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
| **id** | **Integer**|  | |
| **product** | [**Product**](Product.md)|  | |

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
| **200** | The product was updated successfully |  -  |


## productsPost

> Product productsPost(product)

Create a new product

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.InventoryManagementSysteminventory.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Product product = new Product(); // Product | 
        try {
            Product result = apiInstance.productsPost(product);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#productsPost");
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
| **product** | [**Product**](Product.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The product was created successfully |  -  |

