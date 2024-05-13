

# Transaction

A credit or debit transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID. |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Nature of the transaction. |  |
|**transactionAmount** | **BigDecimal** | Amount of the transaction. |  |
|**transactionDate** | [**TransactionTransactionDate**](TransactionTransactionDate.md) |  |  |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;credit&quot; |
| DEBIT | &quot;debit&quot; |



