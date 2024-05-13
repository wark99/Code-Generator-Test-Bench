

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**canceledAmount** | **BigDecimal** | O cancelamento na Drip pode ser total ou parcial, o atributo canceled amount retorna o valor de cancelamento solicitado  pelo parceiro. Uma ordem cancelada é uma ordem onde o status é CLOSED e o canceledAmount &#x3D; valor total da ordem, uma ordem paga por completo é uma ordem com status CLOSED e canceledAmount menor que o valor total da ordem |  [optional] |
|**amount** | **BigDecimal** | Valor da ordem aprovada |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | ACTIVE &#x3D; Ordem foi criada e não foi totalmente paga ou cancelada |  [optional] |
|**createdDate** | **OffsetDateTime** | Order created date in ISO 8601 format |  [optional] |
|**closedDate** | **OffsetDateTime** | Order closed date in ISO 8601 format |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CLOSED | &quot;CLOSED&quot; |



