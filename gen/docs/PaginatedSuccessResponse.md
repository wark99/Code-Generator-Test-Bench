

# PaginatedSuccessResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | [**ResultEnum**](#ResultEnum) | Result of the HTTP request |  |
|**data** | [**SuccessResponseDataData**](SuccessResponseDataData.md) |  |  |
|**total** | **Object** | Total number of results |  |
|**pages** | **Object** | Total number of pages |  |
|**page** | **Object** | The current page |  |
|**itemsPerPage** | **Object** | Number of results per page |  |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |
| ASYNCHRONOUS | &quot;asynchronous&quot; |



