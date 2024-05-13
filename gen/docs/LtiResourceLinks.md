

# LtiResourceLinks

Only used with LTI 1.3 `context_external_tools`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an lti resource link record. |  |
|**createdAt** | **Object** | Timestamp of when a lti_resource_links record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a lti_resource_links record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the line item. |  |
|**contextId** | **Object** | The context the LTI resource link belongs to. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the context the LTI resource link belongs to. |  |
|**contextExternalToolId** | **Object** | The ID of the context_external_tool associated to the resource. |  |
|**custom** | [**LtiResourceLinksCustom**](LtiResourceLinksCustom.md) |  |  [optional] |
|**resourceLinkUuid** | **Object** | A UUID identifying the resource link. |  |
|**lookupUuid** | **Object** | Used to identify the resource link to use in order to lookup custom parameters in some scenarios, such as a link added from Deep Linking into a Rich Content Editor. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



