

# Voucher

The voucher object. Contains attributes specific to the voucher and others inherited from the product from which it is issued.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voucherCode** | **String** | The unique voucher code (also referred to as the voucher number) that is accepted by the merchant. |  [optional] |
|**voucherId** | **UUID** | The unique technical reference for the voucher, used in Client API requests. |  [optional] |
|**name** | **String** | The name of the voucher as displayed to end-users, generally including its denomination. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the voucher. |  [optional] |
|**expiration** | **OffsetDateTime** | Expiration date and time of the voucher in ISO 8601 / RFC 3339 format (i.e. 2030-10-12T22:59:59+00:00). |  [optional] |
|**currency** | **String** | Currency code (ISO 4217 format i.e. SGD) for the voucher&#39;s amount, or an empty string for product-based (is_value_based &#x3D; false). |  [optional] |
|**remainingAmount** | **Integer** | Voucher remaining amount to spend in cents for value-based vouchers, or the number of items for product-based. |  [optional] |
|**productCode** | **String** | The product code identifying the product from which the voucher is issued. |  [optional] |
|**productName** | **String** | The product name. |  [optional] |
|**isValueBased** | **Boolean** | Indicates whether the voucher is value-based (true) or product-based (false). |  [optional] |
|**isStatusAvailable** | **Boolean** | Indicates whether the status of the voucher can be retrieved (true) or not (false). |  [optional] |
|**isMultipleUse** | **Boolean** | Indicates whether the vouchers can be redeemed in multiple transactions or will be fully redeemed in a single transaction. |  [optional] |
|**url** | **URI** | Full URL providing direct access to the voucher. |  [optional] |
|**shortUrl** | **URI** | Shortened URL to access the voucher, used in combination with a PIN.  |  [optional] |
|**shortUrlPin** | **Integer** | PIN code required to access the voucher via the short URL. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| EXPIRED | &quot;expired&quot; |
| VOIDED | &quot;voided&quot; |
| USED | &quot;used&quot; |



