

# TransferDepositSwitchParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | [**List&lt;DepositSwitchAccount&gt;**](DepositSwitchAccount.md) | List of customer accounts for Deposit Switch |  |
|**partnerId** | **String** | Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in) |  |
|**customerId** | **String** | A customer ID. See Add Customer API for how to create a customer ID. |  |
|**language** | **String** | By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60; * French (Canada): &#x60;fr&#x60;  |  [optional] |
|**webhook** | **String** | The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details. |  [optional] |
|**webhookContentType** | **String** | The content type the webhook events will be sent in. Supported types: \&quot;application/json\&quot; and \&quot;application/xml\&quot;. |  [optional] |
|**webhookData** | **Object** | Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**webhookHeaders** | **Object** | Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/). |  [optional] |
|**redirectUri** | **String** | The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe). |  [optional] |



