

# RequestBody9


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bitrate** | [**BitrateEnum**](#BitrateEnum) | Specify the bitrate of the stream |  |
|**codec** | [**CodecEnum**](#CodecEnum) | Specify the codec of the stream |  |
|**countryList** | **String** | Specify the country list not allow accessing to the stream |  [optional] |
|**fallbackIsActiveRelay** | **Boolean** | Specify if the fallback is a relay stream |  [optional] |
|**fallbackRelayMountpoint** | **String** | Specify the relay mountpoint for the fallback |  [optional] |
|**fallbackRelayPort** | **Integer** | Specify the relay server port for the fallback |  [optional] |
|**fallbackRelayServer** | **String** | Specify the relay server domain for the fallback |  [optional] |
|**hashKey** | **String** | Specify the token to protect the stream |  [optional] |
|**ipExcludeList** | **String** | Specify the ip list not allow accessing to the stream |  [optional] |
|**ipIncludeList** | **String** | Specify the ip list allow accessing to the stream |  [optional] |
|**isActiveRelay** | **Boolean** | Specify if this is a relay stream |  [optional] |
|**isAllowCountry** | **Boolean** | Specify if the access restriction rules is enabled |  [optional] |
|**isFallback** | **Boolean** | Specify is the new stream have a fallback |  [optional] |
|**isHashRestriction** | **Boolean** | Specify if the access restriction rules is enabled |  [optional] |
|**mountpoint** | **String** | Specify the mountpoint of the stream |  |
|**relayMountpoint** | **String** | Specify the relay mountpoint |  [optional] |
|**relayPort** | **Integer** | Specify the relay server port |  [optional] |
|**relayServer** | **String** | Specify the relay server domain |  [optional] |



## Enum: BitrateEnum

| Name | Value |
|---- | -----|
| NUMBER_24 | 24 |
| NUMBER_32 | 32 |
| NUMBER_48 | 48 |
| NUMBER_64 | 64 |
| NUMBER_96 | 96 |
| NUMBER_128 | 128 |
| NUMBER_192 | 192 |
| NUMBER_256 | 256 |
| NUMBER_320 | 320 |
| NUMBER_512 | 512 |



## Enum: CodecEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



