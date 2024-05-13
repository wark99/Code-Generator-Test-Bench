

# TextDecoration

StringObject에서 사용되는 text 서식입니다.  서식을 지원하는 템플릿 상품인 경우 설정이 적용되며, 서식을 지원하지 않는 템플릿 상품에 설정하면 무시됩니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**textSize** | **String** | 글자 크기 지정시 사용합니다.  숫자 뒤에 단위 dp를 반드시 붙여서 입력하여야 합니다.  |  [optional] |
|**textAlignment** | [**TextAlignmentEnum**](#TextAlignmentEnum) | 문장 정렬 지정시 사용합니다. 지원하는 정렬의 종류는 다음과 같습니다. - textStart: 왼쪽 정렬 - center: 중앙 정렬 - textEnd: 오른쪽 정렬  |  [optional] |
|**textStyle** | [**TextStyleEnum**](#TextStyleEnum) | 문장의 글자를 굵게 표현할 때 사용합니다. |  [optional] |
|**textColor** | **String** | 문장의 글자 색상을 지정한 색상 값으로 설정합니다. - 색상코드 Hex 표현식 |  [optional] |



## Enum: TextAlignmentEnum

| Name | Value |
|---- | -----|
| TEXTSTART | &quot;textStart&quot; |
| CENTER | &quot;center&quot; |
| TEXTEND | &quot;textEnd&quot; |



## Enum: TextStyleEnum

| Name | Value |
|---- | -----|
| BOLD | &quot;bold&quot; |



