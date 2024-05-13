

# LayoutRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | [**ProductCodeEnum**](#ProductCodeEnum) | 레이아웃 사용이 가능한 메시지 상품 코드 입니다. |  [optional] |
|**componentCount** | **Integer** | 레이아웃 정의 시 지정 가능한 최대 컴포넌트 개수 입니다. |  [optional] |
|**componentMinCount** | **Integer** | 레이아웃 정의 시 필요한 최소 컴포넌트 개수 입니다. |  [optional] |
|**buttonCount** | **Integer** | 레이아웃 정의 시 지정 가능한 버튼 컴포넌트 개수 입니다. |  [optional] |
|**componentLimit** | [**LayoutRuleComponentLimit**](LayoutRuleComponentLimit.md) |  |  [optional] |



## Enum: ProductCodeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LMS | &quot;lms&quot; |
| MMS | &quot;mms&quot; |



