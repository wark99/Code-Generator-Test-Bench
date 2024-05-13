

# SearchAllChannelsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**term** | **String** | The string to search in the channel name, display name, and purpose. |  |
|**notAssociatedToGroup** | **String** | A group id to exclude channels that are associated to that group via GroupChannel records. |  [optional] |
|**excludeDefaultChannels** | **Boolean** | Exclude default channels from the results by setting this parameter to true. |  [optional] |
|**teamIds** | **List&lt;String&gt;** | Filters results to channels belonging to the given team ids   |  [optional] |
|**groupConstrained** | **Boolean** | Filters results to only return channels constrained to a group   |  [optional] |
|**excludeGroupConstrained** | **Boolean** | Filters results to exclude channels constrained to a group   |  [optional] |
|**_public** | **Boolean** | Filters results to only return Public / Open channels, can be used in conjunction with &#x60;private&#x60; to return both &#x60;public&#x60; and &#x60;private&#x60; channels   |  [optional] |
|**_private** | **Boolean** | Filters results to only return Private channels, can be used in conjunction with &#x60;public&#x60; to return both &#x60;private&#x60; and &#x60;public&#x60; channels   |  [optional] |
|**deleted** | **Boolean** | Filters results to only return deleted / archived channels   |  [optional] |
|**page** | **String** | The page number to return, if paginated. If this parameter is not present with the &#x60;per_page&#x60; parameter then the results will be returned un-paged. |  [optional] |
|**perPage** | **String** | The number of entries to return per page, if paginated. If this parameter is not present with the &#x60;page&#x60; parameter then the results will be returned un-paged. |  [optional] |
|**excludePolicyConstrained** | **Boolean** | If set to true, only channels which do not have a granular retention policy assigned to them will be returned. The &#x60;sysconsole_read_compliance_data_retention&#x60; permission is required to use this parameter.   |  [optional] |
|**includeSearchById** | **Boolean** | If set to true, returns channels where given search &#39;term&#39; matches channel ID.   |  [optional] |



