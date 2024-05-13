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
public class SeoApi {
    private ApiClient apiClient;

    public SeoApi() {
        this(new ApiClient());
    }

    public SeoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate SEO Tags
     * Generates all most important META tags based on the content provided. Make sure to imclude link to the website and pictures URL to get as many tags populated as possible.  RESULT EXAMPLE:      {       \&quot;meta_tags\&quot;: {         \&quot;title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;keywords\&quot;: \&quot;Las Vegas Grand Prix, F1, Max Verstappen, Fernando Alonso, Lewis Hamilton, racing, spectacle, Las Vegas Strip\&quot;,         \&quot;description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;author\&quot;: \&quot;BBC\&quot;,         \&quot;og:url\&quot;: \&quot;https://bbc.com/\&quot;,         \&quot;og:type\&quot;: \&quot;article\&quot;,         \&quot;og:image\&quot;: \&quot;\&quot;,         \&quot;og:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;og:site_name\&quot;: \&quot;BBC\&quot;,         \&quot;og:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;twitter:card\&quot;: \&quot;summary_large_image\&quot;,         \&quot;twitter:image\&quot;: \&quot;\&quot;,         \&quot;twitter:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;twitter:creator\&quot;: \&quot;BBC\&quot;,         \&quot;twitter:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it\&quot;       }     } 
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
    public Object v1SeoGenerateTagsPost(String accept, Object body) throws RestClientException {
        return v1SeoGenerateTagsPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Generate SEO Tags
     * Generates all most important META tags based on the content provided. Make sure to imclude link to the website and pictures URL to get as many tags populated as possible.  RESULT EXAMPLE:      {       \&quot;meta_tags\&quot;: {         \&quot;title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;keywords\&quot;: \&quot;Las Vegas Grand Prix, F1, Max Verstappen, Fernando Alonso, Lewis Hamilton, racing, spectacle, Las Vegas Strip\&quot;,         \&quot;description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;author\&quot;: \&quot;BBC\&quot;,         \&quot;og:url\&quot;: \&quot;https://bbc.com/\&quot;,         \&quot;og:type\&quot;: \&quot;article\&quot;,         \&quot;og:image\&quot;: \&quot;\&quot;,         \&quot;og:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;og:site_name\&quot;: \&quot;BBC\&quot;,         \&quot;og:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;twitter:card\&quot;: \&quot;summary_large_image\&quot;,         \&quot;twitter:image\&quot;: \&quot;\&quot;,         \&quot;twitter:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;twitter:creator\&quot;: \&quot;BBC\&quot;,         \&quot;twitter:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it\&quot;       }     } 
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
    public ResponseEntity<Object> v1SeoGenerateTagsPostWithHttpInfo(String accept, Object body) throws RestClientException {
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
        return apiClient.invokeAPI("/v1/seo/generate_tags", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
