

# DetailInfo

리치카드 메시지 상품별 1라인당 글자수, 타이틀 라인수 및 버튼 수에 따라 메시지가 잘려 보이지 않는 최대 라인수 정보를 제공합니다. 메시지가 수신된 단말에 따라 상이할 수 있으나 리치카드 RCS메시지 발송 시 권장사항으로 참고하시기 바랍니다. LMS와 MMS 12종 총 13종에 대해 개별 제공됩니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCardType** | **String** | 상품 카드 종류 |  [optional] |
|**releaseDate** | **String** | 정보 제공 일자(내용 수정시 일시 변경) |  [optional] |
|**summary** | **String** | 요약 정보 |  [optional] |
|**charactersPerLine** | [**DetailInfoCharactersPerLine**](DetailInfoCharactersPerLine.md) |  |  [optional] |
|**combinations** | [**List&lt;DetailInfoCombinationsInner&gt;**](DetailInfoCombinationsInner.md) | 디스크립션 권장 라인수 조합 |  [optional] |



