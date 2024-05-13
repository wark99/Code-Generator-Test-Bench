# RecipeApi

All URIs are relative to *https://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recipesGet**](RecipeApi.md#recipesGet) | **GET** /recipes | Get recipes for dish, cuisine |
| [**recipesPost**](RecipeApi.md#recipesPost) | **POST** /recipes | Create a new recipe |
| [**recipesRecipeIdBookmarkPost**](RecipeApi.md#recipesRecipeIdBookmarkPost) | **POST** /recipes/{recipeId}/bookmark | Bookmark a recipe |
| [**recipesRecipeIdDelete**](RecipeApi.md#recipesRecipeIdDelete) | **DELETE** /recipes/{recipeId} | Delete a recipe |
| [**recipesRecipeIdGet**](RecipeApi.md#recipesRecipeIdGet) | **GET** /recipes/{recipeId} | Get recipe details |
| [**recipesRecipeIdRatingPost**](RecipeApi.md#recipesRecipeIdRatingPost) | **POST** /recipes/{recipeId}/rating | Rate a recipe |



## recipesGet

> RecipesGet200Response recipesGet(sort, dishId, cuisineId)

Get recipes for dish, cuisine

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        String sort = "recent"; // String | 
        Integer dishId = 56; // Integer | 
        Integer cuisineId = 56; // Integer | 
        try {
            RecipesGet200Response result = apiInstance.recipesGet(sort, dishId, cuisineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesGet");
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
| **sort** | **String**|  | [optional] [enum: recent, topRated] |
| **dishId** | **Integer**|  | [optional] |
| **cuisineId** | **Integer**|  | [optional] |

### Return type

[**RecipesGet200Response**](RecipesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## recipesPost

> RecipesPost201Response recipesPost(newRecipe)

Create a new recipe

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        NewRecipe newRecipe = new NewRecipe(); // NewRecipe | 
        try {
            RecipesPost201Response result = apiInstance.recipesPost(newRecipe);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesPost");
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
| **newRecipe** | [**NewRecipe**](NewRecipe.md)|  | |

### Return type

[**RecipesPost201Response**](RecipesPost201Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** |  |  -  |


## recipesRecipeIdBookmarkPost

> Object recipesRecipeIdBookmarkPost(recipeId)

Bookmark a recipe

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            Object result = apiInstance.recipesRecipeIdBookmarkPost(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesRecipeIdBookmarkPost");
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
| **recipeId** | **Integer**|  | |

### Return type

**Object**

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |


## recipesRecipeIdDelete

> recipesRecipeIdDelete(recipeId)

Delete a recipe

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            apiInstance.recipesRecipeIdDelete(recipeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesRecipeIdDelete");
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
| **recipeId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## recipesRecipeIdGet

> RecipesRecipeIdGet200Response recipesRecipeIdGet(recipeId)

Get recipe details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            RecipesRecipeIdGet200Response result = apiInstance.recipesRecipeIdGet(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesRecipeIdGet");
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
| **recipeId** | **Integer**|  | |

### Return type

[**RecipesRecipeIdGet200Response**](RecipesRecipeIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |


## recipesRecipeIdRatingPost

> Object recipesRecipeIdRatingPost(recipeId, recipesRecipeIdRatingPostRequest)

Rate a recipe

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecipeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        RecipesRecipeIdRatingPostRequest recipesRecipeIdRatingPostRequest = new RecipesRecipeIdRatingPostRequest(); // RecipesRecipeIdRatingPostRequest | 
        try {
            Object result = apiInstance.recipesRecipeIdRatingPost(recipeId, recipesRecipeIdRatingPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#recipesRecipeIdRatingPost");
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
| **recipeId** | **Integer**|  | |
| **recipesRecipeIdRatingPostRequest** | [**RecipesRecipeIdRatingPostRequest**](RecipesRecipeIdRatingPostRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |

