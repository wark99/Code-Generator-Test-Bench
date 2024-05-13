

# ContractInfo

브랜드와 대행사의 계약관계 정보입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**corpId** | **String** | RCS Biz Center에 등록된 기업 ID 입니다. |  |
|**corpRegNum** | **String** | RCS Biz Center에 등록된 기업의 사업자등록번호 입니다. |  [optional] |
|**brandId** | **String** | 브랜드 ID 입니다. |  |
|**brandName** | **String** | 브랜드 명 입니다. |  [optional] |
|**agencyId** | **String** | 대행사 ID 입니다. |  |
|**contracts** | [**List&lt;ContractsEnum&gt;**](#List&lt;ContractsEnum&gt;) | 계약 유형 입니다. |  [optional] |
|**registerDate** | **OffsetDateTime** | 계약정보 등록일시 입니다. |  [optional] |
|**updateDate** | **OffsetDateTime** | 계약정보 수정일시 입니다. |  [optional] |
|**brandDate** | **OffsetDateTime** | 계약된 대상 브랜드의 최종 변경 일시 정보 입니다.  |  [optional] |
|**chatbotDate** | **OffsetDateTime** | 브랜드 내 등록된 대화방 중 가장 최근에 변경된 대화방의 일시  정보 입니다.  |  [optional] |
|**messagebaseDate** | **OffsetDateTime** | 브랜드 내 등록된 템플릿 중 가장 최근에 변경된 템플릿의 일시  정보 입니다.  |  [optional] |
|**logoDate** | **OffsetDateTime** | 브랜드 내 등록된 브랜드 로고 중 가장 최근에 변경된 로고의 일시 정보 입니다.  |  [optional] |



## Enum: List&lt;ContractsEnum&gt;

| Name | Value |
|---- | -----|
| A2P | &quot;a2p&quot; |
| CHAT | &quot;chat&quot; |



