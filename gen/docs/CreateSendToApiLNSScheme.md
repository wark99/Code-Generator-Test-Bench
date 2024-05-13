

# CreateSendToApiLNSScheme


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **Integer** | external account id |  |
|**actionClass** | **Object** |  |  |
|**devEui** | **Integer** | device id |  |
|**upId** | [**UpId**](UpId.md) |  |  [optional] |
|**dataHex** | [**DataHex**](DataHex.md) |  |  [optional] |
|**mac** | [**Mac**](Mac.md) |  |  [optional] |
|**fport** | [**Fport**](Fport.md) |  |  [optional] |
|**conf** | **Boolean** | Send data as confirmed message |  [optional] |
|**imme** | **Boolean** | Send data immediate (for Class C or for Class A if up_id specified) |  [optional] |
|**nodel** | **Boolean** | do not delete from queue after join/rejoin |  [optional] |
|**fpend** | **Boolean** | Set FPending bit for immediate downlink |  [optional] |
|**prio** | **AppApiv2ConstansActionPrio1** | Set priority for send via queue (0-low, 1-middle, 2-hight) |  [optional] |



