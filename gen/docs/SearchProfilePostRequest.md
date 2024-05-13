

# SearchProfilePostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**searchId** | **String** |  |  [optional] |
|**searchType** | [**SearchTypeEnum**](#SearchTypeEnum) | only need to be supplied for anonymous search |  [optional] |
|**searchText** | **String** |  |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) |  |  [optional] |
|**nextPage** | **Integer** |  |  [optional] |
|**maxPageResults** | **Integer** |  |  [optional] |
|**filter** | [**SearchProfilePostRequestFilter**](SearchProfilePostRequestFilter.md) |  |  |



## Enum: SearchTypeEnum

| Name | Value |
|---- | -----|
| PARENT | &quot;parent&quot; |
| PROVIDER | &quot;provider&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| LAST_SEEN_ASC | &quot;last_seen_asc&quot; |
| LAST_SEEN_DESC | &quot;last_seen_desc&quot; |
| AGE_ASC | &quot;age_asc&quot; |
| AGE_DESC | &quot;age_desc&quot; |
| HOURLY_RATE_ASC | &quot;hourly_rate_asc&quot; |
| HOURLY_RATE_DESC | &quot;hourly_rate_desc&quot; |



