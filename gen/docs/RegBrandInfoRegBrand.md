

# RegBrandInfoRegBrand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | 브랜드 홈에 표시되는 브랜드 이름 입니다니다. |  |
|**description** | **String** | 브랜드 홈에 표시되는 브랜드 설명 입니다. |  |
|**tel** | **String** | 브랜드 홈에 노출될 전화번호(대표발신번호와 별개) 입니다.  |  |
|**menus** | [**List&lt;MenuItemInfo&gt;**](MenuItemInfo.md) | 브랜드 홈에는 최대 4개까지 표시됩니다.   chat은 기본 등록 되므로 지정할 수 있는 최대 menu는 3개이며, 등록 시 call을 포함하지 않고 2개 이하 지정할 경우 call을 기본 추가합니다.      + **2020년 12월 3일 기준 브랜드 menus 중 app 은 이통사 정책에 의거 한시적으로 등록이 불가하며 app 등록 시 error 리턴됩니다.**  |  [optional] |
|**categoryId** | **String** | 브랜드 카테고리 ID 입니다. |  |
|**subCategoryId** | **String** | 브랜드 하위 카테고리 ID 입니다. |  |
|**categoryOpt** | **String** | 검색용 키워드 임의 등록 할 수 있습니다. |  [optional] |
|**zipCode** | **String** | 브랜드 홈에 표시될 우편번호(5자리) 입니다. |  [optional] |
|**roadAddress** | **String** | 브랜드 홈에 표시되는 도로명주소 입니다. |  [optional] |
|**detailAddress** | **String** | 브랜드 홈에 표시되는 상세주소 입니다. |  [optional] |
|**email** | **String** | 브랜드 홈에 표시되는 이메일주소 입니다. |  [optional] |
|**webSiteUrl** | **String** | 브랜드 홈에 표시되는 홈페이지 주소 입니다. |  [optional] |
|**initTab** | [**InitTabEnum**](#InitTabEnum) | 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다.   미지정 시 기본값은 FEED 입니다.   + FEED: 소식탭을 기본 탭으로 지정합니다.   + INFO: 정보탭을 기본 탭으로 지정합니다.    |  [optional] |
|**initFeedItem** | [**InitFeedItemEnum**](#InitFeedItemEnum) | 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D; 퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D; 퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색(&#x3D; portalsearch) 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.    |  [optional] |
|**initFeedItems** | [**List&lt;InitFeedItemsEnum&gt;**](#List&lt;InitFeedItemsEnum&gt;) | initTab FEED인 경우, 소식탭에 표시할 메뉴를 지정합니다.   menus에서 설정한 항목 중 소식탭에 표시할 항목을 지정합니다. 즉, menus에 지정되지 않은 항목을 설정하면 error 처리 됩니다.   menus는 최대 3개까지 지정할 수 있으며, menus에 설정한 3개항목과 소식탭에만 표시가능한 portalsearch를 추가로 등록할 경우 최대 4개가 등록됩니다.    |  [optional] |
|**templateColor** | **String** | 브랜드 내 등록되는 템플릿의 버튼 컬러 값을 지정합니다.   컬러값은 Hex code 형식만 유효합니다.  |  [optional] |
|**bizInfoYn** | [**BizInfoYnEnum**](#BizInfoYnEnum) | 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.    |  [optional] |
|**bizInfoTitle** | **String** | bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 제목을 지정합니다.    |  [optional] |
|**bizInfoContent** | **String** | bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 내용을 지정합니다.  |  [optional] |



## Enum: InitTabEnum

| Name | Value |
|---- | -----|
| FEED | &quot;FEED&quot; |
| INFO | &quot;INFO&quot; |



## Enum: InitFeedItemEnum

| Name | Value |
|---- | -----|
| TEL | &quot;TEL&quot; |
| HOME | &quot;HOME&quot; |
| SEARCH | &quot;SEARCH&quot; |



## Enum: List&lt;InitFeedItemsEnum&gt;

| Name | Value |
|---- | -----|
| CALL | &quot;call&quot; |
| WEB | &quot;web&quot; |
| STORE | &quot;store&quot; |
| ORDER | &quot;order&quot; |
| BUY | &quot;buy&quot; |
| TICKETS | &quot;tickets&quot; |
| MOREINFO | &quot;moreinfo&quot; |
| PORTALSEARCH | &quot;portalsearch&quot; |



## Enum: BizInfoYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



