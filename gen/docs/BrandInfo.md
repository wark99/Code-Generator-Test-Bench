

# BrandInfo

브랜드 기본 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandId** | **String** | 브랜드ID - 브랜드 등록 시 자동 생성됩니다. |  |
|**name** | **String** | 브랜드 이름 - 브랜드 등록 시 지정합니다. |  |
|**brandKey** | **String** | 브랜드 Key - 브랜드 등록 시 자동 생성됩니다. |  [optional] |
|**registerDate** | **OffsetDateTime** | 등록일시 - 브랜드 등록 일시입니다. |  [optional] |
|**approvalDate** | **OffsetDateTime** | 승인일시 - 브랜드가 검수에서 승인된 일시입니다. |  [optional] |
|**updateDate** | **OffsetDateTime** | 수정일시 - 브랜드의 정보가 수정된 일시입니다. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 브랜드의 상태 입니다.      + 저장 : RCS Biz Center 홈페이지에서 브랜드 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 브랜드 등록 직후 검수 이전 상태입니다.     + 검수시작 : 브랜드 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 브랜드 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 브랜드는 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 승인대기(수정) : 승인된 브랜드 변경 시 검수 대상으로 판단되어 검수 요청된 상태입니다.     + 검수시작(수정) : 승인된 브랜드 변경으로 승인요청된 브랜드 검수가 시작된 상태입니다.     + 반려(수정) : 승인된 브랜드 변경 검수 처리 결과 반려된 상태입니다.     + 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다.       브랜드 조회 API 호출 시 수정 이전 브랜드 정보가 제공됩니다.    |  [optional] |
|**mediaUrl** | [**List&lt;MediaUrlInner&gt;**](MediaUrlInner.md) | 이미지 파일ID와 URL 및 사용 유형 정보를 제공합니다.  |  [optional] |
|**chatbotDate** | **OffsetDateTime** | 브랜드 내 등록된 대화방 중 가장 최근에 변경된 대화방의 일시 정보 입니다.  |  [optional] |
|**messagebaseDate** | **OffsetDateTime** | 브랜드 내 등록된 템플릿 중 가장 최근에 변경된 템플릿의 일시 정보 입니다.  |  [optional] |



## Enum: StatusEnum

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



