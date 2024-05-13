

# ModTemplateInfo

템플릿 수정 시 사용되는 Object 입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandId** | **String** | 브랜드ID |  |
|**messagebaseformId** | **String** | 텡플릿 양식 ID |  [optional] |
|**tmpltName** | **String** | 템플릿명 |  |
|**agencyId** | **String** | 대행사ID |  [optional] |
|**body** | [**List&lt;RegTemplateInfoBodyInner&gt;**](RegTemplateInfoBodyInner.md) | messagebaseform JSON의 ROOT.params[n-1] object의 type 이 file, string 인 경우, 각 속성에 맞는 데이터 Object를 사용하여 템플릿을 구성합니다. messageabseform JSON의 ROOT.params[n-1].isMandatory 가 true 이면 템플릿 등록을 위해 필수로 등록해야 하는 요소이므로 반드시 데이터를 설정해야 템플릿 등록이 가능합니다.  |  |
|**buttons** | [**List&lt;RegTemplateInfoButtonsInner&gt;**](RegTemplateInfoButtonsInner.md) | 템플릿에 버튼을 설정하는 경우 지정합니다.   이통사 발송규격에서 제공되는 buttons와 동일한 사용 방식으로 템플릿에 표시되는 버튼을 지정할수 있습니다. 이미지 템플릿 슬라이드형의 경우 buttons 배열 내 object가 각 카드에 해당하며, object 하위 suggestions 배열 내에 messagebaseform의 policyInfo.maxButtonCount 지정 숫자만큼 버튼을 등록할 수 있습니다. 지정 가능한 RCS 버튼 액션은 아래 링크의 파일을 확인해 주세요.  **[버튼 Action 목록 Link](https://file.rcsbizcenter.com/231214143124234/TS-231214143124234-fVDQnA_1.xlsx)**  actiond의 displayText, postback을 제외한 action 하위 항목에 다음과 같이 변수부를 지정할 수 있습니다. - urlAction: openUrl 하위 url 설정 값 중 URL 하위 경로만 변수 지정 가능 (예, https://www.rcsbizcenter.com/{{변수}}) - mapAction(좌표, 쿼리 방식): location 하위 속성의 값 - calendarAction: createCalendarEvent 하위 속성의 값 - clipboardAction: copyToClipboard 하위 속성의 값 - composeAction: composeTextMessage 하위 속성 값 - dialerAction: dialPhoneNumber 하위 속성의 값  |  [optional] |



