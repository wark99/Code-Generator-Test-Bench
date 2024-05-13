package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Company;
import org.openapitools.client.model.GetTelemetry200Response;
import org.openapitools.client.model.GetTools200Response;
import org.openapitools.client.model.Plant;
import org.openapitools.client.model.Tool;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:24.819947494Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ToolControllerApi {
    private ApiClient apiClient;

    public ToolControllerApi() {
        this(new ApiClient());
    }

    public ToolControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get information about all your companies
     * All company catalog, along with tool information is returned as a JSON array
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @return List&lt;List&lt;Company&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<List<Company>> getCompanies() throws RestClientException {
        return getCompaniesWithHttpInfo().getBody();
    }

    /**
     * Get information about all your companies
     * All company catalog, along with tool information is returned as a JSON array
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @return ResponseEntity&lt;List&lt;List&lt;Company&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<List<Company>>> getCompaniesWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<List<Company>>> localReturnType = new ParameterizedTypeReference<List<List<Company>>>() {};
        return apiClient.invokeAPI("/companies", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about all your plants
     * All plants catalog, along with tool information is returned as a JSON array
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @return List&lt;List&lt;Plant&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<List<Plant>> getPlants() throws RestClientException {
        return getPlantsWithHttpInfo().getBody();
    }

    /**
     * Get information about all your plants
     * All plants catalog, along with tool information is returned as a JSON array
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @return ResponseEntity&lt;List&lt;List&lt;Plant&gt;&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<List<Plant>>> getPlantsWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<List<Plant>>> localReturnType = new ParameterizedTypeReference<List<List<Plant>>>() {};
        return apiClient.invokeAPI("/plants", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get tool telemetry
     * The tool telemetry, for the specified keys, is returned. Custom aggregation can be chosen among the available ones.
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * @param id Id of the tool (optional)
     * @param externalId Id to be used as a key to external database (optional)
     * @param from Start of telemetry interval to be returned (optional)
     * @param to End of telemetry interval to be returned (optional)
     * @param keys Telemetry keys to be exported, comma separated (CYCLES, CYCLE_TIME, RUNTIME, UPTIME, TEMPERATURE) (optional)
     * @return GetTelemetry200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTelemetry200Response getTelemetry(Integer id, String externalId, Integer from, Integer to, String keys) throws RestClientException {
        return getTelemetryWithHttpInfo(id, externalId, from, to, keys).getBody();
    }

    /**
     * Get tool telemetry
     * The tool telemetry, for the specified keys, is returned. Custom aggregation can be chosen among the available ones.
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * @param id Id of the tool (optional)
     * @param externalId Id to be used as a key to external database (optional)
     * @param from Start of telemetry interval to be returned (optional)
     * @param to End of telemetry interval to be returned (optional)
     * @param keys Telemetry keys to be exported, comma separated (CYCLES, CYCLE_TIME, RUNTIME, UPTIME, TEMPERATURE) (optional)
     * @return ResponseEntity&lt;GetTelemetry200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTelemetry200Response> getTelemetryWithHttpInfo(Integer id, String externalId, Integer from, Integer to, String keys) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "keys", keys));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetTelemetry200Response> localReturnType = new ParameterizedTypeReference<GetTelemetry200Response>() {};
        return apiClient.invokeAPI("/telemetry", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about all a specific tool
     * A single tool is returned in a JSON object
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * @param id Id of the tool (optional)
     * @param externalId Id to be used as a key to external database (optional)
     * @return Tool
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tool getTool(Integer id, String externalId) throws RestClientException {
        return getToolWithHttpInfo(id, externalId).getBody();
    }

    /**
     * Get information about all a specific tool
     * A single tool is returned in a JSON object
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not found
     * @param id Id of the tool (optional)
     * @param externalId Id to be used as a key to external database (optional)
     * @return ResponseEntity&lt;Tool&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tool> getToolWithHttpInfo(Integer id, String externalId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Tool> localReturnType = new ParameterizedTypeReference<Tool>() {};
        return apiClient.invokeAPI("/tool", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about all your tools
     * All tool catalog, along with tool information is returned as a JSON array. Output is paginated.
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @param page Id of the desired page (optional)
     * @return GetTools200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTools200Response getTools(Integer page) throws RestClientException {
        return getToolsWithHttpInfo(page).getBody();
    }

    /**
     * Get information about all your tools
     * All tool catalog, along with tool information is returned as a JSON array. Output is paginated.
     * <p><b>200</b> - Successful operation
     * <p><b>401</b> - Unauthorized
     * @param page Id of the desired page (optional)
     * @return ResponseEntity&lt;GetTools200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTools200Response> getToolsWithHttpInfo(Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetTools200Response> localReturnType = new ParameterizedTypeReference<GetTools200Response>() {};
        return apiClient.invokeAPI("/tools", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
