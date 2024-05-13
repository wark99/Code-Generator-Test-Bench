# RechargeApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boomRechargePost**](RechargeApi.md#boomRechargePost) | **POST** /BoomRecharge |  |



## boomRechargePost

> ModelApiResponse boomRechargePost(rechargeRequest)



&lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Recharge by Mdn\&quot; API is a specific type of recharge API that allows users to recharge their mobile phone using their Mdn.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomRecharge&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;ClientCode&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;TransactionId&lt;/code&gt; (String - Mandatory) Starting with \&quot;BRI\&quot; for instant activation.&lt;/li&gt; &lt;li&gt;&lt;code&gt;MSISDN&lt;/code&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PlanID&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Rental&lt;/code&gt; (Decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Carrier_Type&lt;/code&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RechargeType&lt;/code&gt; (Int - Mandatory) 0 for after plan expires and 1 for starting from.&lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RechargeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        RechargeApi apiInstance = new RechargeApi(defaultClient);
        RechargeRequest rechargeRequest = new RechargeRequest(); // RechargeRequest | Add Recharge
        try {
            ModelApiResponse result = apiInstance.boomRechargePost(rechargeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RechargeApi#boomRechargePost");
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
| **rechargeRequest** | [**RechargeRequest**](RechargeRequest.md)| Add Recharge | |

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

