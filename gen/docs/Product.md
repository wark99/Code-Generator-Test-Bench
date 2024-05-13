

# Product

The product object. Serves as template from which vouchers are issued.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | A unique set of alphanumeric characters assigned to the product within the product catalogue, serving as an SKU. |  [optional] |
|**name** | **String** | Name of the product. |  [optional] |
|**description** | **String** | A brief description of the product. |  [optional] |
|**isValueBased** | **Boolean** | Indicates whether the product is value-based (true) or product-based (false). |  [optional] |
|**isOpenValue** | **Boolean** | Allows for open denomination or quantity at issuance (true) or is a fixed denomination / quantity product (false). |  [optional] |
|**isStatusAvailable** | **Boolean** | Indicates whether the status of vouchers issued from this product can be retrieved (true) or not (false). |  [optional] |
|**isMultipleUse** | **Boolean** | Indicates whether the vouchers can be redeemed in multiple transactions or will be fully redeemed in a single transaction. |  [optional] |
|**currency** | **String** | Currency code (ISO 4217 format i.e. SGD) for the product&#39;s amount, or an empty string for product-based (is_value_based &#x3D; false). |  [optional] |
|**amount** | **Integer** | Face value in cents for value-based products, or number of items for product-based. null for open-value products. |  [optional] |
|**quantity** | **Integer** | Quantity of this product in stock or null if stock is unlimited. |  [optional] |
|**expiryScheme** | **String** | Specifies how the voucher&#39;s expiration date is determined upon issuance. |  [optional] |
|**validFrom** | **OffsetDateTime** | The start date and time of the product validity. |  [optional] |
|**validUntil** | **OffsetDateTime** | The end date and time of the product validity, if applicable. |  [optional] |
|**image** | **URI** | A URL linking to the product&#39;s image. |  [optional] |
|**termsAndConditions** | **String** | Terms and conditions of the product. |  [optional] |



