

# Account

An account in a financial institution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankId** | **String** | Aggregator-specific ID of the financial institution the account is opened in. |  |
|**accountId** | **String** | Pseudonymous ID of the account. |  |
|**productType** | **String** | Aggregator-specific account type. |  |
|**openDate** | [**AccountOpenDate**](AccountOpenDate.md) |  |  [optional] |
|**balance** | **BigDecimal** | Account balance at balance_date. |  |
|**balanceDate** | [**AccountBalanceDate**](AccountBalanceDate.md) |  |  |
|**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | All transactions registered in the account. |  |



