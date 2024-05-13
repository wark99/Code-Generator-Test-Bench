package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.HTTPValidationError;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PageDeviceDataScheme;
import org.openapitools.client.model.PageObjectDataScheme;
import org.openapitools.client.model.PageObjectLastDataScheme;
import org.openapitools.client.model.Period;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DataApi {
    private ApiClient apiClient;

    public DataApi() {
        this(new ApiClient());
    }

    public DataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get device data
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique device id (required)
     * @param startDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (optional)
     * @param endDate end date of filtering period (format YYYY-MM-DDThh:mm:ss) (optional)
     * @param period Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     (optional, default to 0)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageDeviceDataScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public PageDeviceDataScheme getDataDevice(Integer id, OffsetDateTime startDate, OffsetDateTime endDate, Period period, Integer perPage, Integer page) throws RestClientException {
        return getDataDeviceWithHttpInfo(id, startDate, endDate, period, perPage, page).getBody();
    }

    /**
     * Get device data
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique device id (required)
     * @param startDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (optional)
     * @param endDate end date of filtering period (format YYYY-MM-DDThh:mm:ss) (optional)
     * @param period Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     (optional, default to 0)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageDeviceDataScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<PageDeviceDataScheme> getDataDeviceWithHttpInfo(Integer id, OffsetDateTime startDate, OffsetDateTime endDate, Period period, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataDevice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "period", period));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PageDeviceDataScheme> localReturnType = new ParameterizedTypeReference<PageDeviceDataScheme>() {};
        return apiClient.invokeAPI("/data/device/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get object data
     * Get object data
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objIds Unique object ids (required)
     * @param startDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (required)
     * @param endDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (required)
     * @param datePeriod Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     (optional, default to 0)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageObjectDataScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageObjectDataScheme getDataObject(List<Integer> objIds, OffsetDateTime startDate, OffsetDateTime endDate, Period datePeriod, Integer perPage, Integer page) throws RestClientException {
        return getDataObjectWithHttpInfo(objIds, startDate, endDate, datePeriod, perPage, page).getBody();
    }

    /**
     * Get object data
     * Get object data
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objIds Unique object ids (required)
     * @param startDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (required)
     * @param endDate start date of filtering period (format YYYY-MM-DDThh:mm:ss) (required)
     * @param datePeriod Period, grouping of data by period:   * 0 - Asis     * 1 - Hour     * 2 - Day     * 3 - Week     * 4 - Month     (optional, default to 0)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageObjectDataScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageObjectDataScheme> getDataObjectWithHttpInfo(List<Integer> objIds, OffsetDateTime startDate, OffsetDateTime endDate, Period datePeriod, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'objIds' is set
        if (objIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objIds' when calling getDataObject");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getDataObject");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getDataObject");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "obj_ids", objIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_period", datePeriod));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageObjectDataScheme> localReturnType = new ParameterizedTypeReference<PageObjectDataScheme>() {};
        return apiClient.invokeAPI("/data/object/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get object last data
     * Get object last data
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objIds Unique object ids (required)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageObjectLastDataScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageObjectLastDataScheme getLastDataObject(List<Integer> objIds, Integer perPage, Integer page) throws RestClientException {
        return getLastDataObjectWithHttpInfo(objIds, perPage, page).getBody();
    }

    /**
     * Get object last data
     * Get object last data
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objIds Unique object ids (required)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageObjectLastDataScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageObjectLastDataScheme> getLastDataObjectWithHttpInfo(List<Integer> objIds, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'objIds' is set
        if (objIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objIds' when calling getLastDataObject");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "obj_ids", objIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageObjectLastDataScheme> localReturnType = new ParameterizedTypeReference<PageObjectLastDataScheme>() {};
        return apiClient.invokeAPI("/data/object/last-data/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
