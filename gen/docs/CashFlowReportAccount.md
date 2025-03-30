

# CashFlowReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Finicity account ID |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then all owners will be listed separated by |. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). If the owner information is not available, this field will not appear in the report. If the account has multiple owners then the address of the primary owner will be listed. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**number** | **String** | The account number from the institution (obfuscated) |  [optional] |
|**type** | **String** | The list of supported account types. * &#x60;checking&#x60; * &#x60;savings&#x60; * &#x60;moneyMarket&#x60; * &#x60;cd&#x60; * &#x60;investment&#x60; * &#x60;investmentTaxDeferred&#x60; * &#x60;employeeStockPurchasePlan&#x60; * &#x60;ira&#x60; * &#x60;401k&#x60; * &#x60;roth&#x60; * &#x60;403b&#x60; * &#x60;529&#x60; * &#x60;rollover&#x60; * &#x60;ugma&#x60; * &#x60;utma&#x60; * &#x60;keogh&#x60; * &#x60;457&#x60; * &#x60;401a&#x60; * &#x60;unknown&#x60; * &#x60;mortgage&#x60; * &#x60;loan&#x60; * &#x60;creditCard&#x60; * &#x60;lineOfCredit&#x60; * &#x60;payroll&#x60; * &#x60;studentLoan&#x60; * &#x60;brokerageAccount&#x60; * &#x60;educationSavings&#x60; * &#x60;healthSavingsAccount&#x60; * &#x60;nonTaxableBrokerageAccount&#x60; * &#x60;pension&#x60; * &#x60;profitSharingPlan&#x60; * &#x60;roth401k&#x60; * &#x60;sepIRA&#x60; * &#x60;simpleIRA&#x60; * &#x60;thriftSavingsPlan&#x60; * &#x60;variableAnnuity&#x60; |  [optional] |
|**currency** | **String** | A currency code for account |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable) |  [optional] |
|**currentBalance** | **BigDecimal** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**availableBalance** | **BigDecimal** | Available balance |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the &#x60;balance&#x60; was captured |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | a list of transaction records |  [optional] |
|**cashFlowBalance** | [**CashFlowCashFlowBalance**](CashFlowCashFlowBalance.md) |  |  [optional] |
|**cashFlowCredit** | [**CashFlowCashFlowCredit**](CashFlowCashFlowCredit.md) |  |  [optional] |
|**cashFlowDebit** | [**CashFlowCashFlowDebit**](CashFlowCashFlowDebit.md) |  |  [optional] |
|**cashFlowCharacteristic** | [**CashFlowCashFlowCharacteristic**](CashFlowCashFlowCharacteristic.md) |  |  [optional] |



