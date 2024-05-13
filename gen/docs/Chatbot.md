

# Chatbot

대화방(발신번호) 기본 정보입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **String** | 대화방이 대량등록된 경우 그룹ID 입니다.  |  [optional] |
|**chatbotId** | **String** | 대화방(발신번호)ID, A2P의 경우 발신번호(mdn)과 동일합니다.  |  |
|**brandId** | **String** | 브랜드ID |  |
|**subNum** | **String** | 회신번호 A2P의 경우 발신번호, 즉 chatbotId와 동일합니다.  |  [optional] |
|**isMainNum** | **Boolean** | 대표번호 개념은 더 이상 유효하지 않습니다.   브랜드에 등록된 대화방 중 유효한 첫번째 대화방이 표시됩니다.  |  [optional] |
|**subTitle** | **String** | 대화방명입니다. |  [optional] |
|**service** | [**ServiceEnum**](#ServiceEnum) | 대화방 유형입니다.      + a2p : 발신번호를 이용한 대화방   + chat : 양방향ID를 이용한 대화방  |  [optional] |
|**display** | [**DisplayEnum**](#DisplayEnum) | 단말에서 대화방의 검색 및 RCS대화방 노출 여부를 설정합니다.   브랜드홈 전시로 설정되면 대화방은 RCS메시지 수신이 가능하게 되며, 반대로 브랜드홈 비전시 설정 시에는 RCS메시지 수신이 불가능합니다.      + &#39;11&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 비전시    |  [optional] |
|**inputField** | [**InputFieldEnum**](#InputFieldEnum) | 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화  |  [optional] |
|**subDescr** | **String** | 대화방 검색 시 노출되는 소개글을 입력할 수 있습니다.    |  [optional] |
|**botAgencyId** | **String** | 양방향 대화방 서비스 계약 관계에 있는 대행사ID로 자동응답메시지 과금 및 챗봇 연동에 사용됩니다.     예를들어 양방향ID 대화방을 생성하는 경우 대행사ID를 지정하지 않아도 생성이 가능합니다.   대화방(발신번호)를 전환하는 경우에는 반드시 대행사ID를 지정해야 합니다.      + 기업에서 양방향 대화방 등록 시: 브랜드 대행사 중 양방향 서비스가 가능한 대행사ID 지정     + 양방향 서비스 대행사에서 양방향 대화방 등록 시: 연계된 중계사의 RBC 등록ID 지정(RBC 등록 ID는 해당 중계사에 직접 확인)  |  [optional] |
|**saftyStatusYn** | [**SaftyStatusYnEnum**](#SaftyStatusYnEnum) | 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시  |  [optional] |
|**psMenuUse** | **Boolean** | 대화방메뉴 사용 여부입니다.      + true : 사용     + false : 미사용  |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 대화방의 승인 상태입니다.      + 저장 : RCS Biz Center 홈페이지에서 대화방 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 대화방 등록 직후 검수 이전 상태입니다.     + 검수시작 : 대화방 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 대화방 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 대화방은 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 검수완료(수정) : 승인된 대화방의 이름을 변경하였으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 표시 대화방 이름이 다를 수 있습니다.     |  [optional] |
|**registerDate** | **OffsetDateTime** | 대화방 등록일시 |  [optional] |
|**approvalDate** | **OffsetDateTime** | 대화방 승인일시 |  [optional] |
|**updateDate** | **OffsetDateTime** | 대화방 수정일시 |  [optional] |
|**registerId** | **String** | 대화방 등록 계정 ID |  [optional] |
|**updateId** | **String** | 대화방 수정 계정 ID |  [optional] |



## Enum: ServiceEnum

| Name | Value |
|---- | -----|
| A2P | &quot;a2p&quot; |
| CHAT | &quot;chat&quot; |



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



## Enum: ApprovalResultEnum

| Name | Value |
|---- | -----|
| _ | &quot;승인대기&quot; |
| _2 | &quot;검수시작&quot; |
| _3 | &quot;승인&quot; |
| _4 | &quot;반려&quot; |
| _5 | &quot;검수완료&quot; |
| _6 | &quot;검수완료(수정)&quot; |
| _7 | &quot;저장&quot; |



