

# MessageButtonStatData

메시지 버튼 클릭 카운트

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statDate** | **String** | 통계일자 |  [optional] |
|**corpId** | **String** | RCS Biz Center에 등록된 기업ID |  [optional] |
|**corpRegNum** | **String** | 기업사업자 등록 번호 |  [optional] |
|**brandId** | **String** | 브랜드 ID |  [optional] |
|**chatbotId** | **String** | 대화방 ID |  [optional] |
|**groupId** | **String** | 발송 캠페인 구분 ID |  [optional] |
|**messagebaseId** | **String** | 발송 메시지의 messagebaseId(식별 불가시 NA) |  [optional] |
|**reactionType** | [**ReactionTypeEnum**](#ReactionTypeEnum) | 고객이 클릭 반응한 대상(messagebaseId 식별 불가시 NA) |  [optional] |
|**cardNum** | **Integer** | 클릭한 이미지 또는 버튼이 있는 card 의 위치(식별 불가시 0)      - ex1) Standalone 인 경우 1   - ex2) Card 4장 Carousel 1,2,3,4 중 버튼이 위치한 카드 번호   - ex3) 칩리스트인 경우 1    |  [optional] |
|**buttonList** | [**List&lt;ButtonStatData&gt;**](ButtonStatData.md) | 발송 캠페인 메시지에 포함된 RCS 액션 버튼 통계 Data |  [optional] |



## Enum: ReactionTypeEnum

| Name | Value |
|---- | -----|
| NA | &quot;NA&quot; |
| BUTTON | &quot;button&quot; |
| CHIPLIST | &quot;chipList&quot; |
| IMAGE | &quot;image&quot; |



