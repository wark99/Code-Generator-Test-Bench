

# MenuItemInfo

브랜드 홈에 표시 가능한 버튼 정보 객체입니다. AppLink와 WebLink가 모두 설정된 경우 단말에 app 이 설치되어 있으면 app을 실행하고 설치되지 않은 경우 weblink로 연결됩니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buttonType** | [**ButtonTypeEnum**](#ButtonTypeEnum) | 버튼 유형 |  |
|**applink** | [**AppLinkItemInfo**](AppLinkItemInfo.md) |  |  [optional] |
|**weblink** | **String** | buttonType call 을 제외한 모든 버튼은 Web URL을 입력해야 합니다. URL은 http:// 또는 https:// 로 시작하여야 합니다.  |  [optional] |



## Enum: ButtonTypeEnum

| Name | Value |
|---- | -----|
| CALL | &quot;call&quot; |
| WEB | &quot;web&quot; |
| APP | &quot;app&quot; |
| STORE | &quot;store&quot; |
| ORDER | &quot;order&quot; |
| BUY | &quot;buy&quot; |
| TICKETS | &quot;tickets&quot; |
| MOREINFO | &quot;moreinfo&quot; |



