

# NotiTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notiType** | **String** |  |  |
|**brandId** | **String** |  |  [optional] |
|**messagebaseformId** | **String** |  |  [optional] |
|**messagebaseId** | **String** |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | 대상별 처리 정보를 제공합니다.&lt;br&gt; &#39;rejected&#39;: 반려 &lt;br&gt; &#39;created&#39;: 승인 또는 신규등록 &lt;br&gt; &#39;modified&#39;: 수정 &lt;br&gt; &#39;deleted&#39;: 삭제 &lt;br&gt;  |  [optional] |
|**reason** | **String** | \&quot;method가 rejected 인 경우 사유를 제공합니다.\&quot;  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| REJECTED | &quot;rejected&quot; |
| CREATED | &quot;created&quot; |
| MODIFIED | &quot;modified&quot; |
| DELETED | &quot;deleted&quot; |



