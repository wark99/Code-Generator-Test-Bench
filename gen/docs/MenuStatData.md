

# MenuStatData

대화방메뉴 별 상세 Data Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**postbackId** | **String** | 메뉴에 할당된 postbackId |  |
|**menuType** | [**MenuTypeEnum**](#MenuTypeEnum) | 메뉴 할당된 액션 구분 - action: RCS 액션 버튼(urlAction, mapAction, ...) 메뉴 - reply: 기본응답 메뉴 - autoreply: 자동응답 메뉴 - menu: 하위 메뉴를 갖는 상위 메뉴  |  |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | menuType이 action인 경우 할당된 RCS 액션 유형   이미지 영역에 동영상 스트리밍을 설정한 경우 iframeplayB로 별도 구분(현재 자동응답메시지는 iframepalyB 설정 미지원)  |  [optional] |
|**title** | **String** | 버튼명, 이미지는 image_1, image_2, ..., image_# 형식으로 제공되며, 동영상 스트리밍의 경우는 iframeplayB_1, iframeplayB_2, ..., iframeplayB_# 형식으로 제공  |  |
|**clickCount** | **Integer** | menuType이 action, reply, autoreply 인 경우 클릭수 (1일 내 동일 고객의 버튼 클릭 수 제외)  |  [optional] |
|**subList** | [**List&lt;SubStatData&gt;**](SubStatData.md) | 하위 메뉴 또는 자동응답메시지 상의 버튼 상세 Data |  [optional] |



## Enum: MenuTypeEnum

| Name | Value |
|---- | -----|
| ACTION | &quot;action&quot; |
| REPLY | &quot;reply&quot; |
| AUTOREPLY | &quot;autoreply&quot; |
| MENU | &quot;menu&quot; |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| URLACTION | &quot;urlAction&quot; |
| DIALERACTION | &quot;dialerAction&quot; |
| MAPACTION | &quot;mapAction&quot; |
| CALENDARACTION | &quot;calendarAction&quot; |
| COMPOSEACTION | &quot;composeAction&quot; |
| CLIPBOARDACTION | &quot;clipboardAction&quot; |
| IFRAMEPLAYB | &quot;iframeplayB&quot; |



