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
public class TravelTourismHospitalityApi {
    private ApiClient apiClient;

    public TravelTourismHospitalityApi() {
        this(new ApiClient());
    }

    public TravelTourismHospitalityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Hospitality Product Categories
     * Generates a a list of suitable categories for the Hospitality type product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating products catalogs data and bulk products&#39; processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Górskie Noclegi\&quot;,           \&quot;weight\&quot;: 8         },         {           \&quot;name\&quot;: \&quot;Regionalna Kuchnia\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Przyrodnicze Spa\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;Wypożyczalnia Sprzętu Sportowego\&quot;,           \&quot;weight\&quot;: 6.3         }       ]     } 
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
    public Object v1TthHospitalityProductCategoriesPost(String accept, Object body) throws RestClientException {
        return v1TthHospitalityProductCategoriesPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Hospitality Product Categories
     * Generates a a list of suitable categories for the Hospitality type product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating products catalogs data and bulk products&#39; processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Górskie Noclegi\&quot;,           \&quot;weight\&quot;: 8         },         {           \&quot;name\&quot;: \&quot;Regionalna Kuchnia\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Przyrodnicze Spa\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;Wypożyczalnia Sprzętu Sportowego\&quot;,           \&quot;weight\&quot;: 6.3         }       ]     } 
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
    public ResponseEntity<Object> v1TthHospitalityProductCategoriesPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/tth/hospitality_product_categories", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Travel Review Sentiment
     * Parses the Travel/Hospitality product review and provides its sentiment (POSITIVE/NEGATIVE/NEUTRAL) with a score between 0-100%. Great for sentiment report processing for any online store.  RESULT EXAMPLE:      {       \&quot;opinion\&quot;: \&quot;POSITIVE\&quot;,       \&quot;score\&quot;: 95     } 
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
    public Object v1TthReviewSentimentPost(String accept, Object body) throws RestClientException {
        return v1TthReviewSentimentPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Travel Review Sentiment
     * Parses the Travel/Hospitality product review and provides its sentiment (POSITIVE/NEGATIVE/NEUTRAL) with a score between 0-100%. Great for sentiment report processing for any online store.  RESULT EXAMPLE:      {       \&quot;opinion\&quot;: \&quot;POSITIVE\&quot;,       \&quot;score\&quot;: 95     } 
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
    public ResponseEntity<Object> v1TthReviewSentimentPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/tth/review_sentiment", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Tours &amp; Activities Product Categories
     * Generates a list of suitable categories for the Tours &amp; Activities product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating product catalogue data and bulk product processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Halong Bay Cruise\&quot;,           \&quot;weight\&quot;: 9.5         },         {           \&quot;name\&quot;: \&quot;Day Cruises\&quot;,           \&quot;weight\&quot;: 8.8         },         {           \&quot;name\&quot;: \&quot;Kayaking Tours\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;Scenic Boat Tours\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 
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
    public Object v1TthTaProductCategoriesPost(String accept, Object body) throws RestClientException {
        return v1TthTaProductCategoriesPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Tours &amp; Activities Product Categories
     * Generates a list of suitable categories for the Tours &amp; Activities product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating product catalogue data and bulk product processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Halong Bay Cruise\&quot;,           \&quot;weight\&quot;: 9.5         },         {           \&quot;name\&quot;: \&quot;Day Cruises\&quot;,           \&quot;weight\&quot;: 8.8         },         {           \&quot;name\&quot;: \&quot;Kayaking Tours\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;Scenic Boat Tours\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 
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
    public ResponseEntity<Object> v1TthTaProductCategoriesPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/tth/ta_product_categories", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
