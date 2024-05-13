

# WebhookUrlPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notiType** | **Object** |  |  |
|**corpId** | **Object** |  |  [optional] |
|**corpRegNum** | **Object** |  |  [optional] |
|**brandId** | **Object** |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | 대상별 처리 정보를 제공합니다.&lt;br&gt; &#39;created&#39;: 승인 또는 신규등록 &lt;br&gt; &#39;rejected&#39;: 반려 &lt;br&gt; &#39;modified&#39;: 수정 &lt;br&gt; &#39;deleted&#39;: 삭제 &lt;br&gt;  |  [optional] |
|**reason** | **Object** | \&quot;method가 rejected 인 경우 사유를 제공합니다.\&quot;  |  [optional] |
|**chatbotId** | **Object** |  |  [optional] |
|**messagebaseformId** | **Object** |  |  [optional] |
|**messagebaseId** | **Object** |  |  [optional] |
|**autoReplyMsgId** | **Object** |  |  [optional] |
|**agencyKey** | **Object** | 재발급으로 새로 생성된 agencyKey 입니다.  |  |
|**date** | **Object** | 재발급 일시입니다..  |  [optional] |
|**userName** | **Object** | 대행사 키를 재발급한 대행사 담당자의 이름입니다.  |  [optional] |
|**fileId** | **Object** |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| REJECTED | &quot;rejected&quot; |
| CREATED | &quot;created&quot; |
| MODIFIED | &quot;modified&quot; |
| DELETED | &quot;deleted&quot; |



