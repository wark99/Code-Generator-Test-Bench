

# Model1TimezonesGet200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | [**ResultEnum**](#ResultEnum) | Result of the HTTP request |  |
|**total** | **Object** | Total number of items Added when using query parameter &#x60;page&#x60;  |  [optional] |
|**page** | **Object** | Number of the current page Added when using query parameter &#x60;page&#x60;  |  [optional] |
|**pages** | **Object** | Total number of pages Added when using query parameter &#x60;page&#x60;  |  [optional] |
|**itemsPerPage** | **Object** | Number of items per page Added when using query parameter &#x60;page&#x60;  |  [optional] |
|**data** | [**List&lt;Timezone&gt;**](Timezone.md) |  |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |
| ASYNCHRONOUS | &quot;asynchronous&quot; |



