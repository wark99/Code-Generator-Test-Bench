

# RegBrandLayout

레이아웃 등록 객체 정보 입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**layoutName** | **String** | 레이아웃 이름을 지정합니다.  |  |
|**productCode** | [**ProductCodeEnum**](#ProductCodeEnum) | 레이아웃의 메시지 상품 코드 입니다. |  |
|**sampleLayoutId** | **String** | 샘플 레이아웃 ID 입니다. 샘플 레이아웃을 이용하여 부분적으로 컴포넌트 변경하여 등록하는 경우 설정합니다. |  [optional] |
|**headerComposition** | [**List&lt;LayoutComponent&gt;**](LayoutComponent.md) | 카드 내의 최상위 영역으로 1개의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 headerYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.   컴포넌트를 지정하지 않을 경우 빈 배열로 등록 합니다.    |  |
|**bodyComposition** | [**List&lt;LayoutComponent&gt;**](LayoutComponent.md) | 카드 내의 중간 영역으로 메시지 상품에서 지정한 개수의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 bodyYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.   예를 들어 LMS는 최대 6개의 컴포넌트를 지정할 수 있으며, 최대 개수 범위 내에서 각 영역별 배분할 수 있습니다.           + Header 1개 지정 시 body 최대 5개     + body만 지정 시 최대 6개  |  |
|**footerComposition** | [**List&lt;LayoutComponent&gt;**](LayoutComponent.md) | 카드 내의 최하단 영역으로 1개의 컴포넌트를 지정할 수 있습니다.   컴포넌트 중 footerYn &#x3D; &#39;Y&#39; 인 컴포넌트만 등록이 가능합니다.   컴포넌트를 지정하지 않을 경우 빈 배열로 등록 합니다.   현재는 footer에 사용자가 직접 지정하는 컴포넌트는 없습니다.  |  |



## Enum: ProductCodeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LMS | &quot;lms&quot; |
| MMS | &quot;mms&quot; |



