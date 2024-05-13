package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CarstockBrandRendersRequest;
import org.openapitools.client.model.CarstockBrandRendersResponse;
import org.openapitools.client.model.CarstockCarouselRequest;
import org.openapitools.client.model.CarstockCarouselResponse;
import org.openapitools.client.model.CarstockChildsRequest;
import org.openapitools.client.model.CarstockComparableRequest;
import org.openapitools.client.model.CarstockComparableResponse;
import org.openapitools.client.model.CarstockGenericRendersRequest;
import org.openapitools.client.model.CarstockGenericRendersResponse;
import org.openapitools.client.model.CarstockImagesChildsPost200Response;
import org.openapitools.client.model.CarstockImagesSelectionPost200Response;
import org.openapitools.client.model.CarstockPlaceHoldersRequest;
import org.openapitools.client.model.CarstockPlaceHoldersResponse;
import org.openapitools.client.model.CarstockSelectionRequest;
import org.openapitools.client.model.CarstockSpecificRequest;
import org.openapitools.client.model.CarstockSpecificResponse;
import org.openapitools.client.model.ErrorResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockImagesApi {
    private ApiClient apiClient;

    public CarstockImagesApi() {
        this(new ApiClient());
    }

    public CarstockImagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the current carstock images of type brand render
     * Get the current carstock images of type brand render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockBrandRendersRequest  (optional)
     * @return List&lt;CarstockBrandRendersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockBrandRendersResponse> carstockImagesBrandrendersPost(CarstockBrandRendersRequest carstockBrandRendersRequest) throws RestClientException {
        return carstockImagesBrandrendersPostWithHttpInfo(carstockBrandRendersRequest).getBody();
    }

    /**
     * Get the current carstock images of type brand render
     * Get the current carstock images of type brand render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockBrandRendersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockBrandRendersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockBrandRendersResponse>> carstockImagesBrandrendersPostWithHttpInfo(CarstockBrandRendersRequest carstockBrandRendersRequest) throws RestClientException {
        Object localVarPostBody = carstockBrandRendersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockBrandRendersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockBrandRendersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/brandrenders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type brand render
     * Get the current carstock images of type brand render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockBrandRendersRequest  (optional)
     * @return List&lt;CarstockBrandRendersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockBrandRendersResponse> carstockImagesBrandrendersPost_0(CarstockBrandRendersRequest carstockBrandRendersRequest) throws RestClientException {
        return carstockImagesBrandrendersPost_0WithHttpInfo(carstockBrandRendersRequest).getBody();
    }

    /**
     * Get the current carstock images of type brand render
     * Get the current carstock images of type brand render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockBrandRendersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockBrandRendersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockBrandRendersResponse>> carstockImagesBrandrendersPost_0WithHttpInfo(CarstockBrandRendersRequest carstockBrandRendersRequest) throws RestClientException {
        Object localVarPostBody = carstockBrandRendersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockBrandRendersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockBrandRendersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/brandrenders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current active carstock images
     * Get the current active carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockCarouselRequest  (optional)
     * @return List&lt;CarstockCarouselResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockCarouselResponse> carstockImagesCarouselPost(CarstockCarouselRequest carstockCarouselRequest) throws RestClientException {
        return carstockImagesCarouselPostWithHttpInfo(carstockCarouselRequest).getBody();
    }

    /**
     * Get the current active carstock images
     * Get the current active carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockCarouselRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockCarouselResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockCarouselResponse>> carstockImagesCarouselPostWithHttpInfo(CarstockCarouselRequest carstockCarouselRequest) throws RestClientException {
        Object localVarPostBody = carstockCarouselRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockCarouselResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockCarouselResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/carousel", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current active carstock images
     * Get the current active carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockCarouselRequest  (optional)
     * @return List&lt;CarstockCarouselResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockCarouselResponse> carstockImagesCarouselPost_0(CarstockCarouselRequest carstockCarouselRequest) throws RestClientException {
        return carstockImagesCarouselPost_0WithHttpInfo(carstockCarouselRequest).getBody();
    }

    /**
     * Get the current active carstock images
     * Get the current active carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockCarouselRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockCarouselResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockCarouselResponse>> carstockImagesCarouselPost_0WithHttpInfo(CarstockCarouselRequest carstockCarouselRequest) throws RestClientException {
        Object localVarPostBody = carstockCarouselRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockCarouselResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockCarouselResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/carousel", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Re-used images
     * Get the child carstocks that are using images of the givin carstock
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockChildsRequest  (optional)
     * @return CarstockImagesChildsPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CarstockImagesChildsPost200Response carstockImagesChildsPost(CarstockChildsRequest carstockChildsRequest) throws RestClientException {
        return carstockImagesChildsPostWithHttpInfo(carstockChildsRequest).getBody();
    }

    /**
     * Re-used images
     * Get the child carstocks that are using images of the givin carstock
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockChildsRequest  (optional)
     * @return ResponseEntity&lt;CarstockImagesChildsPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CarstockImagesChildsPost200Response> carstockImagesChildsPostWithHttpInfo(CarstockChildsRequest carstockChildsRequest) throws RestClientException {
        Object localVarPostBody = carstockChildsRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<CarstockImagesChildsPost200Response> localReturnType = new ParameterizedTypeReference<CarstockImagesChildsPost200Response>() {};
        return apiClient.invokeAPI("/carstock/images/childs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Re-used images
     * Get the child carstocks that are using images of the givin carstock
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockChildsRequest  (optional)
     * @return CarstockImagesChildsPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CarstockImagesChildsPost200Response carstockImagesChildsPost_0(CarstockChildsRequest carstockChildsRequest) throws RestClientException {
        return carstockImagesChildsPost_0WithHttpInfo(carstockChildsRequest).getBody();
    }

    /**
     * Re-used images
     * Get the child carstocks that are using images of the givin carstock
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockChildsRequest  (optional)
     * @return ResponseEntity&lt;CarstockImagesChildsPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CarstockImagesChildsPost200Response> carstockImagesChildsPost_0WithHttpInfo(CarstockChildsRequest carstockChildsRequest) throws RestClientException {
        Object localVarPostBody = carstockChildsRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<CarstockImagesChildsPost200Response> localReturnType = new ParameterizedTypeReference<CarstockImagesChildsPost200Response>() {};
        return apiClient.invokeAPI("/carstock/images/childs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type comparable carstock images
     * Get the current carstock images of type comparable carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockComparableRequest  (optional)
     * @return List&lt;CarstockComparableResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockComparableResponse> carstockImagesComparablePost(CarstockComparableRequest carstockComparableRequest) throws RestClientException {
        return carstockImagesComparablePostWithHttpInfo(carstockComparableRequest).getBody();
    }

    /**
     * Get the current carstock images of type comparable carstock images
     * Get the current carstock images of type comparable carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockComparableRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockComparableResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockComparableResponse>> carstockImagesComparablePostWithHttpInfo(CarstockComparableRequest carstockComparableRequest) throws RestClientException {
        Object localVarPostBody = carstockComparableRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockComparableResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockComparableResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/comparable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type comparable carstock images
     * Get the current carstock images of type comparable carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockComparableRequest  (optional)
     * @return List&lt;CarstockComparableResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockComparableResponse> carstockImagesComparablePost_0(CarstockComparableRequest carstockComparableRequest) throws RestClientException {
        return carstockImagesComparablePost_0WithHttpInfo(carstockComparableRequest).getBody();
    }

    /**
     * Get the current carstock images of type comparable carstock images
     * Get the current carstock images of type comparable carstock images
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockComparableRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockComparableResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockComparableResponse>> carstockImagesComparablePost_0WithHttpInfo(CarstockComparableRequest carstockComparableRequest) throws RestClientException {
        Object localVarPostBody = carstockComparableRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockComparableResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockComparableResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/comparable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type generic render
     * Get the current carstock images of type generic render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockGenericRendersRequest  (optional)
     * @return List&lt;CarstockGenericRendersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockGenericRendersResponse> carstockImagesGenericrendersPost(CarstockGenericRendersRequest carstockGenericRendersRequest) throws RestClientException {
        return carstockImagesGenericrendersPostWithHttpInfo(carstockGenericRendersRequest).getBody();
    }

    /**
     * Get the current carstock images of type generic render
     * Get the current carstock images of type generic render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockGenericRendersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockGenericRendersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockGenericRendersResponse>> carstockImagesGenericrendersPostWithHttpInfo(CarstockGenericRendersRequest carstockGenericRendersRequest) throws RestClientException {
        Object localVarPostBody = carstockGenericRendersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockGenericRendersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockGenericRendersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/genericrenders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type generic render
     * Get the current carstock images of type generic render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockGenericRendersRequest  (optional)
     * @return List&lt;CarstockGenericRendersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockGenericRendersResponse> carstockImagesGenericrendersPost_0(CarstockGenericRendersRequest carstockGenericRendersRequest) throws RestClientException {
        return carstockImagesGenericrendersPost_0WithHttpInfo(carstockGenericRendersRequest).getBody();
    }

    /**
     * Get the current carstock images of type generic render
     * Get the current carstock images of type generic render
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockGenericRendersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockGenericRendersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockGenericRendersResponse>> carstockImagesGenericrendersPost_0WithHttpInfo(CarstockGenericRendersRequest carstockGenericRendersRequest) throws RestClientException {
        Object localVarPostBody = carstockGenericRendersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockGenericRendersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockGenericRendersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/genericrenders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type placeholder
     * Get the current carstock images of type placeholder
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockPlaceHoldersRequest  (optional)
     * @return List&lt;CarstockPlaceHoldersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockPlaceHoldersResponse> carstockImagesPlaceholdersPost(CarstockPlaceHoldersRequest carstockPlaceHoldersRequest) throws RestClientException {
        return carstockImagesPlaceholdersPostWithHttpInfo(carstockPlaceHoldersRequest).getBody();
    }

    /**
     * Get the current carstock images of type placeholder
     * Get the current carstock images of type placeholder
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockPlaceHoldersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockPlaceHoldersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockPlaceHoldersResponse>> carstockImagesPlaceholdersPostWithHttpInfo(CarstockPlaceHoldersRequest carstockPlaceHoldersRequest) throws RestClientException {
        Object localVarPostBody = carstockPlaceHoldersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockPlaceHoldersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockPlaceHoldersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/placeholders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type placeholder
     * Get the current carstock images of type placeholder
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockPlaceHoldersRequest  (optional)
     * @return List&lt;CarstockPlaceHoldersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockPlaceHoldersResponse> carstockImagesPlaceholdersPost_0(CarstockPlaceHoldersRequest carstockPlaceHoldersRequest) throws RestClientException {
        return carstockImagesPlaceholdersPost_0WithHttpInfo(carstockPlaceHoldersRequest).getBody();
    }

    /**
     * Get the current carstock images of type placeholder
     * Get the current carstock images of type placeholder
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockPlaceHoldersRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockPlaceHoldersResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockPlaceHoldersResponse>> carstockImagesPlaceholdersPost_0WithHttpInfo(CarstockPlaceHoldersRequest carstockPlaceHoldersRequest) throws RestClientException {
        Object localVarPostBody = carstockPlaceHoldersRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockPlaceHoldersResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockPlaceHoldersResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/placeholders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock imagesources
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSelectionRequest  (optional)
     * @return CarstockImagesSelectionPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CarstockImagesSelectionPost200Response carstockImagesSelectionPost(CarstockSelectionRequest carstockSelectionRequest) throws RestClientException {
        return carstockImagesSelectionPostWithHttpInfo(carstockSelectionRequest).getBody();
    }

    /**
     * Get the current carstock imagesources
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSelectionRequest  (optional)
     * @return ResponseEntity&lt;CarstockImagesSelectionPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CarstockImagesSelectionPost200Response> carstockImagesSelectionPostWithHttpInfo(CarstockSelectionRequest carstockSelectionRequest) throws RestClientException {
        Object localVarPostBody = carstockSelectionRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<CarstockImagesSelectionPost200Response> localReturnType = new ParameterizedTypeReference<CarstockImagesSelectionPost200Response>() {};
        return apiClient.invokeAPI("/carstock/images/selection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock imagesources
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSelectionRequest  (optional)
     * @return CarstockImagesSelectionPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CarstockImagesSelectionPost200Response carstockImagesSelectionPost_0(CarstockSelectionRequest carstockSelectionRequest) throws RestClientException {
        return carstockImagesSelectionPost_0WithHttpInfo(carstockSelectionRequest).getBody();
    }

    /**
     * Get the current carstock imagesources
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSelectionRequest  (optional)
     * @return ResponseEntity&lt;CarstockImagesSelectionPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CarstockImagesSelectionPost200Response> carstockImagesSelectionPost_0WithHttpInfo(CarstockSelectionRequest carstockSelectionRequest) throws RestClientException {
        Object localVarPostBody = carstockSelectionRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<CarstockImagesSelectionPost200Response> localReturnType = new ParameterizedTypeReference<CarstockImagesSelectionPost200Response>() {};
        return apiClient.invokeAPI("/carstock/images/selection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type car specific
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSpecificRequest  (optional)
     * @return List&lt;CarstockSpecificResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockSpecificResponse> carstockImagesSpecificPost(CarstockSpecificRequest carstockSpecificRequest) throws RestClientException {
        return carstockImagesSpecificPostWithHttpInfo(carstockSpecificRequest).getBody();
    }

    /**
     * Get the current carstock images of type car specific
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSpecificRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockSpecificResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockSpecificResponse>> carstockImagesSpecificPostWithHttpInfo(CarstockSpecificRequest carstockSpecificRequest) throws RestClientException {
        Object localVarPostBody = carstockSpecificRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockSpecificResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockSpecificResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/specific", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current carstock images of type car specific
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSpecificRequest  (optional)
     * @return List&lt;CarstockSpecificResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockSpecificResponse> carstockImagesSpecificPost_0(CarstockSpecificRequest carstockSpecificRequest) throws RestClientException {
        return carstockImagesSpecificPost_0WithHttpInfo(carstockSpecificRequest).getBody();
    }

    /**
     * Get the current carstock images of type car specific
     * Get the current carstock images of type car specific
     * <p><b>200</b> - Carstock specific images for the given carstockid
     * <p><b>500</b> - Internal server error
     * @param carstockSpecificRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockSpecificResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockSpecificResponse>> carstockImagesSpecificPost_0WithHttpInfo(CarstockSpecificRequest carstockSpecificRequest) throws RestClientException {
        Object localVarPostBody = carstockSpecificRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstockSpecificResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockSpecificResponse>>() {};
        return apiClient.invokeAPI("/carstock/images/specific", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
