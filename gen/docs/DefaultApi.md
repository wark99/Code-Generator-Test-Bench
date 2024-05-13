# DefaultApi

All URIs are relative to *https://sbx-drip-be.usedrip.com.br/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancellationIdPut**](DefaultApi.md#cancellationIdPut) | **PUT** /cancellation/{id} | Cancelamento |
| [**checkoutsIdGet**](DefaultApi.md#checkoutsIdGet) | **GET** /checkouts/{id} |  |
| [**checkoutsPost**](DefaultApi.md#checkoutsPost) | **POST** /checkouts | Criar checkout |
| [**instalmentsSimulatorGet**](DefaultApi.md#instalmentsSimulatorGet) | **GET** /instalments_simulator | Simular parcelas |
| [**merchantOrdersIdDetailGet**](DefaultApi.md#merchantOrdersIdDetailGet) | **GET** /merchant/orders/{id}/detail | Listar detalhes da ordem |
| [**merchantsGetCnpjGet**](DefaultApi.md#merchantsGetCnpjGet) | **GET** /merchants/get_cnpj |  |



## cancellationIdPut

> cancellationIdPut(id, cancellationIdPutRequest)

Cancelamento

Responsável por realizar o cancelamento de uma order na Drip. O cancelamento pode ser parcial ou total, o que determinará o tipo de cancelamento é o valor do amount, se igual ao valor da compra, será realizado o cancelamento total e a ordem será fechada, do contrário, será realizado o cancelamento parcial e a ordem continuará ativa.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Cancellation ID
        CancellationIdPutRequest cancellationIdPutRequest = new CancellationIdPutRequest(); // CancellationIdPutRequest | 
        try {
            apiInstance.cancellationIdPut(id, cancellationIdPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancellationIdPut");
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
| **id** | **UUID**| Cancellation ID | |
| **cancellationIdPutRequest** | [**CancellationIdPutRequest**](CancellationIdPutRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## checkoutsIdGet

> Checkout checkoutsIdGet(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Checkout ID
        try {
            Checkout result = apiInstance.checkoutsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#checkoutsIdGet");
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
| **id** | **UUID**| Checkout ID | |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## checkoutsPost

> Checkout checkoutsPost(checkoutCreationParams)

Criar checkout

Um checkout na Drip é uma intenção de pagamento do usuário. Ao selecionar a Drip como método de pagamento, um checkout é criado com os dados enviados pela api do parceiro, uma vez criado, o endpoint retorna algumas informações: - formUrl: Endereço no qual o usuário será redirecionado para finalizar o checkout, recomendamos que seja aberto um frame, desta forma o usuário continuará no ambiente do parceiro e também será possível o tracking via analytics. Para renderizar o modal deve passar sempre o parametro transparent&#x3D;true no final da url do checkout drip-fe.usedrip.com.br/checkouts/{ID}?transparent&#x3D;true - status:    - MORE_INFO: significa que a Drip necessita de mais informações do usuário para processar o pagamento.   - OK: Pagamento aprovado.   - KO: Pagamento não aprovado. - eventos enviados pela modal(no frontend):   - checkoutCompleted: Enviado quando o cliente finaliza o checkout (tanto pelo OK e KO)     - eventName: checkoutCompleted     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - clickOnClose: Enviado quando usuário clica para fechar o checkout     - eventName: clickOnClose     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - finishedCheckout: Quando clica para fechar o modal e ele já está finalizado(Substitui o clickOnClose quando o checkout se encontra finalizado)     - eventName: finishedCheckout     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot; 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CheckoutCreationParams checkoutCreationParams = new CheckoutCreationParams(); // CheckoutCreationParams | 
        try {
            Checkout result = apiInstance.checkoutsPost(checkoutCreationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#checkoutsPost");
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
| **checkoutCreationParams** | [**CheckoutCreationParams**](CheckoutCreationParams.md)|  | |

### Return type

[**Checkout**](Checkout.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## instalmentsSimulatorGet

> InstalmentsSimulator instalmentsSimulatorGet(amount, date)

Simular parcelas

Utilizado para retornar ao usuário uma simulação de como ficará sua parcelas, bem como o valor de cashback. Geralmente é usado na página de checkout do e-commerce parceiro.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String amount = "amount_example"; // String | Valor total da ordem com 2 digitos depois do ponto, ex 1000.00 or 1.00
        LocalDate date = LocalDate.now(); // LocalDate | Data de hoje no formato yyyy-mm-dd, ex 2022-05-25
        try {
            InstalmentsSimulator result = apiInstance.instalmentsSimulatorGet(amount, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#instalmentsSimulatorGet");
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
| **amount** | **String**| Valor total da ordem com 2 digitos depois do ponto, ex 1000.00 or 1.00 | [optional] |
| **date** | **LocalDate**| Data de hoje no formato yyyy-mm-dd, ex 2022-05-25 | [optional] |

### Return type

[**InstalmentsSimulator**](InstalmentsSimulator.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retorna o percentual de cashback e uma lista de parcelas |  -  |


## merchantOrdersIdDetailGet

> Order merchantOrdersIdDetailGet(id)

Listar detalhes da ordem

Ordem é uma compra (checkout) aprovada pela Drip. Este endpoint retorna o detalhe da ordem 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Order ID
        try {
            Order result = apiInstance.merchantOrdersIdDetailGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#merchantOrdersIdDetailGet");
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
| **id** | **UUID**| Order ID | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## merchantsGetCnpjGet

> MerchantsGetCnpjGet200Response merchantsGetCnpjGet()



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sbx-drip-be.usedrip.com.br/api/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            MerchantsGetCnpjGet200Response result = apiInstance.merchantsGetCnpjGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#merchantsGetCnpjGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**MerchantsGetCnpjGet200Response**](MerchantsGetCnpjGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return cnpj on json |  -  |

