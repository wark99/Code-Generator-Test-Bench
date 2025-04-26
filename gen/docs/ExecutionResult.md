

# ExecutionResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**output** | **String** | The standard output of the code execution |  [optional] |
|**errors** | **String** | Any error messages or standard error output |  [optional] |
|**executionTime** | **BigDecimal** | The time taken to execute the code in milliseconds |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the code execution |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |
| TIMEOUT | &quot;timeout&quot; |



