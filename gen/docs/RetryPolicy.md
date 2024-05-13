

# RetryPolicy

Retry policy for communications

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maximumAttempts** | **String** | 0 means unlimited, otherwise the maximum number of attempts |  [optional] |
|**backoffCoefficient** | **BigDecimal** | The backoff coefficient to use for exponential backoff. 1.0 means no backoff and always use the initial interval value. |  [optional] |
|**initialInterval** | **String** | Amount of time before the first retry. Subsequent retries will also be at this interval if backoff coefficient is set to &gt; 1.0 |  [optional] |
|**maximumInterval** | **String** | Maximum amount of time between retries. The interval will not exceed this value to stop waiting exponentially due to the backoff coefficient. |  [optional] |
|**startToCloseTimeout** | **String** | Maximum amount of time for the workflow to be scheduled and to complete. Set to \&quot;PT0S\&quot; to disable |  [optional] |



