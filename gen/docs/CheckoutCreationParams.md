

# CheckoutCreationParams

Information about the checkout. If the merchant does not have all the customer data parameters, they can be left out. We will request it from the customer himself during the checkout with Drip, if deemed necessary.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The total amount of the order in float type (e.g., 100.00 or 1.00) |  [optional] |
|**customerCpf** | **String** | The customer&#39;s CPF (Brazilian identification number) |  [optional] |
|**customerName** | **String** | The customer&#39;s name |  [optional] |
|**customerEmail** | **String** | The customer&#39;s email address |  [optional] |
|**customerAddressCep** | **String** | The customer&#39;s address ZIP code (CEP) |  [optional] |
|**customerAddressStreet** | **String** | The customer&#39;s street address |  [optional] |
|**customerAddressNeighborhood** | **String** | The customer&#39;s address neighborhood |  [optional] |
|**customerAddressCity** | **String** | The customer&#39;s address city |  [optional] |
|**customerAddressState** | **String** | The customer&#39;s address state |  [optional] |
|**customerAddressNumber** | **String** | The customer&#39;s address number |  [optional] |
|**customerAddressComplement** | **String** | Additional information about the customer&#39;s address |  [optional] |
|**merchantCode** | **String** | Should be the ID for the order/checkout in the merchant side, can be used by merchant to identify orders on Drip |  [optional] |
|**resolveUrl** | **String** | Should handle callbacks and redirections when a checkout is approved, MUST PROPERLY handle multiple requests to not create multiple orders. |  [optional] |



