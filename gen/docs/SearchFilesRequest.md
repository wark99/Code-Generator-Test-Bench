

# SearchFilesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**terms** | **String** | The search terms as inputed by the user. To search for files from a user include &#x60;from:someusername&#x60;, using a user&#39;s username. To search in a specific channel include &#x60;in:somechannel&#x60;, using the channel name (not the display name). To search for specific extensions included &#x60;ext:extension&#x60;. |  |
|**isOrSearch** | **Boolean** | Set to true if an Or search should be performed vs an And search. |  |
|**timeZoneOffset** | **Integer** | Offset from UTC of user timezone for date searches. |  [optional] |
|**includeDeletedChannels** | **Boolean** | Set to true if deleted channels should be included in the search. (archived channels) |  [optional] |
|**page** | **Integer** | The page to select. (Only works with Elasticsearch) |  [optional] |
|**perPage** | **Integer** | The number of posts per page. (Only works with Elasticsearch) |  [optional] |



