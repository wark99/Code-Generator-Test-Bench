

# CourseAccountAssociations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a course account association record. |  |
|**courseId** | **Object** | Identifies the course. |  |
|**createdAt** | **Object** | Timestamp of when the record was created. |  |
|**updatedAt** | **Object** | Timestamp of when the record was updated. |  |
|**accountId** | **Object** | Identifies the accounts dataset. Points to the account associated with the course. Could be Canvas root account or sub-account ID. |  |
|**courseSectionId** | **Object** | Identifies the course section. |  [optional] |
|**depth** | **Object** | How many steps in the account chain are between the courses&#39; direct account (&#x60;course&#x60;.&#x60;account_id&#x60;) and the &#x60;account_id&#x60; of the association. |  |



