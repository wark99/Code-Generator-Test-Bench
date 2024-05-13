

# StringObject

messagebaseform JSON의 ROOT.params[n-1].type이 string 인 경우, 템플릿에 등록할 Text 입력에 사용되는 Object 입니다. type 하위 속성인 contentType의 값에 따라 입력 가능 형식에 차이가 있습니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**param** | **String** | messagebaseform JSON의 ROOT.params[n-1].param 과 동일한 값으로 템플릿 구성 Text의 표시 위치에 해당 |  |
|**value** | **String** | 영역에 지정할 Text 형식에 맞게 입력해야 합니다. - messagebaseform의 ROOT.params[n-1].contentType이 title, description, cell 인 경우: 고정부와 변수부로 이루어진 문장 - messagebaseform의 ROOT.params[n-1].contentType이 url인 경우: http(s)://로 시작하는 URL 입력  |  |
|**decoration** | [**TextDecoration**](TextDecoration.md) |  |  [optional] |



