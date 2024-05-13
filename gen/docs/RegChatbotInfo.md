

# RegChatbotInfo

대화방(발신번호) 등록 정보 객체입니다.   Object 구성은 [RegChatbotInfo](#/RegChatbotInfo)를 참고하시기 바랍니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mdn** | **String** | 등록할 발신번호입니다.  국가번호는 제외하고 등록하며, 현재 정책적으로 휴대전화번호는 등록이 불가합니다.  |  |
|**subNum** | **String** | 회신번호 입니다. 발신번호(mdn)와 회신번호가 동일해야 합니다.  발신번호와 동일하게 설정됩니다.  |  [optional] |
|**subTitle** | **String** | 대화방명입니다. |  |
|**rcsReply** | [**RcsReplyEnum**](#RcsReplyEnum) | SMS MO 수신 0, RCS Postback 수신 1 |  |
|**display** | [**DisplayEnum**](#DisplayEnum) | 대화방 전시 설정값 입니다. 설정하지 않을 경우 기본 &#39;01&#39;로 설정됩니다.      + &#39;11&#39; : 브랜드채널 노출,브랜드검색 허용,브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출,브랜드검색 허용,브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출,브랜드검색 불허,브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출,브랜드검색 불허,브랜드홈 비전시    |  [optional] |
|**inputField** | [**InputFieldEnum**](#InputFieldEnum) | 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화  |  [optional] |
|**subDescr** | **String** | 대화방 검색 시 노출되는 소개글을 입력할 수 있습니다.    |  [optional] |
|**saftyStatusYn** | [**SaftyStatusYnEnum**](#SaftyStatusYnEnum) | 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시  |  [optional] |



## Enum: RcsReplyEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: DisplayEnum

| Name | Value |
|---- | -----|
| _11 | &quot;11&quot; |
| _10 | &quot;10&quot; |
| _01 | &quot;01&quot; |
| _00 | &quot;00&quot; |



## Enum: InputFieldEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: SaftyStatusYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



