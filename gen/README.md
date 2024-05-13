# openapi-java-client

SharpAPI

- API version: 1.0.0

- Build date: 2024-05-13T19:13:33.772980200Z[Etc/UTC]

- Generator version: 7.4.0

# AI-Powered Swiss Army Knife API for Coders

## Supercharge your app today.

Currently, 15 (and growing!) easy-to-use REST API endpoints to help automate your app AI content processing whether it's: [E-commerce](http://sharpapi.com/#ecommerce), [HR Tech](http://sharpapi.com#hr), [Travel, Tourism &amp; Hospitality](http://sharpapi.com/#tth), [Content](http://sharpapi.com/#content) or [SEO](http://sharpapi.com/#seo)

### All-in-one API

Powered by OpenAI/ChatGPT, Claude 2 and some of our SharpAPI secret sauce 😻

Assisting you with the most repetitive content analysis and content generation processing needs of your app.

#### Easy to use RESTful format

- A standardized set of endpoints at your service.
- Always returning data in the same predictable JSON format.
- Analysis endpoints (like product categories, skills, and job positions) providing valuable relevance scores.
- No need to worry about returned fuzzy AI data.
    

#### Multi-language support

Almost 100 languages are supported for every content or data analysis API endpoint. [Check the list here.](https://botpress.com/blog/list-of-languages-supported-by-chatgpt)

## Basic Usage

SharpAPI uses polling as the basic technique for requesting our AI processing jobs.

Each type of job has its request endpoint and arrays of parameters allowed.

On the lowest level, it requires 3 steps to request and obtain processing results.

**Authorization**

We use the Bearer Authorization method. [More at swagger.io.](https://swagger.io/docs/specification/authentication/bearer-authentication/)

`Authorization: Bearer`

**Accept header**

All requests must also contain a header

`Accept: application/json`

### STEP 1. Make a POST request for a specific processing job

For example `https://sharpapi.com/api/v1/hr/parse_resume`

API will return similar response headers:

```
HTTP/1.1 202 Accepted
Location: https://sharpapi.com/api/v1/job/status/05f988ad-c39a-4d87-b866-efe99bdee885
Retry-After: 10

 ```

Additionally, the response text will also contain the job status URL.

```
{
  \"status_url\": \"https://sharpapi.com/api/v1/job/status/05f988ad-c39a-4d87-b866-efe99bdee885\"
}

 ```

All POST API endpoints will return the same set of headers and body.

### STEP 2. Check job progress

Using Retry-After response header values keep checking the requested job while its status is `pending`.

The API should return this response:

```
{
  \"data\": {
    \"type\": \"api_job\",
    \"id\": \"05f988ad-c39a-4d87-b866-efe99bdee885\",
    \"attributes\": {
      \"status\": \"pending\",
      \"type\": \"tth_hospitality_product_categories\"
    }
  }
}

 ```

The final response format will be delivered when the status becomes `success` or `failed`.

### STEP 3. Automatic HTTP 303 redirect to fetch the results.

Querying job progress endpoint will at some point return headers:

```
HTTP/1.1 303 See Other
Location: https://sharpapi.com/api/v1/job/result/05f988ad-c39a-4d87-b866-efe99bdee885

 ```

Your HTTP client will be redirected to a new URL and a successful response format will look like this:

```
{
  \"data\": {
    \"type\": \"api_job_result\",
    \"id\": \"05f988ad-c39a-4d87-b866-efe99bdee885\",
    \"attributes\": {
      \"status\": \"success\",
      \"type\": \"tth_hospitality_product_categories\",
      \"result\": \"[{\\\"name\\\": \\\"Hotel Accommodation\\\", \\\"weight\\\": 9.5}, {\\\"name\\\": \\\"Restaurant and Dining\\\", \\\"weight\\\": 8}, {\\\"name\\\": \\\"Tourist Attractions\\\", \\\"weight\\\": 7.5}]\"
    }
  }
}

 ```

The `result` field will contain processing output in escaped JSON format.

On rare occasions, the job processing might fail and the resulting response will look like this:

```
{
  \"data\": {
    \"type\": \"api_job\",
    \"id\": \"b08a921f-aaa0-43d9-be08-e4921d41ef34\",
    \"attributes\": {
      \"status\": \"failed\",
      \"type\": \"tth_hospitality_product_categories\"
    }
  }
}

 ```

In this case, we encourage you to rerun the request, AI engines sometimes tend to be a bit capricious, return some hallucinations or throw connection exceptions for that matter. And for the sake of making sure you always get properly formatted JSON with requested response data - we gracefully fail your job so your app can try again.

**We do not charge our customers for failed API jobs, your assigned word-processing quota will stay the same.**


## Errors

|Error|Details|
|--|--|
|401 Unauthorized|Please check your API Key for validity  |
|402 Payment Required|You have exceeded your monthly word quota. Please login to the dashboard and increase the number of credits.|
|422 Unprocessable Content|Input parameters validation error, check the provided request body for missing or incorrect parameters values  |
|429 Too Many Requests|Rate limiting in effect, too many request per minute generated for the provided API key. Please check the values of the headers: X-RateLimit-Limit, X-RateLimit-Remaining, X-RateLimit-Reset & Retry-After  |
|500 Internal Server Error|Our server admin has been informed via bug tracking system, and we're working on the backend issue. Please try again later|
|503 Service Unavailable|Service temporarily unavailable - please rerun the request in a couple of seconds.|


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ContentApi;

public class ContentApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentDetectEmailsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentDetectEmailsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContentApi* | [**v1ContentDetectEmailsPost**](docs/ContentApi.md#v1ContentDetectEmailsPost) | **POST** /v1/content/detect_emails | Detect Emails
*ContentApi* | [**v1ContentDetectPhonesPost**](docs/ContentApi.md#v1ContentDetectPhonesPost) | **POST** /v1/content/detect_phones | Detect Phones Numbers
*ContentApi* | [**v1ContentDetectSpamPost**](docs/ContentApi.md#v1ContentDetectSpamPost) | **POST** /v1/content/detect_spam | Detect Spam
*ContentApi* | [**v1ContentKeywordsPost**](docs/ContentApi.md#v1ContentKeywordsPost) | **POST** /v1/content/keywords | Generate Keywords/Tags
*ContentApi* | [**v1ContentSummarizePost**](docs/ContentApi.md#v1ContentSummarizePost) | **POST** /v1/content/summarize | Summarize Text
*ContentApi* | [**v1ContentTranslatePost**](docs/ContentApi.md#v1ContentTranslatePost) | **POST** /v1/content/translate | Translate Text
*ECommerceApi* | [**v1EcommerceProductCategoriesPost**](docs/ECommerceApi.md#v1EcommerceProductCategoriesPost) | **POST** /v1/ecommerce/product_categories | Product Categories
*ECommerceApi* | [**v1EcommerceProductIntroPost**](docs/ECommerceApi.md#v1EcommerceProductIntroPost) | **POST** /v1/ecommerce/product_intro | Generate Product Intro
*ECommerceApi* | [**v1EcommerceReviewSentimentPost**](docs/ECommerceApi.md#v1EcommerceReviewSentimentPost) | **POST** /v1/ecommerce/review_sentiment | Product Review Sentiment
*ECommerceApi* | [**v1EcommerceThankYouEmailPost**](docs/ECommerceApi.md#v1EcommerceThankYouEmailPost) | **POST** /v1/ecommerce/thank_you_email | Generate Thank You E-mail
*GeneralApi* | [**v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get**](docs/GeneralApi.md#v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get) | **GET** /v1/job/status/9e0f60b8-0299-46e9-be2e-02e216b8dc66 | Job Status
*HrApi* | [**v1HrJobDescriptionPost**](docs/HrApi.md#v1HrJobDescriptionPost) | **POST** /v1/hr/job_description | Generate Job Description
*HrApi* | [**v1HrParseResumePost**](docs/HrApi.md#v1HrParseResumePost) | **POST** /v1/hr/parse_resume | Parse Resume/CV File
*HrApi* | [**v1HrRelatedJobPositionsPost**](docs/HrApi.md#v1HrRelatedJobPositionsPost) | **POST** /v1/hr/related_job_positions | Related Job Positions
*HrApi* | [**v1HrRelatedSkillsPost**](docs/HrApi.md#v1HrRelatedSkillsPost) | **POST** /v1/hr/related_skills | Related Skills
*SeoApi* | [**v1SeoGenerateTagsPost**](docs/SeoApi.md#v1SeoGenerateTagsPost) | **POST** /v1/seo/generate_tags | Generate SEO Tags
*TravelTourismHospitalityApi* | [**v1TthHospitalityProductCategoriesPost**](docs/TravelTourismHospitalityApi.md#v1TthHospitalityProductCategoriesPost) | **POST** /v1/tth/hospitality_product_categories | Hospitality Product Categories
*TravelTourismHospitalityApi* | [**v1TthReviewSentimentPost**](docs/TravelTourismHospitalityApi.md#v1TthReviewSentimentPost) | **POST** /v1/tth/review_sentiment | Travel Review Sentiment
*TravelTourismHospitalityApi* | [**v1TthTaProductCategoriesPost**](docs/TravelTourismHospitalityApi.md#v1TthTaProductCategoriesPost) | **POST** /v1/tth/ta_product_categories | Tours &amp; Activities Product Categories


## Documentation for Models



<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



