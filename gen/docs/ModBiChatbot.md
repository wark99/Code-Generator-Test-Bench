

# ModBiChatbot

양방향 대화방 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subNum** | **String** | 회신번호 입니다.   A2P는 chatbotId와 동일하며, 생략 가능합니다.   service가 chat인 경우 사전에 승인된 대화방(발신번호) 중 하나를 반드시 지정해야 합니다.  |  [optional] |
|**subTitle** | **String** | 대화방명입니다. |  [optional] |
|**display** | [**DisplayEnum**](#DisplayEnum) | 단말에서 대화방의 검색 및 RCS대화방 노출 여부를 설정합니다.   브랜드홈 전시로 설정되면 대화방은 RCS메시지 수신이 가능하게 되며, 반대로 브랜드홈 비전시 설정 시에는 RCS메시지 수신이 불가능합니다.      + &#39;11&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 비전시  |  [optional] |
|**inputField** | [**InputFieldEnum**](#InputFieldEnum) | 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화  |  [optional] |
|**botAgencyId** | **String** | 양방향 대화방 서비스 계약 관계에 있는 대행사ID로 자동응답메시지 과금 및 챗봇 연동에 사용됩니다.     예를들어 양방향ID 대화방을 생성하는 경우 대행사ID를 지정하지 않아도 생성이 가능합니다.   대화방(발신번호)를 전환하는 경우에는 반드시 대행사ID를 지정해야 합니다.   이미 양방향 대화방으로 전환된 발신번호의 경우,   botAgencyId를 빈값으로 설정하면 일반 발신번호로 전환됩니다.(DELETE /brand/{brandId}/bidirectional/chatbot/{chatbotId}과 동일)    + 기업에서 양방향 대화방 등록 시: 브랜드 대행사 중 양방향 서비스가 가능한 대행사ID 지정     + 양방향 서비스 대행사에서 양방향 대화방 등록 시: 연계된 중계사의 RBC 등록ID 지정(RBC 등록 ID는 해당 중계사에 직접 확인)  |  [optional] |
|**subDescr** | **String** | 대화방 검색 시 노출되는 소개글을 입력할 수 있습니다.    |  [optional] |
|**saftyStatusYn** | [**SaftyStatusYnEnum**](#SaftyStatusYnEnum) | 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시  |  [optional] |



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



