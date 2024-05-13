

# RegMessagebaseInfo

템플릿 등록 정보 객체입니다.  템플릿 등록시 지정된 messagebaseform의 widgetPolicy 의 속성만 수정/삭제가 가능합니다. formattedString에 템플릿이 정의되며 지정된 형식에 맞게 등록되어야 합니다. formattedString 내 suggestions에 추가 가능한 버튼 Action은 다음 링크에서 확인 가능합니다.  **[버튼 Action 목록 Link](https://file.rcsbizcenter.com/231214143124234/TS-231214143124234-fVDQnA_1.xlsx)** 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagebaseformId** | **String** | 텡플릿 양식 ID |  |
|**custTmpltId** | **String** | 사용자 지정 템플릿ID로 영문/숫자 25자 이내만 가능 |  |
|**tmpltName** | **String** | 템플릿명 |  |
|**brandId** | **String** | 브랜드ID |  |
|**agencyId** | **String** | 대행사ID |  [optional] |
|**formattedString** | [**RegRCSMessage**](RegRCSMessage.md) |  |  [optional] |



