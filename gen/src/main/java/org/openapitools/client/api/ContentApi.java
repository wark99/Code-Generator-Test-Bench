package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:33.772980200Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContentApi {
    private ApiClient apiClient;

    public ContentApi() {
        this(new ApiClient());
    }

    public ContentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Detect Emails
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentDetectEmailsPost(String accept, Object body) throws RestClientException {
        return v1ContentDetectEmailsPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Detect Emails
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentDetectEmailsPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/detect_emails", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect Phones Numbers
     * Parses the provided text for any phone numbers and returns the original detected version and its E.164 format. Might come in handy in the case of processing and validating big chunks of data against phone numbers or f.e. if you want to detect phone numbers in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       {         \&quot;parsed_number\&quot;: \&quot;+18003947486\&quot;,         \&quot;detected_number\&quot;: \&quot;1800-394-7486\&quot;       },       {         \&quot;parsed_number\&quot;: \&quot;+6588888888\&quot;,         \&quot;detected_number\&quot;: \&quot;+65 8888 8888\&quot;       }     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentDetectPhonesPost(String accept, Object body) throws RestClientException {
        return v1ContentDetectPhonesPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Detect Phones Numbers
     * Parses the provided text for any phone numbers and returns the original detected version and its E.164 format. Might come in handy in the case of processing and validating big chunks of data against phone numbers or f.e. if you want to detect phone numbers in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       {         \&quot;parsed_number\&quot;: \&quot;+18003947486\&quot;,         \&quot;detected_number\&quot;: \&quot;1800-394-7486\&quot;       },       {         \&quot;parsed_number\&quot;: \&quot;+6588888888\&quot;,         \&quot;detected_number\&quot;: \&quot;+65 8888 8888\&quot;       }     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentDetectPhonesPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/detect_phones", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Detect Spam
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentDetectSpamPost(String accept, Object body) throws RestClientException {
        return v1ContentDetectSpamPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Detect Spam
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentDetectSpamPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/detect_spam", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Keywords/Tags
     * Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentKeywordsPost(String accept, Object body) throws RestClientException {
        return v1ContentKeywordsPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Generate Keywords/Tags
     * Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentKeywordsPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/keywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Summarize Text
     * Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentSummarizePost(String accept, Object body) throws RestClientException {
        return v1ContentSummarizePostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Summarize Text
     * Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentSummarizePostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/summarize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Translate Text
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1ContentTranslatePost(String accept, Object body) throws RestClientException {
        return v1ContentTranslatePostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Translate Text
     * Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1ContentTranslatePostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/content/translate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
