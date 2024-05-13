package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetClass200Response;
import org.openapitools.client.model.GetClasses200Response;

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
public class ClassesApi {
    private ApiClient apiClient;

    public ClassesApi() {
        this(new ApiClient());
    }

    public ClassesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a class
     * Retrieve the class.
     * <p><b>200</b> - Returns a Class object.
     * <p><b>404</b> - Class not found.
     * @param classId  (required)
     * @return GetClass200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetClass200Response getClass(String classId) throws RestClientException {
        return getClassWithHttpInfo(classId).getBody();
    }

    /**
     * Get a class
     * Retrieve the class.
     * <p><b>200</b> - Returns a Class object.
     * <p><b>404</b> - Class not found.
     * @param classId  (required)
     * @return ResponseEntity&lt;GetClass200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetClass200Response> getClassWithHttpInfo(String classId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'classId' is set
        if (classId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'classId' when calling getClass");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("classId", classId);

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

        ParameterizedTypeReference<GetClass200Response> localReturnType = new ParameterizedTypeReference<GetClass200Response>() {};
        return apiClient.invokeAPI("/classes/{classId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List class costs
     * Retrieve a list of class costs.
     * <p><b>200</b> - Returns a list of lesson costs, in pence format, associated to the classes in the given term.
     * @param filterTerm ID of the term (optional)
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Integer> getClassCosts(Integer filterTerm) throws RestClientException {
        return getClassCostsWithHttpInfo(filterTerm).getBody();
    }

    /**
     * List class costs
     * Retrieve a list of class costs.
     * <p><b>200</b> - Returns a list of lesson costs, in pence format, associated to the classes in the given term.
     * @param filterTerm ID of the term (optional)
     * @return ResponseEntity&lt;List&lt;Integer&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Integer>> getClassCostsWithHttpInfo(Integer filterTerm) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[term]", filterTerm));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Integer>> localReturnType = new ParameterizedTypeReference<List<Integer>>() {};
        return apiClient.invokeAPI("/classes/costs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List classes
     * Retrieve a list of classes.
     * <p><b>200</b> - Returns a list of Class objects.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterTerm ID of the term (optional)
     * @param filterVenue ID of the venue (optional)
     * @param filterStage ID of the stage (optional)
     * @param filterAgeInterval Interval between the min and max age i.e. month, year (optional)
     * @param filterAgeMin Minimum age threshold (optional)
     * @param filterAgeMax Maximum age threshold (optional)
     * @param filterAbility ID of the ability (optional)
     * @param filterActivity ID of the activity (optional)
     * @param filterDay Numerical day of the week i.e. 1 &#x3D; Sunday, 2 &#x3D; Monday etc. (optional)
     * @param filterSearch Phrase to match the class name, venue name and organiser name (optional)
     * @param page Pagination page number (optional)
     * @param limit Pagination page limit (optional)
     * @return GetClasses200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetClasses200Response getClasses(Integer filterOrganiser, Integer filterTerm, Integer filterVenue, Integer filterStage, String filterAgeInterval, Integer filterAgeMin, Integer filterAgeMax, Integer filterAbility, Integer filterActivity, String filterDay, String filterSearch, Integer page, Integer limit) throws RestClientException {
        return getClassesWithHttpInfo(filterOrganiser, filterTerm, filterVenue, filterStage, filterAgeInterval, filterAgeMin, filterAgeMax, filterAbility, filterActivity, filterDay, filterSearch, page, limit).getBody();
    }

    /**
     * List classes
     * Retrieve a list of classes.
     * <p><b>200</b> - Returns a list of Class objects.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterTerm ID of the term (optional)
     * @param filterVenue ID of the venue (optional)
     * @param filterStage ID of the stage (optional)
     * @param filterAgeInterval Interval between the min and max age i.e. month, year (optional)
     * @param filterAgeMin Minimum age threshold (optional)
     * @param filterAgeMax Maximum age threshold (optional)
     * @param filterAbility ID of the ability (optional)
     * @param filterActivity ID of the activity (optional)
     * @param filterDay Numerical day of the week i.e. 1 &#x3D; Sunday, 2 &#x3D; Monday etc. (optional)
     * @param filterSearch Phrase to match the class name, venue name and organiser name (optional)
     * @param page Pagination page number (optional)
     * @param limit Pagination page limit (optional)
     * @return ResponseEntity&lt;GetClasses200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetClasses200Response> getClassesWithHttpInfo(Integer filterOrganiser, Integer filterTerm, Integer filterVenue, Integer filterStage, String filterAgeInterval, Integer filterAgeMin, Integer filterAgeMax, Integer filterAbility, Integer filterActivity, String filterDay, String filterSearch, Integer page, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[organiser]", filterOrganiser));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[term]", filterTerm));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[venue]", filterVenue));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[stage]", filterStage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[age][interval]", filterAgeInterval));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[age][min]", filterAgeMin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[age][max]", filterAgeMax));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[ability]", filterAbility));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[activity]", filterActivity));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[day]", filterDay));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[search]", filterSearch));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetClasses200Response> localReturnType = new ParameterizedTypeReference<GetClasses200Response>() {};
        return apiClient.invokeAPI("/classes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
