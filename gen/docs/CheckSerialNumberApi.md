# CheckSerialNumberApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boomCheckSerialNumberPost**](CheckSerialNumberApi.md#boomCheckSerialNumberPost) | **POST** /BoomCheckSerialNumber |  |



## boomCheckSerialNumberPost

> ModelApiResponse boomCheckSerialNumberPost(checkSerialNumberRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CheckSerialNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        CheckSerialNumberApi apiInstance = new CheckSerialNumberApi(defaultClient);
        CheckSerialNumberRequest checkSerialNumberRequest = new CheckSerialNumberRequest(); // CheckSerialNumberRequest | <h1>Description</h1> <h3>The \"Check by Serial Number\" API designed to provide information about the validity of a SIM card based on its serial number. SIM card validity can refer to various aspects such as whether the SIM card is active. <h3> <h1>Endpoints</h1> <h4>/BoomCheckSerialNumber</h4> <h1>Request Type</h1> <h4>Post</h4> <h3>Parameters</h3> <ul> <li><strong>ClientCode</strong> (String - Mandatory)</li> <li><strong>SerialNumber</strong> (String - Mandatory) Serial No. must be between 18 and 23 characters.</li> <li><strong>Carrier_Type</strong> (Int - Mandatory) 97 for purple2 and 90 for red.</li> </ul>
        try {
            ModelApiResponse result = apiInstance.boomCheckSerialNumberPost(checkSerialNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckSerialNumberApi#boomCheckSerialNumberPost");
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
| **checkSerialNumberRequest** | [**CheckSerialNumberRequest**](CheckSerialNumberRequest.md)| &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Check by Serial Number\&quot; API designed to provide information about the validity of a SIM card based on its serial number. SIM card validity can refer to various aspects such as whether the SIM card is active. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomCheckSerialNumber&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - Mandatory) Serial No. must be between 18 and 23 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;/ul&gt; | |

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

