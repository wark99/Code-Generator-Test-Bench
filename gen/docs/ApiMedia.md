

# ApiMedia

Media

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **Object** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**validated** | [**ValidatedEnum**](#ValidatedEnum) |  |  [optional] |
|**published** | [**PublishedEnum**](#PublishedEnum) |  |  [optional] |
|**streams** | **List&lt;String&gt;** |  |  [optional] |
|**shotBoundaries** | **List&lt;String&gt;** |  |  [optional] |
|**duration** | **Seconds** | duration in seconds |  [optional] |
|**collectedAt** | **Datetime** |  |  [optional] |
|**publishedAt** | **Datetime** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**discardedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**manifests** | **MediaManifests** |  |  [optional] |
|**source** | **ApiLink** |  |  [optional] |
|**state** | **BigDecimal** |  |  [optional] |
|**preview** | **ApiPreview** |  |  [optional] |
|**sample** | **ApiSample** |  |  [optional] |
|**thumbnail** | **ApiLink** |  |  [optional] |
|**poster** | **ApiLink** |  |  [optional] |
|**encodings** | [**List&lt;ApiEncoding&gt;**](ApiEncoding.md) |  |  [optional] |
|**progress** | **BigDecimal** | % |  [optional] |
|**playbacks** | **MediaPlaybacks** |  |  [optional] |
|**annotations** | [**List&lt;ApiAnnotation&gt;**](ApiAnnotation.md) |  |  [optional] |
|**category** | **String** |  |  [optional] |
|**chapters** | [**List&lt;ApiChapter&gt;**](ApiChapter.md) |  |  [optional] |
|**folder** | **String** |  |  [optional] |
|**countryRestricted** | **Object** |  |  [optional] |
|**ipRestricted** | **Object** |  |  [optional] |
|**keyRestricted** | **Object** |  |  [optional] |
|**path** | **Object** |  |  [optional] |
|**journal** | [**List&lt;ApiMediaJournalLog&gt;**](ApiMediaJournalLog.md) |  |  [optional] |
|**language** | [**List&lt;ApiLanguage&gt;**](ApiLanguage.md) |  |  [optional] |
|**logos** | [**List&lt;ApiLogo&gt;**](ApiLogo.md) |  |  [optional] |
|**scenes** | **ApiThumbnail** |  |  [optional] |
|**shares** | [**List&lt;ApiShare&gt;**](ApiShare.md) |  |  [optional] |
|**subtitles** | [**List&lt;ApiSubtitle&gt;**](ApiSubtitle.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**thumbstrip** | **ApiThumbnail** |  |  [optional] |
|**upload** | **ApiUpload** |  |  [optional] |



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



