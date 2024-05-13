

# Pet

Registration information of the pet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the pet in the system which can be used to uniquely identify each pet. |  [optional] [readonly] |
|**name** | **String** | The name of the pet |  [optional] |
|**breed** | **String** | Breed of the pet |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Simple type of the pet |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) | Gender of the pet |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the pet |  [optional] |
|**address** | **Address** | The address of the pet&#39;s current location, this could be the current owner&#39;s address or the address of the store where the pet is current at.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOG | &quot;dog&quot; |
| CAT | &quot;cat&quot; |
| BIRD | &quot;bird&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MAKE | &quot;make&quot; |
| FEMALE | &quot;female&quot; |



