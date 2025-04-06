

# Pet

A pet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the pet. |  |
|**birthDate** | **LocalDate** | The date of birth of the pet. |  |
|**type** | [**PetType**](PetType.md) |  |  |
|**id** | **Integer** | The ID of the pet. |  [readonly] |
|**ownerId** | **Integer** | The ID of the pet&#39;s owner. |  [optional] [readonly] |
|**visits** | [**List&lt;Visit&gt;**](Visit.md) | Vet visit bookings for this pet. |  [readonly] |



