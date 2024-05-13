

# LineObject

Line을 표현할 수 있는 템플릿 상품인 경우 설정 시 적용되며 지원하지 않는 상품은 무시됩니다.(현재 스타일 템플릿만 Line을 사용할 수 있습니다.) lineIndex만 사용되며 향후 속성이 추가될 수 있습니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineIndex** | [**LineIndexEnum**](#LineIndexEnum) | 템플릿에 Line을 행별로 표시합니다.  현재는 스타일(Cell) 템플릿에서 Text 행 아래 삽입되며 총 9개까지 지원합니다.   lineIndex 값은 템플릿 내의 지정 위치 값을 의미 합니다. 예를 들어 lineIndex 2는 두번째 Text 행 아래 입니다.  |  |
|**decoration** | [**LineDecoration**](LineDecoration.md) |  |  [optional] |



## Enum: LineIndexEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |



