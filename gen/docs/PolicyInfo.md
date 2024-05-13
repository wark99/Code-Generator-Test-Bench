

# PolicyInfo

리치카드, 오픈리치카드에 포함된 content(title, description, media, button) 에 대한 검증 정책 저장을 위한 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttonsAllowed** | **Boolean** | MaaP FE /message의 buttons 사용 유무 true : buttons 필드 사용 false : buttons 에 값이 들어오면 실패 처리  |  [optional] |
|**adHeaderAllowed** | **Boolean** | header에 광고 인입 허가 여부 true : 광고인입 허용(MaaP FE /message의 header 체크안함) false : 광고인입 불허(MaaP FE /message이 header가 1(광고)         이면 실패 처리)  |  [optional] |
|**adBodyAllowed** | **Boolean** | 광고 문구 허용 여부 true : 본문 광고 문구를 체크하지 않음 false : 본문이 \&quot;(광고)\&quot;로 시작하면 실패 처리  |  [optional] |
|**cardCount** | **Integer** | 카드 개수 |  [optional] |
|**maxTitleSize** | **Integer** | 개별 타이틀 글자 최대 수. 사용하지 않음. |  [optional] |
|**maxButtonCount** | **Integer** | 버튼 최대 개수 |  [optional] |
|**maxDescriptionSize** | **Integer** | RichCard인 경우(Carousel포함) Description들의 글자수 총합.&lt;br&gt; OpenRichCard인 경우 변수부 글자수 총합.&lt;br&gt; &lt;&#x3D;0 인 경우 사용하지 않음.&lt;br&gt;  |  [optional] |
|**maxMediaSize** | **Integer** | Byte단위 미디어 크기 총합의 최대 크기, &lt;&#x3D;0 인 경우 사용하지 않음. |  [optional] |



