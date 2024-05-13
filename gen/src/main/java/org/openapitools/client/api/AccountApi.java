package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PatchDetailsRequest;
import org.openapitools.client.model.PatchEmergencyContactRequest;
import org.openapitools.client.model.PatchMarketingConsentRequest;
import org.openapitools.client.model.PatchPasswordRequest;
import org.openapitools.client.model.PostAttachPaymentMethodRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountApi {
    private ApiClient apiClient;

    public AccountApi() {
        this(new ApiClient());
    }

    public AccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update details
     * Update the account holders details.
     * <p><b>200</b>
     * @param patchDetailsRequest Updates the users account. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object patchDetails(PatchDetailsRequest patchDetailsRequest) throws RestClientException {
        return patchDetailsWithHttpInfo(patchDetailsRequest).getBody();
    }

    /**
     * Update details
     * Update the account holders details.
     * <p><b>200</b>
     * @param patchDetailsRequest Updates the users account. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> patchDetailsWithHttpInfo(PatchDetailsRequest patchDetailsRequest) throws RestClientException {
        Object localVarPostBody = patchDetailsRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/account/details", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update emergency contact
     * Update the account holders emergency contact.
     * <p><b>200</b>
     * @param patchEmergencyContactRequest Updates the users emergency contact. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object patchEmergencyContact(PatchEmergencyContactRequest patchEmergencyContactRequest) throws RestClientException {
        return patchEmergencyContactWithHttpInfo(patchEmergencyContactRequest).getBody();
    }

    /**
     * Update emergency contact
     * Update the account holders emergency contact.
     * <p><b>200</b>
     * @param patchEmergencyContactRequest Updates the users emergency contact. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> patchEmergencyContactWithHttpInfo(PatchEmergencyContactRequest patchEmergencyContactRequest) throws RestClientException {
        Object localVarPostBody = patchEmergencyContactRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/account/emergency-contact", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update marketing consent
     * Update the account holders marketing consent.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users marketing consent for a given organiser. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchMarketingConsent(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        patchMarketingConsentWithHttpInfo(patchMarketingConsentRequest);
    }

    /**
     * Update marketing consent
     * Update the account holders marketing consent.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users marketing consent for a given organiser. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchMarketingConsentWithHttpInfo(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        Object localVarPostBody = patchMarketingConsentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/marketing-consent", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update password
     * Update the account password.
     * <p><b>200</b>
     * @param patchPasswordRequest Updates the users password. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object patchPassword(PatchPasswordRequest patchPasswordRequest) throws RestClientException {
        return patchPasswordWithHttpInfo(patchPasswordRequest).getBody();
    }

    /**
     * Update password
     * Update the account password.
     * <p><b>200</b>
     * @param patchPasswordRequest Updates the users password. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> patchPasswordWithHttpInfo(PatchPasswordRequest patchPasswordRequest) throws RestClientException {
        Object localVarPostBody = patchPasswordRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/account/password", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update photo consent
     * Update the account holders photo consent.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users photo consent for a given organiser. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchPhotoConsent(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        patchPhotoConsentWithHttpInfo(patchMarketingConsentRequest);
    }

    /**
     * Update photo consent
     * Update the account holders photo consent.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users photo consent for a given organiser. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchPhotoConsentWithHttpInfo(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        Object localVarPostBody = patchMarketingConsentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/photo-consent", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update session reminders
     * Update the account holders session reminders.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users session reminders setting for a given organiser. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchSessionReminders(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        patchSessionRemindersWithHttpInfo(patchMarketingConsentRequest);
    }

    /**
     * Update session reminders
     * Update the account holders session reminders.
     * <p><b>204</b> - No content.
     * @param patchMarketingConsentRequest Toggles the users session reminders setting for a given organiser. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchSessionRemindersWithHttpInfo(PatchMarketingConsentRequest patchMarketingConsentRequest) throws RestClientException {
        Object localVarPostBody = patchMarketingConsentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/session-reminders", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Attach Payment Method
     * Attach a payment method to the user.
     * <p><b>204</b> - No content.
     * @param postAttachPaymentMethodRequest Attaches a new payment method to the authenticated user for a given organiser. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postAttachPaymentMethod(PostAttachPaymentMethodRequest postAttachPaymentMethodRequest) throws RestClientException {
        postAttachPaymentMethodWithHttpInfo(postAttachPaymentMethodRequest);
    }

    /**
     * Attach Payment Method
     * Attach a payment method to the user.
     * <p><b>204</b> - No content.
     * @param postAttachPaymentMethodRequest Attaches a new payment method to the authenticated user for a given organiser. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postAttachPaymentMethodWithHttpInfo(PostAttachPaymentMethodRequest postAttachPaymentMethodRequest) throws RestClientException {
        Object localVarPostBody = postAttachPaymentMethodRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/attach-payment-method", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
