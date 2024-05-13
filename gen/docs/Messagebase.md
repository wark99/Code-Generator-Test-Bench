

# Messagebase

Messagebase 기본 정보입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 템플릿이 대량등록된 경우 그룹ID 입니다. |  [optional] |
|**messagebaseId** | **String** | 템플릿 ID |  [optional] |
|**tmpltName** | **String** | 템플릿 등록시 입력된 템플릿 명칭입니다. |  [optional] |
|**messagebaseformId** | **String** | 템플릿의 원형인 템플릿 양식 ID 입니다. |  [optional] |
|**brandId** | [**BrandIdEnum**](#BrandIdEnum) | 템플릿이 등록되어 있는 브랜드 ID 입니다.&lt;br&gt; 공통으로 사용하는 템플릿인 경우 &#39;common&#39;으로 표시됩니다.  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 템플릿의 상태를 표시합니다.&lt;br&gt; ready : 사용 &lt;br&gt; pause : 사용중지  |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 템플릿의 승인 상태입니다.  - 저장 : RCS Biz Center 홈페이지에서 템플릿 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 템플릿은 승인요청을 해야 승인대기 상태로 변경됩니다.  - 승인대기 : 템플릿 등록 직후 검수 이전 상태입니다.  - 검수시작 : 템플릿 검수가 시작된 상태입니다.  - 승인 : 검수가 완료되어 이통3사에 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.  - 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 템플릿은 수정 후 다시 승인요청 할 수 있습니다.  - 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.  - 승인대기(수정) : 승인된 템플릿 변경 승인요청 직후 검수 이전 상태입니다.       - 검수시작(수정) : 승인된 템플릿 변경으로 승인요청된 템플릿 검수가 시작된 상태입니다.  - 반려(수정) : 승인된 템플릿 변경 검수 처리 결과 반려된 상태입니다.  - 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.   현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다.  |  [optional] |
|**approvalReason** | **String** | 승인 사유 |  [optional] |
|**registerDate** | **OffsetDateTime** | 템플릿 등록일시 |  [optional] |
|**approvalDate** | **OffsetDateTime** | 템플릿 승인일시 |  [optional] |
|**updateDate** | **OffsetDateTime** | 템플릿 수정일시 |  [optional] |
|**registerId** | **String** | 템플릿 등록 계정 ID |  [optional] |
|**updateId** | **String** | 템플릿 수정 계정 ID |  [optional] |



## Enum: BrandIdEnum

| Name | Value |
|---- | -----|
| COMMON | &quot;common&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| PAUSE | &quot;pause&quot; |



## Enum: ApprovalResultEnum

| Name | Value |
|---- | -----|
| _ | &quot;승인대기&quot; |
| _2 | &quot;검수시작&quot; |
| _3 | &quot;승인&quot; |
| _4 | &quot;반려&quot; |
| _5 | &quot;검수완료&quot; |
| _6 | &quot;저장&quot; |
| _7 | &quot;승인대기(수정)&quot; |
| _8 | &quot;검수시작(수정)&quot; |
| _9 | &quot;반려(수정)&quot; |
| _10 | &quot;검수완료(수정)&quot; |



