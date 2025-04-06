

# UserProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**username** | **String** |  |  |
|**name** | **String** |  |  |
|**bio** | **String** |  |  |
|**followersCount** | **Integer** |  |  |
|**followingCount** | **Integer** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**profilePicture** | **URI** |  |  |
|**diets** | **List&lt;String&gt;** |  |  [optional] |
|**recipeCount** | **Integer** |  |  [optional] |
|**selfFollowing** | **Boolean** |  |  [optional] |
|**bookmarks** | [**List&lt;RecipeSummary&gt;**](RecipeSummary.md) | Only available when querying the current user&#39;s profile. |  [optional] |
|**recipes** | [**List&lt;RecipeSummary&gt;**](RecipeSummary.md) |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |
| UNKNOWN | &quot;unknown&quot; |



