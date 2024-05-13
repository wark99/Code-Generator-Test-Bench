

# Story


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**user** | [**StoryUser**](StoryUser.md) |  |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  |
|**contentUrl** | **String** |  |  |
|**thubmnailUrl** | **String** |  |  |
|**caption** | **String** |  |  [optional] |
|**tags** | [**List&lt;StoryTagsInner&gt;**](StoryTagsInner.md) |  |  |
|**college** | [**List&lt;StoryCollegeInner&gt;**](StoryCollegeInner.md) |  |  |
|**expiresAt** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**v** | **Integer** |  |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;Public&quot; |
| FRIENDS_ONLY | &quot;Friends-Only&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;Image&quot; |
| VIDEO | &quot;Video&quot; |



