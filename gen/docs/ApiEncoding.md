

# ApiEncoding

Encoding

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**container** | [**ContainerEnum**](#ContainerEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**copy** | [**CopyEnum**](#CopyEnum) |  |  [optional] |
|**videoCodec** | [**VideoCodecEnum**](#VideoCodecEnum) |  |  [optional] |
|**videoAspect** | [**VideoAspectEnum**](#VideoAspectEnum) |  |  [optional] |
|**videoFps** | **Float** |  |  [optional] |
|**audioCodec** | [**AudioCodecEnum**](#AudioCodecEnum) |  |  [optional] |
|**audioChannel** | [**AudioChannelEnum**](#AudioChannelEnum) |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**owned** | [**OwnedEnum**](#OwnedEnum) |  |  [optional] |
|**preset** | [**List&lt;ApiEncodingPreset&gt;**](ApiEncodingPreset.md) |  |  [optional] |
|**streams** | [**List&lt;ApiEncodingStream&gt;**](ApiEncodingStream.md) |  |  [optional] |



## Enum: ContainerEnum

| Name | Value |
|---- | -----|
| FLV | &quot;FLV&quot; |
| M4A | &quot;M4A&quot; |
| MKV | &quot;MKV&quot; |
| MP4 | &quot;MP4&quot; |
| WEBM | &quot;WEBM&quot; |
| MP3 | &quot;MP3&quot; |
| COPY | &quot;COPY&quot; |
| AAC | &quot;AAC&quot; |



## Enum: CopyEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: VideoCodecEnum

| Name | Value |
|---- | -----|
| H264 | &quot;H264&quot; |
| HEVC | &quot;HEVC&quot; |
| THEORA | &quot;THEORA&quot; |
| VP8 | &quot;VP8&quot; |
| VP9 | &quot;VP9&quot; |
| COPY | &quot;COPY&quot; |
| H263 | &quot;H263&quot; |



## Enum: VideoAspectEnum

| Name | Value |
|---- | -----|
| LETTERBOX | &quot;LETTERBOX&quot; |
| STRETCH | &quot;STRETCH&quot; |
| FILL | &quot;FILL&quot; |
| KEEP_RATIO | &quot;KEEP_RATIO&quot; |
| COPY | &quot;COPY&quot; |



## Enum: AudioCodecEnum

| Name | Value |
|---- | -----|
| AAC | &quot;AAC&quot; |
| HE_AAC | &quot;HE_AAC&quot; |
| FLAC | &quot;FLAC&quot; |
| MP3 | &quot;MP3&quot; |
| VORBIS | &quot;VORBIS&quot; |
| COPY | &quot;COPY&quot; |
| OPUS | &quot;OPUS&quot; |



## Enum: AudioChannelEnum

| Name | Value |
|---- | -----|
| MONO_1_0 | &quot;MONO_1_0&quot; |
| STEREO_2_0 | &quot;STEREO_2_0&quot; |
| STEREO_2_1 | &quot;STEREO_2_1&quot; |
| SURROUND_4_1 | &quot;SURROUND_4_1&quot; |
| SURROUND_5_1 | &quot;SURROUND_5_1&quot; |
| SURROUND_6_1 | &quot;SURROUND_6_1&quot; |
| SURROUND_7_1 | &quot;SURROUND_7_1&quot; |



## Enum: OwnedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



