

# SubStatData

하위 메뉴 또는 자동응답메시지 버튼 별 상세 Data Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**postbackId** | **String** | 하위 메뉴 또는 버튼에 할당된 postbackId |  |
|**menuType** | [**MenuTypeEnum**](#MenuTypeEnum) | 하위 메뉴에 할당된 액션 구분 - action: RCS 액션 버튼(urlAction, mapAction, ...) 메뉴 - reply: 기본응답 메뉴 - autoreply: 자동응답 메뉴  |  [optional] |
|**messagebaseId** | **String** | menuType이 autoreply인 경우, 자동응답메시지의 messagebaseId(식별 불가시 NA) |  [optional] |
|**reactionType** | [**ReactionTypeEnum**](#ReactionTypeEnum) | 고객이 클릭 반응한 대상(messagebaseId 식별 불가시 NA) |  [optional] |
|**cardNum** | **Integer** | menuType이 autoreply인 경우, 이미지 또는 버튼이 있는 card 의 위치(식별 불가시 0)      - ex1) Standalone 인 경우 1   - ex2) Card 4장 Carousel 1,2,3,4 중 버튼이 위치한 카드 번호   - ex3) 칩리스트인 경우 1  |  [optional] |
|**buttonNum** | **Integer** | menuType이 autoreply인 경우, 이미지, 칩리스트 또는 버튼의  메시지 내 위치를 나타내는 번호(식별 불가시 0)   좌에서 우, 위에서 아래로 1부터 번호 부여하며 Carousel은 각 카드별로 1부터 부여  |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | menuType이 action인 경우 할당된 RCS 액션 유형  |  [optional] |
|**title** | **String** | 메뉴명 |  |
|**clickCount** | **Integer** | menuType이 action, reply 인 경우 클릭수 (1일 내 동일 고객의 버튼 클릭 수 제외)  |  |
|**subActionList** | [**List&lt;SubActionData&gt;**](SubActionData.md) | menuType이 autoReply인 경우 자동응답메시지 상의 상세 버튼 Data |  [optional] |



## Enum: MenuTypeEnum

| Name | Value |
|---- | -----|
| ACTION | &quot;action&quot; |
| REPLY | &quot;reply&quot; |
| AUTOREPLY | &quot;autoreply&quot; |



## Enum: ReactionTypeEnum

| Name | Value |
|---- | -----|
| NA | &quot;NA&quot; |
| BUTTON | &quot;button&quot; |
| CHIPLIST | &quot;chipList&quot; |
| IMAGE | &quot;image&quot; |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| URLACTION | &quot;urlAction&quot; |
| DIALERACTION | &quot;dialerAction&quot; |
| MAPACTION | &quot;mapAction&quot; |
| CALENDARACTION | &quot;calendarAction&quot; |
| COMPOSEACTION | &quot;composeAction&quot; |
| CLIPBOARDACTION | &quot;clipboardAction&quot; |



