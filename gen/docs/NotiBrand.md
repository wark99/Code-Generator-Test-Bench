

# NotiBrand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notiType** | **String** |  |  |
|**brandId** | **String** |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | 대상별 처리 정보를 제공합니다.&lt;br&gt; &#39;rejected&#39;: 반려 &lt;br&gt; &#39;modified&#39;: 수정 &lt;br&gt;  |  [optional] |
|**reason** | **String** | \&quot;method가 rejected 인 경우 사유를 제공합니다.\&quot;  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| REJECTED | &quot;rejected&quot; |
| MODIFIED | &quot;modified&quot; |



