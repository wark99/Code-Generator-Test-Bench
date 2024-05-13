

# NotiAgencyKey

대행사 키가 재발급된 경우에 한하여 전달됩니다. 삭제 시에는 전송되지 않습니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notiType** | **String** | webhook 알림 타입 구분값 입니다. |  |
|**agencyKey** | **String** | 재발급으로 새로 생성된 agencyKey 입니다.  |  |
|**method** | [**MethodEnum**](#MethodEnum) | 대상의 CRUD 정보를 제공합니다.&lt;br&gt; &#39;created&#39;: 재발급으로 새로운 agencyKey가 생성된 경우 표시됩니다. &lt;br&gt;  |  [optional] |
|**date** | **String** | 재발급 일시입니다..  |  [optional] |
|**userName** | **String** | 대행사 키를 재발급한 대행사 담당자의 이름입니다.  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |



