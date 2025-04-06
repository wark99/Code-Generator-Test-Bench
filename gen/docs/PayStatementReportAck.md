

# PayStatementReportAck

A Pay Statement report being generated

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A report ID |  |
|**customerType** | **String** | The type of customer (\&quot;active\&quot; or \&quot;testing\&quot; or \&quot;\&quot; for all types) |  |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**requestId** | **String** | Finicity indicator to track all activity associated with this report |  |
|**requesterName** | **String** | Name of a Finicity partner |  |
|**endUser** | [**ConsumerEndUser**](ConsumerEndUser.md) |  |  [optional] |
|**createdDate** | **Long** | A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). Note: If the report is retrieved on a day other than the day it was generated, on the header of the PDF version of the report there will be a \&quot;Retrieved Date\&quot; populated. |  |
|**title** | **String** | Title of the report |  |
|**consumerId** | **String** | A consumer ID. See Create Consumer API for how to create a consumer ID. |  |
|**consumerSsn** | **String** | Last 4 digits of a SSN |  |
|**disputeStatement** | **String** | The dispute text |  [optional] |
|**type** | **String** | A report type. Possible values:  * &#x60;voi&#x60;  * &#x60;voa&#x60;  * &#x60;voaHistory&#x60;  * &#x60;history&#x60;  * &#x60;voieTxVerify&#x60;  * &#x60;voieWithReport&#x60;  * &#x60;voieWithInterview&#x60;  * &#x60;voieWithStatement&#x60;  * &#x60;paystatement&#x60;  * &#x60;preQualVoa&#x60;  * &#x60;assetSummary&#x60;  * &#x60;voie&#x60;  * &#x60;transactions&#x60;  * &#x60;statement&#x60;  * &#x60;voiePayroll&#x60;  * &#x60;voeTransactions&#x60;  * &#x60;voePayroll&#x60;  * &#x60;cfrp&#x60;  * &#x60;cfrb&#x60;  * &#x60;barpcra&#x60;  * &#x60;barpnoncra&#x60;  * &#x60;barbcra&#x60;  * &#x60;barbftc&#x60;  * &#x60;barbnoncra&#x60;  * &#x60;cfrpcra&#x60;  * &#x60;cfrpnoncra&#x60;  * &#x60;cracfrbcra&#x60;  * &#x60;cfrbnoncra&#x60;  * &#x60;cfrbftc&#x60;  |  |
|**status** | **String** | A report generation status. Possible values:  * &#x60;inProgress&#x60;  * &#x60;success&#x60;  * &#x60;failure&#x60;  |  |
|**constraints** | [**PayStatementReportConstraints**](PayStatementReportConstraints.md) |  |  |
|**errors** | [**List&lt;ErrorMessage&gt;**](ErrorMessage.md) | In case errors occurred during the report generation |  [optional] |
|**portfolioId** | **String** | A unique identifier that will be consistent across all reports created for the same customer |  |



