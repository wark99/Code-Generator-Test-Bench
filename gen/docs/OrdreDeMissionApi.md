# OrdreDeMissionApi

All URIs are relative to *https://test.auditeurs.qualibat.eu/PAGC/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOM**](OrdreDeMissionApi.md#getOM) | **GET** /ordreMission/{Numéro} |  |
| [**postOMAcceptation**](OrdreDeMissionApi.md#postOMAcceptation) | **POST** /ordreMission/accepter |  |
| [**postOMAnnuler**](OrdreDeMissionApi.md#postOMAnnuler) | **POST** /ordreMission/annuler |  |
| [**postOMAuditeur**](OrdreDeMissionApi.md#postOMAuditeur) | **POST** /ordreMission/auditeur |  |
| [**postOMPlanifier**](OrdreDeMissionApi.md#postOMPlanifier) | **POST** /ordreMission/planification |  |
| [**postOMPlanifierAnnuler**](OrdreDeMissionApi.md#postOMPlanifierAnnuler) | **POST** /ordreMission/planification/annuler |  |
| [**postOMRefus**](OrdreDeMissionApi.md#postOMRefus) | **POST** /ordreMission/refuser |  |



## getOM

> OrdreMission getOM(numéro)



&lt;strong&gt;Information sur l&#39;ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action permet de récupérer les informations sur l&#39;ordre de mission &lt;u&gt; &lt;li&gt;Informations générales de l&#39;ordre de mission&lt;/li&gt; &lt;li&gt;Informations sur le chantier à auditer&lt;/li&gt; &lt;li&gt;Informations sur l&#39;entreprise auditées&lt;/li&gt; &lt;/u&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        String numéro = "numéro_example"; // String | Numéro de l'ordre de mission
        try {
            OrdreMission result = apiInstance.getOM(numéro);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#getOM");
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
| **numéro** | **String**| Numéro de l&#39;ordre de mission | |

### Return type

[**OrdreMission**](OrdreMission.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information sur l&#39;ordre de mission demandé |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMAcceptation

> postOMAcceptation(numeroOM)



&lt;strong&gt;Accepter un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        NumeroOM numeroOM = new NumeroOM(); // NumeroOM | 
        try {
            apiInstance.postOMAcceptation(numeroOM);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMAcceptation");
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
| **numeroOM** | [**NumeroOM**](NumeroOM.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMAnnuler

> postOMAnnuler(numeroOMMotif)



&lt;strong&gt;Annuler un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée à n&#39;importe quel moment dans la mesure ou la confirmation de réaliastion de l&#39;audit n&#39;a pas été éffectuée. (Etat de l&#39;ordre de mission différent de :[vEtatOrdreMissionAnnulé,vEtatOrdreMissionRefusé,vEtatOrdreMissionRécusé,vEtatOrdreMissionRapportARediger,vEtatOrdreMissionRapportAVerifier,vEtatOrdreMissionRapportEnVerification,vEtatOrdreMissionLevéeAVerifier,vEtatOrdreMissionLevéeEnVerification, vEtatOrdreMissionNCAttenteReponse, vEtatOrdreMissionNCAttenteLevées, vEtatOrdreMissionClôturé])

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        NumeroOMMotif numeroOMMotif = new NumeroOMMotif(); // NumeroOMMotif | 
        try {
            apiInstance.postOMAnnuler(numeroOMMotif);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMAnnuler");
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
| **numeroOMMotif** | [**NumeroOMMotif**](NumeroOMMotif.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMAuditeur

> postOMAuditeur(numeroOMEmail)



&lt;strong&gt;Associer un auditeur à un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditeurAAffecter, vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié].&lt;br&gt;&lt;br&gt;&lt;strong&gt;Attention&lt;/strong&gt;, pour les OM combinés, l&#39;auditeur affecté doit être le même.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        NumeroOMEmail numeroOMEmail = new NumeroOMEmail(); // NumeroOMEmail | 
        try {
            apiInstance.postOMAuditeur(numeroOMEmail);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMAuditeur");
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
| **numeroOMEmail** | [**NumeroOMEmail**](NumeroOMEmail.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMPlanifier

> postOMPlanifier(planificationOM)



&lt;strong&gt;Planifier un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié]. &lt;br&gt; L&#39;année de l&#39;audit ne peut pas être antérieure de plus de 3 ans.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        PlanificationOM planificationOM = new PlanificationOM(); // PlanificationOM | 
        try {
            apiInstance.postOMPlanifier(planificationOM);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMPlanifier");
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
| **planificationOM** | [**PlanificationOM**](PlanificationOM.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMPlanifierAnnuler

> postOMPlanifierAnnuler(numeroOMMotif)



&lt;strong&gt;Annuler la planification un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état \&quot;vEtatOrdreMissionAuditPlanifié\&quot;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        NumeroOMMotif numeroOMMotif = new NumeroOMMotif(); // NumeroOMMotif | 
        try {
            apiInstance.postOMPlanifierAnnuler(numeroOMMotif);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMPlanifierAnnuler");
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
| **numeroOMMotif** | [**NumeroOMMotif**](NumeroOMMotif.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |


## postOMRefus

> postOMRefus(numeroOMMotif)



&lt;strong&gt;Refuser un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdreDeMissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.auditeurs.qualibat.eu/PAGC/v1");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OrdreDeMissionApi apiInstance = new OrdreDeMissionApi(defaultClient);
        NumeroOMMotif numeroOMMotif = new NumeroOMMotif(); // NumeroOMMotif | 
        try {
            apiInstance.postOMRefus(numeroOMMotif);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdreDeMissionApi#postOMRefus");
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
| **numeroOMMotif** | [**NumeroOMMotif**](NumeroOMMotif.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **406** |  |  -  |
| **500** |  |  -  |

