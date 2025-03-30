package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AccessToken;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.PartnerCredentials;
import org.openapitools.client.model.PartnerCredentialsWithNewSecret;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:37:23.431609925Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Access Token
     * Send Partner ID and Partner Secret to the Partner Authentication service to obtain a token for accessing Finicity APIs. * The token is valid for two hours and is required on all calls to the Finicity APIs * As a best practice, use a single token for all calls. Assign a timestamp for each token, and then check the current timestamp before making any calls. If the token is greater than 90 minutes, generate a new one. * ⚠️ After five failed attempts to authenticate, your account will be locked. To reset your account, you can report a support issue using the support.finicity.com portal. Alternatively, contact your Client Success Manager or your onboarding representative.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The access token was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key.
     * @param partnerCredentials  (required)
     * @return AccessToken
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccessToken createToken(PartnerCredentials partnerCredentials) throws RestClientException {
        return createTokenWithHttpInfo(partnerCredentials).getBody();
    }

    /**
     * Create Access Token
     * Send Partner ID and Partner Secret to the Partner Authentication service to obtain a token for accessing Finicity APIs. * The token is valid for two hours and is required on all calls to the Finicity APIs * As a best practice, use a single token for all calls. Assign a timestamp for each token, and then check the current timestamp before making any calls. If the token is greater than 90 minutes, generate a new one. * ⚠️ After five failed attempts to authenticate, your account will be locked. To reset your account, you can report a support issue using the support.finicity.com portal. Alternatively, contact your Client Success Manager or your onboarding representative.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The access token was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key.
     * @param partnerCredentials  (required)
     * @return ResponseEntity&lt;AccessToken&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccessToken> createTokenWithHttpInfo(PartnerCredentials partnerCredentials) throws RestClientException {
        Object localVarPostBody = partnerCredentials;
        
        // verify the required parameter 'partnerCredentials' is set
        if (partnerCredentials == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerCredentials' when calling createToken");
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

        String[] localVarAuthNames = new String[] { "FinicityAppKey" };

        ParameterizedTypeReference<AccessToken> localReturnType = new ParameterizedTypeReference<AccessToken>() {};
        return apiClient.invokeAPI("/aggregation/v2/partners/authentication", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Modify Partner Secret
     * Change the Partner Secret used to authenticate this partner.  The secret does not expire, but can be changed by calling this API. A valid Partner Secret may contain upper and lowercase characters, numbers, and the characters !, @, #, $, %, &amp;, *, _, -, +. It must include at least one number and at least one letter, and its length should be between 12 and 255 characters.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The Partner Secret was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key.
     * @param partnerCredentialsWithNewSecret  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void modifyPartnerSecret(PartnerCredentialsWithNewSecret partnerCredentialsWithNewSecret) throws RestClientException {
        modifyPartnerSecretWithHttpInfo(partnerCredentialsWithNewSecret);
    }

    /**
     * Modify Partner Secret
     * Change the Partner Secret used to authenticate this partner.  The secret does not expire, but can be changed by calling this API. A valid Partner Secret may contain upper and lowercase characters, numbers, and the characters !, @, #, $, %, &amp;, *, _, -, +. It must include at least one number and at least one letter, and its length should be between 12 and 255 characters.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The Partner Secret was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check Partner ID, Partner Secret or Finicity-App-Key.
     * @param partnerCredentialsWithNewSecret  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> modifyPartnerSecretWithHttpInfo(PartnerCredentialsWithNewSecret partnerCredentialsWithNewSecret) throws RestClientException {
        Object localVarPostBody = partnerCredentialsWithNewSecret;
        
        // verify the required parameter 'partnerCredentialsWithNewSecret' is set
        if (partnerCredentialsWithNewSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerCredentialsWithNewSecret' when calling modifyPartnerSecret");
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

        String[] localVarAuthNames = new String[] { "FinicityAppKey" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v2/partners/authentication", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
