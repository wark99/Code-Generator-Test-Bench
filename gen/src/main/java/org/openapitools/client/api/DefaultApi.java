package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AppraisalGet200Response;
import java.math.BigDecimal;
import org.openapitools.client.model.BuyerGet200Response;
import org.openapitools.client.model.CertificateGet200Response;
import org.openapitools.client.model.ContractorGet200Response;
import org.openapitools.client.model.CorrespondencePost200Response;
import org.openapitools.client.model.CorrespondencePostRequest;
import org.openapitools.client.model.EmployeeGet200Response;
import java.io.File;
import org.openapitools.client.model.InspectionAppointmentGet200Response;
import org.openapitools.client.model.InspectionReportGet200Response;
import org.openapitools.client.model.InspectionReportPost200Response;
import org.openapitools.client.model.InspectionReportPostRequest;
import org.openapitools.client.model.InventoryPropertyPropertyIdPost200Response;
import org.openapitools.client.model.InventoryPropertyPropertyIdPostRequest;
import org.openapitools.client.model.LandlordPotentialGet200Response;
import java.time.LocalDate;
import org.openapitools.client.model.MaintenanceGet200Response;
import org.openapitools.client.model.MaintenanceIdPut200Response;
import org.openapitools.client.model.MaintenanceIdPutRequest;
import org.openapitools.client.model.MaintenancePost200Response;
import org.openapitools.client.model.MaintenancePostRequest;
import org.openapitools.client.model.MaintenancePropertyPropertyIdPost200Response;
import org.openapitools.client.model.MaintenancePropertyPropertyIdPostRequest;
import org.openapitools.client.model.OfferAcceptedGet200Response;
import org.openapitools.client.model.OfferGet200Response;
import org.openapitools.client.model.OwnerGet200Response;
import org.openapitools.client.model.OwnerIdBankAccountGet200Response;
import org.openapitools.client.model.PropertyFeesGet200Response;
import org.openapitools.client.model.PropertyGet200Response;
import org.openapitools.client.model.PropertyIdInsuranceGet200Response;
import org.openapitools.client.model.PropertyIdLandlordStatementsGet200Response;
import org.openapitools.client.model.PropertyIdLedgerLandlordGet200Response;
import org.openapitools.client.model.PropertyIdMortgageGet200Response;
import org.openapitools.client.model.PropertyIdPaymentGet200Response;
import org.openapitools.client.model.PropertyIdRentLedgerGet200Response;
import org.openapitools.client.model.PropertyInvoiceOwnerBalancePost200Response;
import org.openapitools.client.model.PropertyInvoiceOwnerBalancePostRequest;
import org.openapitools.client.model.PropertyLeadPost200Response;
import org.openapitools.client.model.PropertyLeadPostRequest;
import org.openapitools.client.model.PropertyLettingsIdMarketingGet200Response;
import org.openapitools.client.model.PropertyNotesGet200Response;
import org.openapitools.client.model.PropertyPropertyIdInvoiceFilePost200Response;
import org.openapitools.client.model.PropertyPropertyIdMeterReadingPost200Response;
import org.openapitools.client.model.PropertyPropertyIdMeterReadingPostRequest;
import org.openapitools.client.model.PropertySalesIdMarketingGet200Response;
import org.openapitools.client.model.PropertySalesReportGet200Response;
import org.openapitools.client.model.PropertyStatusChangeGet200Response;
import org.openapitools.client.model.PropertyUtilitiesMovementTypeGet200Response;
import org.openapitools.client.model.ReferralMortgageCustomUpdatePost200Response;
import org.openapitools.client.model.ReferralMortgageCustomUpdatePostRequest;
import org.openapitools.client.model.TenantGet200Response;
import org.openapitools.client.model.TenantIdDetailsGet200Response;
import org.openapitools.client.model.TenantPotentialGet200Response;
import org.openapitools.client.model.ViewingGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * 
     * Get all appraisals with their details and linked properties
     * <p><b>200</b> - Get all appraisals with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param fromDate Filter results by initial meeting with a date on or after the date (optional)
     * @param toDate Filter results by initial meeting with a date on or before the date (optional)
     * @return AppraisalGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppraisalGet200Response appraisalGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        return appraisalGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo, fromDate, toDate).getBody();
    }

    /**
     * 
     * Get all appraisals with their details and linked properties
     * <p><b>200</b> - Get all appraisals with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param fromDate Filter results by initial meeting with a date on or after the date (optional)
     * @param toDate Filter results by initial meeting with a date on or before the date (optional)
     * @return ResponseEntity&lt;AppraisalGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppraisalGet200Response> appraisalGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from_date", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to_date", toDate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<AppraisalGet200Response> localReturnType = new ParameterizedTypeReference<AppraisalGet200Response>() {};
        return apiClient.invokeAPI("/appraisal", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all buyers that have at least one accepted offer on a property.
     * <p><b>200</b> - Get all buyers that have at least one accepted offer on a property.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return BuyerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BuyerGet200Response buyerGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return buyerGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all buyers that have at least one accepted offer on a property.
     * <p><b>200</b> - Get all buyers that have at least one accepted offer on a property.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;BuyerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BuyerGet200Response> buyerGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<BuyerGet200Response> localReturnType = new ParameterizedTypeReference<BuyerGet200Response>() {};
        return apiClient.invokeAPI("/buyer", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property.
     * <p><b>200</b> - Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return BuyerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BuyerGet200Response buyerPotentialGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return buyerPotentialGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property.
     * <p><b>200</b> - Get all potential buyers with their details. A potential buyer is a buyer that does not have an accepted offer on a property.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;BuyerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BuyerGet200Response> buyerPotentialGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<BuyerGet200Response> localReturnType = new ParameterizedTypeReference<BuyerGet200Response>() {};
        return apiClient.invokeAPI("/buyer/potential", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all certificates.
     * <p><b>200</b> - Get all certificates.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param expiryDateFrom Filter results by certificate expiry date with a date on or after the date (optional)
     * @param expiryDateTo Filter results by certificate expiry date with a date on or before the date (optional)
     * @param propertyId The property to filter results by (optional)
     * @return CertificateGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CertificateGet200Response certificateGet(Integer page, Integer pageSize, LocalDate expiryDateFrom, LocalDate expiryDateTo, Integer propertyId) throws RestClientException {
        return certificateGetWithHttpInfo(page, pageSize, expiryDateFrom, expiryDateTo, propertyId).getBody();
    }

    /**
     * 
     * Get all certificates.
     * <p><b>200</b> - Get all certificates.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param expiryDateFrom Filter results by certificate expiry date with a date on or after the date (optional)
     * @param expiryDateTo Filter results by certificate expiry date with a date on or before the date (optional)
     * @param propertyId The property to filter results by (optional)
     * @return ResponseEntity&lt;CertificateGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CertificateGet200Response> certificateGetWithHttpInfo(Integer page, Integer pageSize, LocalDate expiryDateFrom, LocalDate expiryDateTo, Integer propertyId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "expiry_date_from", expiryDateFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "expiry_date_to", expiryDateTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "property_id", propertyId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CertificateGet200Response> localReturnType = new ParameterizedTypeReference<CertificateGet200Response>() {};
        return apiClient.invokeAPI("/certificate", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all contractor with their details and linked services
     * <p><b>200</b> - Get all contractor with their details and linked services
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ContractorGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ContractorGet200Response contractorGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return contractorGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all contractor with their details and linked services
     * <p><b>200</b> - Get all contractor with their details and linked services
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;ContractorGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ContractorGet200Response> contractorGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ContractorGet200Response> localReturnType = new ParameterizedTypeReference<ContractorGet200Response>() {};
        return apiClient.invokeAPI("/contractor", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create correspondence record.
     * <p><b>200</b> - Create correspondence record.
     * @param correspondencePostRequest Create correspondence record. (optional)
     * @return CorrespondencePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorrespondencePost200Response correspondencePost(CorrespondencePostRequest correspondencePostRequest) throws RestClientException {
        return correspondencePostWithHttpInfo(correspondencePostRequest).getBody();
    }

    /**
     * 
     * Create correspondence record.
     * <p><b>200</b> - Create correspondence record.
     * @param correspondencePostRequest Create correspondence record. (optional)
     * @return ResponseEntity&lt;CorrespondencePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorrespondencePost200Response> correspondencePostWithHttpInfo(CorrespondencePostRequest correspondencePostRequest) throws RestClientException {
        Object localVarPostBody = correspondencePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CorrespondencePost200Response> localReturnType = new ParameterizedTypeReference<CorrespondencePost200Response>() {};
        return apiClient.invokeAPI("/correspondence", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all employees.
     * <p><b>200</b> - Get all employees.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @return EmployeeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmployeeGet200Response employeeGet(Integer page, Integer pageSize) throws RestClientException {
        return employeeGetWithHttpInfo(page, pageSize).getBody();
    }

    /**
     * 
     * Get all employees.
     * <p><b>200</b> - Get all employees.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @return ResponseEntity&lt;EmployeeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmployeeGet200Response> employeeGetWithHttpInfo(Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<EmployeeGet200Response> localReturnType = new ParameterizedTypeReference<EmployeeGet200Response>() {};
        return apiClient.invokeAPI("/employee", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all upcoming inspection appointments with their details
     * <p><b>200</b> - Get all upcoming inspection appointments with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return InspectionAppointmentGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InspectionAppointmentGet200Response inspectionAppointmentGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return inspectionAppointmentGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all upcoming inspection appointments with their details
     * <p><b>200</b> - Get all upcoming inspection appointments with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;InspectionAppointmentGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InspectionAppointmentGet200Response> inspectionAppointmentGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InspectionAppointmentGet200Response> localReturnType = new ParameterizedTypeReference<InspectionAppointmentGet200Response>() {};
        return apiClient.invokeAPI("/inspection/appointment", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all inspection reports with their details
     * <p><b>200</b> - Get all inspection reports with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return InspectionReportGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InspectionReportGet200Response inspectionReportGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return inspectionReportGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all inspection reports with their details
     * <p><b>200</b> - Get all inspection reports with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;InspectionReportGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InspectionReportGet200Response> inspectionReportGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InspectionReportGet200Response> localReturnType = new ParameterizedTypeReference<InspectionReportGet200Response>() {};
        return apiClient.invokeAPI("/inspection/report", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new inspection report
     * <p><b>200</b> - Create a new inspection report
     * @param inspectionReportPostRequest Create a new inspection report (optional)
     * @return InspectionReportPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InspectionReportPost200Response inspectionReportPost(InspectionReportPostRequest inspectionReportPostRequest) throws RestClientException {
        return inspectionReportPostWithHttpInfo(inspectionReportPostRequest).getBody();
    }

    /**
     * 
     * Create a new inspection report
     * <p><b>200</b> - Create a new inspection report
     * @param inspectionReportPostRequest Create a new inspection report (optional)
     * @return ResponseEntity&lt;InspectionReportPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InspectionReportPost200Response> inspectionReportPostWithHttpInfo(InspectionReportPostRequest inspectionReportPostRequest) throws RestClientException {
        Object localVarPostBody = inspectionReportPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InspectionReportPost200Response> localReturnType = new ParameterizedTypeReference<InspectionReportPost200Response>() {};
        return apiClient.invokeAPI("/inspection/report", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new inventory.
     * <p><b>200</b> - Create a new inventory.
     * @param propertyId ID of the property the new inventory should be assigned to. (required)
     * @param inventoryPropertyPropertyIdPostRequest Create a new inventory. (optional)
     * @return InventoryPropertyPropertyIdPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventoryPropertyPropertyIdPost200Response inventoryPropertyPropertyIdPost(Integer propertyId, InventoryPropertyPropertyIdPostRequest inventoryPropertyPropertyIdPostRequest) throws RestClientException {
        return inventoryPropertyPropertyIdPostWithHttpInfo(propertyId, inventoryPropertyPropertyIdPostRequest).getBody();
    }

    /**
     * 
     * Create a new inventory.
     * <p><b>200</b> - Create a new inventory.
     * @param propertyId ID of the property the new inventory should be assigned to. (required)
     * @param inventoryPropertyPropertyIdPostRequest Create a new inventory. (optional)
     * @return ResponseEntity&lt;InventoryPropertyPropertyIdPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InventoryPropertyPropertyIdPost200Response> inventoryPropertyPropertyIdPostWithHttpInfo(Integer propertyId, InventoryPropertyPropertyIdPostRequest inventoryPropertyPropertyIdPostRequest) throws RestClientException {
        Object localVarPostBody = inventoryPropertyPropertyIdPostRequest;
        
        // verify the required parameter 'propertyId' is set
        if (propertyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyId' when calling inventoryPropertyPropertyIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("property_id", propertyId);

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InventoryPropertyPropertyIdPost200Response> localReturnType = new ParameterizedTypeReference<InventoryPropertyPropertyIdPost200Response>() {};
        return apiClient.invokeAPI("/inventory/property/{property_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all potential landlords with their details
     * <p><b>200</b> - Get all potential landlords with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return LandlordPotentialGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LandlordPotentialGet200Response landlordPotentialGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return landlordPotentialGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all potential landlords with their details
     * <p><b>200</b> - Get all potential landlords with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;LandlordPotentialGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LandlordPotentialGet200Response> landlordPotentialGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<LandlordPotentialGet200Response> localReturnType = new ParameterizedTypeReference<LandlordPotentialGet200Response>() {};
        return apiClient.invokeAPI("/landlord/potential", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all maintenance reports with their details
     * <p><b>200</b> - Get all maintenance reports with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param closed Set this to 1 in order to only show closed items. If this param is not set then it will default to show items that are not closed. (optional)
     * @return MaintenanceGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceGet200Response maintenanceGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, BigDecimal closed) throws RestClientException {
        return maintenanceGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo, closed).getBody();
    }

    /**
     * 
     * Get all maintenance reports with their details
     * <p><b>200</b> - Get all maintenance reports with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param closed Set this to 1 in order to only show closed items. If this param is not set then it will default to show items that are not closed. (optional)
     * @return ResponseEntity&lt;MaintenanceGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceGet200Response> maintenanceGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, BigDecimal closed) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "closed", closed));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<MaintenanceGet200Response> localReturnType = new ParameterizedTypeReference<MaintenanceGet200Response>() {};
        return apiClient.invokeAPI("/maintenance", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Update an existing maintenance report.
     * <p><b>200</b> - Update an existing maintenance report.
     * @param id The id of the maintenance report record (required)
     * @param maintenanceIdPutRequest Update an existing maintenance report. (optional)
     * @return MaintenanceIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceIdPut200Response maintenanceIdPut(BigDecimal id, MaintenanceIdPutRequest maintenanceIdPutRequest) throws RestClientException {
        return maintenanceIdPutWithHttpInfo(id, maintenanceIdPutRequest).getBody();
    }

    /**
     * 
     * Update an existing maintenance report.
     * <p><b>200</b> - Update an existing maintenance report.
     * @param id The id of the maintenance report record (required)
     * @param maintenanceIdPutRequest Update an existing maintenance report. (optional)
     * @return ResponseEntity&lt;MaintenanceIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceIdPut200Response> maintenanceIdPutWithHttpInfo(BigDecimal id, MaintenanceIdPutRequest maintenanceIdPutRequest) throws RestClientException {
        Object localVarPostBody = maintenanceIdPutRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling maintenanceIdPut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<MaintenanceIdPut200Response> localReturnType = new ParameterizedTypeReference<MaintenanceIdPut200Response>() {};
        return apiClient.invokeAPI("/maintenance/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new holding maintenance report.
     * <p><b>200</b> - Create a new holding maintenance report.
     * @param maintenancePostRequest Create a new holding maintenance report. (optional)
     * @return MaintenancePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenancePost200Response maintenancePost(MaintenancePostRequest maintenancePostRequest) throws RestClientException {
        return maintenancePostWithHttpInfo(maintenancePostRequest).getBody();
    }

    /**
     * 
     * Create a new holding maintenance report.
     * <p><b>200</b> - Create a new holding maintenance report.
     * @param maintenancePostRequest Create a new holding maintenance report. (optional)
     * @return ResponseEntity&lt;MaintenancePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenancePost200Response> maintenancePostWithHttpInfo(MaintenancePostRequest maintenancePostRequest) throws RestClientException {
        Object localVarPostBody = maintenancePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<MaintenancePost200Response> localReturnType = new ParameterizedTypeReference<MaintenancePost200Response>() {};
        return apiClient.invokeAPI("/maintenance", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new maintenance report.
     * <p><b>200</b> - Create a new maintenance report.
     * @param propertyId ID of the property the new maintenance report should be assigned to. (required)
     * @param maintenancePropertyPropertyIdPostRequest Create a new maintenance report. (optional)
     * @return MaintenancePropertyPropertyIdPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenancePropertyPropertyIdPost200Response maintenancePropertyPropertyIdPost(Integer propertyId, MaintenancePropertyPropertyIdPostRequest maintenancePropertyPropertyIdPostRequest) throws RestClientException {
        return maintenancePropertyPropertyIdPostWithHttpInfo(propertyId, maintenancePropertyPropertyIdPostRequest).getBody();
    }

    /**
     * 
     * Create a new maintenance report.
     * <p><b>200</b> - Create a new maintenance report.
     * @param propertyId ID of the property the new maintenance report should be assigned to. (required)
     * @param maintenancePropertyPropertyIdPostRequest Create a new maintenance report. (optional)
     * @return ResponseEntity&lt;MaintenancePropertyPropertyIdPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenancePropertyPropertyIdPost200Response> maintenancePropertyPropertyIdPostWithHttpInfo(Integer propertyId, MaintenancePropertyPropertyIdPostRequest maintenancePropertyPropertyIdPostRequest) throws RestClientException {
        Object localVarPostBody = maintenancePropertyPropertyIdPostRequest;
        
        // verify the required parameter 'propertyId' is set
        if (propertyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyId' when calling maintenancePropertyPropertyIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("property_id", propertyId);

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<MaintenancePropertyPropertyIdPost200Response> localReturnType = new ParameterizedTypeReference<MaintenancePropertyPropertyIdPost200Response>() {};
        return apiClient.invokeAPI("/maintenance/property/{property_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all accepted offers.
     * <p><b>200</b> - Get all accepted offers.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param acceptedOfferFrom Filter the results on or after the offer accepted date (optional)
     * @param acceptedOfferTo Filter the results on or before the offer accepted date (optional)
     * @return OfferAcceptedGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OfferAcceptedGet200Response offerAcceptedGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate acceptedOfferFrom, LocalDate acceptedOfferTo) throws RestClientException {
        return offerAcceptedGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo, acceptedOfferFrom, acceptedOfferTo).getBody();
    }

    /**
     * 
     * Get all accepted offers.
     * <p><b>200</b> - Get all accepted offers.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param acceptedOfferFrom Filter the results on or after the offer accepted date (optional)
     * @param acceptedOfferTo Filter the results on or before the offer accepted date (optional)
     * @return ResponseEntity&lt;OfferAcceptedGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OfferAcceptedGet200Response> offerAcceptedGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate acceptedOfferFrom, LocalDate acceptedOfferTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "accepted_offer_from", acceptedOfferFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "accepted_offer_to", acceptedOfferTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<OfferAcceptedGet200Response> localReturnType = new ParameterizedTypeReference<OfferAcceptedGet200Response>() {};
        return apiClient.invokeAPI("/offer/accepted", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all offers.
     * <p><b>200</b> - Get all offers.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param offerFrom Filter the results on or after the offer date (optional)
     * @param offerTo Filter the results on or before the offer date (optional)
     * @return OfferGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OfferGet200Response offerGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate offerFrom, LocalDate offerTo) throws RestClientException {
        return offerGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo, offerFrom, offerTo).getBody();
    }

    /**
     * 
     * Get all offers.
     * <p><b>200</b> - Get all offers.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param offerFrom Filter the results on or after the offer date (optional)
     * @param offerTo Filter the results on or before the offer date (optional)
     * @return ResponseEntity&lt;OfferGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OfferGet200Response> offerGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, LocalDate offerFrom, LocalDate offerTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offer_from", offerFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offer_to", offerTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<OfferGet200Response> localReturnType = new ParameterizedTypeReference<OfferGet200Response>() {};
        return apiClient.invokeAPI("/offer", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all current owners with their details and linked properties
     * <p><b>200</b> - Get all current owners with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param propertyManagementType Filter results by the management type or property or linked properties (optional)
     * @return OwnerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OwnerGet200Response ownerGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, String propertyManagementType) throws RestClientException {
        return ownerGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo, propertyManagementType).getBody();
    }

    /**
     * 
     * Get all current owners with their details and linked properties
     * <p><b>200</b> - Get all current owners with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @param propertyManagementType Filter results by the management type or property or linked properties (optional)
     * @return ResponseEntity&lt;OwnerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OwnerGet200Response> ownerGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo, String propertyManagementType) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "property_management_type", propertyManagementType));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<OwnerGet200Response> localReturnType = new ParameterizedTypeReference<OwnerGet200Response>() {};
        return apiClient.invokeAPI("/owner", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get owner bank account details.
     * <p><b>200</b> - Get owner bank account details.
     * @param id Id of the record (required)
     * @return OwnerIdBankAccountGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OwnerIdBankAccountGet200Response ownerIdBankAccountGet(BigDecimal id) throws RestClientException {
        return ownerIdBankAccountGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get owner bank account details.
     * <p><b>200</b> - Get owner bank account details.
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;OwnerIdBankAccountGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OwnerIdBankAccountGet200Response> ownerIdBankAccountGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling ownerIdBankAccountGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<OwnerIdBankAccountGet200Response> localReturnType = new ParameterizedTypeReference<OwnerIdBankAccountGet200Response>() {};
        return apiClient.invokeAPI("/owner/{id}/bank-account", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show all property fees.
     * <p><b>200</b> - Show all property fees.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return PropertyFeesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyFeesGet200Response propertyFeesGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return propertyFeesGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Show all property fees.
     * <p><b>200</b> - Show all property fees.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;PropertyFeesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyFeesGet200Response> propertyFeesGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyFeesGet200Response> localReturnType = new ParameterizedTypeReference<PropertyFeesGet200Response>() {};
        return apiClient.invokeAPI("/property/fees", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all properties with their details
     * <p><b>200</b> - Get all properties with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return PropertyGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyGet200Response propertyGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return propertyGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all properties with their details
     * <p><b>200</b> - Get all properties with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;PropertyGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyGet200Response> propertyGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyGet200Response> localReturnType = new ParameterizedTypeReference<PropertyGet200Response>() {};
        return apiClient.invokeAPI("/property", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get property insurance details
     * <p><b>200</b> - Get property insurance details
     * @param id Id of the record (required)
     * @param fromDate Filter results with a date on or after the date (optional)
     * @param toDate Filter results with a date on or before the date (optional)
     * @return PropertyIdInsuranceGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdInsuranceGet200Response propertyIdInsuranceGet(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        return propertyIdInsuranceGetWithHttpInfo(id, fromDate, toDate).getBody();
    }

    /**
     * 
     * Get property insurance details
     * <p><b>200</b> - Get property insurance details
     * @param id Id of the record (required)
     * @param fromDate Filter results with a date on or after the date (optional)
     * @param toDate Filter results with a date on or before the date (optional)
     * @return ResponseEntity&lt;PropertyIdInsuranceGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdInsuranceGet200Response> propertyIdInsuranceGetWithHttpInfo(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdInsuranceGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from_date", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to_date", toDate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdInsuranceGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdInsuranceGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/insurance", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get landlord statement filenames for property
     * <p><b>200</b> - Get landlord statement filenames for property
     * @param id Id of the record (required)
     * @param fromDate Filter results with a date on or after the date (optional)
     * @param toDate Filter results with a date on or before the date (optional)
     * @return PropertyIdLandlordStatementsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdLandlordStatementsGet200Response propertyIdLandlordStatementsGet(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        return propertyIdLandlordStatementsGetWithHttpInfo(id, fromDate, toDate).getBody();
    }

    /**
     * 
     * Get landlord statement filenames for property
     * <p><b>200</b> - Get landlord statement filenames for property
     * @param id Id of the record (required)
     * @param fromDate Filter results with a date on or after the date (optional)
     * @param toDate Filter results with a date on or before the date (optional)
     * @return ResponseEntity&lt;PropertyIdLandlordStatementsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdLandlordStatementsGet200Response> propertyIdLandlordStatementsGetWithHttpInfo(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdLandlordStatementsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from_date", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to_date", toDate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdLandlordStatementsGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdLandlordStatementsGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/landlord-statements", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get landlord ledger by property ID with date range
     * <p><b>200</b> - Get landlord ledger by property ID with date range
     * @param id Id of the record (required)
     * @param startDate Start date of period (required)
     * @param endDate End date of period (required)
     * @return PropertyIdLedgerLandlordGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdLedgerLandlordGet200Response propertyIdLedgerLandlordGet(BigDecimal id, LocalDate startDate, LocalDate endDate) throws RestClientException {
        return propertyIdLedgerLandlordGetWithHttpInfo(id, startDate, endDate).getBody();
    }

    /**
     * 
     * Get landlord ledger by property ID with date range
     * <p><b>200</b> - Get landlord ledger by property ID with date range
     * @param id Id of the record (required)
     * @param startDate Start date of period (required)
     * @param endDate End date of period (required)
     * @return ResponseEntity&lt;PropertyIdLedgerLandlordGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdLedgerLandlordGet200Response> propertyIdLedgerLandlordGetWithHttpInfo(BigDecimal id, LocalDate startDate, LocalDate endDate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdLedgerLandlordGet");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling propertyIdLedgerLandlordGet");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling propertyIdLedgerLandlordGet");
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
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdLedgerLandlordGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdLedgerLandlordGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/ledger/landlord", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get property mortgage details
     * <p><b>200</b> - Get property mortgage details
     * @param id Id of the record (required)
     * @return PropertyIdMortgageGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdMortgageGet200Response propertyIdMortgageGet(BigDecimal id) throws RestClientException {
        return propertyIdMortgageGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get property mortgage details
     * <p><b>200</b> - Get property mortgage details
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;PropertyIdMortgageGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdMortgageGet200Response> propertyIdMortgageGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdMortgageGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdMortgageGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdMortgageGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/mortgage", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get payment details for property.
     * <p><b>200</b> - Get payment details for property.
     * @param id Id of the record (required)
     * @return PropertyIdPaymentGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdPaymentGet200Response propertyIdPaymentGet(BigDecimal id) throws RestClientException {
        return propertyIdPaymentGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get payment details for property.
     * <p><b>200</b> - Get payment details for property.
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;PropertyIdPaymentGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdPaymentGet200Response> propertyIdPaymentGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdPaymentGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdPaymentGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdPaymentGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/payment", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show property rent ledger
     * <p><b>200</b> - Show property rent ledger
     * @param id Id of the record (required)
     * @param fromDate Start date of period (optional)
     * @param toDate End date of period (optional)
     * @return PropertyIdRentLedgerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyIdRentLedgerGet200Response propertyIdRentLedgerGet(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        return propertyIdRentLedgerGetWithHttpInfo(id, fromDate, toDate).getBody();
    }

    /**
     * 
     * Show property rent ledger
     * <p><b>200</b> - Show property rent ledger
     * @param id Id of the record (required)
     * @param fromDate Start date of period (optional)
     * @param toDate End date of period (optional)
     * @return ResponseEntity&lt;PropertyIdRentLedgerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyIdRentLedgerGet200Response> propertyIdRentLedgerGetWithHttpInfo(BigDecimal id, LocalDate fromDate, LocalDate toDate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyIdRentLedgerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from_date", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to_date", toDate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyIdRentLedgerGet200Response> localReturnType = new ParameterizedTypeReference<PropertyIdRentLedgerGet200Response>() {};
        return apiClient.invokeAPI("/property/{id}/rent-ledger", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new invoice for the property owner
     * <p><b>200</b> - Create a new invoice for the property owner
     * @param propertyInvoiceOwnerBalancePostRequest Create a new invoice for the property owner (optional)
     * @return PropertyInvoiceOwnerBalancePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyInvoiceOwnerBalancePost200Response propertyInvoiceOwnerBalancePost(PropertyInvoiceOwnerBalancePostRequest propertyInvoiceOwnerBalancePostRequest) throws RestClientException {
        return propertyInvoiceOwnerBalancePostWithHttpInfo(propertyInvoiceOwnerBalancePostRequest).getBody();
    }

    /**
     * 
     * Create a new invoice for the property owner
     * <p><b>200</b> - Create a new invoice for the property owner
     * @param propertyInvoiceOwnerBalancePostRequest Create a new invoice for the property owner (optional)
     * @return ResponseEntity&lt;PropertyInvoiceOwnerBalancePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyInvoiceOwnerBalancePost200Response> propertyInvoiceOwnerBalancePostWithHttpInfo(PropertyInvoiceOwnerBalancePostRequest propertyInvoiceOwnerBalancePostRequest) throws RestClientException {
        Object localVarPostBody = propertyInvoiceOwnerBalancePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyInvoiceOwnerBalancePost200Response> localReturnType = new ParameterizedTypeReference<PropertyInvoiceOwnerBalancePost200Response>() {};
        return apiClient.invokeAPI("/property/invoice/owner/balance", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create a new lead for a property
     * <p><b>200</b> - Create a new lead for a property
     * @param propertyLeadPostRequest Create a new lead for a property (optional)
     * @return PropertyLeadPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyLeadPost200Response propertyLeadPost(PropertyLeadPostRequest propertyLeadPostRequest) throws RestClientException {
        return propertyLeadPostWithHttpInfo(propertyLeadPostRequest).getBody();
    }

    /**
     * 
     * Create a new lead for a property
     * <p><b>200</b> - Create a new lead for a property
     * @param propertyLeadPostRequest Create a new lead for a property (optional)
     * @return ResponseEntity&lt;PropertyLeadPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyLeadPost200Response> propertyLeadPostWithHttpInfo(PropertyLeadPostRequest propertyLeadPostRequest) throws RestClientException {
        Object localVarPostBody = propertyLeadPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyLeadPost200Response> localReturnType = new ParameterizedTypeReference<PropertyLeadPost200Response>() {};
        return apiClient.invokeAPI("/property/lead", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show lettings property marketing
     * <p><b>200</b> - Show lettings property marketing
     * @param id Id of the record (required)
     * @return PropertyLettingsIdMarketingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyLettingsIdMarketingGet200Response propertyLettingsIdMarketingGet(BigDecimal id) throws RestClientException {
        return propertyLettingsIdMarketingGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Show lettings property marketing
     * <p><b>200</b> - Show lettings property marketing
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;PropertyLettingsIdMarketingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyLettingsIdMarketingGet200Response> propertyLettingsIdMarketingGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertyLettingsIdMarketingGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyLettingsIdMarketingGet200Response> localReturnType = new ParameterizedTypeReference<PropertyLettingsIdMarketingGet200Response>() {};
        return apiClient.invokeAPI("/property/lettings/{id}/marketing", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all property notes.
     * <p><b>200</b> - Get all property notes.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param dateFrom Filter results with a date on or after the date (optional)
     * @param dateTo Filter results with a date on or before the date (optional)
     * @return PropertyNotesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyNotesGet200Response propertyNotesGet(Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo) throws RestClientException {
        return propertyNotesGetWithHttpInfo(page, pageSize, dateFrom, dateTo).getBody();
    }

    /**
     * 
     * Get all property notes.
     * <p><b>200</b> - Get all property notes.
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param dateFrom Filter results with a date on or after the date (optional)
     * @param dateTo Filter results with a date on or before the date (optional)
     * @return ResponseEntity&lt;PropertyNotesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyNotesGet200Response> propertyNotesGetWithHttpInfo(Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_from", dateFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_to", dateTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyNotesGet200Response> localReturnType = new ParameterizedTypeReference<PropertyNotesGet200Response>() {};
        return apiClient.invokeAPI("/property/notes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Upload an invoice file
     * <p><b>200</b> - Upload an invoice file
     * @param propertyId Id of the property (required)
     * @param reference Reference to be used on the file. This must contain letters, digits, underscores and dashes only. (optional)
     * @param body Allowed mime types: application/pdf, image/jpeg. Maximum size: 20MB (optional)
     * @return PropertyPropertyIdInvoiceFilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyPropertyIdInvoiceFilePost200Response propertyPropertyIdInvoiceFilePost(BigDecimal propertyId, String reference, File body) throws RestClientException {
        return propertyPropertyIdInvoiceFilePostWithHttpInfo(propertyId, reference, body).getBody();
    }

    /**
     * 
     * Upload an invoice file
     * <p><b>200</b> - Upload an invoice file
     * @param propertyId Id of the property (required)
     * @param reference Reference to be used on the file. This must contain letters, digits, underscores and dashes only. (optional)
     * @param body Allowed mime types: application/pdf, image/jpeg. Maximum size: 20MB (optional)
     * @return ResponseEntity&lt;PropertyPropertyIdInvoiceFilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyPropertyIdInvoiceFilePost200Response> propertyPropertyIdInvoiceFilePostWithHttpInfo(BigDecimal propertyId, String reference, File body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'propertyId' is set
        if (propertyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyId' when calling propertyPropertyIdInvoiceFilePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("property_id", propertyId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference", reference));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/octet-stream"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyPropertyIdInvoiceFilePost200Response> localReturnType = new ParameterizedTypeReference<PropertyPropertyIdInvoiceFilePost200Response>() {};
        return apiClient.invokeAPI("/property/{property_id}/invoice/file", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Create meter reading for a specific property.
     * <p><b>200</b> - Create meter reading for a specific property.
     * @param propertyId Id of the property (required)
     * @param propertyPropertyIdMeterReadingPostRequest Create meter reading for a specific property. (optional)
     * @return PropertyPropertyIdMeterReadingPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyPropertyIdMeterReadingPost200Response propertyPropertyIdMeterReadingPost(BigDecimal propertyId, PropertyPropertyIdMeterReadingPostRequest propertyPropertyIdMeterReadingPostRequest) throws RestClientException {
        return propertyPropertyIdMeterReadingPostWithHttpInfo(propertyId, propertyPropertyIdMeterReadingPostRequest).getBody();
    }

    /**
     * 
     * Create meter reading for a specific property.
     * <p><b>200</b> - Create meter reading for a specific property.
     * @param propertyId Id of the property (required)
     * @param propertyPropertyIdMeterReadingPostRequest Create meter reading for a specific property. (optional)
     * @return ResponseEntity&lt;PropertyPropertyIdMeterReadingPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyPropertyIdMeterReadingPost200Response> propertyPropertyIdMeterReadingPostWithHttpInfo(BigDecimal propertyId, PropertyPropertyIdMeterReadingPostRequest propertyPropertyIdMeterReadingPostRequest) throws RestClientException {
        Object localVarPostBody = propertyPropertyIdMeterReadingPostRequest;
        
        // verify the required parameter 'propertyId' is set
        if (propertyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyId' when calling propertyPropertyIdMeterReadingPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("property_id", propertyId);

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyPropertyIdMeterReadingPost200Response> localReturnType = new ParameterizedTypeReference<PropertyPropertyIdMeterReadingPost200Response>() {};
        return apiClient.invokeAPI("/property/{property_id}/meter-reading", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show sales property marketing
     * <p><b>200</b> - Show sales property marketing
     * @param id Id of the record (required)
     * @return PropertySalesIdMarketingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertySalesIdMarketingGet200Response propertySalesIdMarketingGet(BigDecimal id) throws RestClientException {
        return propertySalesIdMarketingGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Show sales property marketing
     * <p><b>200</b> - Show sales property marketing
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;PropertySalesIdMarketingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertySalesIdMarketingGet200Response> propertySalesIdMarketingGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling propertySalesIdMarketingGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertySalesIdMarketingGet200Response> localReturnType = new ParameterizedTypeReference<PropertySalesIdMarketingGet200Response>() {};
        return apiClient.invokeAPI("/property/sales/{id}/marketing", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show sales report by date range
     * <p><b>200</b> - Show sales report by date range
     * @param fromDate Start date of period (required)
     * @param toDate End date of period (required)
     * @return PropertySalesReportGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertySalesReportGet200Response propertySalesReportGet(LocalDate fromDate, LocalDate toDate) throws RestClientException {
        return propertySalesReportGetWithHttpInfo(fromDate, toDate).getBody();
    }

    /**
     * 
     * Show sales report by date range
     * <p><b>200</b> - Show sales report by date range
     * @param fromDate Start date of period (required)
     * @param toDate End date of period (required)
     * @return ResponseEntity&lt;PropertySalesReportGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertySalesReportGet200Response> propertySalesReportGetWithHttpInfo(LocalDate fromDate, LocalDate toDate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDate' when calling propertySalesReportGet");
        }
        
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toDate' when calling propertySalesReportGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from_date", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to_date", toDate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertySalesReportGet200Response> localReturnType = new ParameterizedTypeReference<PropertySalesReportGet200Response>() {};
        return apiClient.invokeAPI("/property/sales/report", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all property status change events
     * <p><b>200</b> - Get all property status change events
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return PropertyStatusChangeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyStatusChangeGet200Response propertyStatusChangeGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return propertyStatusChangeGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all property status change events
     * <p><b>200</b> - Get all property status change events
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;PropertyStatusChangeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyStatusChangeGet200Response> propertyStatusChangeGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyStatusChangeGet200Response> localReturnType = new ParameterizedTypeReference<PropertyStatusChangeGet200Response>() {};
        return apiClient.invokeAPI("/property/status/change", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all properties with their details. Please use move-in or move-out.
     * <p><b>200</b> - Get all properties with their details. Please use move-in or move-out.
     * @param movementType Please use &#x60;move-in&#x60; or &#x60;move-out&#x60; (required)
     * @param daysFrom Filter the results by days before today (required)
     * @param daysTo Filter the results by days after today (required)
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @return PropertyUtilitiesMovementTypeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyUtilitiesMovementTypeGet200Response propertyUtilitiesMovementTypeGet(String movementType, BigDecimal daysFrom, BigDecimal daysTo, Integer page, Integer pageSize) throws RestClientException {
        return propertyUtilitiesMovementTypeGetWithHttpInfo(movementType, daysFrom, daysTo, page, pageSize).getBody();
    }

    /**
     * 
     * Get all properties with their details. Please use move-in or move-out.
     * <p><b>200</b> - Get all properties with their details. Please use move-in or move-out.
     * @param movementType Please use &#x60;move-in&#x60; or &#x60;move-out&#x60; (required)
     * @param daysFrom Filter the results by days before today (required)
     * @param daysTo Filter the results by days after today (required)
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @return ResponseEntity&lt;PropertyUtilitiesMovementTypeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PropertyUtilitiesMovementTypeGet200Response> propertyUtilitiesMovementTypeGetWithHttpInfo(String movementType, BigDecimal daysFrom, BigDecimal daysTo, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'movementType' is set
        if (movementType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movementType' when calling propertyUtilitiesMovementTypeGet");
        }
        
        // verify the required parameter 'daysFrom' is set
        if (daysFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'daysFrom' when calling propertyUtilitiesMovementTypeGet");
        }
        
        // verify the required parameter 'daysTo' is set
        if (daysTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'daysTo' when calling propertyUtilitiesMovementTypeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("movement_type", movementType);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "days_from", daysFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "days_to", daysTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<PropertyUtilitiesMovementTypeGet200Response> localReturnType = new ParameterizedTypeReference<PropertyUtilitiesMovementTypeGet200Response>() {};
        return apiClient.invokeAPI("/property/utilities/{movement_type}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Custom integration endpoint for referrals partner
     * <p><b>200</b> - Custom integration endpoint for referrals partner
     * @param referralMortgageCustomUpdatePostRequest Custom integration endpoint for referrals partner (optional)
     * @return ReferralMortgageCustomUpdatePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReferralMortgageCustomUpdatePost200Response referralMortgageCustomUpdatePost(ReferralMortgageCustomUpdatePostRequest referralMortgageCustomUpdatePostRequest) throws RestClientException {
        return referralMortgageCustomUpdatePostWithHttpInfo(referralMortgageCustomUpdatePostRequest).getBody();
    }

    /**
     * 
     * Custom integration endpoint for referrals partner
     * <p><b>200</b> - Custom integration endpoint for referrals partner
     * @param referralMortgageCustomUpdatePostRequest Custom integration endpoint for referrals partner (optional)
     * @return ResponseEntity&lt;ReferralMortgageCustomUpdatePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReferralMortgageCustomUpdatePost200Response> referralMortgageCustomUpdatePostWithHttpInfo(ReferralMortgageCustomUpdatePostRequest referralMortgageCustomUpdatePostRequest) throws RestClientException {
        Object localVarPostBody = referralMortgageCustomUpdatePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ReferralMortgageCustomUpdatePost200Response> localReturnType = new ParameterizedTypeReference<ReferralMortgageCustomUpdatePost200Response>() {};
        return apiClient.invokeAPI("/referral/mortgage/custom-update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all current tenants with their details and linked properties
     * <p><b>200</b> - Get all current tenants with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return TenantGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantGet200Response tenantGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return tenantGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all current tenants with their details and linked properties
     * <p><b>200</b> - Get all current tenants with their details and linked properties
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;TenantGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantGet200Response> tenantGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<TenantGet200Response> localReturnType = new ParameterizedTypeReference<TenantGet200Response>() {};
        return apiClient.invokeAPI("/tenant", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get tenant details.
     * <p><b>200</b> - Get tenant details.
     * @param id Id of the record (required)
     * @return TenantIdDetailsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantIdDetailsGet200Response tenantIdDetailsGet(BigDecimal id) throws RestClientException {
        return tenantIdDetailsGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get tenant details.
     * <p><b>200</b> - Get tenant details.
     * @param id Id of the record (required)
     * @return ResponseEntity&lt;TenantIdDetailsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantIdDetailsGet200Response> tenantIdDetailsGetWithHttpInfo(BigDecimal id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling tenantIdDetailsGet");
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<TenantIdDetailsGet200Response> localReturnType = new ParameterizedTypeReference<TenantIdDetailsGet200Response>() {};
        return apiClient.invokeAPI("/tenant/{id}/details", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all potential tenants with their details
     * <p><b>200</b> - Get all potential tenants with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return TenantPotentialGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantPotentialGet200Response tenantPotentialGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return tenantPotentialGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all potential tenants with their details
     * <p><b>200</b> - Get all potential tenants with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;TenantPotentialGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantPotentialGet200Response> tenantPotentialGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<TenantPotentialGet200Response> localReturnType = new ParameterizedTypeReference<TenantPotentialGet200Response>() {};
        return apiClient.invokeAPI("/tenant/potential", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get all viewings with their details
     * <p><b>200</b> - Get all viewings with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ViewingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ViewingGet200Response viewingGet(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        return viewingGetWithHttpInfo(page, pageSize, lastUpdatedFrom, lastUpdatedTo).getBody();
    }

    /**
     * 
     * Get all viewings with their details
     * <p><b>200</b> - Get all viewings with their details
     * @param page The page of results returned (optional)
     * @param pageSize Set the number of results per page (max: 500) (optional)
     * @param lastUpdatedFrom Filter the results on or after the date (optional)
     * @param lastUpdatedTo Filter the results on or before the date (optional)
     * @return ResponseEntity&lt;ViewingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ViewingGet200Response> viewingGetWithHttpInfo(Integer page, Integer pageSize, LocalDate lastUpdatedFrom, LocalDate lastUpdatedTo) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_from", lastUpdatedFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_updated_to", lastUpdatedTo));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ViewingGet200Response> localReturnType = new ParameterizedTypeReference<ViewingGet200Response>() {};
        return apiClient.invokeAPI("/viewing", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
