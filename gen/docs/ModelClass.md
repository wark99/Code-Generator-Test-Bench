

# ModelClass


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**activityId** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**sessionCost** | **Integer** |  |  [optional] |
|**trialAllowed** | **Boolean** |  |  [optional] |
|**trialCost** | **Integer** |  |  [optional] |
|**ageRange** | **String** |  |  [optional] |
|**sell** | **Boolean** |  |  [optional] |
|**term** | **String** |  |  [optional] |
|**teacher** | **String** |  |  [optional] |
|**venueId** | **Integer** |  |  [optional] |
|**venueName** | **String** |  |  [optional] |
|**organiserId** | **Integer** |  |  [optional] |
|**organiserName** | **String** |  |  [optional] |
|**organiserClassImage** | **String** |  |  [optional] |
|**stage** | **String** |  |  [optional] |
|**stageClassImage** | **String** |  |  [optional] |
|**ability** | [**AbilityEnum**](#AbilityEnum) |  |  [optional] |
|**spacesCount** | **Integer** |  |  [optional] |
|**invitedWaiteesCount** | **Integer** |  |  [optional] |
|**nextSession** | **OffsetDateTime** |  |  [optional] |
|**nextSessionEndsAt** | **OffsetDateTime** |  |  [optional] |
|**sessions** | [**List&lt;Session&gt;**](Session.md) |  |  [optional] |



## Enum: AbilityEnum

| Name | Value |
|---- | -----|
| BEGINNER | &quot;Beginner&quot; |
| INTERMEDIATE | &quot;Intermediate&quot; |
| ADVANCED | &quot;Advanced&quot; |



