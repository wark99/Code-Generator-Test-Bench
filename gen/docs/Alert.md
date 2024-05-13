

# Alert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | UUID |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Event source:   - beakon: Public Safety Radio   - news: Internet News   - 511: 511.org API   - NWS: National Weather Service API |  [optional] |
|**tags** | **List&lt;Tag&gt;** |  |  [optional] |
|**dateCreated** | **LocalDate** |  |  [optional] |
|**location** | **String** |  |  [optional] |
|**geometry** | **Object** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**certainty** | [**CertaintyEnum**](#CertaintyEnum) |  |  [optional] |
|**urgency** | [**UrgencyEnum**](#UrgencyEnum) |  |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| BEAKON | &quot;beakon&quot; |
| NEWS | &quot;news&quot; |
| _511 | &quot;511&quot; |
| NWS | &quot;nws&quot; |



## Enum: CertaintyEnum

| Name | Value |
|---- | -----|
| REPORTED | &quot;reported&quot; |
| RESPONDED | &quot;responded&quot; |
| DEBUNKED | &quot;debunked&quot; |



## Enum: UrgencyEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |



