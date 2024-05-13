

# BrandDetail

브랜드 상세 정보 객체입니다.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **Object** | 브랜드 설명에 등록된 내용입니다. |  [optional] |
|**tel** | **Object** | 브랜드홈에 노출될 전화번호(대표발신번호와 별개) 입니다.  |  [optional] |
|**menus** | **Object** | 브랜드 홈에는 최대 4개까지 표시됩니다. chat은 기본 등록 되므로 지정할 수 있는 최대 menu는 3개이며, 등록 시 call을 포함하지 않고 2개 이하 지정할 경우 call을 기본 추가합니다. |  [optional] |
|**categoryId** | **Object** | 브랜드 카테고리 ID 입니다. |  [optional] |
|**categoryName** | **Object** | 브랜드 카테고리 명 입니다. |  [optional] |
|**subCategoryId** | **Object** | 브랜드 하위 카테고리 ID 입니다. |  [optional] |
|**subCategoryName** | **Object** | 브랜드 하위 카테고리 명 입니다. |  [optional] |
|**categoryOpt** | **Object** | 검색용 키워드 임의 등록 할 수 있습니다. |  [optional] |
|**zipCode** | **Object** | 브랜드 홈에 표시될 우편번호(5자리) 입니다. |  [optional] |
|**roadAddress** | **Object** | 브랜드 홈에 표시되는 도로명주소 입니다. |  [optional] |
|**detailAddress** | **Object** | 브랜드 홈에 표시되는 상세주소 입니다. |  [optional] |
|**email** | **Object** | 브랜드 홈에 표시되는 이메일주소 입니다. |  [optional] |
|**webSiteUrl** | **Object** | 브랜드 홈에 표시되는 홈페이지 주소 입니다. |  [optional] |
|**approvalReason** | **Object** | 검수 시 반려 사유가 제공됩니다. |  [optional] |
|**brandFeedUrl** | **Object** | 브랜드 소식 URL 입니다. 브랜드 소식을 최초 등록하거나 브랜드 홈 기본 탭을 소식탭(FEED)로 설정하면 자동 생성됩니다.  |  [optional] |
|**initTab** | [**InitTabEnum**](#InitTabEnum) | 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다. 미지정 시 기본값은 FEED 입니다. + FEED: 소식탭을 기본 탭으로 지정합니다. + INFO: 정보탭을 기본 탭으로 지정합니다. 브랜드 최초 승인 시에만 선택이 가능하며 승인 이후에는 수정이 불가합니다.  |  [optional] |
|**initFeedItem** | [**InitFeedItemEnum**](#InitFeedItemEnum) | 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D;퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D;퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.    |  [optional] |
|**initFeedItems** | **Object** | initTab FEED인 경우, 소식탭에 표시할 메뉴를 지정합니다.   menus에서 설정한 항목 중 소식탭에 표시할 항목을 지정합니다. 즉, menus에 지정되지 않은 항목을 설정하면 error 처리 됩니다.   menus는 최대 3개까지 지정할 수 있으며, menus에 설정한 3개항목과 소식탭에만 표시가능한 portalsearch를 추가로 등록할 경우 최대 4개가 등록됩니다.    |  [optional] |
|**templateColor** | **Object** | 브랜드 내 등록되는 템플릿의 버튼 컬러 값을 지정합니다.   컬러값은 Hex code 형식만 유효합니다.  |  [optional] |
|**bizInfoYn** | [**BizInfoYnEnum**](#BizInfoYnEnum) | 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.    |  [optional] |
|**bizInfoTitle** | **Object** | bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 제목을 지정합니다.    |  [optional] |
|**bizInfoContent** | **Object** | bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 내용을 지정합니다.  |  [optional] |
|**brandId** | **Object** | 브랜드ID - 브랜드 등록 시 자동 생성됩니다. |  |
|**name** | **Object** | 브랜드 이름 - 브랜드 등록 시 지정합니다. |  |
|**brandKey** | **Object** | 브랜드 Key - 브랜드 등록 시 자동 생성됩니다. |  [optional] |
|**registerDate** | **Object** | 등록일시 - 브랜드 등록 일시입니다. |  [optional] |
|**approvalDate** | **Object** | 승인일시 - 브랜드가 검수에서 승인된 일시입니다. |  [optional] |
|**updateDate** | **Object** | 수정일시 - 브랜드의 정보가 수정된 일시입니다. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 브랜드의 상태 입니다.      + 저장 : RCS Biz Center 홈페이지에서 브랜드 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 브랜드 등록 직후 검수 이전 상태입니다.     + 검수시작 : 브랜드 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 브랜드 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 브랜드는 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 승인대기(수정) : 승인된 브랜드 변경 시 검수 대상으로 판단되어 검수 요청된 상태입니다.     + 검수시작(수정) : 승인된 브랜드 변경으로 승인요청된 브랜드 검수가 시작된 상태입니다.     + 반려(수정) : 승인된 브랜드 변경 검수 처리 결과 반려된 상태입니다.     + 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다.       브랜드 조회 API 호출 시 수정 이전 브랜드 정보가 제공됩니다.    |  [optional] |
|**mediaUrl** | **Object** | 이미지 파일ID와 URL 및 사용 유형 정보를 제공합니다.  |  [optional] |
|**chatbotDate** | **Object** | 브랜드 내 등록된 대화방 중 가장 최근에 변경된 대화방의 일시 정보 입니다.  |  [optional] |
|**messagebaseDate** | **Object** | 브랜드 내 등록된 템플릿 중 가장 최근에 변경된 템플릿의 일시 정보 입니다.  |  [optional] |



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



## Enum: BizInfoYnEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _ | &quot;승인대기&quot; |
| _2 | &quot;검수시작&quot; |
| _3 | &quot;승인&quot; |
| _4 | &quot;반려&quot; |
| _5 | &quot;검수완료&quot; |
| _6 | &quot;저장&quot; |
| _7 | &quot;승인대기(수정)&quot; |
| _8 | &quot;검수시작(수정)&quot; |
| _9 | &quot;반려(수정)&quot; |
| _10 | &quot;검수완료(수정)&quot; |



