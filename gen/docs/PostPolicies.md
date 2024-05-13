

# PostPolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a post policy record. |  |
|**courseId** | **Object** | The ID of the course referenced by this policy. Note that this is always set even if the policy refers to a specific assignment within a course. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;post_policies&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;post_policies&#x60; record was updated. |  |
|**assignmentId** | **Object** | The ID of the assignment referenced by this policy, or NULL if the policy refers to a course at large. |  [optional] |
|**postManually** | **Object** | For post policies associated with an assignment, whether submissions receiving grades or comments should be posted to the student automatically. For post policies associated with a course, this value will be applied by default to assignments created in the course. |  |



