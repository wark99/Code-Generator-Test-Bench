

# ObbAnalyticsReportAck

Response given when analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;Long&gt;** | List of account IDs included in the report |  |
|**businessId** | **Integer** | Business ID associated with the requested customer |  [optional] |
|**createdDate** | **String** | Created date of balance analytics request |  |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**reportId** | **String** | A report ID |  |
|**reportPin** | **String** | PIN that may be used to access the report |  |
|**requesterName** | **String** | Name of requester |  [optional] |
|**title** | **String** | Title of the report |  |



