

# MessagebaseFormInfo

템플릿 생성을 위한 양식 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mediaUrl** | [**List&lt;MediaUrlInner&gt;**](MediaUrlInner.md) | 이미지 파일ID와 URL 및 사용 유형 정보를 제공합니다.  |  [optional] |
|**productCode** | [**ProductCodeEnum**](#ProductCodeEnum) | 메시지 상품종류 구분값입니다. |  [optional] |
|**spec** | [**SpecEnum**](#SpecEnum) | 양식의 레이아웃 구조가 리치카드인지 오픈리치카드인지 구분합니다.  |  [optional] |
|**guideInfo** | [**GuideInfo**](GuideInfo.md) |  |  [optional] |
|**policyInfo** | [**PolicyInfo**](PolicyInfo.md) |  |  [optional] |
|**params** | **Object** |  |  [optional] |
|**formattedString** | [**RCSMessage**](RCSMessage.md) |  |  [optional] |
|**messagebaseformId** | **Object** | 템플릿 양식 ID 입니다. |  |
|**formName** | **Object** | 템플릿 양식명 입니다. |  |
|**cardType** | **Object** | 카드종류를 구분합니다. 향후 추가될 수 있습니다.&lt;br&gt; [openrichcard]&lt;br&gt; - Description&lt;br&gt; - Cell&lt;br&gt; - Free&lt;br&gt;  |  [optional] |
|**bizCondition** | **Object** | 양식을 사용할 수 있는 대상 업태의 목록입니다.  |  [optional] |
|**bizCategory** | **Object** | Description, Cell의 유형그룹 입니다.&lt;br&gt; 예)&lt;br&gt; -  일반&lt;br&gt; -  금융&lt;br&gt; -  유통/커머스&lt;br&gt; -  교통&lt;br&gt; -  엔터테인먼트&lt;br&gt; -  IT서비스&lt;br&gt; -  공공&lt;br&gt; -  타이틀 자유형&lt;br&gt;  |  [optional] |
|**bizService** | **Object** | Description, Cell의 세부 유형 입니다.&lt;br&gt; 예)&lt;br&gt; -  승인&lt;br&gt; -  입금&lt;br&gt; -  출금&lt;br&gt; -  출고&lt;br&gt; -  주문&lt;br&gt; -  배송&lt;br&gt; -  예약&lt;br&gt; -  회원가입&lt;br&gt; -  인증&lt;br&gt; -  타이틀 자유형&lt;br&gt;  |  [optional] |
|**registerDate** | **Object** | 템플릿 양식 등록일시 입니다. |  [optional] |
|**updateDate** | **Object** | 템플릿 양식 수정일시 입니다. |  [optional] |



## Enum: ProductCodeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LMS | &quot;lms&quot; |
| MMS | &quot;mms&quot; |
| TMPLT | &quot;tmplt&quot; |



## Enum: SpecEnum

| Name | Value |
|---- | -----|
| RICHCARD | &quot;richcard&quot; |
| OPENRICHCARD | &quot;openrichcard&quot; |



