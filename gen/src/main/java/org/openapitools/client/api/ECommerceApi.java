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
public class ECommerceApi {
    private ApiClient apiClient;

    public ECommerceApi() {
        this(new ApiClient());
    }

    public ECommerceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Product Categories
     * Generates a list of suitable categories for the product with relevance weights as a float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating product catalogue data and bulk products&#39; processing.  RESULT EXAMPLE:      [       {         \&quot;name\&quot;: \&quot;Gaming Laptops\&quot;,         \&quot;weight\&quot;: 10       },       {         \&quot;name\&quot;: \&quot;Computer Hardware\&quot;,         \&quot;weight\&quot;: 9       },       {         \&quot;name\&quot;: \&quot;Electronics\&quot;,         \&quot;weight\&quot;: 8       },       {         \&quot;name\&quot;: \&quot;Technology\&quot;,         \&quot;weight\&quot;: 7       }     ] 
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
    public Object v1EcommerceProductCategoriesPost(String accept, Object body) throws RestClientException {
        return v1EcommerceProductCategoriesPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Product Categories
     * Generates a list of suitable categories for the product with relevance weights as a float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating product catalogue data and bulk products&#39; processing.  RESULT EXAMPLE:      [       {         \&quot;name\&quot;: \&quot;Gaming Laptops\&quot;,         \&quot;weight\&quot;: 10       },       {         \&quot;name\&quot;: \&quot;Computer Hardware\&quot;,         \&quot;weight\&quot;: 9       },       {         \&quot;name\&quot;: \&quot;Electronics\&quot;,         \&quot;weight\&quot;: 8       },       {         \&quot;name\&quot;: \&quot;Technology\&quot;,         \&quot;weight\&quot;: 7       }     ] 
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
    public ResponseEntity<Object> v1EcommerceProductCategoriesPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/ecommerce/product_categories", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Product Intro
     * Generates a shorter version of the product description. Provide as many details and parameters of the product to get the best marketing introduction possible. Comes in handy with populating product catalog data and bulk products processing.  RESULT EXAMPLE:      {       \&quot;product_intro\&quot;: \&quot;Experience the ultimate gaming and content creation powerhouse with the Razer Blade 16 Gaming Laptop. Featuring the NVIDIA GeForce RTX 4090 graphics and the 13th Gen Intel Core i9 HX CPU, this laptop delivers unparalleled performance for both gaming and resource-intensive tasks. The next-gen dual-mode Mini LED display offers stunning 4K resolution for creative work and ultra-fast refresh rates for smooth gameplay. With a compact GaN charger and an anodized aluminum unibody, this laptop is designed for portability without compromising on power and durability.\&quot;     } 
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
    public Object v1EcommerceProductIntroPost(String accept, Object body) throws RestClientException {
        return v1EcommerceProductIntroPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Generate Product Intro
     * Generates a shorter version of the product description. Provide as many details and parameters of the product to get the best marketing introduction possible. Comes in handy with populating product catalog data and bulk products processing.  RESULT EXAMPLE:      {       \&quot;product_intro\&quot;: \&quot;Experience the ultimate gaming and content creation powerhouse with the Razer Blade 16 Gaming Laptop. Featuring the NVIDIA GeForce RTX 4090 graphics and the 13th Gen Intel Core i9 HX CPU, this laptop delivers unparalleled performance for both gaming and resource-intensive tasks. The next-gen dual-mode Mini LED display offers stunning 4K resolution for creative work and ultra-fast refresh rates for smooth gameplay. With a compact GaN charger and an anodized aluminum unibody, this laptop is designed for portability without compromising on power and durability.\&quot;     } 
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
    public ResponseEntity<Object> v1EcommerceProductIntroPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/ecommerce/product_intro", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Product Review Sentiment
     * Parses the customer&#39;s product review and provides its sentiment (POSITIVE/NEGATIVE/NAUTRAL) with a score between 0-100%. Great for sentiment report processing for any online store.  RESULT EXAMPLE:      {       \&quot;score\&quot;: 85,       \&quot;opinion\&quot;: \&quot;NEGATIVE\&quot;     } 
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
    public Object v1EcommerceReviewSentimentPost(String accept, Object body) throws RestClientException {
        return v1EcommerceReviewSentimentPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Product Review Sentiment
     * Parses the customer&#39;s product review and provides its sentiment (POSITIVE/NEGATIVE/NAUTRAL) with a score between 0-100%. Great for sentiment report processing for any online store.  RESULT EXAMPLE:      {       \&quot;score\&quot;: 85,       \&quot;opinion\&quot;: \&quot;NEGATIVE\&quot;     } 
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
    public ResponseEntity<Object> v1EcommerceReviewSentimentPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/ecommerce/review_sentiment", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Thank You E-mail
     * Generates a personalized thank you email to the customer after the purchase. The response content does not contain the title, greeting or sender info at the end so you can personalize the rest of the email easily.  RESULT EXAMPLE:      {       \&quot;email\&quot;: \&quot;We would like to sincerely thank you for purchasing the [I&#39;M From] Honey Mask 4.23oz | wash off type, real honey 38.7%, Deep moisturization, Nourishment, Hydrating and Clear Complexion. We appreciate your support and hope that our product will provide your skin with the nourishment and hydration it needs. If you have any questions or need further assistance, please feel free to contact us. Your satisfaction is our priority, and we are here to ensure that you have a positive experience with our products. Thank you once again for choosing our products. We value your trust and look forward to serving you again in the future.\&quot;     } 
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
    public Object v1EcommerceThankYouEmailPost(String accept, Object body) throws RestClientException {
        return v1EcommerceThankYouEmailPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Generate Thank You E-mail
     * Generates a personalized thank you email to the customer after the purchase. The response content does not contain the title, greeting or sender info at the end so you can personalize the rest of the email easily.  RESULT EXAMPLE:      {       \&quot;email\&quot;: \&quot;We would like to sincerely thank you for purchasing the [I&#39;M From] Honey Mask 4.23oz | wash off type, real honey 38.7%, Deep moisturization, Nourishment, Hydrating and Clear Complexion. We appreciate your support and hope that our product will provide your skin with the nourishment and hydration it needs. If you have any questions or need further assistance, please feel free to contact us. Your satisfaction is our priority, and we are here to ensure that you have a positive experience with our products. Thank you once again for choosing our products. We value your trust and look forward to serving you again in the future.\&quot;     } 
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
    public ResponseEntity<Object> v1EcommerceThankYouEmailPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/ecommerce/thank_you_email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
