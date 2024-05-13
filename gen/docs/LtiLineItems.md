

# LtiLineItems

LTI 1.3 tools that have been authorized by an admin may manage this table.  See [Learning Tools Interoperability (LTI) Assignment and Grade Services Specification](https://www.imsglobal.org/spec/lti-ags/v2p0#line-item-service).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an lti line item record. |  |
|**createdAt** | **Object** | Timestamp of when a lti_line_items record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a lti_line_items record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the line item. |  |
|**assignmentId** | **Object** | The ID of the assignment associated with the line item. |  |
|**clientId** | **Object** | The client ID used to create the line item (developer key global id). |  |
|**coupled** | **Object** | True if the line item is the default one created when a user created an assignment; false if the line item was created via the API (regardless if it is the default line item or not). |  |
|**scoreMaximum** | **Object** | The maximum score for the line item. |  |
|**resourceId** | [**LtiLineItemsResourceId**](LtiLineItemsResourceId.md) |  |  [optional] |
|**ltiResourceLinkId** | **Object** | The resource link ID associated with the line item. This ID matches the associated assignments \&quot;lti_context_id\&quot;. |  [optional] |
|**label** | [**LtiLineItemsLabel**](LtiLineItemsLabel.md) |  |  |
|**extensions** | [**LtiLineItemsExtensions**](LtiLineItemsExtensions.md) |  |  |
|**tag** | [**LtiLineItemsTag**](LtiLineItemsTag.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



