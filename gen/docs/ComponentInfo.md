

# ComponentInfo

컴포넌트 정보 객체입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**componentId** | **String** | 컴포넌트 ID 입니다. |  [optional] |
|**componentName** | **String** | 컴포넌트 이름 입니다. |  [optional] |
|**iconImgFileUrl** | **String** | 컴포넌트 모양을 아이콘으로 표현한 이미지 파일 주소입니다. |  [optional] |
|**status** | **String** | 컴포넌트의 사용 가능 여부, 범위를 표시합니다.      + public: 레이아웃 등록/수정 시 사용 가능한 컴포넌트 입니다.     + private: RBC에서 특정 케이스별 추가하는 컴포넌트로 레이아웃 등록/수정 시 별도 사용할 수 없습니다.     + tpl: 템플릿에서 사용되는 컴포넌트로 레이아웃 등록/수정 시 사용할 수 없습니다.     + disable: 사용할 수 없는 컴포넌트 입니다. 제공 중이던 컴포넌트가 사용 중지된 경우 설정됩니다.  |  [optional] |
|**headerYn** | [**HeaderYnEnum**](#HeaderYnEnum) | 레이아웃의 Header 영역 내 사용 가능 여부입니다.      + Y: 가능   + N: 불가능  |  [optional] |
|**bodyYn** | [**BodyYnEnum**](#BodyYnEnum) | 레이아웃의 Body 영역 내 사용 가능 여부입니다.      + Y: 가능   + N: 불가능  |  [optional] |
|**footerYn** | [**FooterYnEnum**](#FooterYnEnum) | 레이아웃의 footer 영역 내 사용 가능 여부입니다.      + Y: 가능   + N: 불가능  |  [optional] |
|**options** | [**ComponentInfoOptions**](ComponentInfoOptions.md) |  |  [optional] |
|**groupComponentId** | **String** | 컴포넌트 그룹 ID 입니다.   동일한 컴포넌트 그룹ID를 갖는 컴포넌트는 레이아웃의 body 영역에서 함께 사용될 수 없습니다.  |  [optional] |



## Enum: HeaderYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: BodyYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: FooterYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



