

# ConsumerFileUpload

Payload of a consumer file upload session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregator** | [**AggregatorEnum**](#AggregatorEnum) | The financial aggregator that exports accounts data. |  |
|**aggregatorFiles** | **List&lt;URI&gt;** | List of all uploaded aggregator files. |  |
|**bureau** | [**BureauEnum**](#BureauEnum) | The credit bureau that exports credit report data. |  |
|**creditFile** | **URI** | The uploaded credit report. |  |



## Enum: AggregatorEnum

| Name | Value |
|---- | -----|
| FINICITY | &quot;finicity&quot; |
| MX | &quot;mx&quot; |
| YODLEE | &quot;yodlee&quot; |



## Enum: BureauEnum

| Name | Value |
|---- | -----|
| EFX | &quot;efx&quot; |
| EXP | &quot;exp&quot; |
| TU | &quot;tu&quot; |



