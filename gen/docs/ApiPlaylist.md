

# ApiPlaylist

Playlist

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) |  |  [optional] |
|**validated** | [**ValidatedEnum**](#ValidatedEnum) |  |  [optional] |
|**published** | [**PublishedEnum**](#PublishedEnum) |  |  [optional] |
|**image** | **ApiDataUrl** |  |  [optional] |
|**prepend** | [**PrependEnum**](#PrependEnum) |  |  [optional] |
|**autoAddMediaByName** | **String** |  |  [optional] |
|**autoAddMediaByDescription** | **String** |  |  [optional] |
|**mediasThumbnail** | [**MediasThumbnailEnum**](#MediasThumbnailEnum) |  |  [optional] |
|**mediasInfo** | [**MediasInfoEnum**](#MediasInfoEnum) |  |  [optional] |
|**navPosition** | [**NavPositionEnum**](#NavPositionEnum) |  |  [optional] |
|**chapterStyle** | [**ChapterStyleEnum**](#ChapterStyleEnum) |  |  [optional] |
|**liveReferenceTime** | **Timestamp** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**mediasCount** | **Integer** |  |  [optional] |
|**mediasDuration** | **Float** |  |  [optional] |
|**shares** | [**List&lt;ApiShare&gt;**](ApiShare.md) |  |  [optional] |
|**tags** | [**List&lt;ApiTag&gt;**](ApiTag.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |
| DYNAMIC | &quot;DYNAMIC&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| MERGE | &quot;MERGE&quot; |
| SPLIT | &quot;SPLIT&quot; |
| LIVE | &quot;LIVE&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| CREATED_ASC | &quot;CREATED_ASC&quot; |
| CREATED_DESC | &quot;CREATED_DESC&quot; |
| PUBLISHED_ASC | &quot;PUBLISHED_ASC&quot; |
| PUBLISHED_DESC | &quot;PUBLISHED_DESC&quot; |
| NAME_ASC | &quot;NAME_ASC&quot; |
| NAME_DESC | &quot;NAME_DESC&quot; |
| DURATION_ASC | &quot;DURATION_ASC&quot; |
| DURATION_DESC | &quot;DURATION_DESC&quot; |
| RANDOM | &quot;RANDOM&quot; |
| MANUAL | &quot;MANUAL&quot; |



## Enum: ValidatedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: PublishedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: PrependEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: MediasThumbnailEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: MediasInfoEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: NavPositionEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



## Enum: ChapterStyleEnum

| Name | Value |
|---- | -----|
| DARK | &quot;DARK&quot; |
| LIGHT | &quot;LIGHT&quot; |



