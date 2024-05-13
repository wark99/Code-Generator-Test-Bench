# ApiApi

All URIs are relative to *https://api-gateway.instructure.com/dap*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**jobIdGet**](ApiApi.md#jobIdGet) | **GET** /job/{id} | Returns status information about a job. |
| [**objectUrlPost**](ApiApi.md#objectUrlPost) | **POST** /object/url | Produces a list of pre-signed URLs for a list of objects. |
| [**queryNamespaceTableGet**](ApiApi.md#queryNamespaceTableGet) | **GET** /query/{namespace}/table | Returns a list of table names that exist in the given scope (e.g. organization domain). |
| [**queryNamespaceTableTableDataPost**](ApiApi.md#queryNamespaceTableTableDataPost) | **POST** /query/{namespace}/table/{table}/data | Queries a table for data. |
| [**queryNamespaceTableTableSchemaGet**](ApiApi.md#queryNamespaceTableTableSchemaGet) | **GET** /query/{namespace}/table/{table}/schema | Returns the JSON schema that records in the table conform to. |



## jobIdGet

> JobIdGet200Response jobIdGet(id)

Returns status information about a job.

Jobs (and all objects they created) are deleted 24 hours after the job was started. Deleted jobs are no longer returned by this endpoint.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String id = "id_example"; // String | Unique identifier returned when the job was started by querying data.
        try {
            JobIdGet200Response result = apiInstance.jobIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#jobIdGet");
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
| **id** | **String**| Unique identifier returned when the job was started by querying data. | |

### Return type

[**JobIdGet200Response**](JobIdGet200Response.md)

### Authorization

[Default](../README.md#Default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure. |  -  |
| **202** | A data access job in progress. |  -  |
| **401** | Client lacks valid authentication credentials. |  -  |
| **404** | The job does not exist or has expired. |  -  |
| **500** | The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error. |  -  |
| **504** | Gateway timeout error, usually should be handled with retry logic. |  -  |


## objectUrlPost

> ResourceResult objectUrlPost(modelObject)

Produces a list of pre-signed URLs for a list of objects.

In contrast to objects, which have a longer lifetime, pre-signed URLs are valid for a shorter duration, typically 15 minutes.  File paths returned by this endpoint do not adhere to any specification. While they may contain auxiliary information such as job ID or part counter, these are only informative. Downstream systems should not depend on any specific patterns of file names, or make any assumptions how much data each file contains.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        List<ModelObject> modelObject = Arrays.asList(); // List<ModelObject> | 
        try {
            ResourceResult result = apiInstance.objectUrlPost(modelObject);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#objectUrlPost");
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
| **modelObject** | [**List&lt;ModelObject&gt;**](ModelObject.md)|  | |

### Return type

[**ResourceResult**](ResourceResult.md)

### Authorization

[Default](../README.md#Default)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of pre-signed URLs. |  -  |
| **400** | The input is malformed. |  -  |
| **401** | Client lacks valid authentication credentials. |  -  |
| **404** | Objects do not exist or have expired. |  -  |
| **500** | The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error. |  -  |
| **504** | Gateway timeout error, usually should be handled with retry logic. |  -  |


## queryNamespaceTableGet

> TableList queryNamespaceTableGet(namespace, scope)

Returns a list of table names that exist in the given scope (e.g. organization domain).

If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String namespace = "namespace_example"; // String | Identifies the domain or product that the request pertains to, e.g. `canvas`.
        String scope = "scope_example"; // String | Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery.
        try {
            TableList result = apiInstance.queryNamespaceTableGet(namespace, scope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#queryNamespaceTableGet");
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
| **namespace** | **String**| Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. | |
| **scope** | **String**| Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. | [optional] |

### Return type

[**TableList**](TableList.md)

### Authorization

[Default](../README.md#Default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of tables in the given scope. |  -  |
| **401** | Client lacks valid authentication credentials. |  -  |
| **404** | The namespace does not exist. |  -  |
| **500** | The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error. |  -  |
| **504** | Gateway timeout error, usually should be handled with retry logic. |  -  |


## queryNamespaceTableTableDataPost

> JobIdGet200Response queryNamespaceTableTableDataPost(namespace, table, query, scope)

Queries a table for data.

This is an asynchronous operation. Calling this endpoint will start a new job and return immediately with status information. However, the operation will continue running on the server. The caller can poll the status of the job to find out when it is ready.  If a job with the same query parameters already exists, its details are returned rather than starting a new job.  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.  For incremental queries, the output uses a special metadata field called &#x60;action&#x60; to identify whether a record is *upserted* (inserted or updated) or *(hard) deleted* (&#x60;U&#x60; corresponds to upsert, and &#x60;D&#x60; to delete): &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; Upserted records have the primary key fields present in the sub-object &#x60;key&#x60; and all other data fields in the sub-object &#x60;value&#x60;. Deleted records only have the primary key fields in the &#x60;key&#x60; property, and lack the &#x60;value&#x60; property.  Hard deletes are infrequent. They only take place when a record is irreversibly deleted from the source database, e.g. to comply with privacy or legal requirements.  In most cases, records are *soft-deleted*, i.e. they are updated in such a way as to be understood *deleted* or *inactive* though the record is retained in the database, e.g. by setting a &#x60;workflow_state&#x60; column to the value &#x60;inactive&#x60; or &#x60;deleted&#x60;. In this context, soft deletes are equivalent to an update, and are denoted with a &#x60;U&#x60;, and all field values are included in the output.  In the rare event that inserting a record is quickly followed by a hard delete in the source database between two successive incremental queries, a record might appear with a new (so far unseen) &#x60;key&#x60;, no &#x60;value&#x60; and an &#x60;action&#x60; of &#x60;D&#x60;.  For snapshot queries, deleted records are not included in the output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } &#x60;&#x60;&#x60;  This is a rate-limited endpoint. If excessive data volume is requested repeatedly using this endpoint (e.g. a full snapshot every hour), future requests may be denied. We encourage making use of incremental queries, which substantially reduce the amount of data returned.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String namespace = "namespace_example"; // String | Identifies the domain or product that the request pertains to, e.g. `canvas`.
        String table = "table_example"; // String | Canonical name of the table whose data to return.
        Query query = new Query(); // Query | 
        String scope = "scope_example"; // String | Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery.
        try {
            JobIdGet200Response result = apiInstance.queryNamespaceTableTableDataPost(namespace, table, query, scope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#queryNamespaceTableTableDataPost");
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
| **namespace** | **String**| Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. | |
| **table** | **String**| Canonical name of the table whose data to return. | |
| **query** | [**Query**](Query.md)|  | |
| **scope** | **String**| Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. | [optional] |

### Return type

[**JobIdGet200Response**](JobIdGet200Response.md)

### Authorization

[Default](../README.md#Default)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure. |  -  |
| **202** | A data access job in progress. |  -  |
| **400** | The input is malformed. **OR** There is no data in the requested range. **OR** Raised when data is queried outside of the allowed time range, and the table was reloaded recently. |  -  |
| **401** | Client lacks valid authentication credentials. |  -  |
| **404** | The namespace or table does not exist. |  -  |
| **500** | The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error. |  -  |
| **504** | Gateway timeout error, usually should be handled with retry logic. |  -  |


## queryNamespaceTableTableSchemaGet

> VersionedSchema queryNamespaceTableTableSchemaGet(namespace, table, scope)

Returns the JSON schema that records in the table conform to.

If data is returned in JSON Lines format (&#x60;*.jsonl&#x60;) then the schema applies to the JSON object obtained by combining the sub-objects accessed via the &#x60;key&#x60; and &#x60;value&#x60; properties, respectively, of JSON items.  Assume the schema reads as follows: &#x60;&#x60;&#x60;json {     \&quot;type\&quot;: \&quot;object\&quot;,     \&quot;properties\&quot;: {         \&quot;pkey\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;,             \&quot;format\&quot;: \&quot;int64\&quot;         },         \&quot;prop1\&quot;: {             \&quot;type\&quot;: \&quot;string\&quot;         },         \&quot;prop2\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;         },         \&quot;additionalProperties\&quot;: false,         \&quot;required\&quot;: [             \&quot;pkey\&quot;,             \&quot;prop1\&quot;         ]     } } &#x60;&#x60;&#x60;  Suppose we have the following JSON output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; In the example directly above, the first and second items (&#x60;update&#x60; records) would both validate against the pre-defined schema. The validator would check the following synthesized JSON objects: &#x60;&#x60;&#x60;json { \&quot;pkey\&quot;: 1, \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } { \&quot;pkey\&quot;: 2, \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } &#x60;&#x60;&#x60; The third item (a &#x60;delete&#x60; record) does not have to validate because it indicates that the client is to remove the item.  If data is returned in Comma-Separated Values format (&#x60;*.csv&#x60;) then the schema type constraints apply to CSV &#x60;key&#x60; and &#x60;value&#x60; columns, respectively, but not CSV &#x60;meta&#x60; columns. For example, assume we have the following CSV output: &#x60;&#x60;&#x60;csv meta.action,key.pkey,value.prop1,value.prop2 U,1,\&quot;value1\&quot;,42 U,2,\&quot;value2\&quot;, D,3,, &#x60;&#x60;&#x60; Then the schema would read the same as in the JSON example above.  Nested JSON objects are flattened to simple fields, with composite names constructed using the dot notation (&#x60;parent.child&#x60;).  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String namespace = "namespace_example"; // String | Identifies the domain or product that the request pertains to, e.g. `canvas`.
        String table = "table_example"; // String | Canonical name of the table whose schema to return.
        String scope = "scope_example"; // String | Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery.
        try {
            VersionedSchema result = apiInstance.queryNamespaceTableTableSchemaGet(namespace, table, scope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#queryNamespaceTableTableSchemaGet");
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
| **namespace** | **String**| Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. | |
| **table** | **String**| Canonical name of the table whose schema to return. | |
| **scope** | **String**| Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. | [optional] |

### Return type

[**VersionedSchema**](VersionedSchema.md)

### Authorization

[Default](../README.md#Default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The versioned JSON schema specification for the table. |  -  |
| **401** | Client lacks valid authentication credentials. |  -  |
| **404** | The namespace or table does not exist. |  -  |
| **500** | The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error. |  -  |
| **504** | Gateway timeout error, usually should be handled with retry logic. |  -  |

