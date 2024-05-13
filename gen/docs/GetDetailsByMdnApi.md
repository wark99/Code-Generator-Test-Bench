# GetDetailsByMdnApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boomGetMdnStatusPost**](GetDetailsByMdnApi.md#boomGetMdnStatusPost) | **POST** /BoomGetMdnStatus |  |



## boomGetMdnStatusPost

> ModelApiResponse boomGetMdnStatusPost(getDetailsByMdnRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetDetailsByMdnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        GetDetailsByMdnApi apiInstance = new GetDetailsByMdnApi(defaultClient);
        GetDetailsByMdnRequest getDetailsByMdnRequest = new GetDetailsByMdnRequest(); // GetDetailsByMdnRequest | <h1>Description</h1> <h3>The \"Get Details By Mdn\" Api displays information about Mdn’s details, subscription details, customer details and plan. <h3> <h1>Endpoints</h1> <h4>/BoomGetMdnStatus</h4> <h1>Request Type</h1> <h4>Post</h4> <h3>Parameters</h3> <ul> <li><strong>ClientCode</strong> (String - Mandatory)</li> <li><strong>Msisdn</strong> (String - Mandatory) MSISDN must be exactly 10 digits.</li> <li><strong>Carrier_Type</strong> (Int - Mandatory) 97 for purple2 and 90 for red.</li> </ul>
        try {
            ModelApiResponse result = apiInstance.boomGetMdnStatusPost(getDetailsByMdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GetDetailsByMdnApi#boomGetMdnStatusPost");
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
| **getDetailsByMdnRequest** | [**GetDetailsByMdnRequest**](GetDetailsByMdnRequest.md)| &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Get Details By Mdn\&quot; Api displays information about Mdn’s details, subscription details, customer details and plan. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomGetMdnStatus&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;/ul&gt; | |

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

