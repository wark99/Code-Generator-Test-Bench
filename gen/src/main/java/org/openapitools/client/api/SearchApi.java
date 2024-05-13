package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.FileInfoList;
import org.openapitools.client.model.SearchFilesRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return FileInfoList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FileInfoList searchFiles(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        return searchFilesWithHttpInfo(teamId, searchFilesRequest).getBody();
    }

    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return ResponseEntity&lt;FileInfoList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileInfoList> searchFilesWithHttpInfo(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        Object localVarPostBody = searchFilesRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchFiles");
        }
        
        // verify the required parameter 'searchFilesRequest' is set
        if (searchFilesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchFilesRequest' when calling searchFiles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<FileInfoList> localReturnType = new ParameterizedTypeReference<FileInfoList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/files/search", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
