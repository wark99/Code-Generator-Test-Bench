package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:33.772980200Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class HrApi {
    private ApiClient apiClient;

    public HrApi() {
        this(new ApiClient());
    }

    public HrApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Job Description
     * Based on the list of extensive parameters this endpoint provides concise job details in the response format, including the short description, job requirements, and job responsibilities.  Only the &#x60;name&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;job_short_description\&quot;: \&quot;We are seeking a skilled PHP Software Engineer with a minimum of 5 years of experience to join our team. This is a full-time remote position based in the United Kingdom, and we are open to sponsoring an employment visa. The ideal candidate should have expertise in PHP8, Laravel, and MySQL, with additional experience in AWS RDS, AWS Aurora, and GitFlow being advantageous.\&quot;,       \&quot;job_requirements\&quot;: \&quot;- Bachelor Degree in Computer Science or related field - Minimum 5 years of experience in PHP software development - Proficiency in PHP8, Laravel, and MySQL - Experience with AWS RDS, AWS Aurora, and GitFlow is a plus - \&quot;,       \&quot;job_responsibilities\&quot;: \&quot;-Design, develop, and maintain PHP-based software applications - Collaborate with cross-functional teams to define, design, and ship new features - Perform code reviews, write unit tests, and contribute to architectural decisions\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1HrJobDescriptionPost(String accept, Object body) throws RestClientException {
        return v1HrJobDescriptionPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Generate Job Description
     * Based on the list of extensive parameters this endpoint provides concise job details in the response format, including the short description, job requirements, and job responsibilities.  Only the &#x60;name&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;job_short_description\&quot;: \&quot;We are seeking a skilled PHP Software Engineer with a minimum of 5 years of experience to join our team. This is a full-time remote position based in the United Kingdom, and we are open to sponsoring an employment visa. The ideal candidate should have expertise in PHP8, Laravel, and MySQL, with additional experience in AWS RDS, AWS Aurora, and GitFlow being advantageous.\&quot;,       \&quot;job_requirements\&quot;: \&quot;- Bachelor Degree in Computer Science or related field - Minimum 5 years of experience in PHP software development - Proficiency in PHP8, Laravel, and MySQL - Experience with AWS RDS, AWS Aurora, and GitFlow is a plus - \&quot;,       \&quot;job_responsibilities\&quot;: \&quot;-Design, develop, and maintain PHP-based software applications - Collaborate with cross-functional teams to define, design, and ship new features - Perform code reviews, write unit tests, and contribute to architectural decisions\&quot;     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1HrJobDescriptionPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/hr/job_description", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Parse Resume/CV File
     * Parses a resume (CV) file from multiple formats (PDF/DOC/DOCX/TXT/RTF) and returns an extensive object of data points.  The file has to be uploaded as &#x60;form-data&#x60; parameter called &#x60;file&#x60;.  An optional language parameter can also be provided (\\&#x60;English\\&#x60; value is set as the default one) .  RESULT EXAMPLE:      {       \&quot;candidate_name\&quot;: \&quot;Mandy Campbell\&quot;,       \&quot;candidate_email\&quot;: \&quot;email@email.com\&quot;,       \&quot;candidate_phone\&quot;: \&quot;3868683442\&quot;,       \&quot;candidate_address\&quot;: \&quot;1515 Pacific Ave, Los Angeles, CA 90291, United States\&quot;,       \&quot;candidate_language\&quot;: \&quot;English\&quot;,       \&quot;candidate_spoken_languages\&quot;: [         \&quot;English\&quot;,         \&quot;Spanish\&quot;       ],       \&quot;candidate_honors_and_awards\&quot;: [],       \&quot;candidate_courses_and_certifications\&quot;: [         \&quot;CrossFit Level 1 Instructor\&quot;,         \&quot;Coach’s Prep Certified\&quot;,         \&quot;Advanced First Aid Diploma\&quot;       ],       \&quot;positions\&quot;: [         {           \&quot;skills\&quot;: [             \&quot;group fitness programming\&quot;,             \&quot;staffing\&quot;,             \&quot;marketing\&quot;,             \&quot;fitness assessments\&quot;,             \&quot;sales\&quot;,             \&quot;active listening\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,           \&quot;job_details\&quot;: \&quot;Ran daily tasks, staffing, and marketing for the group fitness programming. Upheld an active rapport with members and improved group-class utilization by 18% by redesigning class schedules, approximating annual program budgets, analyzing and reporting program statistics.\&quot;,           \&quot;company_name\&quot;: \&quot;Dominist Fitness\&quot;,           \&quot;position_name\&quot;: \&quot;Certified Bootcamp Instructor\&quot;         },         {           \&quot;skills\&quot;: [             \&quot;fitness training\&quot;,             \&quot;client support\&quot;,             \&quot;strength and conditioning\&quot;,             \&quot;group cycling workouts\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;job_details\&quot;: \&quot;Gave new gym members a comprehensive outline of the equipment, going over safety and advantages of a wide array of exercises. Trained individual clients, helping them to achieve their fitness goals with a combination of healthy exercise, lifestyle choices, and nutrition.\&quot;,           \&quot;company_name\&quot;: \&quot;Curves Gym\&quot;,           \&quot;position_name\&quot;: \&quot;Bootcamp Instructor\&quot;         }       ],       \&quot;education_qualifications\&quot;: [         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: null,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Bachelor’s Degree or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Concordia University\&quot;,           \&quot;school_type\&quot;: \&quot;University or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Surpassing expectations in Personal Training coursework.\&quot;,           \&quot;faculty_department\&quot;: \&quot;Exercise Science\&quot;,           \&quot;specialization_subjects\&quot;: \&quot;Personal Training\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2020-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;National CPR Foundation\&quot;,           \&quot;school_type\&quot;: \&quot;Professional training institution\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Advanced First Aid Diploma\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2018-12-31\&quot;,           \&quot;start_date\&quot;: \&quot;2018-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;High School/Secondary School Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Barlow High School\&quot;,           \&quot;school_type\&quot;: \&quot;High School/Secondary School or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Varsity track athlete. Leader of the varsity cycling club\&quot;         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param _file  (optional)
     * @param language  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1HrParseResumePost(String accept, File _file, String language) throws RestClientException {
        return v1HrParseResumePostWithHttpInfo(accept, _file, language).getBody();
    }

    /**
     * Parse Resume/CV File
     * Parses a resume (CV) file from multiple formats (PDF/DOC/DOCX/TXT/RTF) and returns an extensive object of data points.  The file has to be uploaded as &#x60;form-data&#x60; parameter called &#x60;file&#x60;.  An optional language parameter can also be provided (\\&#x60;English\\&#x60; value is set as the default one) .  RESULT EXAMPLE:      {       \&quot;candidate_name\&quot;: \&quot;Mandy Campbell\&quot;,       \&quot;candidate_email\&quot;: \&quot;email@email.com\&quot;,       \&quot;candidate_phone\&quot;: \&quot;3868683442\&quot;,       \&quot;candidate_address\&quot;: \&quot;1515 Pacific Ave, Los Angeles, CA 90291, United States\&quot;,       \&quot;candidate_language\&quot;: \&quot;English\&quot;,       \&quot;candidate_spoken_languages\&quot;: [         \&quot;English\&quot;,         \&quot;Spanish\&quot;       ],       \&quot;candidate_honors_and_awards\&quot;: [],       \&quot;candidate_courses_and_certifications\&quot;: [         \&quot;CrossFit Level 1 Instructor\&quot;,         \&quot;Coach’s Prep Certified\&quot;,         \&quot;Advanced First Aid Diploma\&quot;       ],       \&quot;positions\&quot;: [         {           \&quot;skills\&quot;: [             \&quot;group fitness programming\&quot;,             \&quot;staffing\&quot;,             \&quot;marketing\&quot;,             \&quot;fitness assessments\&quot;,             \&quot;sales\&quot;,             \&quot;active listening\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,           \&quot;job_details\&quot;: \&quot;Ran daily tasks, staffing, and marketing for the group fitness programming. Upheld an active rapport with members and improved group-class utilization by 18% by redesigning class schedules, approximating annual program budgets, analyzing and reporting program statistics.\&quot;,           \&quot;company_name\&quot;: \&quot;Dominist Fitness\&quot;,           \&quot;position_name\&quot;: \&quot;Certified Bootcamp Instructor\&quot;         },         {           \&quot;skills\&quot;: [             \&quot;fitness training\&quot;,             \&quot;client support\&quot;,             \&quot;strength and conditioning\&quot;,             \&quot;group cycling workouts\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;job_details\&quot;: \&quot;Gave new gym members a comprehensive outline of the equipment, going over safety and advantages of a wide array of exercises. Trained individual clients, helping them to achieve their fitness goals with a combination of healthy exercise, lifestyle choices, and nutrition.\&quot;,           \&quot;company_name\&quot;: \&quot;Curves Gym\&quot;,           \&quot;position_name\&quot;: \&quot;Bootcamp Instructor\&quot;         }       ],       \&quot;education_qualifications\&quot;: [         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: null,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Bachelor’s Degree or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Concordia University\&quot;,           \&quot;school_type\&quot;: \&quot;University or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Surpassing expectations in Personal Training coursework.\&quot;,           \&quot;faculty_department\&quot;: \&quot;Exercise Science\&quot;,           \&quot;specialization_subjects\&quot;: \&quot;Personal Training\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2020-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;National CPR Foundation\&quot;,           \&quot;school_type\&quot;: \&quot;Professional training institution\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Advanced First Aid Diploma\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2018-12-31\&quot;,           \&quot;start_date\&quot;: \&quot;2018-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;High School/Secondary School Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Barlow High School\&quot;,           \&quot;school_type\&quot;: \&quot;High School/Secondary School or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Varsity track athlete. Leader of the varsity cycling club\&quot;         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param _file  (optional)
     * @param language  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1HrParseResumePostWithHttpInfo(String accept, File _file, String language) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        if (_file != null)
            localVarFormParams.add("file", new FileSystemResource(_file));
        if (language != null)
            localVarFormParams.add("language", language);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/hr/parse_resume", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Related Job Positions
     * Generates a list of related job positions with their weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;job_position\&quot;: \&quot;Tax Manager\&quot;,       \&quot;related_job_positions\&quot;: [         {           \&quot;name\&quot;: \&quot;Tax Consultant\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Business Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Corporate Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Finance &amp; Tax Manager\&quot;,           \&quot;weight\&quot;: 1.15         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1HrRelatedJobPositionsPost(String accept, Object body) throws RestClientException {
        return v1HrRelatedJobPositionsPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Related Job Positions
     * Generates a list of related job positions with their weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;job_position\&quot;: \&quot;Tax Manager\&quot;,       \&quot;related_job_positions\&quot;: [         {           \&quot;name\&quot;: \&quot;Tax Consultant\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Business Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Corporate Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Finance &amp; Tax Manager\&quot;,           \&quot;weight\&quot;: 1.15         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1HrRelatedJobPositionsPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/hr/related_job_positions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Related Skills
     * Generates a list of related skills with their weights as a float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;skill\&quot;: \&quot;Laravel\&quot;,       \&quot;related_skills\&quot;: [         {           \&quot;name\&quot;: \&quot;JavaScript\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;MySQL\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;PHP\&quot;,           \&quot;weight\&quot;: 8.5         },         {           \&quot;name\&quot;: \&quot;MVC Frameworks\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1HrRelatedSkillsPost(String accept, Object body) throws RestClientException {
        return v1HrRelatedSkillsPostWithHttpInfo(accept, body).getBody();
    }

    /**
     * Related Skills
     * Generates a list of related skills with their weights as a float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;skill\&quot;: \&quot;Laravel\&quot;,       \&quot;related_skills\&quot;: [         {           \&quot;name\&quot;: \&quot;JavaScript\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;MySQL\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;PHP\&quot;,           \&quot;weight\&quot;: 8.5         },         {           \&quot;name\&quot;: \&quot;MVC Frameworks\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 
     * <p><b>202</b> - Accepted
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>422</b> - Unprocessable Content
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1HrRelatedSkillsPostWithHttpInfo(String accept, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/hr/related_skills", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
