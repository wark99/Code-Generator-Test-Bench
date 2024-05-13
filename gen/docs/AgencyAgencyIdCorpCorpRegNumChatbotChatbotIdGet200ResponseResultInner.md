

# AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200ResponseResultInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**corpRegNum** | **String** | 조회 요청한 사업자등록번호 |  [optional] |
|**chatbotId** | **String** | 조회 요청한 발신번호 |  [optional] |
|**conditionValue** | [**ConditionValueEnum**](#ConditionValueEnum) | 발신번호 등록 여부 상태값 0: RBC 미등록 발신번호&lt;br&gt; 1: 해당 사업자로 등록된 발신번호&lt;br&gt; 2: 해당 사업자로 등록된 발신번호가 아님  |  [optional] |
|**conditionDescription** | [**ConditionDescriptionEnum**](#ConditionDescriptionEnum) | conditionValue 에 대한 설명  |  [optional] |



## Enum: ConditionValueEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: ConditionDescriptionEnum

| Name | Value |
|---- | -----|
| RBC_ | &quot;RBC 미등록 발신번호&quot; |
| _ | &quot;해당 사업자로 등록된 발신번호&quot; |
| _2 | &quot;해당 사업자로 등록된 발신번호가 아님&quot; |



