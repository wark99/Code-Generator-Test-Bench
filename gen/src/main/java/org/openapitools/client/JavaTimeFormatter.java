/*
 * SharpAPI
 * # AI-Powered Swiss Army Knife API for Coders  ## Supercharge your app today.  Currently, 15 (and growing!) easy-to-use REST API endpoints to help automate your app AI content processing whether it's: [E-commerce](http://sharpapi.com/#ecommerce), [HR Tech](http://sharpapi.com#hr), [Travel, Tourism &amp; Hospitality](http://sharpapi.com/#tth), [Content](http://sharpapi.com/#content) or [SEO](http://sharpapi.com/#seo)  ### All-in-one API  Powered by OpenAI/ChatGPT, Claude 2 and some of our SharpAPI secret sauce 😻  Assisting you with the most repetitive content analysis and content generation processing needs of your app.  #### Easy to use RESTful format  - A standardized set of endpoints at your service. - Always returning data in the same predictable JSON format. - Analysis endpoints (like product categories, skills, and job positions) providing valuable relevance scores. - No need to worry about returned fuzzy AI data.       #### Multi-language support  Almost 100 languages are supported for every content or data analysis API endpoint. [Check the list here.](https://botpress.com/blog/list-of-languages-supported-by-chatgpt)  ## Basic Usage  SharpAPI uses polling as the basic technique for requesting our AI processing jobs.  Each type of job has its request endpoint and arrays of parameters allowed.  On the lowest level, it requires 3 steps to request and obtain processing results.  **Authorization**  We use the Bearer Authorization method. [More at swagger.io.](https://swagger.io/docs/specification/authentication/bearer-authentication/)  `Authorization: Bearer`  **Accept header**  All requests must also contain a header  `Accept: application/json`  ### STEP 1. Make a POST request for a specific processing job  For example `https://sharpapi.com/api/v1/hr/parse_resume`  API will return similar response headers:  ``` HTTP/1.1 202 Accepted Location: https://sharpapi.com/api/v1/job/status/05f988ad-c39a-4d87-b866-efe99bdee885 Retry-After: 10   ```  Additionally, the response text will also contain the job status URL.  ``` {   \"status_url\": \"https://sharpapi.com/api/v1/job/status/05f988ad-c39a-4d87-b866-efe99bdee885\" }   ```  All POST API endpoints will return the same set of headers and body.  ### STEP 2. Check job progress  Using Retry-After response header values keep checking the requested job while its status is `pending`.  The API should return this response:  ``` {   \"data\": {     \"type\": \"api_job\",     \"id\": \"05f988ad-c39a-4d87-b866-efe99bdee885\",     \"attributes\": {       \"status\": \"pending\",       \"type\": \"tth_hospitality_product_categories\"     }   } }   ```  The final response format will be delivered when the status becomes `success` or `failed`.  ### STEP 3. Automatic HTTP 303 redirect to fetch the results.  Querying job progress endpoint will at some point return headers:  ``` HTTP/1.1 303 See Other Location: https://sharpapi.com/api/v1/job/result/05f988ad-c39a-4d87-b866-efe99bdee885   ```  Your HTTP client will be redirected to a new URL and a successful response format will look like this:  ``` {   \"data\": {     \"type\": \"api_job_result\",     \"id\": \"05f988ad-c39a-4d87-b866-efe99bdee885\",     \"attributes\": {       \"status\": \"success\",       \"type\": \"tth_hospitality_product_categories\",       \"result\": \"[{\\\"name\\\": \\\"Hotel Accommodation\\\", \\\"weight\\\": 9.5}, {\\\"name\\\": \\\"Restaurant and Dining\\\", \\\"weight\\\": 8}, {\\\"name\\\": \\\"Tourist Attractions\\\", \\\"weight\\\": 7.5}]\"     }   } }   ```  The `result` field will contain processing output in escaped JSON format.  On rare occasions, the job processing might fail and the resulting response will look like this:  ``` {   \"data\": {     \"type\": \"api_job\",     \"id\": \"b08a921f-aaa0-43d9-be08-e4921d41ef34\",     \"attributes\": {       \"status\": \"failed\",       \"type\": \"tth_hospitality_product_categories\"     }   } }   ```  In this case, we encourage you to rerun the request, AI engines sometimes tend to be a bit capricious, return some hallucinations or throw connection exceptions for that matter. And for the sake of making sure you always get properly formatted JSON with requested response data - we gracefully fail your job so your app can try again.  **We do not charge our customers for failed API jobs, your assigned word-processing quota will stay the same.**   ## Errors  |Error|Details| |--|--| |401 Unauthorized|Please check your API Key for validity  | |402 Payment Required|You have exceeded your monthly word quota. Please login to the dashboard and increase the number of credits.| |422 Unprocessable Content|Input parameters validation error, check the provided request body for missing or incorrect parameters values  | |429 Too Many Requests|Rate limiting in effect, too many request per minute generated for the provided API key. Please check the values of the headers: X-RateLimit-Limit, X-RateLimit-Remaining, X-RateLimit-Reset & Retry-After  | |500 Internal Server Error|Our server admin has been informed via bug tracking system, and we're working on the backend issue. Please try again later| |503 Service Unavailable|Service temporarily unavailable - please rerun the request in a couple of seconds.|
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that add parsing/formatting support for Java 8+ {@code OffsetDateTime} class.
 * It's generated for java clients when {@code AbstractJavaCodegen#dateLibrary} specified as {@code java8}.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:33.772980200Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class JavaTimeFormatter {

    private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    /**
     * Get the date format used to parse/format {@code OffsetDateTime} parameters.
     * @return DateTimeFormatter
     */
    public DateTimeFormatter getOffsetDateTimeFormatter() {
        return offsetDateTimeFormatter;
    }

    /**
     * Set the date format used to parse/format {@code OffsetDateTime} parameters.
     * @param offsetDateTimeFormatter {@code DateTimeFormatter}
     */
    public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
        this.offsetDateTimeFormatter = offsetDateTimeFormatter;
    }

    /**
     * Parse the given string into {@code OffsetDateTime} object.
     * @param str String
     * @return {@code OffsetDateTime}
     */
    public OffsetDateTime parseOffsetDateTime(String str) {
        try {
            return OffsetDateTime.parse(str, offsetDateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Format the given {@code OffsetDateTime} object into string.
     * @param offsetDateTime {@code OffsetDateTime}
     * @return {@code OffsetDateTime} in string format
     */
    public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTimeFormatter.format(offsetDateTime);
    }
}
