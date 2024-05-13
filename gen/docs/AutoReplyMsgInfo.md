

# AutoReplyMsgInfo

자동응메시지 상세 정보입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**copyAllowed** | **Object** |  |  [optional] |
|**body** | **Object** |  |  |
|**buttons** | **Object** |  |  [optional] |
|**chipList** | **Object** |  |  [optional] |
|**brandId** | **Object** |  |  |
|**autoReplyMsgId** | **Object** |  |  |
|**autoReplyMsgName** | **Object** |  |  |
|**messagebaseId** | **Object** |  |  |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 자동응답메시지 등록 상태입니다. 자동응답메시지는 운영자 검수 없이 자동 등록됩니다.        - 등록완료 : 이통3사에 자동응답메시지가 정상 등록된 상태입니다.                   - 저장 : RBC 웹에서 저장만 했을 경우 상태이며 별도 등록요청을 해야 합니다.      - 처리중 : 이통 3사 등록 중 에러로 인해 최종 완료가 되지 않은 상태로 수정이나 삭제가 불가능한 상태입니다.     |  [optional] |
|**registerDate** | **Object** | 등록일시 |  [optional] |
|**updateDate** | **Object** | 수정일시 |  [optional] |
|**registerId** | **Object** | 등록 계정 ID |  [optional] |
|**updateId** | **Object** | 수정 계정 ID |  [optional] |



## Enum: ApprovalResultEnum

| Name | Value |
|---- | -----|
| _ | &quot;등록완료&quot; |
| _2 | &quot;저장&quot; |
| _3 | &quot;처리중&quot; |



