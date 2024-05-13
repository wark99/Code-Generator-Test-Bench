package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.JobIdGet200Response;
import org.openapitools.client.model.JobIdGet401Response;
import org.openapitools.client.model.JobIdGet404Response;
import org.openapitools.client.model.JobIdGet500Response;
import org.openapitools.client.model.JobIdGet504Response;
import org.openapitools.client.model.ModelObject;
import org.openapitools.client.model.ObjectUrlPost400Response;
import org.openapitools.client.model.Query;
import org.openapitools.client.model.QueryNamespaceTableTableDataPost400Response;
import org.openapitools.client.model.ResourceResult;
import org.openapitools.client.model.TableJob;
import org.openapitools.client.model.TableList;
import org.openapitools.client.model.VersionedSchema;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:10.693828204Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiApi {
    private ApiClient apiClient;

    public ApiApi() {
        this(new ApiClient());
    }

    public ApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns status information about a job.
     * Jobs (and all objects they created) are deleted 24 hours after the job was started. Deleted jobs are no longer returned by this endpoint.
     * <p><b>200</b> - A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure.
     * <p><b>202</b> - A data access job in progress.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The job does not exist or has expired.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param id Unique identifier returned when the job was started by querying data. (required)
     * @return JobIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobIdGet200Response jobIdGet(String id) throws RestClientException {
        return jobIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Returns status information about a job.
     * Jobs (and all objects they created) are deleted 24 hours after the job was started. Deleted jobs are no longer returned by this endpoint.
     * <p><b>200</b> - A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure.
     * <p><b>202</b> - A data access job in progress.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The job does not exist or has expired.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param id Unique identifier returned when the job was started by querying data. (required)
     * @return ResponseEntity&lt;JobIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobIdGet200Response> jobIdGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "Default" };

        ParameterizedTypeReference<JobIdGet200Response> localReturnType = new ParameterizedTypeReference<JobIdGet200Response>() {};
        return apiClient.invokeAPI("/job/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Produces a list of pre-signed URLs for a list of objects.
     * In contrast to objects, which have a longer lifetime, pre-signed URLs are valid for a shorter duration, typically 15 minutes.  File paths returned by this endpoint do not adhere to any specification. While they may contain auxiliary information such as job ID or part counter, these are only informative. Downstream systems should not depend on any specific patterns of file names, or make any assumptions how much data each file contains.
     * <p><b>200</b> - A list of pre-signed URLs.
     * <p><b>400</b> - The input is malformed.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - Objects do not exist or have expired.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param modelObject  (required)
     * @return ResourceResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceResult objectUrlPost(List<ModelObject> modelObject) throws RestClientException {
        return objectUrlPostWithHttpInfo(modelObject).getBody();
    }

    /**
     * Produces a list of pre-signed URLs for a list of objects.
     * In contrast to objects, which have a longer lifetime, pre-signed URLs are valid for a shorter duration, typically 15 minutes.  File paths returned by this endpoint do not adhere to any specification. While they may contain auxiliary information such as job ID or part counter, these are only informative. Downstream systems should not depend on any specific patterns of file names, or make any assumptions how much data each file contains.
     * <p><b>200</b> - A list of pre-signed URLs.
     * <p><b>400</b> - The input is malformed.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - Objects do not exist or have expired.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param modelObject  (required)
     * @return ResponseEntity&lt;ResourceResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceResult> objectUrlPostWithHttpInfo(List<ModelObject> modelObject) throws RestClientException {
        Object localVarPostBody = modelObject;
        
        // verify the required parameter 'modelObject' is set
        if (modelObject == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelObject' when calling objectUrlPost");
        }
        

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

        String[] localVarAuthNames = new String[] { "Default" };

        ParameterizedTypeReference<ResourceResult> localReturnType = new ParameterizedTypeReference<ResourceResult>() {};
        return apiClient.invokeAPI("/object/url", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a list of table names that exist in the given scope (e.g. organization domain).
     * If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.
     * <p><b>200</b> - A list of tables in the given scope.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return TableList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TableList queryNamespaceTableGet(String namespace, String scope) throws RestClientException {
        return queryNamespaceTableGetWithHttpInfo(namespace, scope).getBody();
    }

    /**
     * Returns a list of table names that exist in the given scope (e.g. organization domain).
     * If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.
     * <p><b>200</b> - A list of tables in the given scope.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return ResponseEntity&lt;TableList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TableList> queryNamespaceTableGetWithHttpInfo(String namespace, String scope) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespace' when calling queryNamespaceTableGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("namespace", namespace);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Default" };

        ParameterizedTypeReference<TableList> localReturnType = new ParameterizedTypeReference<TableList>() {};
        return apiClient.invokeAPI("/query/{namespace}/table", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Queries a table for data.
     * This is an asynchronous operation. Calling this endpoint will start a new job and return immediately with status information. However, the operation will continue running on the server. The caller can poll the status of the job to find out when it is ready.  If a job with the same query parameters already exists, its details are returned rather than starting a new job.  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.  For incremental queries, the output uses a special metadata field called &#x60;action&#x60; to identify whether a record is *upserted* (inserted or updated) or *(hard) deleted* (&#x60;U&#x60; corresponds to upsert, and &#x60;D&#x60; to delete): &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; Upserted records have the primary key fields present in the sub-object &#x60;key&#x60; and all other data fields in the sub-object &#x60;value&#x60;. Deleted records only have the primary key fields in the &#x60;key&#x60; property, and lack the &#x60;value&#x60; property.  Hard deletes are infrequent. They only take place when a record is irreversibly deleted from the source database, e.g. to comply with privacy or legal requirements.  In most cases, records are *soft-deleted*, i.e. they are updated in such a way as to be understood *deleted* or *inactive* though the record is retained in the database, e.g. by setting a &#x60;workflow_state&#x60; column to the value &#x60;inactive&#x60; or &#x60;deleted&#x60;. In this context, soft deletes are equivalent to an update, and are denoted with a &#x60;U&#x60;, and all field values are included in the output.  In the rare event that inserting a record is quickly followed by a hard delete in the source database between two successive incremental queries, a record might appear with a new (so far unseen) &#x60;key&#x60;, no &#x60;value&#x60; and an &#x60;action&#x60; of &#x60;D&#x60;.  For snapshot queries, deleted records are not included in the output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } &#x60;&#x60;&#x60;  This is a rate-limited endpoint. If excessive data volume is requested repeatedly using this endpoint (e.g. a full snapshot every hour), future requests may be denied. We encourage making use of incremental queries, which substantially reduce the amount of data returned.
     * <p><b>200</b> - A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure.
     * <p><b>202</b> - A data access job in progress.
     * <p><b>400</b> - The input is malformed. **OR** There is no data in the requested range. **OR** Raised when data is queried outside of the allowed time range, and the table was reloaded recently.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace or table does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param table Canonical name of the table whose data to return. (required)
     * @param query  (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return JobIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobIdGet200Response queryNamespaceTableTableDataPost(String namespace, String table, Query query, String scope) throws RestClientException {
        return queryNamespaceTableTableDataPostWithHttpInfo(namespace, table, query, scope).getBody();
    }

    /**
     * Queries a table for data.
     * This is an asynchronous operation. Calling this endpoint will start a new job and return immediately with status information. However, the operation will continue running on the server. The caller can poll the status of the job to find out when it is ready.  If a job with the same query parameters already exists, its details are returned rather than starting a new job.  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.  For incremental queries, the output uses a special metadata field called &#x60;action&#x60; to identify whether a record is *upserted* (inserted or updated) or *(hard) deleted* (&#x60;U&#x60; corresponds to upsert, and &#x60;D&#x60; to delete): &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; Upserted records have the primary key fields present in the sub-object &#x60;key&#x60; and all other data fields in the sub-object &#x60;value&#x60;. Deleted records only have the primary key fields in the &#x60;key&#x60; property, and lack the &#x60;value&#x60; property.  Hard deletes are infrequent. They only take place when a record is irreversibly deleted from the source database, e.g. to comply with privacy or legal requirements.  In most cases, records are *soft-deleted*, i.e. they are updated in such a way as to be understood *deleted* or *inactive* though the record is retained in the database, e.g. by setting a &#x60;workflow_state&#x60; column to the value &#x60;inactive&#x60; or &#x60;deleted&#x60;. In this context, soft deletes are equivalent to an update, and are denoted with a &#x60;U&#x60;, and all field values are included in the output.  In the rare event that inserting a record is quickly followed by a hard delete in the source database between two successive incremental queries, a record might appear with a new (so far unseen) &#x60;key&#x60;, no &#x60;value&#x60; and an &#x60;action&#x60; of &#x60;D&#x60;.  For snapshot queries, deleted records are not included in the output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } &#x60;&#x60;&#x60;  This is a rate-limited endpoint. If excessive data volume is requested repeatedly using this endpoint (e.g. a full snapshot every hour), future requests may be denied. We encourage making use of incremental queries, which substantially reduce the amount of data returned.
     * <p><b>200</b> - A snapshot query that has completed with success. **OR** An incremental query that has completed with success. **OR** A data access job that has terminated with failure.
     * <p><b>202</b> - A data access job in progress.
     * <p><b>400</b> - The input is malformed. **OR** There is no data in the requested range. **OR** Raised when data is queried outside of the allowed time range, and the table was reloaded recently.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace or table does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param table Canonical name of the table whose data to return. (required)
     * @param query  (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return ResponseEntity&lt;JobIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobIdGet200Response> queryNamespaceTableTableDataPostWithHttpInfo(String namespace, String table, Query query, String scope) throws RestClientException {
        Object localVarPostBody = query;
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespace' when calling queryNamespaceTableTableDataPost");
        }
        
        // verify the required parameter 'table' is set
        if (table == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'table' when calling queryNamespaceTableTableDataPost");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'query' when calling queryNamespaceTableTableDataPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("namespace", namespace);
        uriVariables.put("table", table);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Default" };

        ParameterizedTypeReference<JobIdGet200Response> localReturnType = new ParameterizedTypeReference<JobIdGet200Response>() {};
        return apiClient.invokeAPI("/query/{namespace}/table/{table}/data", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns the JSON schema that records in the table conform to.
     * If data is returned in JSON Lines format (&#x60;*.jsonl&#x60;) then the schema applies to the JSON object obtained by combining the sub-objects accessed via the &#x60;key&#x60; and &#x60;value&#x60; properties, respectively, of JSON items.  Assume the schema reads as follows: &#x60;&#x60;&#x60;json {     \&quot;type\&quot;: \&quot;object\&quot;,     \&quot;properties\&quot;: {         \&quot;pkey\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;,             \&quot;format\&quot;: \&quot;int64\&quot;         },         \&quot;prop1\&quot;: {             \&quot;type\&quot;: \&quot;string\&quot;         },         \&quot;prop2\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;         },         \&quot;additionalProperties\&quot;: false,         \&quot;required\&quot;: [             \&quot;pkey\&quot;,             \&quot;prop1\&quot;         ]     } } &#x60;&#x60;&#x60;  Suppose we have the following JSON output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; In the example directly above, the first and second items (&#x60;update&#x60; records) would both validate against the pre-defined schema. The validator would check the following synthesized JSON objects: &#x60;&#x60;&#x60;json { \&quot;pkey\&quot;: 1, \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } { \&quot;pkey\&quot;: 2, \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } &#x60;&#x60;&#x60; The third item (a &#x60;delete&#x60; record) does not have to validate because it indicates that the client is to remove the item.  If data is returned in Comma-Separated Values format (&#x60;*.csv&#x60;) then the schema type constraints apply to CSV &#x60;key&#x60; and &#x60;value&#x60; columns, respectively, but not CSV &#x60;meta&#x60; columns. For example, assume we have the following CSV output: &#x60;&#x60;&#x60;csv meta.action,key.pkey,value.prop1,value.prop2 U,1,\&quot;value1\&quot;,42 U,2,\&quot;value2\&quot;, D,3,, &#x60;&#x60;&#x60; Then the schema would read the same as in the JSON example above.  Nested JSON objects are flattened to simple fields, with composite names constructed using the dot notation (&#x60;parent.child&#x60;).  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.
     * <p><b>200</b> - The versioned JSON schema specification for the table.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace or table does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param table Canonical name of the table whose schema to return. (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return VersionedSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VersionedSchema queryNamespaceTableTableSchemaGet(String namespace, String table, String scope) throws RestClientException {
        return queryNamespaceTableTableSchemaGetWithHttpInfo(namespace, table, scope).getBody();
    }

    /**
     * Returns the JSON schema that records in the table conform to.
     * If data is returned in JSON Lines format (&#x60;*.jsonl&#x60;) then the schema applies to the JSON object obtained by combining the sub-objects accessed via the &#x60;key&#x60; and &#x60;value&#x60; properties, respectively, of JSON items.  Assume the schema reads as follows: &#x60;&#x60;&#x60;json {     \&quot;type\&quot;: \&quot;object\&quot;,     \&quot;properties\&quot;: {         \&quot;pkey\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;,             \&quot;format\&quot;: \&quot;int64\&quot;         },         \&quot;prop1\&quot;: {             \&quot;type\&quot;: \&quot;string\&quot;         },         \&quot;prop2\&quot;: {             \&quot;type\&quot;: \&quot;integer\&quot;         },         \&quot;additionalProperties\&quot;: false,         \&quot;required\&quot;: [             \&quot;pkey\&quot;,             \&quot;prop1\&quot;         ]     } } &#x60;&#x60;&#x60;  Suppose we have the following JSON output: &#x60;&#x60;&#x60;json { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 1 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;U\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 2 }, \&quot;value\&quot;: { \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } } { \&quot;meta\&quot;: { \&quot;action\&quot;: \&quot;D\&quot;, ... }, \&quot;key\&quot;: { \&quot;pkey\&quot;: 3 } } &#x60;&#x60;&#x60; In the example directly above, the first and second items (&#x60;update&#x60; records) would both validate against the pre-defined schema. The validator would check the following synthesized JSON objects: &#x60;&#x60;&#x60;json { \&quot;pkey\&quot;: 1, \&quot;prop1\&quot;: \&quot;value1\&quot;, \&quot;prop2\&quot;: 42 } { \&quot;pkey\&quot;: 2, \&quot;prop1\&quot;: \&quot;value2\&quot;, \&quot;prop2\&quot;: null } &#x60;&#x60;&#x60; The third item (a &#x60;delete&#x60; record) does not have to validate because it indicates that the client is to remove the item.  If data is returned in Comma-Separated Values format (&#x60;*.csv&#x60;) then the schema type constraints apply to CSV &#x60;key&#x60; and &#x60;value&#x60; columns, respectively, but not CSV &#x60;meta&#x60; columns. For example, assume we have the following CSV output: &#x60;&#x60;&#x60;csv meta.action,key.pkey,value.prop1,value.prop2 U,1,\&quot;value1\&quot;,42 U,2,\&quot;value2\&quot;, D,3,, &#x60;&#x60;&#x60; Then the schema would read the same as in the JSON example above.  Nested JSON objects are flattened to simple fields, with composite names constructed using the dot notation (&#x60;parent.child&#x60;).  If no scope is specified, then the endpoint uses the default scope of the authenticated user. Returns an error if the user has access to several scopes and the scope is not explicitly specified.
     * <p><b>200</b> - The versioned JSON schema specification for the table.
     * <p><b>401</b> - Client lacks valid authentication credentials.
     * <p><b>404</b> - The namespace or table does not exist.
     * <p><b>500</b> - The requested account has not been onboarded yet. **OR** The requested account has been onboarded but client access has been restricted. **OR** Internal server error.
     * <p><b>504</b> - Gateway timeout error, usually should be handled with retry logic.
     * @param namespace Identifies the domain or product that the request pertains to, e.g. &#x60;canvas&#x60;. (required)
     * @param table Canonical name of the table whose schema to return. (required)
     * @param scope Identifies the scope to access, e.g. a root account UUID for Canvas, or a district ID for Mastery. (optional)
     * @return ResponseEntity&lt;VersionedSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VersionedSchema> queryNamespaceTableTableSchemaGetWithHttpInfo(String namespace, String table, String scope) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespace' when calling queryNamespaceTableTableSchemaGet");
        }
        
        // verify the required parameter 'table' is set
        if (table == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'table' when calling queryNamespaceTableTableSchemaGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("namespace", namespace);
        uriVariables.put("table", table);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Default" };

        ParameterizedTypeReference<VersionedSchema> localReturnType = new ParameterizedTypeReference<VersionedSchema>() {};
        return apiClient.invokeAPI("/query/{namespace}/table/{table}/schema", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
