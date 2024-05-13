

# BrandLayout

레이아웃 기본 정보 입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sampleLayoutId** | **String** | 레이아웃 ID 입니다. |  [optional] |
|**sampleLayoutName** | **String** | 레이아웃 이름 입니다. |  [optional] |
|**productCode** | [**ProductCodeEnum**](#ProductCodeEnum) | 레이아웃의 메시지 상품 코드 입니다. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 레이아웃의 상태를 표시합니다.      + ready : 사용     + pause : 사용중지  |  [optional] |
|**registerId** | **String** | 등록자 ID 입니다. |  [optional] |
|**registerDate** | **OffsetDateTime** | 등록일시 입니다. |  [optional] |
|**updateDate** | **OffsetDateTime** | 수정일시 입니다. |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 레이아웃 등록 상태입니다. 레이아웃은 운영자 검수 없이 자동 등록됩니다.        - 승인 : 이통3사에 정상 등록된 상태입니다.                   - 저장 : RBC 웹에서 저장만 했을 경우 상태이며 별도 등록요청을 해야 합니다.     - 검수완료 : 이통 3사 등록 중 에러로 인해 최종 완료가 되지 않은 상태로 수정이나 삭제가 불가능한 상태입니다.     |  [optional] |



## Enum: ProductCodeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LMS | &quot;lms&quot; |
| MMS | &quot;mms&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| PAUSE | &quot;pause&quot; |



## Enum: ApprovalResultEnum

| Name | Value |
|---- | -----|
| _ | &quot;등록완료&quot; |
| _2 | &quot;저장&quot; |
| _3 | &quot;처리중&quot; |



