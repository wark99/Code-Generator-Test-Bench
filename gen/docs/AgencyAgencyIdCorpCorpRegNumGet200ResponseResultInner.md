

# AgencyAgencyIdCorpCorpRegNumGet200ResponseResultInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**corpRegNum** | **String** | 조회 요청한 사업자등록번호 |  [optional] |
|**conditionValue** | [**ConditionValueEnum**](#ConditionValueEnum) | 등록 여부 및 브랜드, 대행사 지정 현황 상태값 0: RBC 미등록 사업자등록번호&lt;br&gt; 1: RBC 등록 사업자등록번호이나 브랜드 등록 없음&lt;br&gt; 2: 1건 이상의 브랜드 등록있으나 대행사 지정 건 없음&lt;br&gt; 3: 1건 이상 브랜드 등록 및 1개 이상 대행사 지정 존재  |  [optional] |
|**conditionDescription** | [**ConditionDescriptionEnum**](#ConditionDescriptionEnum) | conditionValue 에 대한 설명  |  [optional] |



## Enum: ConditionValueEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: ConditionDescriptionEnum

| Name | Value |
|---- | -----|
| RBC_ | &quot;RBC 미등록 사업자등록번호&quot; |
| RBC_2 | &quot;RBC 등록 사업자등록번호이나 브랜드 등록 없음&quot; |
| _1_ | &quot;1건 이상의 브랜드 등록있으나 대행사 지정 건 없음&quot; |
| _1_1_ | &quot;1건 이상 브랜드 등록 및 1개 이상 대행사 지정 존재&quot; |



