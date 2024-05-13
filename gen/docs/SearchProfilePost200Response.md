

# SearchProfilePost200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**searchId** | **String** |  |  [optional] |
|**sortedBy** | [**SortedByEnum**](#SortedByEnum) |  |  [optional] |
|**pager** | [**SearchProfilePost200ResponsePager**](SearchProfilePost200ResponsePager.md) |  |  [optional] |
|**results** | [**List&lt;SearchProfilePost200ResponseResultsInner&gt;**](SearchProfilePost200ResponseResultsInner.md) |  |  [optional] |



## Enum: SortedByEnum

| Name | Value |
|---- | -----|
| LAST_SEEN_ASC | &quot;last_seen_asc&quot; |
| LAST_SEEN_DESC | &quot;last_seen_desc&quot; |
| AGE_ASC | &quot;age_asc&quot; |
| AGE_DESC | &quot;age_desc&quot; |
| HOURLY_RATE_ASC | &quot;hourly_rate_asc&quot; |
| HOURLY_RATE_DESC | &quot;hourly_rate_desc&quot; |



