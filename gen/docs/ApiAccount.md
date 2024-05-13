

# ApiAccount

Account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iCodeGroupes** | **String** |  |  [optional] |
|**sGroupesNom** | **String** |  |  [optional] |
|**eTypeGroup** | **String** |  |  [optional] |
|**sTVA** | **String** | Numéro de TVA |  [optional] |
|**sPhone** | **String** |  |  [optional] |
|**sFax** | **String** |  |  [optional] |
|**sWebsite** | **String** |  |  [optional] |
|**bPartner** | **String** |  |  [optional] |
|**bContreAffaireAllowed** | **String** |  |  [optional] |
|**bExportGIT** | **BigDecimal** | Exporter les factures et paiements vers GIT |  [optional] |
|**bAlwaysOn** | **BigDecimal** |  |  [optional] |
|**bDisableServiceOnUnpaid** | **String** |  |  [optional] |
|**bUseRenouvellement** | **String** |  |  [optional] |
|**bBetaTesteur** | **String** |  |  [optional] |
|**bExonerationTVA** | **String** |  |  [optional] |
|**fExonerationTVALimitTTC** | **String** |  |  [optional] |
|**iCountryCode** | **BigDecimal** | Code pays PAR DEFAUT des nouveaux users |  [optional] |
|**iLanguageCode** | **BigDecimal** | Code langue par défaut du group |  [optional] |
|**iTimezoneCode** | **BigDecimal** | timezone par défaut du groupe |  [optional] |
|**iDefautEcheanceFacture** | **BigDecimal** | Echéance par défaut pour les factures du groupe en nombre de jours |  [optional] |
|**bUniqueReference** | **String** |  |  [optional] |
|**bPerte** | **BigDecimal** | Possède au moins un fact. passée en perte |  [optional] |
|**dDateCreation** | **String** |  |  [optional] |
|**bDeleted** | **String** |  |  [optional] |
|**dDeletedDate** | **String** |  |  [optional] |
|**sIPCreation** | **String** |  |  [optional] |
|**iBannerCampagne** | **BigDecimal** | stocker si groupe a été créé après click sur bannière campagne |  [optional] |
|**idAffiliation** | **String** |  |  [optional] |
|**iStatutDoublon** | **BigDecimal** | Etat du traitement si compte en doublon |  [optional] |
|**dDoublon** | **String** | Date à laquelle le statut a été changé |  [optional] |
|**sUniqueReference** | **String** | Référence unique du groupe que le client doit renseigner lors d&#39;un paiement par IBAN |  [optional] |
|**cgUs** | **List&lt;CGUAgreement&gt;** |  |  [optional] |
|**addresses** | **List&lt;Address&gt;** |  |  [optional] |
|**billingAddresses** | **List&lt;Address&gt;** |  |  [optional] |
|**country** | [**List&lt;ApiCountry&gt;**](ApiCountry.md) |  |  [optional] |
|**customizationUrl** | **AccountCustomizationUrl** |  |  [optional] |
|**demoGroups** | [**List&lt;ApiDemoGroup&gt;**](ApiDemoGroup.md) |  |  [optional] |
|**beta** | **Object** |  |  [optional] |
|**countryId** | **Object** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**deletedById** | **BigDecimal** |  |  [optional] |
|**deletedByIp** | **List&lt;String&gt;** |  |  [optional] |
|**fax** | **Object** |  |  [optional] |
|**id** | **Object** |  |  [optional] |
|**languageId** | **Object** |  |  [optional] |
|**legalEntityType** | **Object** |  |  [optional] |
|**name** | **Object** |  |  [optional] |
|**partner** | **Object** |  |  [optional] |
|**phone** | **Object** |  |  [optional] |
|**sPhone** | **Object** |  |  [optional] |
|**timezoneId** | **Object** |  |  [optional] |
|**tva** | **Object** |  |  [optional] |
|**type** | **Object** |  |  [optional] |
|**website** | **Object** |  |  [optional] |
|**invitations** | **List&lt;AccountInvitation&gt;** |  |  [optional] |
|**invoices** | **List&lt;Invoice&gt;** |  |  [optional] |
|**language** | [**List&lt;ApiLanguage&gt;**](ApiLanguage.md) |  |  [optional] |
|**logo** | **ApiLogo** |  |  [optional] |
|**logs** | **List&lt;Log&gt;** |  |  [optional] |
|**premiumSupport** | **List&lt;PremiumSupport&gt;** |  |  [optional] |
|**products** | [**List&lt;ApiProduct&gt;**](ApiProduct.md) |  |  [optional] |
|**roles** | **List&lt;Role&gt;** |  |  [optional] |
|**services** | **List&lt;Service&gt;** |  |  [optional] |
|**tags** | [**List&lt;ApiTag&gt;**](ApiTag.md) |  |  [optional] |
|**teams** | **List&lt;Team&gt;** |  |  [optional] |
|**timezone** | **List&lt;Timezone&gt;** |  |  [optional] |
|**users** | [**List&lt;ApiUser&gt;**](ApiUser.md) |  |  [optional] |



