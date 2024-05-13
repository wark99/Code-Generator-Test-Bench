package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CancellationIdPutRequest;
import org.openapitools.client.model.Checkout;
import org.openapitools.client.model.CheckoutCreationParams;
import org.openapitools.client.model.InstalmentsSimulator;
import java.time.LocalDate;
import org.openapitools.client.model.MerchantsGetCnpjGet200Response;
import org.openapitools.client.model.Order;
import java.util.UUID;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:11.928068984Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancelamento
     * Responsável por realizar o cancelamento de uma order na Drip. O cancelamento pode ser parcial ou total, o que determinará o tipo de cancelamento é o valor do amount, se igual ao valor da compra, será realizado o cancelamento total e a ordem será fechada, do contrário, será realizado o cancelamento parcial e a ordem continuará ativa.
     * <p><b>204</b> - No Content
     * @param id Cancellation ID (required)
     * @param cancellationIdPutRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cancellationIdPut(UUID id, CancellationIdPutRequest cancellationIdPutRequest) throws RestClientException {
        cancellationIdPutWithHttpInfo(id, cancellationIdPutRequest);
    }

    /**
     * Cancelamento
     * Responsável por realizar o cancelamento de uma order na Drip. O cancelamento pode ser parcial ou total, o que determinará o tipo de cancelamento é o valor do amount, se igual ao valor da compra, será realizado o cancelamento total e a ordem será fechada, do contrário, será realizado o cancelamento parcial e a ordem continuará ativa.
     * <p><b>204</b> - No Content
     * @param id Cancellation ID (required)
     * @param cancellationIdPutRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cancellationIdPutWithHttpInfo(UUID id, CancellationIdPutRequest cancellationIdPutRequest) throws RestClientException {
        Object localVarPostBody = cancellationIdPutRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cancellationIdPut");
        }
        
        // verify the required parameter 'cancellationIdPutRequest' is set
        if (cancellationIdPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cancellationIdPutRequest' when calling cancellationIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/cancellation/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id Checkout ID (required)
     * @return Checkout
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Checkout checkoutsIdGet(UUID id) throws RestClientException {
        return checkoutsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id Checkout ID (required)
     * @return ResponseEntity&lt;Checkout&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Checkout> checkoutsIdGetWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling checkoutsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Checkout> localReturnType = new ParameterizedTypeReference<Checkout>() {};
        return apiClient.invokeAPI("/checkouts/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Criar checkout
     * Um checkout na Drip é uma intenção de pagamento do usuário. Ao selecionar a Drip como método de pagamento, um checkout é criado com os dados enviados pela api do parceiro, uma vez criado, o endpoint retorna algumas informações: - formUrl: Endereço no qual o usuário será redirecionado para finalizar o checkout, recomendamos que seja aberto um frame, desta forma o usuário continuará no ambiente do parceiro e também será possível o tracking via analytics. Para renderizar o modal deve passar sempre o parametro transparent&#x3D;true no final da url do checkout drip-fe.usedrip.com.br/checkouts/{ID}?transparent&#x3D;true - status:    - MORE_INFO: significa que a Drip necessita de mais informações do usuário para processar o pagamento.   - OK: Pagamento aprovado.   - KO: Pagamento não aprovado. - eventos enviados pela modal(no frontend):   - checkoutCompleted: Enviado quando o cliente finaliza o checkout (tanto pelo OK e KO)     - eventName: checkoutCompleted     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - clickOnClose: Enviado quando usuário clica para fechar o checkout     - eventName: clickOnClose     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - finishedCheckout: Quando clica para fechar o modal e ele já está finalizado(Substitui o clickOnClose quando o checkout se encontra finalizado)     - eventName: finishedCheckout     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot; 
     * <p><b>201</b> - Created
     * @param checkoutCreationParams  (required)
     * @return Checkout
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Checkout checkoutsPost(CheckoutCreationParams checkoutCreationParams) throws RestClientException {
        return checkoutsPostWithHttpInfo(checkoutCreationParams).getBody();
    }

    /**
     * Criar checkout
     * Um checkout na Drip é uma intenção de pagamento do usuário. Ao selecionar a Drip como método de pagamento, um checkout é criado com os dados enviados pela api do parceiro, uma vez criado, o endpoint retorna algumas informações: - formUrl: Endereço no qual o usuário será redirecionado para finalizar o checkout, recomendamos que seja aberto um frame, desta forma o usuário continuará no ambiente do parceiro e também será possível o tracking via analytics. Para renderizar o modal deve passar sempre o parametro transparent&#x3D;true no final da url do checkout drip-fe.usedrip.com.br/checkouts/{ID}?transparent&#x3D;true - status:    - MORE_INFO: significa que a Drip necessita de mais informações do usuário para processar o pagamento.   - OK: Pagamento aprovado.   - KO: Pagamento não aprovado. - eventos enviados pela modal(no frontend):   - checkoutCompleted: Enviado quando o cliente finaliza o checkout (tanto pelo OK e KO)     - eventName: checkoutCompleted     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - clickOnClose: Enviado quando usuário clica para fechar o checkout     - eventName: clickOnClose     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot;   - finishedCheckout: Quando clica para fechar o modal e ele já está finalizado(Substitui o clickOnClose quando o checkout se encontra finalizado)     - eventName: finishedCheckout     - checkoutStatus: \&quot;OK\&quot; ou \&quot;KO\&quot; 
     * <p><b>201</b> - Created
     * @param checkoutCreationParams  (required)
     * @return ResponseEntity&lt;Checkout&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Checkout> checkoutsPostWithHttpInfo(CheckoutCreationParams checkoutCreationParams) throws RestClientException {
        Object localVarPostBody = checkoutCreationParams;
        
        // verify the required parameter 'checkoutCreationParams' is set
        if (checkoutCreationParams == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkoutCreationParams' when calling checkoutsPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Checkout> localReturnType = new ParameterizedTypeReference<Checkout>() {};
        return apiClient.invokeAPI("/checkouts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Simular parcelas
     * Utilizado para retornar ao usuário uma simulação de como ficará sua parcelas, bem como o valor de cashback. Geralmente é usado na página de checkout do e-commerce parceiro.
     * <p><b>200</b> - Retorna o percentual de cashback e uma lista de parcelas
     * @param amount Valor total da ordem com 2 digitos depois do ponto, ex 1000.00 or 1.00 (optional)
     * @param date Data de hoje no formato yyyy-mm-dd, ex 2022-05-25 (optional)
     * @return InstalmentsSimulator
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstalmentsSimulator instalmentsSimulatorGet(String amount, LocalDate date) throws RestClientException {
        return instalmentsSimulatorGetWithHttpInfo(amount, date).getBody();
    }

    /**
     * Simular parcelas
     * Utilizado para retornar ao usuário uma simulação de como ficará sua parcelas, bem como o valor de cashback. Geralmente é usado na página de checkout do e-commerce parceiro.
     * <p><b>200</b> - Retorna o percentual de cashback e uma lista de parcelas
     * @param amount Valor total da ordem com 2 digitos depois do ponto, ex 1000.00 or 1.00 (optional)
     * @param date Data de hoje no formato yyyy-mm-dd, ex 2022-05-25 (optional)
     * @return ResponseEntity&lt;InstalmentsSimulator&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstalmentsSimulator> instalmentsSimulatorGetWithHttpInfo(String amount, LocalDate date) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<InstalmentsSimulator> localReturnType = new ParameterizedTypeReference<InstalmentsSimulator>() {};
        return apiClient.invokeAPI("/instalments_simulator", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Listar detalhes da ordem
     * Ordem é uma compra (checkout) aprovada pela Drip. Este endpoint retorna o detalhe da ordem 
     * <p><b>200</b> - OK
     * @param id Order ID (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order merchantOrdersIdDetailGet(UUID id) throws RestClientException {
        return merchantOrdersIdDetailGetWithHttpInfo(id).getBody();
    }

    /**
     * Listar detalhes da ordem
     * Ordem é uma compra (checkout) aprovada pela Drip. Este endpoint retorna o detalhe da ordem 
     * <p><b>200</b> - OK
     * @param id Order ID (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> merchantOrdersIdDetailGetWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling merchantOrdersIdDetailGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Order> localReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/merchant/orders/{id}/detail", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Return cnpj on json
     * @return MerchantsGetCnpjGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MerchantsGetCnpjGet200Response merchantsGetCnpjGet() throws RestClientException {
        return merchantsGetCnpjGetWithHttpInfo().getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Return cnpj on json
     * @return ResponseEntity&lt;MerchantsGetCnpjGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MerchantsGetCnpjGet200Response> merchantsGetCnpjGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MerchantsGetCnpjGet200Response> localReturnType = new ParameterizedTypeReference<MerchantsGetCnpjGet200Response>() {};
        return apiClient.invokeAPI("/merchants/get_cnpj", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
