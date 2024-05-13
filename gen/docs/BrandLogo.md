

# BrandLogo

브랜드 로고 정보 입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | 로고 이미지 파일 ID 입니다. |  [optional] |
|**fileUrl** | **String** | 로고 이미지 파일 URL 입니다. |  [optional] |
|**name** | **String** | 로고명 입니다. |  [optional] |
|**fileName** | **String** | 원본 파일명 입니다. |  [optional] |
|**description** | **String** | 로고 설명입니다. |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 로고 승인 상태입니다.   - 저장 : RCS Biz Center 홈페이지에서 승인요청 하지 않고 저장 또는 승인요청 취소된 상태입니다. 저장 상태의 로고는 승인요청을 해야 승인대기 상태로 변경됩니다. - 승인대기 : 로고 등록 직후 검수 이전 상태입니다. - 검수시작 : 로고 검수가 시작된 상태입니다. - 승인 : 검수가 완료되어 이통3사에 정보 등록까지 최종 완료되어 RCS 메시지 발송시 사용 가능한 상태입니다. - 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 로고는 수정 후 다시 승인요청 할 수 있습니다. - 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송시 사용할 수 없습니다. - 승인대기(수정) : 승인된 로고를 수정하여 다시 승인요청한  상태입니다.    - 검수시작(수정) : 승인된 로고를 수정하여 다시 승인요청된 로고의 검수가 시작된 상태입니다. - 반려(수정) : 승인된 로고를 수정하여 다시 승인요청 후 검수 처리 결과 반려된 상태입니다. - 검수완료(수정) : 승인된 로고를 수정하여 다시 승인요청 후  검수 승인은 되었으나 이통3사 정보 갱신이 완료되지 않은 상태입니다.   현재 상태에서는 이통사에 따라 로고가 다르게 표시될 수 있습니다.  |  [optional] |
|**approvalReason** | **String** | 승인 사유 |  [optional] |
|**registerDate** | **OffsetDateTime** | 로고 등록일시 |  [optional] |
|**approvalDate** | **OffsetDateTime** | 로고 승인일시 |  [optional] |
|**updateDate** | **OffsetDateTime** | 로고 수정일시 |  [optional] |
|**registerId** | **String** | 로고 등록 계정 ID |  [optional] |
|**updateId** | **String** | 로고 수정 계정 ID |  [optional] |



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



