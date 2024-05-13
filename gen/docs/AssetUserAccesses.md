

# AssetUserAccesses

Supports canvas page views feature.  Logs view and participation counts for a user + asset combination. Contains information on users' usage of assets (assignments, files, etc.).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a user resource access record. |  |
|**displayName** | [**AssetUserAccessesDisplayName**](AssetUserAccessesDisplayName.md) |  |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp of when an &#x60;asset_user_accesses&#x60; record was created. |  [optional] |
|**updatedAt** | **Object** | Timestamp of when an &#x60;asset_user_accesses&#x60; record was updated. |  [optional] |
|**assetCode** | **Object** | It is used to specify the *asset* or the idea of being accessed. For example, &#x60;attachment_{id}&#x60; or &#x60;roster:course_{id}&#x60;. |  [optional] |
|**assetGroupCode** | **Object** | asset_group_code is for the group. For example: calendar_event_{id}. |  [optional] |
|**contextId** | **Object** | The unique identifier for the asset_user_accesses&#39;s context (account, course, user). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  |
|**lastAccess** | **Object** | Timestamp of last access for a particular asset. |  [optional] |
|**assetCategory** | [**AssetCategoryEnum**](#AssetCategoryEnum) | Category of asset accessed. |  [optional] |
|**viewScore** | **Object** | The number of times this asset has been viewed by this user. |  [optional] |
|**participateScore** | **Object** | The number of times this asset has been interacted with by this user. |  [optional] |
|**actionLevel** | [**ActionLevelEnum**](#ActionLevelEnum) | If this access was viewed or participated with. |  [optional] |
|**membershipType** | [**MembershipTypeEnum**](#MembershipTypeEnum) | The role type of user/enrollment accessing this asset. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| ASSESSMENTQUESTION | &quot;AssessmentQuestion&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |
| USER | &quot;User&quot; |



## Enum: AssetCategoryEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ANNOUNCEMENTS | &quot;announcements&quot; |
| ASSIGNMENTS | &quot;assignments&quot; |
| CALENDAR_FEED | &quot;calendar_feed&quot; |
| COLLABORATIONS | &quot;collaborations&quot; |
| CONFERENCES | &quot;conferences&quot; |
| FILES | &quot;files&quot; |
| GRADES | &quot;grades&quot; |
| HOME | &quot;home&quot; |
| MODULES | &quot;modules&quot; |
| OUTCOMES | &quot;outcomes&quot; |
| PAGES | &quot;pages&quot; |
| QUIZZES | &quot;quizzes&quot; |
| ROSTER | &quot;roster&quot; |
| SPEED_GRADER | &quot;speed_grader&quot; |
| SYLLABUS | &quot;syllabus&quot; |
| TOPICS | &quot;topics&quot; |
| CALENDAR | &quot;calendar&quot; |
| EXTERNAL_TOOLS | &quot;external_tools&quot; |
| WIKI | &quot;wiki&quot; |
| EXTERNAL_URLS | &quot;external_urls&quot; |



## Enum: ActionLevelEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| VIEW | &quot;view&quot; |
| PARTICIPATE | &quot;participate&quot; |



## Enum: MembershipTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| TEACHERENROLLMENT | &quot;TeacherEnrollment&quot; |
| ACCOUNTUSER | &quot;AccountUser&quot; |
| OTHER | &quot;Other&quot; |
| USER | &quot;User&quot; |
| NILCLASS | &quot;NilClass&quot; |
| TAENROLLMENT | &quot;TaEnrollment&quot; |
| DESIGNERENROLLMENT | &quot;DesignerEnrollment&quot; |
| OBSERVERENROLLMENT | &quot;ObserverEnrollment&quot; |
| GROUPMEMBERSHIP | &quot;GroupMembership&quot; |
| STUDENTENROLLMENT | &quot;StudentEnrollment&quot; |
| STUDENTVIEWENROLLMENT | &quot;StudentViewEnrollment&quot; |



