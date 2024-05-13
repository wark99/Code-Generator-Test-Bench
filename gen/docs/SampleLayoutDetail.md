

# SampleLayoutDetail

샘플 레이아웃 상세 정보 입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spec** | [**SpecEnum**](#SpecEnum) | 레이아웃 구조가 리치카드인지 오픈리치카드인지 구분합니다. 샘플 레이아웃은 오픈리치카드로 구성되어 있습니다.  |  [optional] |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | 카드 종류를 구분합니다.   레이아웃에 표시되는 카드 타입은 다음 두 가지로 제한됩니다.   + format : 이통사 제공 공통포맷의 카드 타입입니다.     + formatBr : 사용자가 등록한 레이아웃의 카드 타입입니다.  |  [optional] |
|**buttonColor** | **Object** | 버튼에 지정된 컬러 값을 표시합니다.   지정된 경우 컬러 Hex 값(예,&#39;#FFFFFF&#39;)이 표시되며, 미지정 시 빈값 입니다.    |  [optional] |
|**headerComposition** | **Object** | 카드 내의 최상위 영역으로 1개의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 headerYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.  |  [optional] |
|**bodyComposition** | **Object** | 카드 내의 중간 영역으로 메시지 상품에서 지정한 개수의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 bodyYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.   예를 들어 LMS는 최대 6개의 컴포넌트를 지정할 수 있으며, 최대 개수 범위 내에서 각 영역별 배분할 수 있습니다.           + Header 1개 지정 시 body 최대 5개     + body만 지정 시 최대 6개  |  [optional] |
|**footerComposition** | **Object** | 카드 내의 최상위 영역으로 1개의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 footerYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.   현재는 footer에 사용자가 직접 지정하는 컴포넌트는 없습니다.  |  [optional] |
|**formattedString** | [**OpenrichcardMessage**](OpenrichcardMessage.md) | 샘플 레이아웃을 구성한 openrichcard 메시지 구조 정보 입니다.   레이아웃 등록/수정 시에는 컴포넌트를 활용하므로 formattedString 은 참조 데이터로 제공됩니다.    |  [optional] |
|**sampleLayoutId** | **Object** | 샘플 레이아웃 ID 입니다. |  [optional] |
|**sampleLayoutName** | **Object** | 샘플 레이아웃 이름 입니다. |  [optional] |
|**productCode** | [**ProductCodeEnum**](#ProductCodeEnum) | 샘플 레이아웃의 메시지 상품 코드 입니다. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 샘플 레이아웃의 상태를 표시합니다.      + ready : 사용     + pause : 사용중지  |  [optional] |
|**registerId** | **Object** | 등록자 ID 입니다. |  [optional] |
|**registerDate** | **Object** | 등록일시 입니다. |  [optional] |
|**updateDate** | **Object** | 수정일시 입니다. |  [optional] |
|**approvalResult** | [**ApprovalResultEnum**](#ApprovalResultEnum) | 레이아웃 등록 상태입니다. 레이아웃은 운영자 검수 없이 자동 등록됩니다.        - 등록완료 : 이통3사에 정상 등록된 상태입니다.                   - 저장 : RBC 웹에서 저장만 했을 경우 상태이며 별도 등록요청을 해야 합니다.     - 처리중 : 이통 3사 등록 중 에러로 인해 최종 완료가 되지 않은 상태로 수정이나 삭제가 불가능한 상태입니다.     |  [optional] |



## Enum: SpecEnum

| Name | Value |
|---- | -----|
| OPENRICHCARD | &quot;openrichcard&quot; |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| FORMAT | &quot;format&quot; |
| FORMATBR | &quot;formatBr&quot; |



## Enum: ProductCodeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LMS | &quot;lms&quot; |
| MMS | &quot;mms&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| PAUSE | &quot;pause&quot; |



## Enum: ApprovalResultEnum

| Name | Value |
|---- | -----|
| _ | &quot;등록완료&quot; |
| _2 | &quot;저장&quot; |
| _3 | &quot;처리중&quot; |



