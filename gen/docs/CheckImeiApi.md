# CheckImeiApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boomCheckIMEIPost**](CheckImeiApi.md#boomCheckIMEIPost) | **POST** /BoomCheckIMEI |  |



## boomCheckIMEIPost

> ModelApiResponse boomCheckIMEIPost(checkIMEIRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CheckImeiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        CheckImeiApi apiInstance = new CheckImeiApi(defaultClient);
        CheckIMEIRequest checkIMEIRequest = new CheckIMEIRequest(); // CheckIMEIRequest | <h1>Description</h1> <h3>The \"Check by IMEI\" API designed to provide information about the validity and status of an International Mobile Equipment Identity (IMEI) number. IMEI validity can refer to various aspects such as whether the device associated with the IMEI is legitimate. <h3> <h1>Endpoints</h1> <h4>/BoomCheckImei</h4> <h1>Request Type</h1> <h4>Post</h4> <h3>Parameters</h3> <ul> <li><strong>ClientCode</strong> (String - Mandatory)</li> <li><strong>IMEI</strong> (String - Mandatory) IMEI length must be between 14 and 16 characters.</li> <li><strong>Carrier_Type</strong> (Int - Mandatory) 97 for purple2 and 90 for red.</li> <li><strong>is4g</strong> (Boolean - Mandatory) True with 4G and False without 4G.</li> </ul>
        try {
            ModelApiResponse result = apiInstance.boomCheckIMEIPost(checkIMEIRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckImeiApi#boomCheckIMEIPost");
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
| **checkIMEIRequest** | [**CheckIMEIRequest**](CheckIMEIRequest.md)| &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Check by IMEI\&quot; API designed to provide information about the validity and status of an International Mobile Equipment Identity (IMEI) number. IMEI validity can refer to various aspects such as whether the device associated with the IMEI is legitimate. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomCheckImei&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length must be between 14 and 16 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;is4g&lt;/strong&gt; (Boolean - Mandatory) True with 4G and False without 4G.&lt;/li&gt; &lt;/ul&gt; | |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

