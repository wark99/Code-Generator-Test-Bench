

# SubmissionVersions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of this version object. |  |
|**userId** | **Object** | The ID of the submitter. |  [optional] |
|**contextId** | **Object** | The ID of the course this submission belongs to. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the context object (typically &#x60;Course&#x60;). |  |
|**assignmentId** | **Object** | The ID of the associated assignment. |  [optional] |
|**versionId** | **Object** | The ID of the corresponding object in the versions table. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



