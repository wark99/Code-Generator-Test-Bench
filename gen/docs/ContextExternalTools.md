

# ContextExternalTools


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Primary key for this record in the &#x60;context_external_tools&#x60; table in the Canvas database. |  |
|**developerKeyId** | **Object** | The client ID of the tool provider. LTI 1.3 only. |  [optional] |
|**createdAt** | **Object** | Timestamp when the activation was created. |  |
|**updatedAt** | **Object** | The time at which the tool was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow state for activation (active, deleted). |  |
|**contextId** | **Object** | The ID of the context the tool is deployed to. Identifies either a course (&#x60;courses&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Course&#x60;) or an account (&#x60;accounts&#x60;.&#x60;id&#x60; if &#x60;context_type&#x60; is &#x60;Account&#x60;). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of object the tool was activated in. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported the tool. |  [optional] |
|**consumerKey** | [**ContextExternalToolsConsumerKey**](ContextExternalToolsConsumerKey.md) |  |  |
|**clonedItemId** | **Object** | The Id of the item in which this context_external_tool was cloned from. |  [optional] |
|**toolId** | **Object** | The tool ID received from the external tool. May be missing if the tool does not send an ID. |  [optional] |
|**notSelectable** | **Object** | true - tool is selectable in all scenarios. false - not selectable for assignment or module selection menu. |  [optional] |
|**appCenterId** | **Object** | The tool ID from eduappcenter.com. |  [optional] |
|**allowMembershipServiceAccess** | **Object** | Indicates that the tool has access to the legacy membership service. LTI 1 only. This setting is set by the Canvas user who installs the tool. |  |
|**description** | [**ContextExternalToolsDescription**](ContextExternalToolsDescription.md) |  |  [optional] |
|**name** | **Object** | The name of tool activation as entered by the user. |  |
|**domain** | **Object** | The domain for the tool launch URL (optional field). Canvas uses this domain to lookup the correct tool to launch when the tool ID is unknown. |  [optional] |
|**url** | **Object** | The URL to where the tool may launch to (if this value is NULL, use the &#x60;domain&#x60; field). |  [optional] |
|**settings** | [**TypeExtractedFromColumnContextExternalToolsSettings**](TypeExtractedFromColumnContextExternalToolsSettings.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ANONYMOUS | &quot;anonymous&quot; |
| DELETED | &quot;deleted&quot; |
| DISABLED | &quot;disabled&quot; |
| EMAIL_ONLY | &quot;email_only&quot; |
| NAME_ONLY | &quot;name_only&quot; |
| PUBLIC | &quot;public&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |



