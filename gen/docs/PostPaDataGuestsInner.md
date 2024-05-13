

# PostPaDataGuestsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isMainGuest** | **Boolean** | If is the main guest of the reservation set True, else False |  |
|**docType** | **String** | The type of document, must have one of the following value. &#39;IDENT&#39; (paper identity card), &#39;IDELE&#39; (electronic identity card), &#39;PASOR&#39; (passport), &#39;PATEN&#39; (driving licence) |  |
|**idDoc** | **String** | Document id |  |
|**docPlace** | **String** | Document relase country code (following the codes specificated in the API description) |  |
|**birthDate** | **LocalDate** | Birth date of the guest |  |
|**birthCountry** | **String** | Birth country code of the guest (following the codes specificated in the API description) |  |
|**birthProv** | **String** | Birth province code of the guest, mandatory if birth country is Italy (following the codes specificated in the API description) |  [optional] |
|**birthCity** | **String** | Birth city code of the guest, mandatory if birth country is Italy (following the codes specificated in the API description) |  [optional] |
|**firstName** | **String** | First name of the guest |  |
|**lastName** | **String** | Last name of the guest |  |
|**sex** | **Integer** | Sex of the guest, 1 if male, 2 if female |  |
|**citizenship** | **String** | Citizenship code of the guest (following the codes specificated in the API description) |  |



