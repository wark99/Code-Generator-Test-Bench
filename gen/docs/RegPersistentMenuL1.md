

# RegPersistentMenuL1

대화방메뉴 버튼 정보입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | 대화방 메뉴를 구성하는 메뉴 버튼의 유형입니다.    - reply : 응답 메뉴 버튼(챗봇응답 or 자동메시지)   - feed : 브랜드 소식 연결 버튼   - action : RCS 액션 지정 버튼   |  |
|**title** | **String** | 메뉴버튼에 표시되는 메뉴명입니다.  |  |
|**ordNo** | **BigDecimal** | 메뉴버튼 순서 값입니다.  |  |
|**autoReplyMsgId** | **String** | type이 &#39;reply&#39; 인 경우, 자동응답메시지 ID 지정 시 자동응답메시지가 할당됩니다.   자동응답메시지 ID를 지정하지 않은 경우에는 챗봇응답으로 할당됩니다.  |  [optional] |
|**feedId** | **String** | type이 &#39;feed&#39; 인 경우, 브랜드 소식 ID 지정 시 해당 소식이 연결됩니다.    |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | type이 &#39;action&#39;인 경우, 사용할 RCS 액션 유형을 지정합니다.      - dialerAction : 전화연결     - urlAction : 웹사이트 연결  |  [optional] |
|**action** | [**RegPersistentMenuL1Action**](RegPersistentMenuL1Action.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REPLY | &quot;reply&quot; |
| FEED | &quot;feed&quot; |
| ACTION | &quot;action&quot; |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| DIALERACTION | &quot;dialerAction&quot; |
| URLACTION | &quot;urlAction&quot; |



