# HrApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1HrJobDescriptionPost**](HrApi.md#v1HrJobDescriptionPost) | **POST** /v1/hr/job_description | Generate Job Description |
| [**v1HrParseResumePost**](HrApi.md#v1HrParseResumePost) | **POST** /v1/hr/parse_resume | Parse Resume/CV File |
| [**v1HrRelatedJobPositionsPost**](HrApi.md#v1HrRelatedJobPositionsPost) | **POST** /v1/hr/related_job_positions | Related Job Positions |
| [**v1HrRelatedSkillsPost**](HrApi.md#v1HrRelatedSkillsPost) | **POST** /v1/hr/related_skills | Related Skills |



## v1HrJobDescriptionPost

> Object v1HrJobDescriptionPost(accept, body)

Generate Job Description

Based on the list of extensive parameters this endpoint provides concise job details in the response format, including the short description, job requirements, and job responsibilities.  Only the &#x60;name&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;job_short_description\&quot;: \&quot;We are seeking a skilled PHP Software Engineer with a minimum of 5 years of experience to join our team. This is a full-time remote position based in the United Kingdom, and we are open to sponsoring an employment visa. The ideal candidate should have expertise in PHP8, Laravel, and MySQL, with additional experience in AWS RDS, AWS Aurora, and GitFlow being advantageous.\&quot;,       \&quot;job_requirements\&quot;: \&quot;- Bachelor Degree in Computer Science or related field - Minimum 5 years of experience in PHP software development - Proficiency in PHP8, Laravel, and MySQL - Experience with AWS RDS, AWS Aurora, and GitFlow is a plus - \&quot;,       \&quot;job_responsibilities\&quot;: \&quot;-Design, develop, and maintain PHP-based software applications - Collaborate with cross-functional teams to define, design, and ship new features - Perform code reviews, write unit tests, and contribute to architectural decisions\&quot;     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HrApi apiInstance = new HrApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1HrJobDescriptionPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HrApi#v1HrJobDescriptionPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1HrParseResumePost

> Object v1HrParseResumePost(accept, _file, language)

Parse Resume/CV File

Parses a resume (CV) file from multiple formats (PDF/DOC/DOCX/TXT/RTF) and returns an extensive object of data points.  The file has to be uploaded as &#x60;form-data&#x60; parameter called &#x60;file&#x60;.  An optional language parameter can also be provided (\\&#x60;English\\&#x60; value is set as the default one) .  RESULT EXAMPLE:      {       \&quot;candidate_name\&quot;: \&quot;Mandy Campbell\&quot;,       \&quot;candidate_email\&quot;: \&quot;email@email.com\&quot;,       \&quot;candidate_phone\&quot;: \&quot;3868683442\&quot;,       \&quot;candidate_address\&quot;: \&quot;1515 Pacific Ave, Los Angeles, CA 90291, United States\&quot;,       \&quot;candidate_language\&quot;: \&quot;English\&quot;,       \&quot;candidate_spoken_languages\&quot;: [         \&quot;English\&quot;,         \&quot;Spanish\&quot;       ],       \&quot;candidate_honors_and_awards\&quot;: [],       \&quot;candidate_courses_and_certifications\&quot;: [         \&quot;CrossFit Level 1 Instructor\&quot;,         \&quot;Coach’s Prep Certified\&quot;,         \&quot;Advanced First Aid Diploma\&quot;       ],       \&quot;positions\&quot;: [         {           \&quot;skills\&quot;: [             \&quot;group fitness programming\&quot;,             \&quot;staffing\&quot;,             \&quot;marketing\&quot;,             \&quot;fitness assessments\&quot;,             \&quot;sales\&quot;,             \&quot;active listening\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,           \&quot;job_details\&quot;: \&quot;Ran daily tasks, staffing, and marketing for the group fitness programming. Upheld an active rapport with members and improved group-class utilization by 18% by redesigning class schedules, approximating annual program budgets, analyzing and reporting program statistics.\&quot;,           \&quot;company_name\&quot;: \&quot;Dominist Fitness\&quot;,           \&quot;position_name\&quot;: \&quot;Certified Bootcamp Instructor\&quot;         },         {           \&quot;skills\&quot;: [             \&quot;fitness training\&quot;,             \&quot;client support\&quot;,             \&quot;strength and conditioning\&quot;,             \&quot;group cycling workouts\&quot;           ],           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;job_details\&quot;: \&quot;Gave new gym members a comprehensive outline of the equipment, going over safety and advantages of a wide array of exercises. Trained individual clients, helping them to achieve their fitness goals with a combination of healthy exercise, lifestyle choices, and nutrition.\&quot;,           \&quot;company_name\&quot;: \&quot;Curves Gym\&quot;,           \&quot;position_name\&quot;: \&quot;Bootcamp Instructor\&quot;         }       ],       \&quot;education_qualifications\&quot;: [         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: null,           \&quot;start_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Bachelor’s Degree or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Concordia University\&quot;,           \&quot;school_type\&quot;: \&quot;University or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Surpassing expectations in Personal Training coursework.\&quot;,           \&quot;faculty_department\&quot;: \&quot;Exercise Science\&quot;,           \&quot;specialization_subjects\&quot;: \&quot;Personal Training\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2021-07-01\&quot;,           \&quot;start_date\&quot;: \&quot;2020-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;National CPR Foundation\&quot;,           \&quot;school_type\&quot;: \&quot;Professional training institution\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Advanced First Aid Diploma\&quot;         },         {           \&quot;country\&quot;: \&quot;United States\&quot;,           \&quot;end_date\&quot;: \&quot;2018-12-31\&quot;,           \&quot;start_date\&quot;: \&quot;2018-01-01\&quot;,           \&quot;degree_type\&quot;: \&quot;High School/Secondary School Diploma or equivalent\&quot;,           \&quot;school_name\&quot;: \&quot;Barlow High School\&quot;,           \&quot;school_type\&quot;: \&quot;High School/Secondary School or equivalent\&quot;,           \&quot;learning_mode\&quot;: \&quot;In-person learning\&quot;,           \&quot;education_details\&quot;: \&quot;Varsity track athlete. Leader of the varsity cycling club\&quot;         }       ]     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HrApi apiInstance = new HrApi(defaultClient);
        String accept = "application/json"; // String | 
        File _file = new File("/path/to/file"); // File | 
        String language = "language_example"; // String | 
        try {
            Object result = apiInstance.v1HrParseResumePost(accept, _file, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HrApi#v1HrParseResumePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **_file** | **File**|  | [optional] |
| **language** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1HrRelatedJobPositionsPost

> Object v1HrRelatedJobPositionsPost(accept, body)

Related Job Positions

Generates a list of related job positions with their weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;job_position\&quot;: \&quot;Tax Manager\&quot;,       \&quot;related_job_positions\&quot;: [         {           \&quot;name\&quot;: \&quot;Tax Consultant\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Business Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Corporate Tax Manager\&quot;,           \&quot;weight\&quot;: 5.15         },         {           \&quot;name\&quot;: \&quot;Finance &amp; Tax Manager\&quot;,           \&quot;weight\&quot;: 1.15         }       ]     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HrApi apiInstance = new HrApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1HrRelatedJobPositionsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HrApi#v1HrRelatedJobPositionsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1HrRelatedSkillsPost

> Object v1HrRelatedSkillsPost(accept, body)

Related Skills

Generates a list of related skills with their weights as a float value (1.0-10.0) where 10 equals 100%, the highest relevance score.  RESULT EXAMPLE:      {       \&quot;skill\&quot;: \&quot;Laravel\&quot;,       \&quot;related_skills\&quot;: [         {           \&quot;name\&quot;: \&quot;JavaScript\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;MySQL\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;PHP\&quot;,           \&quot;weight\&quot;: 8.5         },         {           \&quot;name\&quot;: \&quot;MVC Frameworks\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HrApi apiInstance = new HrApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1HrRelatedSkillsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HrApi#v1HrRelatedSkillsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |

