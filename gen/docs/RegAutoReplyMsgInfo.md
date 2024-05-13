

# RegAutoReplyMsgInfo

자동응답메시지 등록 정보입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoReplyMsgName** | **String** | 자동응답메시지 명을 지정합니다. |  |
|**messagebaseId** | **String** | 메시지 상품코드 chat에 속하는 messagebase ID를 지정합니다.   제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용 가능하나 다음과 같이 처리 됩니다.      + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        지정된 ID에만 존재하는 필드가 전환되는 ID에 존재하지 않는 경우 무시됩니다.   예를 들어, 텍스트 카드로 등록시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다.  |  |
|**copyAllowed** | **Boolean** | 단말에서 메시지 복사 가능 여부를 지정합니다.      + true : 복사 가능   + false : 복사 불가  |  [optional] |
|**body** | **Object** | 이통 발송규격 중 /message API의 body object와 동일한 방식으로 값을 지정합니다.    |  |
|**buttons** | [**List&lt;RegAutoReplyMsgInfoButtonsInner&gt;**](RegAutoReplyMsgInfoButtonsInner.md) | 자동응답메시지에 버튼을 등록합니다. 지원하는 action 유형은 다음과 같습니다.      + urlAction : 기본 브라우저에서 웹페이지 링크     + localBrowserAction : 채팅+ 내부 브라우저에서 웹페이지 표시   + mapAction : 지도 상의 특정 위치 표시 또는 현재 위치 공유    + calendarAction : 캘린더에 일정 공유     + clipboardAction : 클립보드로 복사     + composeAction : 지정 대화방에 메시지 작성     + dialerAction : 전화걸기     + reply : 다른 자동응답메시지 연결, 챗봇응답  다른 자동응답메시지 연결 시에는 reply JSON object 내에 autoReplyMsgId 필드에 자동응답메시지ID를 지정하며, postback.data는 자동할당 됩니다.    |  [optional] |
|**chipList** | [**List&lt;AutoReplyMsgActions&gt;**](AutoReplyMsgActions.md) | 자동응답메시지에 칩리스트를 지정합니다. 지원하는 action 유형은 다음과 같습니다.      + urlAction : 기본 브라우저에서 웹페이지 링크     + localBrowserAction : 채팅+ 내부 브라우저에서 웹페이지 표시   + mapAction : 지도 상의 특정 위치 표시 또는 현재 위치 공유    + calendarAction : 캘린더에 일정 공유     + clipboardAction : 클립보드로 복사     + composeAction : 지정 대화방에 메시지 작성     + dialerAction : 전화걸기     + reply : 다른 자동응답메시지 연결, 챗봇응답  다른 자동응답메시지 연결 시에는 reply JSON object 내에 autoReplyMsgId 필드에 자동응답메시지ID를 지정하며, postback.data는 자동할당 됩니다.    |  [optional] |



