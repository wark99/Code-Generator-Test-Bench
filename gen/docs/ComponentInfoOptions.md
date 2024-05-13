

# ComponentInfoOptions

레이아웃 사용 시 컴포넌트에 적용될 수 있는 옵션입니다.   옵션 지정이 가능한 경우 표기됩니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**leftAlign** | [**LeftAlignEnum**](#LeftAlignEnum) | 좌측 컬럼(열) 전체의 글자 정렬 위치를 설정합니다.      + left : 좌측 정렬     + right : 우측 정렬     + center : 중앙 정렬  |  [optional] |
|**rightAlign** | [**RightAlignEnum**](#RightAlignEnum) | 우측 컬럼(열) 전체의 글자 정렬 위치를 설정합니다.      + left : 좌측 정렬     + right : 우측 정렬     + center : 중앙 정렬  |  [optional] |
|**leftTextStyle** | [**LeftTextStyleEnum**](#LeftTextStyleEnum) | 좌측 컬럼(열)에 입력되는 글자 스타일을 지정합니다.      + normal : 기본 스타일   + bold : bold 스타일 적용  |  [optional] |
|**rightTextStyle** | [**RightTextStyleEnum**](#RightTextStyleEnum) | 우측 컬럼(열)에 입력되는 글자 스타일을 지정합니다.      + normal : 기본 스타일   + bold : bold 스타일 적용  |  [optional] |
|**maxCount** | [**MaxCountEnum**](#MaxCountEnum) | 테이블의 행 개수를 지정합니다. 정의된 숫자 이외에는 지정할 수 없습니다.      + 5 : 5행   + 10 : 10행  |  [optional] |
|**color** | **Object** | 버튼의 색상 설정 옵션입니다.   버튼의 색상은 브랜드 정보에서 지정한 templateColor 컬러 Hex 값과 동일해야 합니다.   빈값 지정 시 기본 버튼 컬러로 적용되며, 지정된 컬러 Hex 값이 templateColor의 값과 다르면 templateColor로 강제 설정됩니다.    |  [optional] |



## Enum: LeftAlignEnum

| Name | Value |
|---- | -----|
| LEFT | &quot;left&quot; |
| RIGHT | &quot;right&quot; |
| CENTER | &quot;center&quot; |



## Enum: RightAlignEnum

| Name | Value |
|---- | -----|
| LEFT | &quot;left&quot; |
| RIGHT | &quot;right&quot; |
| CENTER | &quot;center&quot; |



## Enum: LeftTextStyleEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;normal&quot; |
| BOLD | &quot;bold&quot; |



## Enum: RightTextStyleEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;normal&quot; |
| BOLD | &quot;bold&quot; |



## Enum: MaxCountEnum

| Name | Value |
|---- | -----|
| _5 | &quot;5&quot; |
| _10 | &quot;10&quot; |



