/*
 * LiveFree PERS API
 * The Personal Emergency Response System (PERS) API enables partners to receive PERS alarms and location data via HTTP webhook.  **Alarm Types**  | Code | Alarm Type | Description | |---|---|---| | E100 | Medical Alarm (Primary Button) | The medical alarm button was activated. | | E101 | Personal Emergency Alarm (Pendant Button) | The personal emergency button was activated. | | E111 | Smoke Alarm | Smoke was detected by a compatible smoke detector. | | E301 | AC Power Loss | The device has lost AC power. | | E302 | Low Battery | The device battery is low. | | E308 | System Shutdown | The device is powering off due to low battery. | | E601 | Manual Test | A manually triggered test signal. | | E602 | Periodic Test | The device sent a recurring test signal. | | E641 | Fall Alarm | The device detected a fall. | | E643 | Geofence Exit | The user has exited a geofence area. | | E644 | Geofence Enter | The user has entered a geofence area. | | E646 | Remote Patient Monitoring (RPM) Alarm | A compatible remote patient monitoring device reported an alarm. | | R100 | Medical Alarm Cancel | A medical alarm was cancelled by the user. | **Provisioning**  Webhooks must be configured by LiveFree support. To configure your webhook, contact support with your webhook URL and authentication info. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engineering@lifebeacon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class RFC3339DateFormat extends DateFormat {
  private static final long serialVersionUID = 1L;
  private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

  private final StdDateFormat fmt = new StdDateFormat()
          .withTimeZone(TIMEZONE_Z)
          .withColonInTimeZone(true);

  public RFC3339DateFormat() {
    this.calendar = new GregorianCalendar();
    this.numberFormat = new DecimalFormat();
  }

  @Override
  public Date parse(String source) {
    return parse(source, new ParsePosition(0));
  }

  @Override
  public Date parse(String source, ParsePosition pos) {
    return fmt.parse(source, pos);
  }

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    return fmt.format(date, toAppendTo, fieldPosition);
  }

  @Override
  public Object clone() {
    return super.clone();
  }
}