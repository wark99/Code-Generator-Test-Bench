

# ButtonStatData

RCS 액션 버튼 통계 Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttonNum** | **Integer** | 이미지, 칩리스트 또는 버튼 reactionType별 메시지 내 위치를 나타내는 번호(식별 불가시 0)    좌에서 우, 위에서 아래로 1부터 번호 부여하며 Carousel은 각 카드별로 1부터 부여   |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | 메시지 버튼에 할당된 RCS 액션 유형 이미지 영역에 동영상 스트리밍을 설정한 경우 iframeplayB로 별도 구분  |  [optional] |
|**title** | **String** | 버튼명, 이미지는 image_1, image_2, ..., image_# 형식으로 제공되며, 동영상 스트리밍의 경우는 iframeplayB_1, iframeplayB_2, ..., iframeplayB_# 형식으로 제공   |  [optional] |
|**clickCount** | **Integer** | 버튼 클릭수 (1일 내 동일 고객의 버튼 클릭 수 제외)  |  [optional] |



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



