

# PaymentHistoryAccountSummary

Account-level summary of transactions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumberDisplay** | **String** | Last four digits of the account |  |
|**financialInstitution** | **String** | Name of the account&#39;s institution |  |
|**institutionIcon** | **String** | URL of institution icon |  |
|**currency** | **String** | A currency code |  |
|**status** | **String** | An account status |  |
|**accountName** | **String** | The account name from the institution |  |
|**accountOwner** | [**PaymentHistoryAccountSummaryAccountOwner**](PaymentHistoryAccountSummaryAccountOwner.md) |  |  |
|**accountType** | **String** | The list of supported account types. * \&quot;checking\&quot;: Standard checking * \&quot;savings\&quot;: Standard savings * \&quot;cd\&quot;: Certificates of deposit * \&quot;moneyMarket\&quot;: Money Market * \&quot;creditCard\&quot;: Standard credit cards * \&quot;lineOfCredit\&quot;: Home equity, line of credit * \&quot;investment\&quot;: Generic investment (no details) * \&quot;investmentTaxDeferred\&quot;: Generic tax-advantaged investment (no details) * \&quot;employeeStockPurchasePlan\&quot;: ESPP, Employee Stock Ownership Plans (ESOP), Stock Purchase Plans * \&quot;ira\&quot;: Individual Retirement Account (not Rollover or Roth) * \&quot;401k\&quot;: 401K Plan * \&quot;roth\&quot;: Roth IRA, Roth 401K * \&quot;403b\&quot;: 403B Plan * \&quot;529plan\&quot;: 529 Plan (True value is 529) * \&quot;rollover\&quot;: Rollover IRA * \&quot;ugma\&quot;: Uniform Gifts to Minors Act * \&quot;utma\&quot;: Uniform Transfers to Minors Act * \&quot;keogh\&quot;: Keogh Plan * \&quot;457plan\&quot;: 457 Plan (True value is 457) * \&quot;401a\&quot;: 401A Plan * \&quot;brokerageAccount\&quot;: Brokerage Account * \&quot;educationSavings\&quot;: Education Savings Account that is not a 529 * \&quot;healthSavingsAccount\&quot;: HSA (Health Savings Accounts) * \&quot;pension\&quot;: Pension * \&quot;profitSharingPlan\&quot;: Profit Sharing Plan * \&quot;roth401k\&quot;: Roth 401K * \&quot;sepIRA\&quot;: Simplified Employee Pension IRA * \&quot;simpleIRA\&quot;: Simple IRA * \&quot;thriftSavingsPlan\&quot;: Thrift Savings Plan * \&quot;variableAnnuity\&quot;: Variable Annuity * \&quot;cryptocurrency\&quot;: Cryptocurrency Wallet, Cryptocurrency Account * \&quot;mortgage\&quot;: Standard Mortgages * \&quot;loan\&quot;: Auto loans, equity loans, other loans * \&quot;studentLoan\&quot;: Student Loan * \&quot;studentLoanGroup\&quot;: Student Loan Group * \&quot;studentLoanAccount\&quot;: Student Loan Account |  |
|**beginningBalance** | **BigDecimal** | Beginning balance of account |  |
|**averageMonthlyBalance** | **BigDecimal** | Monthly average balance of account |  |
|**currentBalance** | **BigDecimal** | Current balance of account |  |
|**beginDate** | **String** | Begin date of account |  |
|**endDate** | **String** | End date of account |  |
|**totalNonsufficientFunds** | **BigDecimal** | Total of NSF transactions in this account |  [optional] |
|**daysSinceNonsufficientFunds** | **Integer** | Days since the latest NSF transaction for this account |  |



