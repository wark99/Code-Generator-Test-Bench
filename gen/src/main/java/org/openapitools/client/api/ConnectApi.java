package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ConnectEmailParameters;
import org.openapitools.client.model.ConnectEmailUrl;
import org.openapitools.client.model.ConnectJointBorrowerEmailParameters;
import org.openapitools.client.model.ConnectJointBorrowerParameters;
import org.openapitools.client.model.ConnectParameters;
import org.openapitools.client.model.ConnectUrl;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.Experiences;
import org.openapitools.client.model.FixConnectParameters;
import org.openapitools.client.model.LiteConnectParameters;
import org.openapitools.client.model.MicroEntryVerifyRequestParameter;
import org.openapitools.client.model.TransferDepositSwitchParameters;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:48:08.238993781Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConnectApi {
    private ApiClient apiClient;

    public ConnectApi() {
        this(new ApiClient());
    }

    public ConnectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Connect URL
     * Generate a Connect URL link to add within your own applications.  Optional Parameters: * &#x60;experience&#x60;: Configure different customer experiences per Connect session by changing the brand, color, logo, icon, the type of credit decisioning report to generate after the session ends, and more. * &#x60;language&#x60;: By default, the Connect application is in English. You don&#39;t need to pass  this parameter unless you want to translate Connect into one of our supported languages.    * Spanish (United States)   * French (Canada)   MVS Developers: You can pre-populate the consumer&#39;s SSN on the Find employment records page at the beginning of the MVS payroll app. Pass the SSN value for the consumer in the body of the request call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectParameters  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl generateConnectUrl(ConnectParameters connectParameters) throws RestClientException {
        return generateConnectUrlWithHttpInfo(connectParameters).getBody();
    }

    /**
     * Generate Connect URL
     * Generate a Connect URL link to add within your own applications.  Optional Parameters: * &#x60;experience&#x60;: Configure different customer experiences per Connect session by changing the brand, color, logo, icon, the type of credit decisioning report to generate after the session ends, and more. * &#x60;language&#x60;: By default, the Connect application is in English. You don&#39;t need to pass  this parameter unless you want to translate Connect into one of our supported languages.    * Spanish (United States)   * French (Canada)   MVS Developers: You can pre-populate the consumer&#39;s SSN on the Find employment records page at the beginning of the MVS payroll app. Pass the SSN value for the consumer in the body of the request call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectParameters  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> generateConnectUrlWithHttpInfo(ConnectParameters connectParameters) throws RestClientException {
        Object localVarPostBody = connectParameters;
        
        // verify the required parameter 'connectParameters' is set
        if (connectParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectParameters' when calling generateConnectUrl");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/v2/generate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Fix Connect URL
     * Use the Connect Fix API when the following conditions occur: * The connection to the user&#39;s financial institution is lost * The user&#39;s credentials were updated (for any number of reasons) * The user&#39;s MFA challenge has expired  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param fixConnectParameters  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl generateFixConnectUrl(FixConnectParameters fixConnectParameters) throws RestClientException {
        return generateFixConnectUrlWithHttpInfo(fixConnectParameters).getBody();
    }

    /**
     * Generate Fix Connect URL
     * Use the Connect Fix API when the following conditions occur: * The connection to the user&#39;s financial institution is lost * The user&#39;s credentials were updated (for any number of reasons) * The user&#39;s MFA challenge has expired  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param fixConnectParameters  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> generateFixConnectUrlWithHttpInfo(FixConnectParameters fixConnectParameters) throws RestClientException {
        Object localVarPostBody = fixConnectParameters;
        
        // verify the required parameter 'fixConnectParameters' is set
        if (fixConnectParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fixConnectParameters' when calling generateFixConnectUrl");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/v2/generate/fix", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Connect URL - Joint Borrower
     * Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but for joint borrowers.  MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectJointBorrowerParameters  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl generateJointBorrowerConnectUrl(ConnectJointBorrowerParameters connectJointBorrowerParameters) throws RestClientException {
        return generateJointBorrowerConnectUrlWithHttpInfo(connectJointBorrowerParameters).getBody();
    }

    /**
     * Generate Connect URL - Joint Borrower
     * Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but for joint borrowers.  MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectJointBorrowerParameters  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> generateJointBorrowerConnectUrlWithHttpInfo(ConnectJointBorrowerParameters connectJointBorrowerParameters) throws RestClientException {
        Object localVarPostBody = connectJointBorrowerParameters;
        
        // verify the required parameter 'connectJointBorrowerParameters' is set
        if (connectJointBorrowerParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectJointBorrowerParameters' when calling generateJointBorrowerConnectUrl");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/v2/generate/jointBorrower", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Lite Connect URL
     * Connect Lite is a variation of Connect Full (&#x60;POST /connect/v2/generate&#x60;), which has a limited set of features. * Sign in, user&#39;s credentials, and Multi-Factor Authentication (MFA) * No user account management  The Connect Web SDK isn&#39;t a requirement when using Connect lite. However, if you want to use the SDK events, routes, and user events, then you must integrate with the Connect Web SDK.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param liteConnectParameters  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl generateLiteConnectUrl(LiteConnectParameters liteConnectParameters) throws RestClientException {
        return generateLiteConnectUrlWithHttpInfo(liteConnectParameters).getBody();
    }

    /**
     * Generate Lite Connect URL
     * Connect Lite is a variation of Connect Full (&#x60;POST /connect/v2/generate&#x60;), which has a limited set of features. * Sign in, user&#39;s credentials, and Multi-Factor Authentication (MFA) * No user account management  The Connect Web SDK isn&#39;t a requirement when using Connect lite. However, if you want to use the SDK events, routes, and user events, then you must integrate with the Connect Web SDK.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param liteConnectParameters  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> generateLiteConnectUrlWithHttpInfo(LiteConnectParameters liteConnectParameters) throws RestClientException {
        Object localVarPostBody = liteConnectParameters;
        
        // verify the required parameter 'liteConnectParameters' is set
        if (liteConnectParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'liteConnectParameters' when calling generateLiteConnectUrl");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/v2/generate/lite", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Connect Transfer URL
     * Generate a Connect URL which you can use in your application to allow end users to select an FI for deposit switch.
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param transferDepositSwitchParameters  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl generateTransferDepositSwitchUrl(TransferDepositSwitchParameters transferDepositSwitchParameters) throws RestClientException {
        return generateTransferDepositSwitchUrlWithHttpInfo(transferDepositSwitchParameters).getBody();
    }

    /**
     * Connect Transfer URL
     * Generate a Connect URL which you can use in your application to allow end users to select an FI for deposit switch.
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param transferDepositSwitchParameters  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> generateTransferDepositSwitchUrlWithHttpInfo(TransferDepositSwitchParameters transferDepositSwitchParameters) throws RestClientException {
        Object localVarPostBody = transferDepositSwitchParameters;
        
        // verify the required parameter 'transferDepositSwitchParameters' is set
        if (transferDepositSwitchParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transferDepositSwitchParameters' when calling generateTransferDepositSwitchUrl");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/generate/transfer/deposit-switch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Experience IDs
     * Retrieve Connect experiences by application name. Optionally, filter the experiences by product codes.
     * <p><b>200</b> - Successful response. Returns all retrieved Experience.
     * <p><b>400</b> - The request was rejected.
     * <p><b>404</b> - The requested entity was not found
     * @param appName Unique name of the application provided to Mastercard during app registration. (required)
     * @param productCode A unique billing code assigned to each open banking product used by the customer, as detailed in their contract. (optional)
     * @return List&lt;Experiences&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Experiences> getAllExperience(String appName, List<String> productCode) throws RestClientException {
        return getAllExperienceWithHttpInfo(appName, productCode).getBody();
    }

    /**
     * Get Experience IDs
     * Retrieve Connect experiences by application name. Optionally, filter the experiences by product codes.
     * <p><b>200</b> - Successful response. Returns all retrieved Experience.
     * <p><b>400</b> - The request was rejected.
     * <p><b>404</b> - The requested entity was not found
     * @param appName Unique name of the application provided to Mastercard during app registration. (required)
     * @param productCode A unique billing code assigned to each open banking product used by the customer, as detailed in their contract. (optional)
     * @return ResponseEntity&lt;List&lt;Experiences&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Experiences>> getAllExperienceWithHttpInfo(String appName, List<String> productCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appName' is set
        if (appName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appName' when calling getAllExperience");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "productCode", productCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appName", appName));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<List<Experiences>> localReturnType = new ParameterizedTypeReference<List<Experiences>>() {};
        return apiClient.invokeAPI("/connect/experiences", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send Connect Email
     * Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but send a Connect email to a consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated and the email sent
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectEmailParameters  (required)
     * @return ConnectEmailUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectEmailUrl sendConnectEmail(ConnectEmailParameters connectEmailParameters) throws RestClientException {
        return sendConnectEmailWithHttpInfo(connectEmailParameters).getBody();
    }

    /**
     * Send Connect Email
     * Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but send a Connect email to a consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated and the email sent
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectEmailParameters  (required)
     * @return ResponseEntity&lt;ConnectEmailUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectEmailUrl> sendConnectEmailWithHttpInfo(ConnectEmailParameters connectEmailParameters) throws RestClientException {
        Object localVarPostBody = connectEmailParameters;
        
        // verify the required parameter 'connectEmailParameters' is set
        if (connectEmailParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectEmailParameters' when calling sendConnectEmail");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectEmailUrl> localReturnType = new ParameterizedTypeReference<ConnectEmailUrl>() {};
        return apiClient.invokeAPI("/connect/v2/send/email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send Connect Email - Joint Borrower
     * Same as Connect Joint Borrower (&#x60;POST /connect/v2/generate/jointBorrower&#x60;) but send a Connect email  to at least one of the joint borrower&#39;s email addresses.  When the consumer opens the email, MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated and the email sent
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectJointBorrowerEmailParameters  (required)
     * @return ConnectEmailUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectEmailUrl sendJointBorrowerConnectEmail(ConnectJointBorrowerEmailParameters connectJointBorrowerEmailParameters) throws RestClientException {
        return sendJointBorrowerConnectEmailWithHttpInfo(connectJointBorrowerEmailParameters).getBody();
    }

    /**
     * Send Connect Email - Joint Borrower
     * Same as Connect Joint Borrower (&#x60;POST /connect/v2/generate/jointBorrower&#x60;) but send a Connect email  to at least one of the joint borrower&#39;s email addresses.  When the consumer opens the email, MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated and the email sent
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param connectJointBorrowerEmailParameters  (required)
     * @return ResponseEntity&lt;ConnectEmailUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectEmailUrl> sendJointBorrowerConnectEmailWithHttpInfo(ConnectJointBorrowerEmailParameters connectJointBorrowerEmailParameters) throws RestClientException {
        Object localVarPostBody = connectJointBorrowerEmailParameters;
        
        // verify the required parameter 'connectJointBorrowerEmailParameters' is set
        if (connectJointBorrowerEmailParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectJointBorrowerEmailParameters' when calling sendJointBorrowerConnectEmail");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectEmailUrl> localReturnType = new ParameterizedTypeReference<ConnectEmailUrl>() {};
        return apiClient.invokeAPI("/connect/v2/send/email/jointBorrower", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Account Validation Assistant User verification of microdeposits
     * The UI re-engages the consumer to enter two microdeposit amounts found in their account and validates them.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param microEntryVerifyRequestParameter  (required)
     * @return ConnectUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectUrl verifyMicroEntryMicrodeposit(MicroEntryVerifyRequestParameter microEntryVerifyRequestParameter) throws RestClientException {
        return verifyMicroEntryMicrodepositWithHttpInfo(microEntryVerifyRequestParameter).getBody();
    }

    /**
     * Account Validation Assistant User verification of microdeposits
     * The UI re-engages the consumer to enter two microdeposit amounts found in their account and validates them.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The URL link was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param microEntryVerifyRequestParameter  (required)
     * @return ResponseEntity&lt;ConnectUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectUrl> verifyMicroEntryMicrodepositWithHttpInfo(MicroEntryVerifyRequestParameter microEntryVerifyRequestParameter) throws RestClientException {
        Object localVarPostBody = microEntryVerifyRequestParameter;
        
        // verify the required parameter 'microEntryVerifyRequestParameter' is set
        if (microEntryVerifyRequestParameter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'microEntryVerifyRequestParameter' when calling verifyMicroEntryMicrodeposit");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ConnectUrl> localReturnType = new ParameterizedTypeReference<ConnectUrl>() {};
        return apiClient.invokeAPI("/connect/v2/generate/microentry/verify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
