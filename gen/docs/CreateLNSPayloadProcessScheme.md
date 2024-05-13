

# CreateLNSPayloadProcessScheme


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**processClass** | **Object** |  |  |
|**devEui** | **Integer** | device id |  |
|**upId** | [**UpId**](UpId.md) |  |  [optional] |
|**data** | [**Data**](Data.md) |  |  [optional] |
|**mac** | [**Mac**](Mac.md) |  |  [optional] |
|**fport** | [**Front**](Front.md) |  |  [optional] |
|**conf** | **Boolean** | Send data as confirmed message |  [optional] |
|**imme** | **Boolean** | Immediate. Send data immediate (for Class C or for Class A if up_id specified) |  [optional] |
|**nodel** | **Boolean** | Not delete. Do not delete from queue after join/rejoin |  [optional] |
|**fpend** | **Boolean** | FPending. Set FPending bit for immediate downlink |  [optional] |
|**prio** | **AppApiv2ConstansActionPrio1** | Prio. Set priority for send via queue (0-low, 1-middle, 2-hight) |  [optional] |



