

# ApiPlayer

Player

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**_default** | [**DefaultEnum**](#DefaultEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**showControls** | [**ShowControlsEnum**](#ShowControlsEnum) |  |  [optional] |
|**showProgression** | [**ShowProgressionEnum**](#ShowProgressionEnum) |  |  [optional] |
|**showAudio** | [**ShowAudioEnum**](#ShowAudioEnum) |  |  [optional] |
|**showDuration** | [**ShowDurationEnum**](#ShowDurationEnum) |  |  [optional] |
|**showFullscreen** | [**ShowFullscreenEnum**](#ShowFullscreenEnum) |  |  [optional] |
|**showDefaultLogo** | [**ShowDefaultLogoEnum**](#ShowDefaultLogoEnum) |  |  [optional] |
|**showSpeed** | [**ShowSpeedEnum**](#ShowSpeedEnum) |  |  [optional] |
|**defaultSpeed** | **Float** |  |  [optional] |
|**is360** | **BigDecimal** |  |  [optional] |
|**encodingChangeEnabled** | **BigDecimal** |  |  [optional] |
|**encodingLimit** | **BigDecimal** |  |  [optional] |
|**chromecast** | [**ChromecastEnum**](#ChromecastEnum) |  |  [optional] |
|**forceMediaRatio** | [**ForceMediaRatioEnum**](#ForceMediaRatioEnum) |  |  [optional] |
|**autoStart** | [**AutoStartEnum**](#AutoStartEnum) |  |  [optional] |
|**audioVolume** | **BigDecimal** |  |  [optional] |
|**showReplay** | [**ShowReplayEnum**](#ShowReplayEnum) |  |  [optional] |
|**showLoop** | [**ShowLoopEnum**](#ShowLoopEnum) |  |  [optional] |
|**showRelated** | **BigDecimal** |  |  [optional] |
|**playRelated** | **BigDecimal** |  |  [optional] |
|**relatedType** | [**RelatedTypeEnum**](#RelatedTypeEnum) |  |  [optional] |
|**width** | **BigDecimal** |  |  [optional] |
|**height** | **BigDecimal** |  |  [optional] |
|**controlbarColor** | **String** |  |  [optional] |
|**controlColor** | **String** |  |  [optional] |
|**controlActiveColor** | **String** |  |  [optional] |
|**logoImage** | **ApiDataUrl** |  |  [optional] |
|**logoAnchor** | [**LogoAnchorEnum**](#LogoAnchorEnum) |  |  [optional] |
|**logoMarginVertical** | **BigDecimal** |  |  [optional] |
|**logoMarginHorizontal** | **BigDecimal** |  |  [optional] |
|**logoPercentage** | **BigDecimal** |  |  [optional] |
|**showMediaInfo** | [**ShowMediaInfoEnum**](#ShowMediaInfoEnum) |  |  [optional] |
|**showMediaThumbnail** | [**ShowMediaThumbnailEnum**](#ShowMediaThumbnailEnum) |  |  [optional] |
|**mediaThumbnailAnchor** | [**MediaThumbnailAnchorEnum**](#MediaThumbnailAnchorEnum) |  |  [optional] |
|**autoHideControls** | [**AutoHideControlsEnum**](#AutoHideControlsEnum) |  |  [optional] |
|**showViewers** | [**ShowViewersEnum**](#ShowViewersEnum) |  |  [optional] |
|**showViewersAfter** | **BigDecimal** |  |  [optional] |
|**showViewersOnlyAfter** | [**ShowViewersOnlyAfterEnum**](#ShowViewersOnlyAfterEnum) |  |  [optional] |
|**timeBeforeHideCb** | **BigDecimal** |  |  [optional] |
|**enableFacebook** | [**EnableFacebookEnum**](#EnableFacebookEnum) |  |  [optional] |
|**facebookBackLink** | **String** |  |  [optional] |
|**facebookPlayerEmbed** | [**FacebookPlayerEmbedEnum**](#FacebookPlayerEmbedEnum) |  |  [optional] |
|**enableTwitter** | [**EnableTwitterEnum**](#EnableTwitterEnum) |  |  [optional] |
|**twitterVia** | **String** |  |  [optional] |
|**twitterBackLink** | **String** |  |  [optional] |
|**twitterRelated** | **String** |  |  [optional] |
|**enableEmbedCode** | [**EnableEmbedCodeEnum**](#EnableEmbedCodeEnum) |  |  [optional] |
|**preloadImage** | **ApiDataUrl** |  |  [optional] |
|**interruptImage** | **ApiDataUrl** |  |  [optional] |
|**geoipImage** | **ApiDataUrl** |  |  [optional] |
|**restrictImage** | **ApiDataUrl** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**isChannelDefault** | [**IsChannelDefaultEnum**](#IsChannelDefaultEnum) |  |  [optional] |
|**ads** | [**List&lt;ApiAd&gt;**](ApiAd.md) |  |  [optional] |
|**owned** | **Bool** |  |  [optional] |
|**shares** | [**List&lt;ApiShare&gt;**](ApiShare.md) |  |  [optional] |



## Enum: DefaultEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowControlsEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowProgressionEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowAudioEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowDurationEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowFullscreenEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowDefaultLogoEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowSpeedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ChromecastEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ForceMediaRatioEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AutoStartEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowReplayEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowLoopEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: RelatedTypeEnum

| Name | Value |
|---- | -----|
| SIMILAR_TAGS | &quot;SIMILAR_TAGS&quot; |
| LAST_UPLOADED | &quot;LAST_UPLOADED&quot; |
| SAME_FOLDER | &quot;SAME_FOLDER&quot; |
| MOST_VIEWED | &quot;MOST_VIEWED&quot; |



## Enum: LogoAnchorEnum

| Name | Value |
|---- | -----|
| TOP_LEFT | &quot;TOP_LEFT&quot; |
| TOP_RIGHT | &quot;TOP_RIGHT&quot; |
| BOTTOM_LEFT | &quot;BOTTOM_LEFT&quot; |
| BOTTOM_RIGHT | &quot;BOTTOM_RIGHT&quot; |
| CENTER | &quot;CENTER&quot; |



## Enum: ShowMediaInfoEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowMediaThumbnailEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: MediaThumbnailAnchorEnum

| Name | Value |
|---- | -----|
| TOP | &quot;TOP&quot; |
| LEFT | &quot;LEFT&quot; |



## Enum: AutoHideControlsEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowViewersEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ShowViewersOnlyAfterEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: EnableFacebookEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: FacebookPlayerEmbedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: EnableTwitterEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: EnableEmbedCodeEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: IsChannelDefaultEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



