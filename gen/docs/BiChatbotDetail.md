

# BiChatbotDetail

양방향 대화방 상세 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chatbotId** | **Object** | 발신번호 또는 양방향ID로 등록된 대화방의 고유 식별값입니다.    |  |
|**brandId** | **Object** | 대화방이 속한 브랜드ID 입니다.  |  |
|**subNum** | **Object** | 양방향 대화방에 지정된 회신번호 입니다. A2P의 경우 chatbotId와 동일합니다.  |  |
|**subTitle** | **Object** | 대화방명입니다. |  [optional] |
|**service** | [**ServiceEnum**](#ServiceEnum) | 대화방 유형입니다.      + a2p : 발신번호를 이용한 대화방   + chat : 양방향ID를 이용한 대화방  |  [optional] |
|**display** | [**DisplayEnum**](#DisplayEnum) | 단말에서 대화방의 검색 및 RCS대화방 노출 여부를 설정합니다.   브랜드홈 전시로 설정되면 대화방은 RCS메시지 수신이 가능하게 되며, 반대로 브랜드홈 비전시 설정 시에는 RCS메시지 수신이 불가능합니다.      + &#39;11&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 비전시    |  [optional] |
|**inputField** | [**InputFieldEnum**](#InputFieldEnum) | 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화  |  [optional] |
|**botAgencyId** | **Object** | 양방향 대화방 서비스 계약 관계에 있는 대행사ID로 자동응답메시지 과금 및 챗봇 연동에 사용됩니다.     예를들어 양방향ID 대화방을 생성하는 경우 대행사ID를 지정하지 않아도 생성이 가능합니다.   대화방(발신번호)를 전환하는 경우에는 반드시 대행사ID를 지정해야 합니다.      + 기업에서 양방향 대화방 등록 시: 브랜드 대행사 중 양방향 서비스가 가능한 대행사ID 지정     + 양방향 서비스 대행사에서 양방향 대화방 등록 시: 연계된 중계사의 RBC 등록ID 지정(RBC 등록 ID는 해당 중계사에 직접 확인)  |  [optional] |
|**subDescr** | **Object** | 대화방 검색 시 노출되는 소개글을 입력할 수 있습니다.    |  [optional] |
|**saftyStatusYn** | [**SaftyStatusYnEnum**](#SaftyStatusYnEnum) | 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시  |  [optional] |
|**psMenuUse** | **Object** | 대화방메뉴 사용 여부입니다.  |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 대화방의 승인 상태입니다.      + 저장 : RCS Biz Center 홈페이지에서 대화방 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 대화방 등록 직후 검수 이전 상태입니다.     + 검수시작 : 대화방 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 대화방 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 대화방은 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 검수완료(수정) : 승인된 대화방의 이름을 변경하였으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 표시 대화방 이름이 다를 수 있습니다.       |  [optional] |
|**registerDate** | **Object** | 대화방 등록일시 |  [optional] |
|**approvalDate** | **Object** | 대화방 승인일시 |  [optional] |
|**updateDate** | **Object** | 대화방 수정일시 |  [optional] |
|**registerId** | **Object** | 대화방 등록 계정 ID |  [optional] |
|**updateId** | **Object** | 대화방 수정 계정 ID |  [optional] |
|**groupId** | **Object** | 대화방이 대량등록된 경우 그룹ID 입니다.  |  [optional] |
|**isMainNum** | **Object** | 대표번호 개념은 더 이상 유효하지 않습니다.   브랜드에 등록된 대화방 중 유효한 첫번째 대화방이 표시됩니다.  |  [optional] |
|**mediaUrl** | [**List&lt;MediaUrlInner&gt;**](MediaUrlInner.md) | 이미지 파일ID와 URL 및 사용 유형 정보를 제공합니다.  |  [optional] |
|**rcsReply** | [**RcsReplyEnum**](#RcsReplyEnum) | SMS MO 수신 &#39;0&#39;, RCS Postback 수신 &#39;1&#39;입니다. service가 &#39;chat&#39; 이거나 양방향 대화방으로 설정하고자 한다면 반드시 &#39;1&#39;로 설정해야 합니다.  |  [optional] |
|**approvalReason** | **String** | 승인 사유 |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 대화방 상태를 나타내는 필드입니다.   현재는 단일 값인 \&quot;published\&quot; 만 존재하며, 대행사나 기업에서 API를 통한 등록/수정은 제공하지 않습니다.  |  [optional] |
|**searchWeight** | **String** | 검색 우선 순위로 사용자 단말에서 검색 시 검색 결과가 여러 개라면 이 값이 높은 순서로 보여집니다. 대행사나 기업에서 API를 통한 등록/수정은 제공하지 않습니다.  |  [optional] |
|**webhook** | **String** | 양방향 대화방 서비스 중계사 webhook URL 정보이며 botAgencyId 지정시 자동으로 등록됩니다.  |  [optional] |
|**botTcPage** | **String** | 이용약관페이지 URL 입니다.   대행사나 기업에서 API를 통해 등록/수정은 제공하지 않습니다.  |  [optional] |
|**persistentMenu** | [**List&lt;PersistentMenu&gt;**](PersistentMenu.md) |  |  [optional] |



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
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



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



## Enum: RcsReplyEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PUBLISHED | &quot;published&quot; |



