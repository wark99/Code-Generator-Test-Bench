

# Schema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email of the user |  [optional] |
|**clientId** | **String** | Client ID of an application belonging to the user |  [optional] |
|**clientSecret** | **String** | Client Secret of an application belonging to the user |  [optional] |
|**scope** | [**List&lt;ScopeEnum&gt;**](#List&lt;ScopeEnum&gt;) | Scopes to request for access. To access the Scoring API, specify &#x60;vs4plus/post:score&#x60; in the list. To access the Data API, specify &#x60;vs4plus/post:data&#x60; in the list. |  [optional] |



## Enum: List&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| SCORE | &quot;vs4plus/post:score&quot; |
| DATA | &quot;vs4plus/post:data&quot; |
| SANDBOX | &quot;vs4plus/post:sandbox&quot; |



