

# FilterStatsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**truncated** | **Object** | Indicates that the result set was truncated and there are more results. |  |
|**nextToken** | **Object** | When &#x60;truncated &#x3D; true&#x60;, &#x60;next_token&#x60; will be non-null and can be used to retrieve further results. Send &#x60;next_token&#x60; in a subsequent request to the same endpoint using the same POST body to get the next set of results. |  [optional] |
|**data** | [**List&lt;Stat&gt;**](Stat.md) |  |  [optional] |



