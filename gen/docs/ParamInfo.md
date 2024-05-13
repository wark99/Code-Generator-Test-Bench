

# ParamInfo

템플릿의 개별 파라미터를 검수하기 위한 대상 파라미터 정보 객체입니다. <br> 크기 관련 필드는 <=0 인 경우 체크하지 않습니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**param** | **String** | 검수 파라미터명. (영문, 한글, 숫자, &#39;_&#39; 만 사용) |  |
|**isMandatory** | **Boolean** | 필수여부. true인 경우 중계사에서 메시지 전송 요청 시 해당 필드가 없는 경우 MaaP FE에서 실패처리한다. false인 경우는 해당 필드가 없는 경우도 메시지 전송이 되도록 MaaP FE에서 적절하게 처리한다.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 기술검사타입을 지정합니다.&lt;br&gt; - string: 문자열 검사 대상&lt;br&gt; - file: 파일 검사 대상&lt;br&gt; - button: formattedString 내 button 제어 대상&lt;br&gt; - layout: formattedString 내 button외 제어 대상&lt;br&gt;  |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | 컨텐츠 유형, PolicyInfo 정책을 검사하는데 사용됩니다.  |  [optional] |
|**strSize** | **Integer** | 글자 최대 크기, type이 string인 경우 |  [optional] |
|**fileSize** | **Integer** | 파일 최대 크기, type이 file인 경우. |  [optional] |
|**strRegx** | **String** | java regular expression, null 인경우 사용하지 않음. 예)      1) 숫자만 : &#39;^[0-9]\\*$&#39;     2) 영문자만 : &#39;[a-zA-Z]\\*$&#39;     3) 한글만 : &#39;^[가-힣]\\*$&#39;     4) 영어 &amp; 숫자만 : &#39;^[a-zA-Z0-9]\\*$&#39;     5) E-Mail : &#39;^[a-zA-Z0-9]+@[a-zA-Z0-9]+$&#39;     6) 휴대폰 : &#39;^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$&#39;     7) 일반전화 : &#39;^\\d{2,3}-\\d{3,4}-\\d{4}$&#39;     8) 주민등록번호 : &#39;\\d{6}\\-[1-4]\\d{6}&#39;     9) IP 주소 : &#39;([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})&#39;    |  [optional] |
|**verification** | **List&lt;String&gt;** | 문장 패턴 정의 (SKT향) \&quot;안녕하세요\&quot;, \&quot;님 \&quot;, \&quot;원입니다.\&quot;  |  [optional] |
|**imageWidth** | **Integer** | 이미지 해상도 가로 크기 (지정된 크기의 이미지를 등록해야 정상 발송 가능) |  [optional] |
|**imageHeight** | **Integer** | 이미지 해상도 세로 크기 (지정된 크기의 이미지를 등록해야 정상 발송 가능) |  [optional] |
|**couplingId** | **String** | 파라미터 간 함께 처리되어야 하는 경우 동일한 값을 부여&lt;br&gt; 즉, 같은 값의 couplingId가 지정되는 경우 지정된 파라미터는 모두 조건을 만족해야 정상 발송 처리됨  |  [optional] |
|**inputText** | **String** | 템플릿 등록시 사용자 입력한 원본 문장(고정부 &amp; 변수부)을 제공합니다. 단, cell방식의 타이틀 선택형은 제공되지 않습니다.  |  [optional] |
|**relationId** | **String** | param과 관계가 있는 param을 의미합니다. 주로 현재 param이 입력되지 않을 경우 메시지 상에 노출여부와 연관된 visibility에 지정된 param을 표시합니다. &lt;br&gt; 메시지 발송시 이통MaaP FE에서 핸들링하는 것으로 템플릿 등록이나 메시지 발송 param과는 무관하며, 참조 용도로 제공됩니다.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| FILE | &quot;file&quot; |
| BUTTON | &quot;button&quot; |
| LAYOUT | &quot;layout&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TITLE | &quot;title&quot; |
| DESCRIPTION | &quot;description&quot; |
| MAAPFILE | &quot;maapfile&quot; |
| CELL | &quot;cell&quot; |
| DISPLAYTEXT | &quot;displayText&quot; |
| URL | &quot;url&quot; |
| ETC | &quot;etc&quot; |
| BUTTONNAME | &quot;buttonName&quot; |
| VISIBILITY | &quot;visibility&quot; |



