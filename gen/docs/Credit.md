

# Credit

The credit score section of a credit report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creditScoreDate** | **LocalDate** | The date the credit score is calculated. |  |
|**creditScoreFactaInquiriesIndicator** | **Boolean** | Indicates whether FACTA inquiries have happened. |  |
|**creditScoreModelNameType** | **String** | Type of the credit score model used to calculate the score. |  |
|**creditScoreModelNameDescription** | **String** | Name of the credit score model used to calculate the score. |  |
|**creditScoreRankPercentileValue** | **Integer** | The percentile position of the credit score in the whole spectrum. A small percentile represents a low score. |  |
|**creditScoreValue** | **Integer** | The actual credit score. |  |
|**creditScoreFactors** | [**List&lt;CreditScoreFactor&gt;**](CreditScoreFactor.md) | List of factors that affect the credit score. |  |



