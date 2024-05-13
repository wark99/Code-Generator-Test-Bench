

# PersistentMenu

대화방메뉴 정보입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**postbackId** | **String** | 메뉴에 자동 부여되는 고유ID이며, RBC 자동할당하므로 별도 입력이 불가합니다. |  [optional] |
|**upPostbackId** | **String** | 현재 메뉴가 속한 상위 메뉴 버튼의 Postback ID, RBC 자동할당하므로 별도 입력이 불가합니다. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 대화방 메뉴를 구성하는 메뉴버튼의 유형입니다.   RBC 개편 이후 하위메뉴(type menu)는 허용하지 않습니다.      + menu : 하위메뉴를 갖는 메뉴 버튼 (deprecated)     + reply : 응답 메뉴 버튼(챗봇응답 or 자동메시지)     + feed : 브랜드 소식 연결 버튼   + action : RCS 액션 지정 버튼   |  |
|**title** | **String** | 메뉴버튼에 표시되는 메뉴명입니다.  |  |
|**ordNo** | **BigDecimal** | 메뉴버튼 순서 값입니다.  |  |
|**autoReplyMsgId** | **String** | type이 &#39;reply&#39; 인 경우, 자동응답메시지ID 지정 시 자동응답메시지가 할당됩니다. 자동응답메시지ID를 지정하지 않은 경우에는 챗봇응답으로 할당됩니다.  |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | type이 &#39;action&#39;인 경우, 사용할 RCS 액션 유형을 지정합니다. 2022년 7월 28일 대화방 메뉴 정책 변경으로 dialerAction만 지정할 수 있습니다.  |  [optional] |
|**action** | [**RegPersistentMenuL0Action**](RegPersistentMenuL0Action.md) |  |  [optional] |



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



