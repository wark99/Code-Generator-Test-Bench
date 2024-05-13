

# TableOption

Table / StyleTable등 테이블 컴포넌트의 옵션 정보 객체 입니다.   

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**leftAlign** | [**LeftAlignEnum**](#LeftAlignEnum) | 좌측 컬럼(열) 전체의 글자 정렬 위치를 설정합니다.      + left : 좌측 정렬     + right : 우측 정렬     + center : 중앙 정렬  |  [optional] |
|**rightAlign** | [**RightAlignEnum**](#RightAlignEnum) | 우측 컬럼(열) 전체의 글자 정렬 위치를 설정합니다.      + left : 좌측 정렬     + right : 우측 정렬     + center : 중앙 정렬  |  [optional] |
|**leftTextStyle** | [**LeftTextStyleEnum**](#LeftTextStyleEnum) | 좌측 컬럼(열)에 입력되는 글자 스타일을 지정합니다.      + normal : 기본 스타일   + bold : bold 스타일 적용  |  [optional] |
|**rightTextStyle** | [**RightTextStyleEnum**](#RightTextStyleEnum) | 우측 컬럼(열)에 입력되는 글자 스타일을 지정합니다.      + normal : 기본 스타일   + bold : bold 스타일 적용  |  [optional] |
|**maxCount** | [**MaxCountEnum**](#MaxCountEnum) | 테이블의 행 개수를 지정합니다. 정의된 숫자 이외에는 지정할 수 없습니다.      + 5 : 5행   + 10 : 10행  |  [optional] |



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
| NUMBER_5 | 5 |
| NUMBER_10 | 10 |



