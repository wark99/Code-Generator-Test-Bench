

# ConnectEmailParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60; * French (Canada): &#x60;fr&#x60;  |  [optional] |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**consumerId** | **String** | A consumer ID. See Create Consumer API for how to create a consumer ID. |  |
|**redirectUri** | **String** | The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe). |  [optional] |
|**webhook** | **String** | The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details. |  [optional] |
|**webhookContentType** | **String** | The content type the webhook events will be sent in. Supported types: \&quot;application/json\&quot; and \&quot;application/xml\&quot;. |  [optional] |
|**webhookData** | **Object** | Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**webhookHeaders** | **Object** | Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**institutionSettings** | **Object** | Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/). |  [optional] |
|**email** | [**EmailOptions**](EmailOptions.md) |  |  |
|**experience** | **String** | The &#x60;experience&#x60; field allows you to customize: * Brand: color and logo * Icon: displayed on the \&quot;Share your data\&quot; page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company. For each additional experience you create thereafter, they&#39;ll give you a unique ID. See [Configure the Connect Experience](https://developer.mastercard.com/open-banking-us/documentation/connect/configure-connect-experience/).  Experience values options: * \&quot;default\&quot;: your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don&#39;t pass the experience parameter, then Connect&#39;s out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run. |  [optional] |
|**singleUseUrl** | **Boolean** | \&quot;true\&quot;: The URL link expires after a Connect session successfully completes.  Note: when the &#x60;singleUseUrl&#x60; and the &#x60;experience&#x60; parameters are passed in the same call, the &#x60;singleUseUrl&#x60; value overrides the &#x60;singleUseUrl&#x60; value configured in the &#x60;experience&#x60; parameter. |  [optional] |
|**fromDate** | **Long** | The &#x60;fromDate&#x60; parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it&#39;s greater than 10 digits, then the &#x60;fromDate&#x60; is set to the credit decisioning report&#39;s default &#x60;fromDate&#x60;.  For an experience that generates multiple reports, the &#x60;fromDate&#x60; gets passed to the reports that support it.  However, Connect doesn&#39;t pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn&#39;t used if you&#39;re only collecting transaction data without a report. |  [optional] |
|**reportCustomFields** | [**List&lt;ReportCustomField&gt;**](ReportCustomField.md) | The &#x60;reportCustomFields&#x60; parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you&#39;d like associated with the report when it&#39;s generated. Every custom field consists of three variables: &#x60;label&#x60;, &#x60;value&#x60;, and &#x60;shown&#x60;. The &#x60;shown&#x60; variable is \&quot;true\&quot; or \&quot;false\&quot;. * \&quot;true\&quot;: (default) display the custom field in the PDF report * \&quot;false\&quot;: don&#39;t display the custom field in the PDF report  For an experience that generates multiple reports, the &#x60;reportCustomFields&#x60; parameter gets passed to all reports.  All custom fields display in the Reseller Billing API. |  [optional] |
|**optionalConsumerInfo** | [**ConsumerInfo**](ConsumerInfo.md) |  |  [optional] |



