# OntologyApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOntology**](OntologyApi.md#addOntology) | **POST** /api/v1/ontologies | Create Ontology Node |
| [**deleteOntologyNode**](OntologyApi.md#deleteOntologyNode) | **DELETE** /api/v1/ontologies/{id} | Delete Ontology Node by ID |
| [**getOntologyNode**](OntologyApi.md#getOntologyNode) | **GET** /api/v1/ontologies/{id} | Get Ontology Node by ID |
| [**listOntologyNodes**](OntologyApi.md#listOntologyNodes) | **GET** /api/v1/ontologies | List All Ontology Nodes |
| [**updateOntologyMetadata**](OntologyApi.md#updateOntologyMetadata) | **PATCH** /api/v1/ontologies/{id} | Update Ontology Node metadata |
| [**updateOntologyNode**](OntologyApi.md#updateOntologyNode) | **PUT** /ontologies/{id}/{action} | Update Ontology Node |



## addOntology

> AddOntology201Response addOntology(addOntologyRequest)

Create Ontology Node

Create a new ontology node with the specified information.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        AddOntologyRequest addOntologyRequest = new AddOntologyRequest(); // AddOntologyRequest | 
        try {
            AddOntology201Response result = apiInstance.addOntology(addOntologyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#addOntology");
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
| **addOntologyRequest** | [**AddOntologyRequest**](AddOntologyRequest.md)|  | |

### Return type

[**AddOntology201Response**](AddOntology201Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Ontology Node created successfully |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |


## deleteOntologyNode

> deleteOntologyNode(id)

Delete Ontology Node by ID

Delete an ontology node by its unique ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        String id = "id_example"; // String | ID of the ontology node to delete
        try {
            apiInstance.deleteOntologyNode(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#deleteOntologyNode");
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
| **id** | **String**| ID of the ontology node to delete | |

### Return type

null (empty response body)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Ontology Node deleted successfully |  -  |
| **404** | Not Found |  -  |


## getOntologyNode

> OntologyUpdate getOntologyNode(id)

Get Ontology Node by ID

Retrieve an ontology node by its unique ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        String id = "id_example"; // String | ID of the ontology node to retrieve
        try {
            OntologyUpdate result = apiInstance.getOntologyNode(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#getOntologyNode");
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
| **id** | **String**| ID of the ontology node to retrieve | |

### Return type

[**OntologyUpdate**](OntologyUpdate.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Ontology Node retrieved successfully |  -  |
| **404** | Not Found |  -  |


## listOntologyNodes

> List&lt;OntologyNode&gt; listOntologyNodes(page, limit, sortBy, sortOrder, filter)

List All Ontology Nodes

Retrieve a list of ontology nodes with optional filter and pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        Integer page = 1; // Integer | Page number (optional, default: 1, can't be negative). 
        Integer limit = 10; // Integer | Number of items per page (optional, default: 10, max: 100). 
        String sortBy = "modifiedOn"; // String | Field to sort by (optional, default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (optional, default: desc). 
        String filter = "false"; // String | Filter criteria (optional, default: no). 
        try {
            List<OntologyNode> result = apiInstance.listOntologyNodes(page, limit, sortBy, sortOrder, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#listOntologyNodes");
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
| **page** | **Integer**| Page number (optional, default: 1, can&#39;t be negative).  | [optional] [default to 1] |
| **limit** | **Integer**| Number of items per page (optional, default: 10, max: 100).  | [optional] [default to 10] |
| **sortBy** | **String**| Field to sort by (optional, default: modifiedOn).  | [optional] [default to modifiedOn] [enum: modifiedOn] |
| **sortOrder** | **String**| Sort order (optional, default: desc).  | [optional] [default to desc] [enum: asc, desc] |
| **filter** | **String**| Filter criteria (optional, default: no).  | [optional] [default to false] |

### Return type

[**List&lt;OntologyNode&gt;**](OntologyNode.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ontology Nodes retrieved successfully |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |
| **404** | No results found |  -  |


## updateOntologyMetadata

> UpdateOntologyMetadata200Response updateOntologyMetadata(id, updateOntologyMetadataRequest)

Update Ontology Node metadata

Update specific fields of an existing ontology node.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        String id = "id_example"; // String | ID of the ontology node to update
        UpdateOntologyMetadataRequest updateOntologyMetadataRequest = new UpdateOntologyMetadataRequest(); // UpdateOntologyMetadataRequest | 
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateOntologyMetadata(id, updateOntologyMetadataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#updateOntologyMetadata");
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
| **id** | **String**| ID of the ontology node to update | |
| **updateOntologyMetadataRequest** | [**UpdateOntologyMetadataRequest**](UpdateOntologyMetadataRequest.md)|  | |

### Return type

[**UpdateOntologyMetadata200Response**](UpdateOntologyMetadata200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ontology Node updated successfully |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |


## updateOntologyNode

> UpdateOntologyMetadata200Response updateOntologyNode(id, action, ontologyUpdate)

Update Ontology Node

Update an ontology node with specific actions (&#39;draft&#39; or &#39;publish&#39;).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OntologyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        OntologyApi apiInstance = new OntologyApi(defaultClient);
        String id = "id_example"; // String | ID of the ontology node to update
        String action = "draft"; // String | Action to perform ('draft' or 'publish')
        OntologyUpdate ontologyUpdate = new OntologyUpdate(); // OntologyUpdate | 
        try {
            UpdateOntologyMetadata200Response result = apiInstance.updateOntologyNode(id, action, ontologyUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OntologyApi#updateOntologyNode");
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
| **id** | **String**| ID of the ontology node to update | |
| **action** | **String**| Action to perform (&#39;draft&#39; or &#39;publish&#39;) | [enum: draft, publish] |
| **ontologyUpdate** | [**OntologyUpdate**](OntologyUpdate.md)|  | |

### Return type

[**UpdateOntologyMetadata200Response**](UpdateOntologyMetadata200Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ontology Node updated successfully |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

