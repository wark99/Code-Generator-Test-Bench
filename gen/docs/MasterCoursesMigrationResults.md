

# MasterCoursesMigrationResults


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses migration result record. |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the import into the associated course (&#x60;failed&#x60;, &#x60;completed&#x60; or &#x60;queued&#x60;). |  |
|**childSubscriptionId** | **Object** | The ID of a relevant associated course subscription record. |  |
|**masterMigrationId** | **Object** | The ID of a relevant blueprint migration record (sync event). |  |
|**contentMigrationId** | **Object** | The ID of a relevant import record on the associated course. |  |
|**importType** | [**ImportTypeEnum**](#ImportTypeEnum) | Whether the blueprint export was for the entire course (&#x60;full&#x60;) or a partial (&#x60;selective&#x60;). |  |
|**results** | **Object** | Relevant results of the import (e.g. items that were not synced because they were modified by the associated course). |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| FAILED | &quot;failed&quot; |
| COMPLETED | &quot;completed&quot; |
| QUEUED | &quot;queued&quot; |



## Enum: ImportTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| FULL | &quot;full&quot; |
| SELECTIVE | &quot;selective&quot; |



