# InstantActivationApi

All URIs are relative to *http://104.42.44.252/BoomAPI/api/Genric*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMdn**](InstantActivationApi.md#addMdn) | **POST** /BoomInstantActivation |  |



## addMdn

> ModelApiResponse addMdn(instantActivationRequest)



&lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Activate Mdn with eSim / physical sim\&quot; API activates new number for a customer using eSim or physical sim. The new number can be activated only after a  successful validation which checks if the IMEI is valid and compatible to eSim technology or not.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomInstantActivation&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h2&gt;Parameters&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length Can&#39;t be greater than 16 and less than 14.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSim mandatory otherwise optional) Serial No. Can&#39;t be greater than 23 or less than 18.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;PortMobileNo&lt;/strong&gt; (String - for portin mandatory otherwise optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TariffId&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Month&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Rental&lt;/strong&gt; (decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;isWifi&lt;/strong&gt; (bool - Mandatory) True- with Wi-Fi and False- without Wi-Fi.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TransactionId&lt;/strong&gt; (String - Mandatory) Starting from “BRI” for instant activation.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;ActivationOrPortin&lt;/strong&gt; (Int - Mandatory) 0 for Activation and 1 for Portin.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Customer_Details&lt;/strong&gt; (Object - Mandatory) &lt;ul&gt; &lt;li&gt;&lt;strong&gt;Firstname&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;LastName&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Email&lt;/strong&gt; (String - Optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Address&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;City&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;State&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Zip&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;contactNumber&lt;/strong&gt; (String - for portin mandatory otherwise optional) Port contact no can only be 10 digits.&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstantActivationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://104.42.44.252/BoomAPI/api/Genric");

        InstantActivationApi apiInstance = new InstantActivationApi(defaultClient);
        InstantActivationRequest instantActivationRequest = new InstantActivationRequest(); // InstantActivationRequest | Add Activation
        try {
            ModelApiResponse result = apiInstance.addMdn(instantActivationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstantActivationApi#addMdn");
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
| **instantActivationRequest** | [**InstantActivationRequest**](InstantActivationRequest.md)| Add Activation | |

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
| **200** | Successful |  -  |

