# RecipeApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCommentToRecipe**](RecipeApi.md#addCommentToRecipe) | **POST** /recipes/{recipeId}/comments | Add a comment to a recipe |
| [**bookmarkRecipe**](RecipeApi.md#bookmarkRecipe) | **POST** /recipes/{recipeId}/bookmarks | Bookmark a recipe |
| [**createRecipe**](RecipeApi.md#createRecipe) | **POST** /recipes | Create a new recipe |
| [**deleteRecipeById**](RecipeApi.md#deleteRecipeById) | **DELETE** /recipes/{recipeId} | Delete a recipe |
| [**getBookmarkers**](RecipeApi.md#getBookmarkers) | **GET** /recipes/{recipeId}/bookmarks | Get users who bookmarked a recipe |
| [**getCommentsForRecipe**](RecipeApi.md#getCommentsForRecipe) | **GET** /recipes/{recipeId}/comments | Get comments for a recipe |
| [**getRecipeById**](RecipeApi.md#getRecipeById) | **GET** /recipes/{recipeId} | Get recipe details |
| [**getRecipesForEntity**](RecipeApi.md#getRecipesForEntity) | **GET** /recipes | Get recipes for dish, cuisine |
| [**rateRecipe**](RecipeApi.md#rateRecipe) | **POST** /recipes/{recipeId}/rating | Rate a recipe |
| [**removeUpvoteFromComment**](RecipeApi.md#removeUpvoteFromComment) | **DELETE** /recipes/{recipeId}/comments/{commentId}/upvote | Remove upvote from a comment |
| [**unbookmarkRecipe**](RecipeApi.md#unbookmarkRecipe) | **DELETE** /recipes/{recipeId}/bookmarks | Unbookmark a recipe |
| [**upvoteComment**](RecipeApi.md#upvoteComment) | **POST** /recipes/{recipeId}/comments/{commentId}/upvote | Upvote a comment |



## addCommentToRecipe

> AddCommentToRecipe201Response addCommentToRecipe(recipeId, addCommentToRecipeRequest)

Add a comment to a recipe

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        AddCommentToRecipeRequest addCommentToRecipeRequest = new AddCommentToRecipeRequest(); // AddCommentToRecipeRequest | 
        try {
            AddCommentToRecipe201Response result = apiInstance.addCommentToRecipe(recipeId, addCommentToRecipeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#addCommentToRecipe");
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
| **addCommentToRecipeRequest** | [**AddCommentToRecipeRequest**](AddCommentToRecipeRequest.md)|  | |

### Return type

[**AddCommentToRecipe201Response**](AddCommentToRecipe201Response.md)

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


## bookmarkRecipe

> SuccessResponseObject bookmarkRecipe(recipeId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            SuccessResponseObject result = apiInstance.bookmarkRecipe(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#bookmarkRecipe");
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

[**SuccessResponseObject**](SuccessResponseObject.md)

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


## createRecipe

> CreateRecipe201Response createRecipe(newRecipe)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        NewRecipe newRecipe = new NewRecipe(); // NewRecipe | 
        try {
            CreateRecipe201Response result = apiInstance.createRecipe(newRecipe);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#createRecipe");
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

[**CreateRecipe201Response**](CreateRecipe201Response.md)

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


## deleteRecipeById

> SuccessResponseObject deleteRecipeById(recipeId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            SuccessResponseObject result = apiInstance.deleteRecipeById(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#deleteRecipeById");
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

[**SuccessResponseObject**](SuccessResponseObject.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getBookmarkers

> GetUserFollowing200Response getBookmarkers(recipeId)

Get users who bookmarked a recipe

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            GetUserFollowing200Response result = apiInstance.getBookmarkers(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#getBookmarkers");
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

[**GetUserFollowing200Response**](GetUserFollowing200Response.md)

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


## getCommentsForRecipe

> GetCommentsForRecipe200Response getCommentsForRecipe(recipeId)

Get comments for a recipe

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            GetCommentsForRecipe200Response result = apiInstance.getCommentsForRecipe(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#getCommentsForRecipe");
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

[**GetCommentsForRecipe200Response**](GetCommentsForRecipe200Response.md)

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


## getRecipeById

> CreateRecipe201Response getRecipeById(recipeId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            CreateRecipe201Response result = apiInstance.getRecipeById(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#getRecipeById");
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

[**CreateRecipe201Response**](CreateRecipe201Response.md)

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


## getRecipesForEntity

> GetRecipesForEntity200Response getRecipesForEntity(sort, dishId, cuisineId)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        String sort = "recent"; // String | 
        String dishId = "dishId_example"; // String | 
        String cuisineId = "cuisineId_example"; // String | 
        try {
            GetRecipesForEntity200Response result = apiInstance.getRecipesForEntity(sort, dishId, cuisineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#getRecipesForEntity");
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
| **dishId** | **String**|  | [optional] |
| **cuisineId** | **String**|  | [optional] |

### Return type

[**GetRecipesForEntity200Response**](GetRecipesForEntity200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |


## rateRecipe

> SuccessResponseObject rateRecipe(recipeId, rateRecipeRequest)

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        RateRecipeRequest rateRecipeRequest = new RateRecipeRequest(); // RateRecipeRequest | 
        try {
            SuccessResponseObject result = apiInstance.rateRecipe(recipeId, rateRecipeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#rateRecipe");
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
| **rateRecipeRequest** | [**RateRecipeRequest**](RateRecipeRequest.md)|  | |

### Return type

[**SuccessResponseObject**](SuccessResponseObject.md)

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


## removeUpvoteFromComment

> AddCommentToRecipe201Response removeUpvoteFromComment(recipeId, commentId)

Remove upvote from a comment

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        Integer commentId = 56; // Integer | 
        try {
            AddCommentToRecipe201Response result = apiInstance.removeUpvoteFromComment(recipeId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#removeUpvoteFromComment");
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
| **commentId** | **Integer**|  | |

### Return type

[**AddCommentToRecipe201Response**](AddCommentToRecipe201Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - returns new comment after upvote removal |  -  |
| **400** |  |  -  |


## unbookmarkRecipe

> SuccessResponseObject unbookmarkRecipe(recipeId)

Unbookmark a recipe

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        try {
            SuccessResponseObject result = apiInstance.unbookmarkRecipe(recipeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#unbookmarkRecipe");
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

[**SuccessResponseObject**](SuccessResponseObject.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** |  |  -  |


## upvoteComment

> AddCommentToRecipe201Response upvoteComment(recipeId, commentId)

Upvote a comment

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
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: auth_jwt
        HttpBearerAuth auth_jwt = (HttpBearerAuth) defaultClient.getAuthentication("auth_jwt");
        auth_jwt.setBearerToken("BEARER TOKEN");

        RecipeApi apiInstance = new RecipeApi(defaultClient);
        Integer recipeId = 56; // Integer | 
        Integer commentId = 56; // Integer | 
        try {
            AddCommentToRecipe201Response result = apiInstance.upvoteComment(recipeId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecipeApi#upvoteComment");
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
| **commentId** | **Integer**|  | |

### Return type

[**AddCommentToRecipe201Response**](AddCommentToRecipe201Response.md)

### Authorization

[auth_jwt](../README.md#auth_jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - returns new comment after upvote |  -  |
| **400** |  |  -  |

