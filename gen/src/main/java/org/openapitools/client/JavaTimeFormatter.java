/*
 * Swagger Inventory Management System(ConvoConvert) - OpenAPI 3.1
 * This is a sample Inventory Management System based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the Inventory Management System, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Inventory Management System repository](https://github.com/afefa-karakra/inventory-management-system.git)
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:45.540345838Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
