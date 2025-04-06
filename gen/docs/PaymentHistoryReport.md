

# PaymentHistoryReport

Payment history report data as JSON

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the report |  |
|**customerId** | **Long** | A customer ID represented as a number. See Add Customer API for how to create a customer ID. |  |
|**accountIds** | **List&lt;Long&gt;** | List of account IDs included in the report |  [optional] |
|**businessId** | **Integer** | Business ID |  [optional] |
|**requesterName** | **String** | Name of requester |  [optional] |
|**reportHeader** | [**ObbReportHeader**](ObbReportHeader.md) | Customer and report metadata |  |
|**analytics** | [**PaymentHistoryAnalytics**](PaymentHistoryAnalytics.md) |  |  [optional] |



