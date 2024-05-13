# ProductsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1productsGet**](ProductsApi.md#call1productsGet) | **GET** /1/products | List products |



## call1productsGet

> Model1ProductsGet200Response call1productsGet(with, accountId, customerName, fqdn, internalName, productId, serviceId, serviceName, _return, limit, skip, page, perPage, orderBy, order, orderFor)

List products

This endpoint allows you to retrieve all the products where the current user&#39;s has at least one right.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        Integer accountId = 1234; // Integer | The account identifier
        String customerName = "My kDrive"; // String | 
        String fqdn = "www.my-domain.ch"; // String | 
        String internalName = "My kDrive"; // String | 
        Integer productId = 1234; // Integer | 
        Integer serviceId = 1; // Integer | 
        String serviceName = "backup"; // String | 
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1ProductsGet200Response result = apiInstance.call1productsGet(with, accountId, customerName, fqdn, internalName, productId, serviceId, serviceName, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#call1productsGet");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **accountId** | **Integer**| The account identifier | [optional] |
| **customerName** | **String**|  | [optional] |
| **fqdn** | **String**|  | [optional] |
| **internalName** | **String**|  | [optional] |
| **productId** | **Integer**|  | [optional] |
| **serviceId** | **Integer**|  | [optional] [enum: 1, 2, 3, 4, 6, 7, 10, 14, 15, 18, 23, 25, 26, 29, 30, 31, 34, 35, 37, 40, 43, 48, 50] |
| **serviceName** | **String**|  | [optional] [enum: backup, certificate, cloud, cloud_hd, custom_url, dedicated_server, domain, drive, e_ticketing, email_hosting, hosting, housing, invitation, jelastic, mailing, nas, public_cloud, radio, swiss_backup, video, vod, web_hosting, website_builder] |
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1ProductsGet200Response**](Model1ProductsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

