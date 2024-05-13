# CheckPortinMdnApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boomCheckPortinMdnPost**](CheckPortinMdnApi.md#boomCheckPortinMdnPost) | **POST** /BoomCheckPortinMdn |  |



## boomCheckPortinMdnPost

> ModelApiResponse boomCheckPortinMdnPost(checkPortinMdnRequest)



&lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Check Port in by Mdn\&quot; API check if IMEI, SIM and MDN are compatible. We get status which describes if the MDN is Portable. This API is called during the port in number flow to check port possibility. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomCheckPortinMdn&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length must be between 14 and 16 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSIM mandatory, otherwise optional) Serial No. must be between 18 and 23 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;is4g&lt;/strong&gt; (Boolean - for portin mandatory, otherwise optional) True with 4G and False without 4G.&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CheckPortinMdnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        CheckPortinMdnApi apiInstance = new CheckPortinMdnApi(defaultClient);
        CheckPortinMdnRequest checkPortinMdnRequest = new CheckPortinMdnRequest(); // CheckPortinMdnRequest | Check Portin by Mdn
        try {
            ModelApiResponse result = apiInstance.boomCheckPortinMdnPost(checkPortinMdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckPortinMdnApi#boomCheckPortinMdnPost");
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
| **checkPortinMdnRequest** | [**CheckPortinMdnRequest**](CheckPortinMdnRequest.md)| Check Portin by Mdn | |

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

