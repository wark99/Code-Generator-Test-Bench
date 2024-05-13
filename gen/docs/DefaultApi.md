# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appraisalGet**](DefaultApi.md#appraisalGet) | **GET** /appraisal |  |
| [**buyerGet**](DefaultApi.md#buyerGet) | **GET** /buyer |  |
| [**buyerPotentialGet**](DefaultApi.md#buyerPotentialGet) | **GET** /buyer/potential |  |
| [**certificateGet**](DefaultApi.md#certificateGet) | **GET** /certificate |  |
| [**contractorGet**](DefaultApi.md#contractorGet) | **GET** /contractor |  |
| [**correspondencePost**](DefaultApi.md#correspondencePost) | **POST** /correspondence |  |
| [**employeeGet**](DefaultApi.md#employeeGet) | **GET** /employee |  |
| [**inspectionAppointmentGet**](DefaultApi.md#inspectionAppointmentGet) | **GET** /inspection/appointment |  |
| [**inspectionReportGet**](DefaultApi.md#inspectionReportGet) | **GET** /inspection/report |  |
| [**inspectionReportPost**](DefaultApi.md#inspectionReportPost) | **POST** /inspection/report |  |
| [**inventoryPropertyPropertyIdPost**](DefaultApi.md#inventoryPropertyPropertyIdPost) | **POST** /inventory/property/{property_id} |  |
| [**landlordPotentialGet**](DefaultApi.md#landlordPotentialGet) | **GET** /landlord/potential |  |
| [**maintenanceGet**](DefaultApi.md#maintenanceGet) | **GET** /maintenance |  |
| [**maintenanceIdPut**](DefaultApi.md#maintenanceIdPut) | **PUT** /maintenance/{id} |  |
| [**maintenancePost**](DefaultApi.md#maintenancePost) | **POST** /maintenance |  |
| [**maintenancePropertyPropertyIdPost**](DefaultApi.md#maintenancePropertyPropertyIdPost) | **POST** /maintenance/property/{property_id} |  |
| [**offerAcceptedGet**](DefaultApi.md#offerAcceptedGet) | **GET** /offer/accepted |  |
| [**offerGet**](DefaultApi.md#offerGet) | **GET** /offer |  |
| [**ownerGet**](DefaultApi.md#ownerGet) | **GET** /owner |  |
| [**ownerIdBankAccountGet**](DefaultApi.md#ownerIdBankAccountGet) | **GET** /owner/{id}/bank-account |  |
| [**propertyFeesGet**](DefaultApi.md#propertyFeesGet) | **GET** /property/fees |  |
| [**propertyGet**](DefaultApi.md#propertyGet) | **GET** /property |  |
| [**propertyIdInsuranceGet**](DefaultApi.md#propertyIdInsuranceGet) | **GET** /property/{id}/insurance |  |
| [**propertyIdLandlordStatementsGet**](DefaultApi.md#propertyIdLandlordStatementsGet) | **GET** /property/{id}/landlord-statements |  |
| [**propertyIdLedgerLandlordGet**](DefaultApi.md#propertyIdLedgerLandlordGet) | **GET** /property/{id}/ledger/landlord |  |
| [**propertyIdMortgageGet**](DefaultApi.md#propertyIdMortgageGet) | **GET** /property/{id}/mortgage |  |
| [**propertyIdPaymentGet**](DefaultApi.md#propertyIdPaymentGet) | **GET** /property/{id}/payment |  |
| [**propertyIdRentLedgerGet**](DefaultApi.md#propertyIdRentLedgerGet) | **GET** /property/{id}/rent-ledger |  |
| [**propertyInvoiceOwnerBalancePost**](DefaultApi.md#propertyInvoiceOwnerBalancePost) | **POST** /property/invoice/owner/balance |  |
| [**propertyLeadPost**](DefaultApi.md#propertyLeadPost) | **POST** /property/lead |  |
| [**propertyLettingsIdMarketingGet**](DefaultApi.md#propertyLettingsIdMarketingGet) | **GET** /property/lettings/{id}/marketing |  |
| [**propertyNotesGet**](DefaultApi.md#propertyNotesGet) | **GET** /property/notes |  |
| [**propertyPropertyIdInvoiceFilePost**](DefaultApi.md#propertyPropertyIdInvoiceFilePost) | **POST** /property/{property_id}/invoice/file |  |
| [**propertyPropertyIdMeterReadingPost**](DefaultApi.md#propertyPropertyIdMeterReadingPost) | **POST** /property/{property_id}/meter-reading |  |
| [**propertySalesIdMarketingGet**](DefaultApi.md#propertySalesIdMarketingGet) | **GET** /property/sales/{id}/marketing |  |
| [**propertySalesReportGet**](DefaultApi.md#propertySalesReportGet) | **GET** /property/sales/report |  |
| [**propertyStatusChangeGet**](DefaultApi.md#propertyStatusChangeGet) | **GET** /property/status/change |  |
| [**propertyUtilitiesMovementTypeGet**](DefaultApi.md#propertyUtilitiesMovementTypeGet) | **GET** /property/utilities/{movement_type} |  |
| [**referralMortgageCustomUpdatePost**](DefaultApi.md#referralMortgageCustomUpdatePost) | **POST** /referral/mortgage/custom-update |  |
| [**tenantGet**](DefaultApi.md#tenantGet) | **GET** /tenant |  |
| [**tenantIdDetailsGet**](DefaultApi.md#tenantIdDetailsGet) | **GET** /tenant/{id}/details |  |
| [**tenantPotentialGet**](DefaultApi.md#tenantPotentialGet) | **GET** /tenant/potential |  |
| [**viewingGet**](DefaultApi.md#viewingGet) | **GET** /viewing |  |



## appraisalGet

> AppraisalGet200Response appraisalGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, fromDate, toDate)



Get all appraisals with their details and linked properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        LocalDate fromDate = LocalDate.now(); // LocalDate | Filter results by initial meeting with a date on or after the date
        LocalDate toDate = LocalDate.now(); // LocalDate | Filter results by initial meeting with a date on or before the date
        try {
            AppraisalGet200Response result = apiInstance.appraisalGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#appraisalGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |
| **fromDate** | **LocalDate**| Filter results by initial meeting with a date on or after the date | [optional] |
| **toDate** | **LocalDate**| Filter results by initial meeting with a date on or before the date | [optional] |

### Return type

[**AppraisalGet200Response**](AppraisalGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all appraisals with their details and linked properties |  -  |


## buyerGet

> BuyerGet200Response buyerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all buyers that have at least one accepted offer on a property.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            BuyerGet200Response result = apiInstance.buyerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#buyerGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**BuyerGet200Response**](BuyerGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all buyers that have at least one accepted offer on a property. |  -  |


## buyerPotentialGet

> BuyerGet200Response buyerPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            BuyerGet200Response result = apiInstance.buyerPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#buyerPotentialGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**BuyerGet200Response**](BuyerGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property. |  -  |


## certificateGet

> CertificateGet200Response certificateGet(page, pageSize, expiryDateFrom, expiryDateTo, propertyId)



Get all certificates.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate expiryDateFrom = LocalDate.now(); // LocalDate | Filter results by certificate expiry date with a date on or after the date
        LocalDate expiryDateTo = LocalDate.now(); // LocalDate | Filter results by certificate expiry date with a date on or before the date
        Integer propertyId = 56; // Integer | The property to filter results by
        try {
            CertificateGet200Response result = apiInstance.certificateGet(page, pageSize, expiryDateFrom, expiryDateTo, propertyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#certificateGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **expiryDateFrom** | **LocalDate**| Filter results by certificate expiry date with a date on or after the date | [optional] |
| **expiryDateTo** | **LocalDate**| Filter results by certificate expiry date with a date on or before the date | [optional] |
| **propertyId** | **Integer**| The property to filter results by | [optional] |

### Return type

[**CertificateGet200Response**](CertificateGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all certificates. |  -  |


## contractorGet

> ContractorGet200Response contractorGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all contractor with their details and linked services

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            ContractorGet200Response result = apiInstance.contractorGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#contractorGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**ContractorGet200Response**](ContractorGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all contractor with their details and linked services |  -  |


## correspondencePost

> CorrespondencePost200Response correspondencePost(correspondencePostRequest)



Create correspondence record.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CorrespondencePostRequest correspondencePostRequest = new CorrespondencePostRequest(); // CorrespondencePostRequest | Create correspondence record.
        try {
            CorrespondencePost200Response result = apiInstance.correspondencePost(correspondencePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#correspondencePost");
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
| **correspondencePostRequest** | [**CorrespondencePostRequest**](CorrespondencePostRequest.md)| Create correspondence record. | [optional] |

### Return type

[**CorrespondencePost200Response**](CorrespondencePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create correspondence record. |  -  |


## employeeGet

> EmployeeGet200Response employeeGet(page, pageSize)



Get all employees.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        try {
            EmployeeGet200Response result = apiInstance.employeeGet(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#employeeGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |

### Return type

[**EmployeeGet200Response**](EmployeeGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all employees. |  -  |


## inspectionAppointmentGet

> InspectionAppointmentGet200Response inspectionAppointmentGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all upcoming inspection appointments with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            InspectionAppointmentGet200Response result = apiInstance.inspectionAppointmentGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#inspectionAppointmentGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**InspectionAppointmentGet200Response**](InspectionAppointmentGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all upcoming inspection appointments with their details |  -  |


## inspectionReportGet

> InspectionReportGet200Response inspectionReportGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all inspection reports with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            InspectionReportGet200Response result = apiInstance.inspectionReportGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#inspectionReportGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**InspectionReportGet200Response**](InspectionReportGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all inspection reports with their details |  -  |


## inspectionReportPost

> InspectionReportPost200Response inspectionReportPost(inspectionReportPostRequest)



Create a new inspection report

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        InspectionReportPostRequest inspectionReportPostRequest = new InspectionReportPostRequest(); // InspectionReportPostRequest | Create a new inspection report
        try {
            InspectionReportPost200Response result = apiInstance.inspectionReportPost(inspectionReportPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#inspectionReportPost");
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
| **inspectionReportPostRequest** | [**InspectionReportPostRequest**](InspectionReportPostRequest.md)| Create a new inspection report | [optional] |

### Return type

[**InspectionReportPost200Response**](InspectionReportPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new inspection report |  -  |


## inventoryPropertyPropertyIdPost

> InventoryPropertyPropertyIdPost200Response inventoryPropertyPropertyIdPost(propertyId, inventoryPropertyPropertyIdPostRequest)



Create a new inventory.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer propertyId = 56; // Integer | ID of the property the new inventory should be assigned to.
        InventoryPropertyPropertyIdPostRequest inventoryPropertyPropertyIdPostRequest = new InventoryPropertyPropertyIdPostRequest(); // InventoryPropertyPropertyIdPostRequest | Create a new inventory.
        try {
            InventoryPropertyPropertyIdPost200Response result = apiInstance.inventoryPropertyPropertyIdPost(propertyId, inventoryPropertyPropertyIdPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#inventoryPropertyPropertyIdPost");
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
| **propertyId** | **Integer**| ID of the property the new inventory should be assigned to. | |
| **inventoryPropertyPropertyIdPostRequest** | [**InventoryPropertyPropertyIdPostRequest**](InventoryPropertyPropertyIdPostRequest.md)| Create a new inventory. | [optional] |

### Return type

[**InventoryPropertyPropertyIdPost200Response**](InventoryPropertyPropertyIdPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new inventory. |  -  |


## landlordPotentialGet

> LandlordPotentialGet200Response landlordPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all potential landlords with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            LandlordPotentialGet200Response result = apiInstance.landlordPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#landlordPotentialGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**LandlordPotentialGet200Response**](LandlordPotentialGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all potential landlords with their details |  -  |


## maintenanceGet

> MaintenanceGet200Response maintenanceGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, closed)



Get all maintenance reports with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        BigDecimal closed = new BigDecimal(78); // BigDecimal | Set this to 1 in order to only show closed items. If this param is not set then it will default to show items that are not closed.
        try {
            MaintenanceGet200Response result = apiInstance.maintenanceGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, closed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#maintenanceGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |
| **closed** | **BigDecimal**| Set this to 1 in order to only show closed items. If this param is not set then it will default to show items that are not closed. | [optional] |

### Return type

[**MaintenanceGet200Response**](MaintenanceGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all maintenance reports with their details |  -  |


## maintenanceIdPut

> MaintenanceIdPut200Response maintenanceIdPut(id, maintenanceIdPutRequest)



Update an existing maintenance report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | The id of the maintenance report record
        MaintenanceIdPutRequest maintenanceIdPutRequest = new MaintenanceIdPutRequest(); // MaintenanceIdPutRequest | Update an existing maintenance report.
        try {
            MaintenanceIdPut200Response result = apiInstance.maintenanceIdPut(id, maintenanceIdPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#maintenanceIdPut");
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
| **id** | **BigDecimal**| The id of the maintenance report record | |
| **maintenanceIdPutRequest** | [**MaintenanceIdPutRequest**](MaintenanceIdPutRequest.md)| Update an existing maintenance report. | [optional] |

### Return type

[**MaintenanceIdPut200Response**](MaintenanceIdPut200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an existing maintenance report. |  -  |


## maintenancePost

> MaintenancePost200Response maintenancePost(maintenancePostRequest)



Create a new holding maintenance report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MaintenancePostRequest maintenancePostRequest = new MaintenancePostRequest(); // MaintenancePostRequest | Create a new holding maintenance report.
        try {
            MaintenancePost200Response result = apiInstance.maintenancePost(maintenancePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#maintenancePost");
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
| **maintenancePostRequest** | [**MaintenancePostRequest**](MaintenancePostRequest.md)| Create a new holding maintenance report. | [optional] |

### Return type

[**MaintenancePost200Response**](MaintenancePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new holding maintenance report. |  -  |


## maintenancePropertyPropertyIdPost

> MaintenancePropertyPropertyIdPost200Response maintenancePropertyPropertyIdPost(propertyId, maintenancePropertyPropertyIdPostRequest)



Create a new maintenance report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer propertyId = 56; // Integer | ID of the property the new maintenance report should be assigned to.
        MaintenancePropertyPropertyIdPostRequest maintenancePropertyPropertyIdPostRequest = new MaintenancePropertyPropertyIdPostRequest(); // MaintenancePropertyPropertyIdPostRequest | Create a new maintenance report.
        try {
            MaintenancePropertyPropertyIdPost200Response result = apiInstance.maintenancePropertyPropertyIdPost(propertyId, maintenancePropertyPropertyIdPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#maintenancePropertyPropertyIdPost");
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
| **propertyId** | **Integer**| ID of the property the new maintenance report should be assigned to. | |
| **maintenancePropertyPropertyIdPostRequest** | [**MaintenancePropertyPropertyIdPostRequest**](MaintenancePropertyPropertyIdPostRequest.md)| Create a new maintenance report. | [optional] |

### Return type

[**MaintenancePropertyPropertyIdPost200Response**](MaintenancePropertyPropertyIdPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new maintenance report. |  -  |


## offerAcceptedGet

> OfferAcceptedGet200Response offerAcceptedGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, acceptedOfferFrom, acceptedOfferTo)



Get all accepted offers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        LocalDate acceptedOfferFrom = LocalDate.now(); // LocalDate | Filter the results on or after the offer accepted date
        LocalDate acceptedOfferTo = LocalDate.now(); // LocalDate | Filter the results on or before the offer accepted date
        try {
            OfferAcceptedGet200Response result = apiInstance.offerAcceptedGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, acceptedOfferFrom, acceptedOfferTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#offerAcceptedGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |
| **acceptedOfferFrom** | **LocalDate**| Filter the results on or after the offer accepted date | [optional] |
| **acceptedOfferTo** | **LocalDate**| Filter the results on or before the offer accepted date | [optional] |

### Return type

[**OfferAcceptedGet200Response**](OfferAcceptedGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all accepted offers. |  -  |


## offerGet

> OfferGet200Response offerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, offerFrom, offerTo)



Get all offers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        LocalDate offerFrom = LocalDate.now(); // LocalDate | Filter the results on or after the offer date
        LocalDate offerTo = LocalDate.now(); // LocalDate | Filter the results on or before the offer date
        try {
            OfferGet200Response result = apiInstance.offerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, offerFrom, offerTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#offerGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |
| **offerFrom** | **LocalDate**| Filter the results on or after the offer date | [optional] |
| **offerTo** | **LocalDate**| Filter the results on or before the offer date | [optional] |

### Return type

[**OfferGet200Response**](OfferGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all offers. |  -  |


## ownerGet

> OwnerGet200Response ownerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, propertyManagementType)



Get all current owners with their details and linked properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        String propertyManagementType = "estate_agency"; // String | Filter results by the management type or property or linked properties
        try {
            OwnerGet200Response result = apiInstance.ownerGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo, propertyManagementType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ownerGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |
| **propertyManagementType** | **String**| Filter results by the management type or property or linked properties | [optional] [enum: estate_agency, lettings] |

### Return type

[**OwnerGet200Response**](OwnerGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all current owners with their details and linked properties |  -  |


## ownerIdBankAccountGet

> OwnerIdBankAccountGet200Response ownerIdBankAccountGet(id)



Get owner bank account details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            OwnerIdBankAccountGet200Response result = apiInstance.ownerIdBankAccountGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ownerIdBankAccountGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**OwnerIdBankAccountGet200Response**](OwnerIdBankAccountGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get owner bank account details. |  -  |


## propertyFeesGet

> PropertyFeesGet200Response propertyFeesGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Show all property fees.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            PropertyFeesGet200Response result = apiInstance.propertyFeesGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyFeesGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**PropertyFeesGet200Response**](PropertyFeesGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show all property fees. |  -  |


## propertyGet

> PropertyGet200Response propertyGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all properties with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            PropertyGet200Response result = apiInstance.propertyGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**PropertyGet200Response**](PropertyGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all properties with their details |  -  |


## propertyIdInsuranceGet

> PropertyIdInsuranceGet200Response propertyIdInsuranceGet(id, fromDate, toDate)



Get property insurance details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        LocalDate fromDate = LocalDate.now(); // LocalDate | Filter results with a date on or after the date
        LocalDate toDate = LocalDate.now(); // LocalDate | Filter results with a date on or before the date
        try {
            PropertyIdInsuranceGet200Response result = apiInstance.propertyIdInsuranceGet(id, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdInsuranceGet");
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
| **id** | **BigDecimal**| Id of the record | |
| **fromDate** | **LocalDate**| Filter results with a date on or after the date | [optional] |
| **toDate** | **LocalDate**| Filter results with a date on or before the date | [optional] |

### Return type

[**PropertyIdInsuranceGet200Response**](PropertyIdInsuranceGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get property insurance details |  -  |


## propertyIdLandlordStatementsGet

> PropertyIdLandlordStatementsGet200Response propertyIdLandlordStatementsGet(id, fromDate, toDate)



Get landlord statement filenames for property

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        LocalDate fromDate = LocalDate.now(); // LocalDate | Filter results with a date on or after the date
        LocalDate toDate = LocalDate.now(); // LocalDate | Filter results with a date on or before the date
        try {
            PropertyIdLandlordStatementsGet200Response result = apiInstance.propertyIdLandlordStatementsGet(id, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdLandlordStatementsGet");
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
| **id** | **BigDecimal**| Id of the record | |
| **fromDate** | **LocalDate**| Filter results with a date on or after the date | [optional] |
| **toDate** | **LocalDate**| Filter results with a date on or before the date | [optional] |

### Return type

[**PropertyIdLandlordStatementsGet200Response**](PropertyIdLandlordStatementsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get landlord statement filenames for property |  -  |


## propertyIdLedgerLandlordGet

> PropertyIdLedgerLandlordGet200Response propertyIdLedgerLandlordGet(id, startDate, endDate)



Get landlord ledger by property ID with date range

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        LocalDate startDate = LocalDate.now(); // LocalDate | Start date of period
        LocalDate endDate = LocalDate.now(); // LocalDate | End date of period
        try {
            PropertyIdLedgerLandlordGet200Response result = apiInstance.propertyIdLedgerLandlordGet(id, startDate, endDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdLedgerLandlordGet");
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
| **id** | **BigDecimal**| Id of the record | |
| **startDate** | **LocalDate**| Start date of period | |
| **endDate** | **LocalDate**| End date of period | |

### Return type

[**PropertyIdLedgerLandlordGet200Response**](PropertyIdLedgerLandlordGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get landlord ledger by property ID with date range |  -  |


## propertyIdMortgageGet

> PropertyIdMortgageGet200Response propertyIdMortgageGet(id)



Get property mortgage details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            PropertyIdMortgageGet200Response result = apiInstance.propertyIdMortgageGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdMortgageGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**PropertyIdMortgageGet200Response**](PropertyIdMortgageGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get property mortgage details |  -  |


## propertyIdPaymentGet

> PropertyIdPaymentGet200Response propertyIdPaymentGet(id)



Get payment details for property.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            PropertyIdPaymentGet200Response result = apiInstance.propertyIdPaymentGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdPaymentGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**PropertyIdPaymentGet200Response**](PropertyIdPaymentGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get payment details for property. |  -  |


## propertyIdRentLedgerGet

> PropertyIdRentLedgerGet200Response propertyIdRentLedgerGet(id, fromDate, toDate)



Show property rent ledger

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        LocalDate fromDate = LocalDate.now(); // LocalDate | Start date of period
        LocalDate toDate = LocalDate.now(); // LocalDate | End date of period
        try {
            PropertyIdRentLedgerGet200Response result = apiInstance.propertyIdRentLedgerGet(id, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyIdRentLedgerGet");
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
| **id** | **BigDecimal**| Id of the record | |
| **fromDate** | **LocalDate**| Start date of period | [optional] |
| **toDate** | **LocalDate**| End date of period | [optional] |

### Return type

[**PropertyIdRentLedgerGet200Response**](PropertyIdRentLedgerGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show property rent ledger |  -  |


## propertyInvoiceOwnerBalancePost

> PropertyInvoiceOwnerBalancePost200Response propertyInvoiceOwnerBalancePost(propertyInvoiceOwnerBalancePostRequest)



Create a new invoice for the property owner

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PropertyInvoiceOwnerBalancePostRequest propertyInvoiceOwnerBalancePostRequest = new PropertyInvoiceOwnerBalancePostRequest(); // PropertyInvoiceOwnerBalancePostRequest | Create a new invoice for the property owner
        try {
            PropertyInvoiceOwnerBalancePost200Response result = apiInstance.propertyInvoiceOwnerBalancePost(propertyInvoiceOwnerBalancePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyInvoiceOwnerBalancePost");
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
| **propertyInvoiceOwnerBalancePostRequest** | [**PropertyInvoiceOwnerBalancePostRequest**](PropertyInvoiceOwnerBalancePostRequest.md)| Create a new invoice for the property owner | [optional] |

### Return type

[**PropertyInvoiceOwnerBalancePost200Response**](PropertyInvoiceOwnerBalancePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new invoice for the property owner |  -  |


## propertyLeadPost

> PropertyLeadPost200Response propertyLeadPost(propertyLeadPostRequest)



Create a new lead for a property

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PropertyLeadPostRequest propertyLeadPostRequest = new PropertyLeadPostRequest(); // PropertyLeadPostRequest | Create a new lead for a property
        try {
            PropertyLeadPost200Response result = apiInstance.propertyLeadPost(propertyLeadPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyLeadPost");
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
| **propertyLeadPostRequest** | [**PropertyLeadPostRequest**](PropertyLeadPostRequest.md)| Create a new lead for a property | [optional] |

### Return type

[**PropertyLeadPost200Response**](PropertyLeadPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new lead for a property |  -  |


## propertyLettingsIdMarketingGet

> PropertyLettingsIdMarketingGet200Response propertyLettingsIdMarketingGet(id)



Show lettings property marketing

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            PropertyLettingsIdMarketingGet200Response result = apiInstance.propertyLettingsIdMarketingGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyLettingsIdMarketingGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**PropertyLettingsIdMarketingGet200Response**](PropertyLettingsIdMarketingGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show lettings property marketing |  -  |


## propertyNotesGet

> PropertyNotesGet200Response propertyNotesGet(page, pageSize, dateFrom, dateTo)



Get all property notes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate dateFrom = LocalDate.now(); // LocalDate | Filter results with a date on or after the date
        LocalDate dateTo = LocalDate.now(); // LocalDate | Filter results with a date on or before the date
        try {
            PropertyNotesGet200Response result = apiInstance.propertyNotesGet(page, pageSize, dateFrom, dateTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyNotesGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **dateFrom** | **LocalDate**| Filter results with a date on or after the date | [optional] |
| **dateTo** | **LocalDate**| Filter results with a date on or before the date | [optional] |

### Return type

[**PropertyNotesGet200Response**](PropertyNotesGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all property notes. |  -  |


## propertyPropertyIdInvoiceFilePost

> PropertyPropertyIdInvoiceFilePost200Response propertyPropertyIdInvoiceFilePost(propertyId, reference, body)



Upload an invoice file

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal propertyId = new BigDecimal(78); // BigDecimal | Id of the property
        String reference = "reference_example"; // String | Reference to be used on the file. This must contain letters, digits, underscores and dashes only.
        File body = []; // File | Allowed mime types: application/pdf, image/jpeg. Maximum size: 20MB
        try {
            PropertyPropertyIdInvoiceFilePost200Response result = apiInstance.propertyPropertyIdInvoiceFilePost(propertyId, reference, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyPropertyIdInvoiceFilePost");
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
| **propertyId** | **BigDecimal**| Id of the property | |
| **reference** | **String**| Reference to be used on the file. This must contain letters, digits, underscores and dashes only. | [optional] |
| **body** | **File**| Allowed mime types: application/pdf, image/jpeg. Maximum size: 20MB | [optional] |

### Return type

[**PropertyPropertyIdInvoiceFilePost200Response**](PropertyPropertyIdInvoiceFilePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload an invoice file |  -  |


## propertyPropertyIdMeterReadingPost

> PropertyPropertyIdMeterReadingPost200Response propertyPropertyIdMeterReadingPost(propertyId, propertyPropertyIdMeterReadingPostRequest)



Create meter reading for a specific property.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal propertyId = new BigDecimal(78); // BigDecimal | Id of the property
        PropertyPropertyIdMeterReadingPostRequest propertyPropertyIdMeterReadingPostRequest = new PropertyPropertyIdMeterReadingPostRequest(); // PropertyPropertyIdMeterReadingPostRequest | Create meter reading for a specific property.
        try {
            PropertyPropertyIdMeterReadingPost200Response result = apiInstance.propertyPropertyIdMeterReadingPost(propertyId, propertyPropertyIdMeterReadingPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyPropertyIdMeterReadingPost");
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
| **propertyId** | **BigDecimal**| Id of the property | |
| **propertyPropertyIdMeterReadingPostRequest** | [**PropertyPropertyIdMeterReadingPostRequest**](PropertyPropertyIdMeterReadingPostRequest.md)| Create meter reading for a specific property. | [optional] |

### Return type

[**PropertyPropertyIdMeterReadingPost200Response**](PropertyPropertyIdMeterReadingPost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create meter reading for a specific property. |  -  |


## propertySalesIdMarketingGet

> PropertySalesIdMarketingGet200Response propertySalesIdMarketingGet(id)



Show sales property marketing

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            PropertySalesIdMarketingGet200Response result = apiInstance.propertySalesIdMarketingGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertySalesIdMarketingGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**PropertySalesIdMarketingGet200Response**](PropertySalesIdMarketingGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show sales property marketing |  -  |


## propertySalesReportGet

> PropertySalesReportGet200Response propertySalesReportGet(fromDate, toDate)



Show sales report by date range

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate fromDate = LocalDate.now(); // LocalDate | Start date of period
        LocalDate toDate = LocalDate.now(); // LocalDate | End date of period
        try {
            PropertySalesReportGet200Response result = apiInstance.propertySalesReportGet(fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertySalesReportGet");
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
| **fromDate** | **LocalDate**| Start date of period | |
| **toDate** | **LocalDate**| End date of period | |

### Return type

[**PropertySalesReportGet200Response**](PropertySalesReportGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show sales report by date range |  -  |


## propertyStatusChangeGet

> PropertyStatusChangeGet200Response propertyStatusChangeGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all property status change events

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            PropertyStatusChangeGet200Response result = apiInstance.propertyStatusChangeGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyStatusChangeGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**PropertyStatusChangeGet200Response**](PropertyStatusChangeGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all property status change events |  -  |


## propertyUtilitiesMovementTypeGet

> PropertyUtilitiesMovementTypeGet200Response propertyUtilitiesMovementTypeGet(movementType, daysFrom, daysTo, page, pageSize)



Get all properties with their details. Please use move-in or move-out.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String movementType = "move-in"; // String | Please use `move-in` or `move-out`
        BigDecimal daysFrom = new BigDecimal(78); // BigDecimal | Filter the results by days before today
        BigDecimal daysTo = new BigDecimal(78); // BigDecimal | Filter the results by days after today
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        try {
            PropertyUtilitiesMovementTypeGet200Response result = apiInstance.propertyUtilitiesMovementTypeGet(movementType, daysFrom, daysTo, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#propertyUtilitiesMovementTypeGet");
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
| **movementType** | **String**| Please use &#x60;move-in&#x60; or &#x60;move-out&#x60; | [enum: move-in, move-out] |
| **daysFrom** | **BigDecimal**| Filter the results by days before today | |
| **daysTo** | **BigDecimal**| Filter the results by days after today | |
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |

### Return type

[**PropertyUtilitiesMovementTypeGet200Response**](PropertyUtilitiesMovementTypeGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all properties with their details. Please use move-in or move-out. |  -  |


## referralMortgageCustomUpdatePost

> ReferralMortgageCustomUpdatePost200Response referralMortgageCustomUpdatePost(referralMortgageCustomUpdatePostRequest)



Custom integration endpoint for referrals partner

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ReferralMortgageCustomUpdatePostRequest referralMortgageCustomUpdatePostRequest = new ReferralMortgageCustomUpdatePostRequest(); // ReferralMortgageCustomUpdatePostRequest | Custom integration endpoint for referrals partner
        try {
            ReferralMortgageCustomUpdatePost200Response result = apiInstance.referralMortgageCustomUpdatePost(referralMortgageCustomUpdatePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#referralMortgageCustomUpdatePost");
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
| **referralMortgageCustomUpdatePostRequest** | [**ReferralMortgageCustomUpdatePostRequest**](ReferralMortgageCustomUpdatePostRequest.md)| Custom integration endpoint for referrals partner | [optional] |

### Return type

[**ReferralMortgageCustomUpdatePost200Response**](ReferralMortgageCustomUpdatePost200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom integration endpoint for referrals partner |  -  |


## tenantGet

> TenantGet200Response tenantGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all current tenants with their details and linked properties

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            TenantGet200Response result = apiInstance.tenantGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**TenantGet200Response**](TenantGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all current tenants with their details and linked properties |  -  |


## tenantIdDetailsGet

> TenantIdDetailsGet200Response tenantIdDetailsGet(id)



Get tenant details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Id of the record
        try {
            TenantIdDetailsGet200Response result = apiInstance.tenantIdDetailsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantIdDetailsGet");
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
| **id** | **BigDecimal**| Id of the record | |

### Return type

[**TenantIdDetailsGet200Response**](TenantIdDetailsGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get tenant details. |  -  |


## tenantPotentialGet

> TenantPotentialGet200Response tenantPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all potential tenants with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            TenantPotentialGet200Response result = apiInstance.tenantPotentialGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#tenantPotentialGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**TenantPotentialGet200Response**](TenantPotentialGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all potential tenants with their details |  -  |


## viewingGet

> ViewingGet200Response viewingGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo)



Get all viewings with their details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/SMEProfessional/Dev/1.15.0");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer page = 56; // Integer | The page of results returned
        Integer pageSize = 56; // Integer | Set the number of results per page (max: 500)
        LocalDate lastUpdatedFrom = LocalDate.now(); // LocalDate | Filter the results on or after the date
        LocalDate lastUpdatedTo = LocalDate.now(); // LocalDate | Filter the results on or before the date
        try {
            ViewingGet200Response result = apiInstance.viewingGet(page, pageSize, lastUpdatedFrom, lastUpdatedTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#viewingGet");
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
| **page** | **Integer**| The page of results returned | [optional] |
| **pageSize** | **Integer**| Set the number of results per page (max: 500) | [optional] |
| **lastUpdatedFrom** | **LocalDate**| Filter the results on or after the date | [optional] |
| **lastUpdatedTo** | **LocalDate**| Filter the results on or before the date | [optional] |

### Return type

[**ViewingGet200Response**](ViewingGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all viewings with their details |  -  |

