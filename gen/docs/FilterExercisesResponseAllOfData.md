

# FilterExercisesResponseAllOfData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** |  |  |
|**name** | **Object** |  |  |
|**orgId** | **Object** | (Optional) Integer ID of the customer Group (aka Organization) that owns this exercise. Exercises with an &#x60;org_id&#x60; of &#x60;null&#x60; are considered \&quot;global\&quot; (meaning no Group owns the exercise and it is useable by any customer). Exercises with a non-null value for &#x60;org_id&#x60; are \&quot;owned\&quot; by the corresponding customer organization and only visible to / usable by that customer. |  [optional] |
|**limbed** | **Object** | Whether or not the exercise is performed on right and left limbs individually. E.g. Back Squat is not limbed, whereas Split Squat is limbed. |  |
|**tracked** | **Object** | Whether this exercise is tracked by the Perch camera or data is manually entered. |  [optional] |



