

# ViewerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 1 &#x3D; Booked - unconfirmed, 2 &#x3D; Booked - confirmed, 3 &#x3D; Viewer cancelled, 4 &#x3D; Landlord cancelled, 5 &#x3D; Agency cancelled, 6 &#x3D; Viewer no show, 7 &#x3D; Agency missed appointment, 8 &#x3D; Viewer interested, 9 &#x3D; Viewer possibly interested - chase, 10 &#x3D; Viewer possibly interested - do not chase, 11 &#x3D; Viewer not interested |  [optional] |
|**viewingTime** | **String** |  |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |



