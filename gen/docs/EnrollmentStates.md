

# EnrollmentStates


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enrollmentId** | **Object** | The ID of the enrollment. |  |
|**updatedAt** | **Object** | Timestamp of when an &#x60;enrollment_states&#x60; record was updated. |  [optional] |
|**stateIsCurrent** | **Object** | Indicates if the enrollment state is current or needs recalculation. |  |
|**stateStartedAt** | **Object** | Indicates the date that the enrollment state should take effect. |  [optional] |
|**stateValidUntil** | **Object** | Indicates the date that the enrollment state becomes stale. |  [optional] |
|**restrictedAccess** | **Object** | Indicates if the enrollment is allowed to view the course. |  |
|**accessIsCurrent** | **Object** | Indicates if the state is within the start and valid until bounds. |  |
|**state** | [**StateEnum**](#StateEnum) | State of the user enrollment. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| INVITED | &quot;invited&quot; |
| CREATION_PENDING | &quot;creation_pending&quot; |
| DELETED | &quot;deleted&quot; |
| REJECTED | &quot;rejected&quot; |
| COMPLETED | &quot;completed&quot; |
| INACTIVE | &quot;inactive&quot; |
| CURRENT_AND_INVITED | &quot;current_and_invited&quot; |
| CURRENT_AND_FUTURE | &quot;current_and_future&quot; |
| CURRENT_AND_CONCLUDED | &quot;current_and_concluded&quot; |
| PENDING_ACTIVE | &quot;pending_active&quot; |
| PENDING_INVITED | &quot;pending_invited&quot; |



