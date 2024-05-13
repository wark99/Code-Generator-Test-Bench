package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.EducationGet200Response;
import org.openapitools.client.model.ExperienceGet200Response;
import org.openapitools.client.model.GeneralGet200Response;
import org.openapitools.client.model.SkillsGet200Response;
import org.openapitools.client.model.Url;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:28.161294873Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Information about educational background
     * 
     * <p><b>200</b> - Section content
     * @return EducationGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EducationGet200Response educationGet() throws RestClientException {
        return educationGetWithHttpInfo().getBody();
    }

    /**
     * Information about educational background
     * 
     * <p><b>200</b> - Section content
     * @return ResponseEntity&lt;EducationGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EducationGet200Response> educationGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<EducationGet200Response> localReturnType = new ParameterizedTypeReference<EducationGet200Response>() {};
        return apiClient.invokeAPI("/education", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Information about professional background
     * 
     * <p><b>200</b> - Section content
     * @return ExperienceGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExperienceGet200Response experienceGet() throws RestClientException {
        return experienceGetWithHttpInfo().getBody();
    }

    /**
     * Information about professional background
     * 
     * <p><b>200</b> - Section content
     * @return ResponseEntity&lt;ExperienceGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExperienceGet200Response> experienceGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<ExperienceGet200Response> localReturnType = new ParameterizedTypeReference<ExperienceGet200Response>() {};
        return apiClient.invokeAPI("/experience", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * General information
     * 
     * <p><b>200</b> - Section content
     * @return GeneralGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GeneralGet200Response generalGet() throws RestClientException {
        return generalGetWithHttpInfo().getBody();
    }

    /**
     * General information
     * 
     * <p><b>200</b> - Section content
     * @return ResponseEntity&lt;GeneralGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GeneralGet200Response> generalGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GeneralGet200Response> localReturnType = new ParameterizedTypeReference<GeneralGet200Response>() {};
        return apiClient.invokeAPI("/general", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Index of resume section endpoints
     * 
     * <p><b>200</b> - Section list
     * @return List&lt;Url&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Url> rootGet() throws RestClientException {
        return rootGetWithHttpInfo().getBody();
    }

    /**
     * Index of resume section endpoints
     * 
     * <p><b>200</b> - Section list
     * @return ResponseEntity&lt;List&lt;Url&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Url>> rootGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<List<Url>> localReturnType = new ParameterizedTypeReference<List<Url>>() {};
        return apiClient.invokeAPI("/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Hard and soft skills, technologies and programming languages
     * 
     * <p><b>200</b> - Section content
     * @return SkillsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SkillsGet200Response skillsGet() throws RestClientException {
        return skillsGetWithHttpInfo().getBody();
    }

    /**
     * Hard and soft skills, technologies and programming languages
     * 
     * <p><b>200</b> - Section content
     * @return ResponseEntity&lt;SkillsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SkillsGet200Response> skillsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<SkillsGet200Response> localReturnType = new ParameterizedTypeReference<SkillsGet200Response>() {};
        return apiClient.invokeAPI("/skills", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
