package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ClientsGetSingle200Response;
import org.openapitools.client.model.ClientsGetSingle400Response;
import org.openapitools.client.model.ClientsList200Response;
import org.openapitools.client.model.ClientsList400Response;
import org.openapitools.client.model.GetApiApplicantApplicantId200Response;
import org.openapitools.client.model.GetApiApplicants200Response;
import org.openapitools.client.model.GetApiApplicants207Response;
import org.openapitools.client.model.GetApiApplicants404Response;
import org.openapitools.client.model.GetApiCaregivers200Response;
import org.openapitools.client.model.GetApiCaregivers207Response;
import org.openapitools.client.model.GetApiCaregivers404Response;
import org.openapitools.client.model.GetApiCaregiversCaregiverId200Response;
import org.openapitools.client.model.GetApiVisits200Response;
import org.openapitools.client.model.GetApiVisits403Response;
import org.openapitools.client.model.GetApiVisits404Response;
import org.openapitools.client.model.GetApiVisits422Response;
import org.openapitools.client.model.GetApiVisits500Response;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PatchApiCaregiversCaregiverId200Response;
import org.openapitools.client.model.PatchApiCaregiversCaregiverId403Response;
import org.openapitools.client.model.PatchApiCaregiversCaregiverId404Response;
import org.openapitools.client.model.PatchApiCaregiversCaregiverId422Response;
import org.openapitools.client.model.PatchApiCaregiversCaregiverIdRequest;
import org.openapitools.client.model.PatchApiClients200Response;
import org.openapitools.client.model.PatchApiClients400Response;
import org.openapitools.client.model.PatchApiClientsRequest;
import org.openapitools.client.model.PatchApiVisitsVisitId400Response;
import org.openapitools.client.model.PatchApiVisitsVisitId401Response;
import org.openapitools.client.model.PatchApiVisitsVisitId500Response;
import org.openapitools.client.model.PatchApiVisitsVisitIdRequest;
import org.openapitools.client.model.PostApiCaregivers201Response;
import org.openapitools.client.model.PostApiCaregivers403Response;
import org.openapitools.client.model.PostApiCaregivers422Response;
import org.openapitools.client.model.PostApiCaregiversRequest;
import org.openapitools.client.model.PostApiClients200Response;
import org.openapitools.client.model.PostApiClients400Response;
import org.openapitools.client.model.PostApiClientsRequest;
import org.openapitools.client.model.PostApiVisits201Response;
import org.openapitools.client.model.PostApiVisits400Response;
import org.openapitools.client.model.PostApiVisits401Response;
import org.openapitools.client.model.PostApiVisits500Response;
import org.openapitools.client.model.PostApiVisitsRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:58.235743643Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Get Client
     * This endpoint returns a single client.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientId Client ID (required)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ClientsGetSingle200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsGetSingle200Response clientsGetSingle(LocalDate xAxisCareApiVersion, Integer clientId, String requestedSensitiveFields) throws RestClientException {
        return clientsGetSingleWithHttpInfo(xAxisCareApiVersion, clientId, requestedSensitiveFields).getBody();
    }

    /**
     * Get Client
     * This endpoint returns a single client.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientId Client ID (required)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ResponseEntity&lt;ClientsGetSingle200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsGetSingle200Response> clientsGetSingleWithHttpInfo(LocalDate xAxisCareApiVersion, Integer clientId, String requestedSensitiveFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling clientsGetSingle");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling clientsGetSingle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("clientId", clientId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiveFields", requestedSensitiveFields));
        

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<ClientsGetSingle200Response> localReturnType = new ParameterizedTypeReference<ClientsGetSingle200Response>() {};
        return apiClient.invokeAPI("/api/clients/{clientId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Clients
     * This endpoint allows you to list clients and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so client must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;clientIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientIds Comma-delimited string of client IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter client result set (optional)
     * @param regionIds Comma-delimited string of region IDs to filter client result set (optional)
     * @param regionNames Comma-delimited string of region names to filter client result set (optional)
     * @param classCodes Comma-delimited string of class codes to filter client result set (optional)
     * @param classLabels Comma-delimited string of class labels to filter client result set (optional)
     * @param adminIds Comma-delimited string of administrator IDs to filter client result set (optional)
     * @param externalIds Comma-delimited string of external IDs to filter client result set (optional)
     * @param adminUsernames Comma-delimited string of administrator usernames to filter client result set (optional)
     * @param startAfterId Used in pagination to specify the client ID after which to start the next page (optional)
     * @param limit Limit the number of clients returned (optional, default to 100)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ClientsList200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsList200Response clientsList(LocalDate xAxisCareApiVersion, String clientIds, String statuses, String regionIds, String regionNames, String classCodes, String classLabels, String adminIds, String externalIds, String adminUsernames, Integer startAfterId, Integer limit, String requestedSensitiveFields) throws RestClientException {
        return clientsListWithHttpInfo(xAxisCareApiVersion, clientIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, externalIds, adminUsernames, startAfterId, limit, requestedSensitiveFields).getBody();
    }

    /**
     * List Clients
     * This endpoint allows you to list clients and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so client must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;clientIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, client SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientIds Comma-delimited string of client IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter client result set (optional)
     * @param regionIds Comma-delimited string of region IDs to filter client result set (optional)
     * @param regionNames Comma-delimited string of region names to filter client result set (optional)
     * @param classCodes Comma-delimited string of class codes to filter client result set (optional)
     * @param classLabels Comma-delimited string of class labels to filter client result set (optional)
     * @param adminIds Comma-delimited string of administrator IDs to filter client result set (optional)
     * @param externalIds Comma-delimited string of external IDs to filter client result set (optional)
     * @param adminUsernames Comma-delimited string of administrator usernames to filter client result set (optional)
     * @param startAfterId Used in pagination to specify the client ID after which to start the next page (optional)
     * @param limit Limit the number of clients returned (optional, default to 100)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ResponseEntity&lt;ClientsList200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsList200Response> clientsListWithHttpInfo(LocalDate xAxisCareApiVersion, String clientIds, String statuses, String regionIds, String regionNames, String classCodes, String classLabels, String adminIds, String externalIds, String adminUsernames, Integer startAfterId, Integer limit, String requestedSensitiveFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling clientsList");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientIds", clientIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "statuses", statuses));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionIds", regionIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionNames", regionNames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "classCodes", classCodes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "classLabels", classLabels));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "adminIds", adminIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalIds", externalIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "adminUsernames", adminUsernames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAfterId", startAfterId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiveFields", requestedSensitiveFields));
        

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<ClientsList200Response> localReturnType = new ParameterizedTypeReference<ClientsList200Response>() {};
        return apiClient.invokeAPI("/api/clients", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Applicant
     * This endpoint returns a single applicant.  By default, applicant SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * @param applicantId  (required)
     * @param xAxisCareApiVersion API version (optional)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return GetApiApplicantApplicantId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApiApplicantApplicantId200Response getApiApplicantApplicantId(String applicantId, String xAxisCareApiVersion, String requestedSensitiveFields) throws RestClientException {
        return getApiApplicantApplicantIdWithHttpInfo(applicantId, xAxisCareApiVersion, requestedSensitiveFields).getBody();
    }

    /**
     * Get Applicant
     * This endpoint returns a single applicant.  By default, applicant SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * @param applicantId  (required)
     * @param xAxisCareApiVersion API version (optional)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ResponseEntity&lt;GetApiApplicantApplicantId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApiApplicantApplicantId200Response> getApiApplicantApplicantIdWithHttpInfo(String applicantId, String xAxisCareApiVersion, String requestedSensitiveFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'applicantId' is set
        if (applicantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicantId' when calling getApiApplicantApplicantId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("applicantId", applicantId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiveFields", requestedSensitiveFields));
        

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetApiApplicantApplicantId200Response> localReturnType = new ParameterizedTypeReference<GetApiApplicantApplicantId200Response>() {};
        return apiClient.invokeAPI("/api/applicants/{applicantId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Applicants
     * This endpoint allows you to list applicants and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so applicants must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;applicantIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some applicants are not found by ID, there is a property called &#x60;applicantsNotFound&#x60; that contains an array of the not found IDs.
     * <p><b>200</b> - OK
     * <p><b>207</b> - Multi-Status (WebDAV)
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param applicantIds Comma-delimited string of applicant IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter applicants result set (optional)
     * @param requestedSensitiverFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @param startAfterId Used in pagination to specify the applicant ID after which to start the next page (optional)
     * @param xAxiscareApiVersion API version (optional)
     * @return GetApiApplicants200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApiApplicants200Response getApiApplicants(String applicantIds, String statuses, String requestedSensitiverFields, String startAfterId, String xAxiscareApiVersion) throws RestClientException {
        return getApiApplicantsWithHttpInfo(applicantIds, statuses, requestedSensitiverFields, startAfterId, xAxiscareApiVersion).getBody();
    }

    /**
     * List Applicants
     * This endpoint allows you to list applicants and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so applicants must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;applicantIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some applicants are not found by ID, there is a property called &#x60;applicantsNotFound&#x60; that contains an array of the not found IDs.
     * <p><b>200</b> - OK
     * <p><b>207</b> - Multi-Status (WebDAV)
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param applicantIds Comma-delimited string of applicant IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter applicants result set (optional)
     * @param requestedSensitiverFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @param startAfterId Used in pagination to specify the applicant ID after which to start the next page (optional)
     * @param xAxiscareApiVersion API version (optional)
     * @return ResponseEntity&lt;GetApiApplicants200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApiApplicants200Response> getApiApplicantsWithHttpInfo(String applicantIds, String statuses, String requestedSensitiverFields, String startAfterId, String xAxiscareApiVersion) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "applicantIds", applicantIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "statuses", statuses));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiverFields", requestedSensitiverFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAfterId", startAfterId));
        

        if (xAxiscareApiVersion != null)
        localVarHeaderParams.add("X-Axiscare-Api-Version", apiClient.parameterToString(xAxiscareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetApiApplicants200Response> localReturnType = new ParameterizedTypeReference<GetApiApplicants200Response>() {};
        return apiClient.invokeAPI("/api/applicants", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Caregivers
     * This endpoint allows you to list caregivers and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so caregivers must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;caregiverIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some caregivers are not found by ID, there is a property called &#x60;caregiversNotFound&#x60; that contains an array of the not found IDs.
     * <p><b>200</b> - OK
     * <p><b>207</b> - Multi-Status (WebDAV)
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param xAxiscareApiVersion API version (required)
     * @param caregiverIds Comma-delimited string of caregiver IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter caregiver result set (optional)
     * @param regionIds Comma-delimited string of region IDs to filter caregiver result set (optional)
     * @param regionNames Comma-delimited string of region names to filter caregiver result set (optional)
     * @param classCodes Comma-delimited string of class codes to filter caregiver result set (optional)
     * @param classLabels Comma-delimited string of class labels to filter caregiver result set (optional)
     * @param adminIds Comma-delimited string of administrator IDs to filter caregiver result set (optional)
     * @param adminUsernames Comma-delimited string of administrator usernames to filter caregiver result set (optional)
     * @param startAfterId Used in pagination to specify the caregiver ID after which to start the next page (optional)
     * @param limit Limit the number of caregiver returned (optional)
     * @param requestedSensitiverFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return GetApiCaregivers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApiCaregivers200Response getApiCaregivers(LocalDate xAxiscareApiVersion, String caregiverIds, String statuses, String regionIds, String regionNames, String classCodes, String classLabels, String adminIds, String adminUsernames, String startAfterId, String limit, String requestedSensitiverFields) throws RestClientException {
        return getApiCaregiversWithHttpInfo(xAxiscareApiVersion, caregiverIds, statuses, regionIds, regionNames, classCodes, classLabels, adminIds, adminUsernames, startAfterId, limit, requestedSensitiverFields).getBody();
    }

    /**
     * List Caregivers
     * This endpoint allows you to list caregivers and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so caregivers must match all the requested filters in order to be returned, unless explicitly asked for via the &#x60;caregiverIds&#x60; parameter.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.  In the case that some caregivers are not found by ID, there is a property called &#x60;caregiversNotFound&#x60; that contains an array of the not found IDs.
     * <p><b>200</b> - OK
     * <p><b>207</b> - Multi-Status (WebDAV)
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param xAxiscareApiVersion API version (required)
     * @param caregiverIds Comma-delimited string of caregiver IDs to return (optional)
     * @param statuses Comma-delimited string of statuses to filter caregiver result set (optional)
     * @param regionIds Comma-delimited string of region IDs to filter caregiver result set (optional)
     * @param regionNames Comma-delimited string of region names to filter caregiver result set (optional)
     * @param classCodes Comma-delimited string of class codes to filter caregiver result set (optional)
     * @param classLabels Comma-delimited string of class labels to filter caregiver result set (optional)
     * @param adminIds Comma-delimited string of administrator IDs to filter caregiver result set (optional)
     * @param adminUsernames Comma-delimited string of administrator usernames to filter caregiver result set (optional)
     * @param startAfterId Used in pagination to specify the caregiver ID after which to start the next page (optional)
     * @param limit Limit the number of caregiver returned (optional)
     * @param requestedSensitiverFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ResponseEntity&lt;GetApiCaregivers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApiCaregivers200Response> getApiCaregiversWithHttpInfo(LocalDate xAxiscareApiVersion, String caregiverIds, String statuses, String regionIds, String regionNames, String classCodes, String classLabels, String adminIds, String adminUsernames, String startAfterId, String limit, String requestedSensitiverFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xAxiscareApiVersion' is set
        if (xAxiscareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxiscareApiVersion' when calling getApiCaregivers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverIds", caregiverIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "statuses", statuses));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionIds", regionIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionNames", regionNames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "classCodes", classCodes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "classLabels", classLabels));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "adminIds", adminIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "adminUsernames", adminUsernames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAfterId", startAfterId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiverFields", requestedSensitiverFields));
        

        if (xAxiscareApiVersion != null)
        localVarHeaderParams.add("X-Axiscare-Api-Version", apiClient.parameterToString(xAxiscareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetApiCaregivers200Response> localReturnType = new ParameterizedTypeReference<GetApiCaregivers200Response>() {};
        return apiClient.invokeAPI("/api/caregivers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Caregiver
     * This endpoint returns a single caregiver.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * @param xAxisCareApiVersion API version (required)
     * @param caregiverId Caregiver ID (required)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return GetApiCaregiversCaregiverId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApiCaregiversCaregiverId200Response getApiCaregiversCaregiverId(LocalDate xAxisCareApiVersion, Integer caregiverId, String requestedSensitiveFields) throws RestClientException {
        return getApiCaregiversCaregiverIdWithHttpInfo(xAxisCareApiVersion, caregiverId, requestedSensitiveFields).getBody();
    }

    /**
     * Get Caregiver
     * This endpoint returns a single caregiver.  By default, caregiver SSNs are excluded from the response unless both a) the token has permission to view sensitive client data and b) the SSN field was requested in the request via the &#x60;requestedSensitiveFields&#x60; parameter.
     * <p><b>200</b> - OK
     * @param xAxisCareApiVersion API version (required)
     * @param caregiverId Caregiver ID (required)
     * @param requestedSensitiveFields Comma-delimited string of names of sensitive fields to include in the payload (optional)
     * @return ResponseEntity&lt;GetApiCaregiversCaregiverId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApiCaregiversCaregiverId200Response> getApiCaregiversCaregiverIdWithHttpInfo(LocalDate xAxisCareApiVersion, Integer caregiverId, String requestedSensitiveFields) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling getApiCaregiversCaregiverId");
        }
        
        // verify the required parameter 'caregiverId' is set
        if (caregiverId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'caregiverId' when calling getApiCaregiversCaregiverId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("caregiverId", caregiverId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestedSensitiveFields", requestedSensitiveFields));
        

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetApiCaregiversCaregiverId200Response> localReturnType = new ParameterizedTypeReference<GetApiCaregiversCaregiverId200Response>() {};
        return apiClient.invokeAPI("/api/caregivers/{caregiverId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Visits
     * This endpoint allows you to list visits and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so the visit must match all the requested filters in order to be returned.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Invalid Input
     * <p><b>500</b> - Internal Server Error
     * @param xAxisCareApiVersion API Version (required)
     * @param clientIds Comma-delimited string of client IDs to filter visit result set (optional)
     * @param clientClassCodes Comma-delimited string of client class codes to filter visit result set (optional)
     * @param clientClassLabels Comma-delimited string of client class labels to filter visit result set (optional)
     * @param clientAdminIds Comma-delimited string of client administrator IDs to filter visit result set (optional)
     * @param caregiverIds Comma-delimited string of caregiver IDs to filter visit result set (optional)
     * @param caregiverClassCodes Comma-delimited string of caregiver class codes to filter visit result set (optional)
     * @param caregiverClassLabels Comma-delimited string of caregiver class labels to filter visit result set (optional)
     * @param caregiverAdminIds Comma-delimited string of caregiver administrator IDs to filter visit result set (optional)
     * @param caregiverAdminUsernames Comma-delimited string of caregiver administrator usernames to filter visit result set (optional)
     * @param regionIds Comma-delimited string of client region IDs to filter visit result set (optional)
     * @param regionNames Comma-delimited string of client region names to filter visit result set (optional)
     * @param startDate Visit start date localized to visit timezone. Required if updatedSinceDate is not used (optional)
     * @param endDate Visit end date localized to visit timezone. Required if updatedSinceDate is not used (optional)
     * @param clientAdminUsernames Comma-delimited string of client administrator usernames to filter visit result set (optional)
     * @param verified Verification status of visits, all visits returned by default (optional)
     * @param updatedSinceDate UTC date to return visits which have been updated since said date (optional)
     * @param visitIds Comma-delimited string of visit IDs to filter visit result set. If this filter is provided, then no other filters can be used. (optional)
     * @return GetApiVisits200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApiVisits200Response getApiVisits(String xAxisCareApiVersion, String clientIds, String clientClassCodes, String clientClassLabels, String clientAdminIds, String caregiverIds, String caregiverClassCodes, String caregiverClassLabels, String caregiverAdminIds, String caregiverAdminUsernames, String regionIds, String regionNames, LocalDate startDate, LocalDate endDate, String clientAdminUsernames, Boolean verified, OffsetDateTime updatedSinceDate, String visitIds) throws RestClientException {
        return getApiVisitsWithHttpInfo(xAxisCareApiVersion, clientIds, clientClassCodes, clientClassLabels, clientAdminIds, caregiverIds, caregiverClassCodes, caregiverClassLabels, caregiverAdminIds, caregiverAdminUsernames, regionIds, regionNames, startDate, endDate, clientAdminUsernames, verified, updatedSinceDate, visitIds).getBody();
    }

    /**
     * List Visits
     * This endpoint allows you to list visits and filter them by various values. The filters work in an \&quot;AND\&quot; fashion, so the visit must match all the requested filters in order to be returned.  If more results match than what the endpoint is set to return, a URL to the next page of results will be provided in the response.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Invalid Input
     * <p><b>500</b> - Internal Server Error
     * @param xAxisCareApiVersion API Version (required)
     * @param clientIds Comma-delimited string of client IDs to filter visit result set (optional)
     * @param clientClassCodes Comma-delimited string of client class codes to filter visit result set (optional)
     * @param clientClassLabels Comma-delimited string of client class labels to filter visit result set (optional)
     * @param clientAdminIds Comma-delimited string of client administrator IDs to filter visit result set (optional)
     * @param caregiverIds Comma-delimited string of caregiver IDs to filter visit result set (optional)
     * @param caregiverClassCodes Comma-delimited string of caregiver class codes to filter visit result set (optional)
     * @param caregiverClassLabels Comma-delimited string of caregiver class labels to filter visit result set (optional)
     * @param caregiverAdminIds Comma-delimited string of caregiver administrator IDs to filter visit result set (optional)
     * @param caregiverAdminUsernames Comma-delimited string of caregiver administrator usernames to filter visit result set (optional)
     * @param regionIds Comma-delimited string of client region IDs to filter visit result set (optional)
     * @param regionNames Comma-delimited string of client region names to filter visit result set (optional)
     * @param startDate Visit start date localized to visit timezone. Required if updatedSinceDate is not used (optional)
     * @param endDate Visit end date localized to visit timezone. Required if updatedSinceDate is not used (optional)
     * @param clientAdminUsernames Comma-delimited string of client administrator usernames to filter visit result set (optional)
     * @param verified Verification status of visits, all visits returned by default (optional)
     * @param updatedSinceDate UTC date to return visits which have been updated since said date (optional)
     * @param visitIds Comma-delimited string of visit IDs to filter visit result set. If this filter is provided, then no other filters can be used. (optional)
     * @return ResponseEntity&lt;GetApiVisits200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApiVisits200Response> getApiVisitsWithHttpInfo(String xAxisCareApiVersion, String clientIds, String clientClassCodes, String clientClassLabels, String clientAdminIds, String caregiverIds, String caregiverClassCodes, String caregiverClassLabels, String caregiverAdminIds, String caregiverAdminUsernames, String regionIds, String regionNames, LocalDate startDate, LocalDate endDate, String clientAdminUsernames, Boolean verified, OffsetDateTime updatedSinceDate, String visitIds) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling getApiVisits");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientIds", clientIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientClassCodes", clientClassCodes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientClassLabels", clientClassLabels));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientAdminIds", clientAdminIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverIds", caregiverIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverClassCodes", caregiverClassCodes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverClassLabels", caregiverClassLabels));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverAdminIds", caregiverAdminIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caregiverAdminUsernames", caregiverAdminUsernames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionIds", regionIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionNames", regionNames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientAdminUsernames", clientAdminUsernames));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "verified", verified));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedSinceDate", updatedSinceDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "visitIds", visitIds));
        

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetApiVisits200Response> localReturnType = new ParameterizedTypeReference<GetApiVisits200Response>() {};
        return apiClient.invokeAPI("/api/visits", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Caregiver
     * This endpoint allows you to edit caregivers in AxisCare. You can supply a partial payload of only the keys you want to update.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Invalid Input
     * @param xAxisCareApiVersion API version (required)
     * @param caregiverId Caregiver ID (required)
     * @param patchApiCaregiversCaregiverIdRequest  (optional)
     * @return PatchApiCaregiversCaregiverId200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PatchApiCaregiversCaregiverId200Response patchApiCaregiversCaregiverId(LocalDate xAxisCareApiVersion, Integer caregiverId, PatchApiCaregiversCaregiverIdRequest patchApiCaregiversCaregiverIdRequest) throws RestClientException {
        return patchApiCaregiversCaregiverIdWithHttpInfo(xAxisCareApiVersion, caregiverId, patchApiCaregiversCaregiverIdRequest).getBody();
    }

    /**
     * Update Caregiver
     * This endpoint allows you to edit caregivers in AxisCare. You can supply a partial payload of only the keys you want to update.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Invalid Input
     * @param xAxisCareApiVersion API version (required)
     * @param caregiverId Caregiver ID (required)
     * @param patchApiCaregiversCaregiverIdRequest  (optional)
     * @return ResponseEntity&lt;PatchApiCaregiversCaregiverId200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PatchApiCaregiversCaregiverId200Response> patchApiCaregiversCaregiverIdWithHttpInfo(LocalDate xAxisCareApiVersion, Integer caregiverId, PatchApiCaregiversCaregiverIdRequest patchApiCaregiversCaregiverIdRequest) throws RestClientException {
        Object localVarPostBody = patchApiCaregiversCaregiverIdRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling patchApiCaregiversCaregiverId");
        }
        
        // verify the required parameter 'caregiverId' is set
        if (caregiverId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'caregiverId' when calling patchApiCaregiversCaregiverId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("caregiverId", caregiverId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PatchApiCaregiversCaregiverId200Response> localReturnType = new ParameterizedTypeReference<PatchApiCaregiversCaregiverId200Response>() {};
        return apiClient.invokeAPI("/api/caregivers/{caregiverId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Client
     * This endpoint allows you to edit clients in AxisCare. You can supply a partial payload of only the keys you want to update.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientId Client ID (required)
     * @param patchApiClientsRequest  (optional)
     * @return PatchApiClients200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PatchApiClients200Response patchApiClients(LocalDate xAxisCareApiVersion, Integer clientId, PatchApiClientsRequest patchApiClientsRequest) throws RestClientException {
        return patchApiClientsWithHttpInfo(xAxisCareApiVersion, clientId, patchApiClientsRequest).getBody();
    }

    /**
     * Update Client
     * This endpoint allows you to edit clients in AxisCare. You can supply a partial payload of only the keys you want to update.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param clientId Client ID (required)
     * @param patchApiClientsRequest  (optional)
     * @return ResponseEntity&lt;PatchApiClients200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PatchApiClients200Response> patchApiClientsWithHttpInfo(LocalDate xAxisCareApiVersion, Integer clientId, PatchApiClientsRequest patchApiClientsRequest) throws RestClientException {
        Object localVarPostBody = patchApiClientsRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling patchApiClients");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling patchApiClients");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("clientId", clientId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PatchApiClients200Response> localReturnType = new ParameterizedTypeReference<PatchApiClients200Response>() {};
        return apiClient.invokeAPI("/api/clients/{clientId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Visit
     * This endpoint allows you to modify an existing visit by its ID (e.g. &#x60;s&#x3D;222:d&#x3D;2024-03-04&#x60;). You can supply a partial payload of only the keys you want to update. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error.
     * @param xAxisCareApiVersion API version (required)
     * @param visitId  (required)
     * @param visitId2  (required)
     * @param patchApiVisitsVisitIdRequest  (optional)
     * @return PostApiVisits201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostApiVisits201Response patchApiVisitsVisitId(LocalDate xAxisCareApiVersion, String visitId, String visitId2, PatchApiVisitsVisitIdRequest patchApiVisitsVisitIdRequest) throws RestClientException {
        return patchApiVisitsVisitIdWithHttpInfo(xAxisCareApiVersion, visitId, visitId2, patchApiVisitsVisitIdRequest).getBody();
    }

    /**
     * Update Visit
     * This endpoint allows you to modify an existing visit by its ID (e.g. &#x60;s&#x3D;222:d&#x3D;2024-03-04&#x60;). You can supply a partial payload of only the keys you want to update. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error.
     * @param xAxisCareApiVersion API version (required)
     * @param visitId  (required)
     * @param visitId2  (required)
     * @param patchApiVisitsVisitIdRequest  (optional)
     * @return ResponseEntity&lt;PostApiVisits201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostApiVisits201Response> patchApiVisitsVisitIdWithHttpInfo(LocalDate xAxisCareApiVersion, String visitId, String visitId2, PatchApiVisitsVisitIdRequest patchApiVisitsVisitIdRequest) throws RestClientException {
        Object localVarPostBody = patchApiVisitsVisitIdRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling patchApiVisitsVisitId");
        }
        
        // verify the required parameter 'visitId' is set
        if (visitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitId' when calling patchApiVisitsVisitId");
        }
        
        // verify the required parameter 'visitId2' is set
        if (visitId2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitId2' when calling patchApiVisitsVisitId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("visitId", visitId);
        uriVariables.put("visitId", visitId2);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostApiVisits201Response> localReturnType = new ParameterizedTypeReference<PostApiVisits201Response>() {};
        return apiClient.invokeAPI("/api/visits/{visitId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add Caregiver
     * This endpoint allows you to add new caregivers to AxisCare. The minimum required information is a first name and last name, and a new caregiver will be created with an Active status.
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Invalid Input
     * @param xAxisCareApiVersion API version (required)
     * @param postApiCaregiversRequest  (optional)
     * @return PostApiCaregivers201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostApiCaregivers201Response postApiCaregivers(LocalDate xAxisCareApiVersion, PostApiCaregiversRequest postApiCaregiversRequest) throws RestClientException {
        return postApiCaregiversWithHttpInfo(xAxisCareApiVersion, postApiCaregiversRequest).getBody();
    }

    /**
     * Add Caregiver
     * This endpoint allows you to add new caregivers to AxisCare. The minimum required information is a first name and last name, and a new caregiver will be created with an Active status.
     * <p><b>201</b> - Created
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Invalid Input
     * @param xAxisCareApiVersion API version (required)
     * @param postApiCaregiversRequest  (optional)
     * @return ResponseEntity&lt;PostApiCaregivers201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostApiCaregivers201Response> postApiCaregiversWithHttpInfo(LocalDate xAxisCareApiVersion, PostApiCaregiversRequest postApiCaregiversRequest) throws RestClientException {
        Object localVarPostBody = postApiCaregiversRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling postApiCaregivers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostApiCaregivers201Response> localReturnType = new ParameterizedTypeReference<PostApiCaregivers201Response>() {};
        return apiClient.invokeAPI("/api/caregivers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add Client
     * This endpoint allows you to add new clients to AxisCare. The minimum required information is a first name and last name, and a new client will be created with an Active status.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param postApiClientsRequest  (optional)
     * @return PostApiClients200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostApiClients200Response postApiClients(LocalDate xAxisCareApiVersion, PostApiClientsRequest postApiClientsRequest) throws RestClientException {
        return postApiClientsWithHttpInfo(xAxisCareApiVersion, postApiClientsRequest).getBody();
    }

    /**
     * Add Client
     * This endpoint allows you to add new clients to AxisCare. The minimum required information is a first name and last name, and a new client will be created with an Active status.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param xAxisCareApiVersion API version (required)
     * @param postApiClientsRequest  (optional)
     * @return ResponseEntity&lt;PostApiClients200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostApiClients200Response> postApiClientsWithHttpInfo(LocalDate xAxisCareApiVersion, PostApiClientsRequest postApiClientsRequest) throws RestClientException {
        Object localVarPostBody = postApiClientsRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling postApiClients");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostApiClients200Response> localReturnType = new ParameterizedTypeReference<PostApiClients200Response>() {};
        return apiClient.invokeAPI("/api/clients", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add Visit
     * \&quot;This endpoint allows you to add a visit. The minimum required information is a client ID, a visit date, a start time, and an end time. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error.
     * @param xAxisCareApiVersion API version (required)
     * @param postApiVisitsRequest  (optional)
     * @return PostApiVisits201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostApiVisits201Response postApiVisits(LocalDate xAxisCareApiVersion, PostApiVisitsRequest postApiVisitsRequest) throws RestClientException {
        return postApiVisitsWithHttpInfo(xAxisCareApiVersion, postApiVisitsRequest).getBody();
    }

    /**
     * Add Visit
     * \&quot;This endpoint allows you to add a visit. The minimum required information is a client ID, a visit date, a start time, and an end time. You may specify *either* a service code *or* a description, but not both.  It also supports a custom billable rate property that you add to the request body:  &#x60;\&quot;billableRateMode\&quot;: \&quot;custom\&quot;&#x60;.    When using the custom billable mode, you will need to provide a &#x60;chargeRate&#x60;:  &#x60;\&quot;chargeRate\&quot;: 120.45&#x60;
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error  If attempting to to add a &#x60;chargeRate&#x60; and change the &#x60;billableRateMode&#x60;, and custom bill rate adjustments have not been enabled, you will get an error.
     * @param xAxisCareApiVersion API version (required)
     * @param postApiVisitsRequest  (optional)
     * @return ResponseEntity&lt;PostApiVisits201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostApiVisits201Response> postApiVisitsWithHttpInfo(LocalDate xAxisCareApiVersion, PostApiVisitsRequest postApiVisitsRequest) throws RestClientException {
        Object localVarPostBody = postApiVisitsRequest;
        
        // verify the required parameter 'xAxisCareApiVersion' is set
        if (xAxisCareApiVersion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xAxisCareApiVersion' when calling postApiVisits");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xAxisCareApiVersion != null)
        localVarHeaderParams.add("X-AxisCare-Api-Version", apiClient.parameterToString(xAxisCareApiVersion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostApiVisits201Response> localReturnType = new ParameterizedTypeReference<PostApiVisits201Response>() {};
        return apiClient.invokeAPI("/api/visits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
