

# SubActionData

자동응답메시지 버튼 별 상세 Data Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**postbackId** | **String** | 하위 메뉴 또는 버튼에 할당된 postbackId |  |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | 자동응답메시지에 할당된 RCS 액션 유형  |  |
|**title** | **String** | 버튼명 |  |
|**clickCount** | **Integer** | 자동응답메시지 내 버튼, 칩리스트 클릭수 (1일 내 동일 고객의 버튼 클릭 수 제외)  |  |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| URLACTION | &quot;urlAction&quot; |
| DIALERACTION | &quot;dialerAction&quot; |
| MAPACTION | &quot;mapAction&quot; |
| CALENDARACTION | &quot;calendarAction&quot; |
| COMPOSEACTION | &quot;composeAction&quot; |
| CLIPBOARDACTION | &quot;clipboardAction&quot; |



