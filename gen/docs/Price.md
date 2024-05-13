

# Price


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional] |
|**fixedCost** | **Integer** |  |  [optional] |
|**sessionLimit** | **Integer** |  |  [optional] |
|**sessionSelectionType** | [**SessionSelectionTypeEnum**](#SessionSelectionTypeEnum) |  |  [optional] |
|**plan** | [**Plan**](Plan.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PERSESSION | &quot;perSession&quot; |
| PERTRIAL | &quot;perTrial&quot; |
| FIXEDCOST | &quot;fixedCost&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |



## Enum: SessionSelectionTypeEnum

| Name | Value |
|---- | -----|
| FIXEDSTART | &quot;fixedStart&quot; |
| FLEXISTART | &quot;flexiStart&quot; |
| CHERRYPICK | &quot;cherryPick&quot; |



