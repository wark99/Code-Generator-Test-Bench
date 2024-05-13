

# RegTemplateInfoBodyInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**param** | **Object** | messagebaseform JSON의 ROOT.params[n-1].param 과 동일한 값으로 템플릿 구성 File(이미지)의 표시 위치에 해당합니다. |  |
|**value** | **Object** | 템플릿에 지정할 File(이미지) - maapfile://{fileId} 형식으로 입력합니다. |  |
|**decoration** | [**LineDecoration**](LineDecoration.md) |  |  [optional] |
|**lineIndex** | [**LineIndexEnum**](#LineIndexEnum) | 템플릿에 Line을 행별로 표시합니다.  현재는 스타일(Cell) 템플릿에서 Text 행 아래 삽입되며 총 9개까지 지원합니다.   lineIndex 값은 템플릿 내의 지정 위치 값을 의미 합니다. 예를 들어 lineIndex 2는 두번째 Text 행 아래 입니다.  |  |



## Enum: LineIndexEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |



