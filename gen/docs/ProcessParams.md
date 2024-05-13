

# ProcessParams

process parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**processClass** | **Object** |  |  |
|**devEui** | **Object** | device id |  |
|**upId** | [**UpId**](UpId.md) |  |  [optional] |
|**data** | [**Data**](Data.md) |  |  [optional] |
|**mac** | [**Mac**](Mac.md) |  |  [optional] |
|**fport** | [**Front**](Front.md) |  |  [optional] |
|**conf** | **Object** | Send data as confirmed message |  [optional] |
|**imme** | **Object** | Immediate. Send data immediate (for Class C or for Class A if up_id specified) |  [optional] |
|**nodel** | **Object** | Not delete. Do not delete from queue after join/rejoin |  [optional] |
|**fpend** | **Object** | FPending. Set FPending bit for immediate downlink |  [optional] |
|**prio** | **AppApiv2ConstansActionPrio1** | Prio. Set priority for send via queue (0-low, 1-middle, 2-hight) |  [optional] |
|**jsonMsg** | **Object** | JSON message |  |
|**addr** | [**Addr**](Addr.md) |  |  [optional] |
|**group** | [**Group**](Group.md) |  |  [optional] |
|**consumptionGroup** | **Object** | consumption group id |  |
|**period** | **Period** | Period |  [optional] |
|**tz** | **Object** | time zone |  [optional] |
|**lastPeriod** | **Object** | Process run for previous period |  [optional] |
|**onlySuc** | **Object** | Overflow only |  [optional] |



