package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Erreur;
import org.openapitools.client.model.NumeroOM;
import org.openapitools.client.model.NumeroOMEmail;
import org.openapitools.client.model.NumeroOMMotif;
import org.openapitools.client.model.OrdreMission;
import org.openapitools.client.model.PlanificationOM;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:49.756884279Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrdreDeMissionApi {
    private ApiClient apiClient;

    public OrdreDeMissionApi() {
        this(new ApiClient());
    }

    public OrdreDeMissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * &lt;strong&gt;Information sur l&#39;ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action permet de récupérer les informations sur l&#39;ordre de mission &lt;u&gt; &lt;li&gt;Informations générales de l&#39;ordre de mission&lt;/li&gt; &lt;li&gt;Informations sur le chantier à auditer&lt;/li&gt; &lt;li&gt;Informations sur l&#39;entreprise auditées&lt;/li&gt; &lt;/u&gt;
     * <p><b>200</b> - Information sur l&#39;ordre de mission demandé
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numéro Numéro de l&#39;ordre de mission (required)
     * @return OrdreMission
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrdreMission getOM(String numéro) throws RestClientException {
        return getOMWithHttpInfo(numéro).getBody();
    }

    /**
     * 
     * &lt;strong&gt;Information sur l&#39;ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action permet de récupérer les informations sur l&#39;ordre de mission &lt;u&gt; &lt;li&gt;Informations générales de l&#39;ordre de mission&lt;/li&gt; &lt;li&gt;Informations sur le chantier à auditer&lt;/li&gt; &lt;li&gt;Informations sur l&#39;entreprise auditées&lt;/li&gt; &lt;/u&gt;
     * <p><b>200</b> - Information sur l&#39;ordre de mission demandé
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numéro Numéro de l&#39;ordre de mission (required)
     * @return ResponseEntity&lt;OrdreMission&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrdreMission> getOMWithHttpInfo(String numéro) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'numéro' is set
        if (numéro == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numéro' when calling getOM");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("Numéro", numéro);

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<OrdreMission> localReturnType = new ParameterizedTypeReference<OrdreMission>() {};
        return apiClient.invokeAPI("/ordreMission/{Numéro}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Accepter un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOM  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMAcceptation(NumeroOM numeroOM) throws RestClientException {
        postOMAcceptationWithHttpInfo(numeroOM);
    }

    /**
     * 
     * &lt;strong&gt;Accepter un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOM  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMAcceptationWithHttpInfo(NumeroOM numeroOM) throws RestClientException {
        Object localVarPostBody = numeroOM;
        
        // verify the required parameter 'numeroOM' is set
        if (numeroOM == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numeroOM' when calling postOMAcceptation");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/accepter", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Annuler un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée à n&#39;importe quel moment dans la mesure ou la confirmation de réaliastion de l&#39;audit n&#39;a pas été éffectuée. (Etat de l&#39;ordre de mission différent de :[vEtatOrdreMissionAnnulé,vEtatOrdreMissionRefusé,vEtatOrdreMissionRécusé,vEtatOrdreMissionRapportARediger,vEtatOrdreMissionRapportAVerifier,vEtatOrdreMissionRapportEnVerification,vEtatOrdreMissionLevéeAVerifier,vEtatOrdreMissionLevéeEnVerification, vEtatOrdreMissionNCAttenteReponse, vEtatOrdreMissionNCAttenteLevées, vEtatOrdreMissionClôturé])
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMAnnuler(NumeroOMMotif numeroOMMotif) throws RestClientException {
        postOMAnnulerWithHttpInfo(numeroOMMotif);
    }

    /**
     * 
     * &lt;strong&gt;Annuler un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée à n&#39;importe quel moment dans la mesure ou la confirmation de réaliastion de l&#39;audit n&#39;a pas été éffectuée. (Etat de l&#39;ordre de mission différent de :[vEtatOrdreMissionAnnulé,vEtatOrdreMissionRefusé,vEtatOrdreMissionRécusé,vEtatOrdreMissionRapportARediger,vEtatOrdreMissionRapportAVerifier,vEtatOrdreMissionRapportEnVerification,vEtatOrdreMissionLevéeAVerifier,vEtatOrdreMissionLevéeEnVerification, vEtatOrdreMissionNCAttenteReponse, vEtatOrdreMissionNCAttenteLevées, vEtatOrdreMissionClôturé])
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMAnnulerWithHttpInfo(NumeroOMMotif numeroOMMotif) throws RestClientException {
        Object localVarPostBody = numeroOMMotif;
        
        // verify the required parameter 'numeroOMMotif' is set
        if (numeroOMMotif == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numeroOMMotif' when calling postOMAnnuler");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/annuler", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Associer un auditeur à un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditeurAAffecter, vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié].&lt;br&gt;&lt;br&gt;&lt;strong&gt;Attention&lt;/strong&gt;, pour les OM combinés, l&#39;auditeur affecté doit être le même.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMEmail  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMAuditeur(NumeroOMEmail numeroOMEmail) throws RestClientException {
        postOMAuditeurWithHttpInfo(numeroOMEmail);
    }

    /**
     * 
     * &lt;strong&gt;Associer un auditeur à un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditeurAAffecter, vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié].&lt;br&gt;&lt;br&gt;&lt;strong&gt;Attention&lt;/strong&gt;, pour les OM combinés, l&#39;auditeur affecté doit être le même.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMEmail  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMAuditeurWithHttpInfo(NumeroOMEmail numeroOMEmail) throws RestClientException {
        Object localVarPostBody = numeroOMEmail;
        
        // verify the required parameter 'numeroOMEmail' is set
        if (numeroOMEmail == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numeroOMEmail' when calling postOMAuditeur");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/auditeur", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Planifier un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié]. &lt;br&gt; L&#39;année de l&#39;audit ne peut pas être antérieure de plus de 3 ans.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param planificationOM  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMPlanifier(PlanificationOM planificationOM) throws RestClientException {
        postOMPlanifierWithHttpInfo(planificationOM);
    }

    /**
     * 
     * &lt;strong&gt;Planifier un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état [vEtatOrdreMissionAuditAPlanifié, vEtatOrdreMissionAuditPlanifié]. &lt;br&gt; L&#39;année de l&#39;audit ne peut pas être antérieure de plus de 3 ans.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param planificationOM  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMPlanifierWithHttpInfo(PlanificationOM planificationOM) throws RestClientException {
        Object localVarPostBody = planificationOM;
        
        // verify the required parameter 'planificationOM' is set
        if (planificationOM == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'planificationOM' when calling postOMPlanifier");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/planification", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Annuler la planification un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état \&quot;vEtatOrdreMissionAuditPlanifié\&quot;.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMPlanifierAnnuler(NumeroOMMotif numeroOMMotif) throws RestClientException {
        postOMPlanifierAnnulerWithHttpInfo(numeroOMMotif);
    }

    /**
     * 
     * &lt;strong&gt;Annuler la planification un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée  si l&#39;ordre de mission est dans l&#39;état \&quot;vEtatOrdreMissionAuditPlanifié\&quot;.
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMPlanifierAnnulerWithHttpInfo(NumeroOMMotif numeroOMMotif) throws RestClientException {
        Object localVarPostBody = numeroOMMotif;
        
        // verify the required parameter 'numeroOMMotif' is set
        if (numeroOMMotif == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numeroOMMotif' when calling postOMPlanifierAnnuler");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/planification/annuler", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * &lt;strong&gt;Refuser un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postOMRefus(NumeroOMMotif numeroOMMotif) throws RestClientException {
        postOMRefusWithHttpInfo(numeroOMMotif);
    }

    /**
     * 
     * &lt;strong&gt;Refuser un ordre de mission&lt;/strong&gt;&lt;br&gt; Cette action peut être réalisée si l&#39;état de l&#39;ordre de mission est \&quot;vEtatOrdreMissionEnAttenteAcceptation\&quot; voir schéma enumEtatOrdreMission
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>406</b>
     * <p><b>500</b>
     * @param numeroOMMotif  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postOMRefusWithHttpInfo(NumeroOMMotif numeroOMMotif) throws RestClientException {
        Object localVarPostBody = numeroOMMotif;
        
        // verify the required parameter 'numeroOMMotif' is set
        if (numeroOMMotif == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numeroOMMotif' when calling postOMRefus");
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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/ordreMission/refuser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
