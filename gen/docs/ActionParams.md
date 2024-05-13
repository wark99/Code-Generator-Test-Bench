

# ActionParams

action parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **Object** | external account id |  |
|**actionClass** | **Object** |  |  |
|**virtualHost** | **Object** | Virtual host |  |
|**exchange** | **Object** | Exchange |  |
|**queue** | **Object** | Queue |  |
|**devEui** | **Object** | device id |  |
|**upId** | [**UpId**](UpId.md) |  |  [optional] |
|**dataHex** | [**DataHex**](DataHex.md) |  |  [optional] |
|**mac** | [**Mac**](Mac.md) |  |  [optional] |
|**fport** | [**Fport**](Fport.md) |  |  [optional] |
|**conf** | **Object** | Send data as confirmed message |  [optional] |
|**imme** | **Object** | Send data immediate (for Class C or for Class A if up_id specified) |  [optional] |
|**nodel** | **Object** | do not delete from queue after join/rejoin |  [optional] |
|**fpend** | **Object** | Set FPending bit for immediate downlink |  [optional] |
|**prio** | **AppApiv2ConstansActionPrio1** | Set priority for send via queue (0-low, 1-middle, 2-hight) |  [optional] |
|**fromEmail** | [**FromEmail**](FromEmail.md) |  |  [optional] |
|**recipient** | **Object** | Message recipient ID (Telegram chat ID) |  |
|**subject** | **Object** | Email subject |  |
|**message** | **Object** | Message |  |
|**path** | **Object** | Path |  [optional] |
|**asJson** | **Object** | If true, then the data is sent as application/json otherwise application/x-www-form-urlencoded |  [optional] |
|**clientId** | [**ClientId**](ClientId.md) |  |  [optional] |
|**topic** | [**Topic**](Topic.md) |  |  [optional] |
|**qos** | [**Qos**](Qos.md) |  |  [optional] |
|**retain** | **Object** | Retain |  [optional] |
|**source** | **Object** | Sender phone or string ID |  |
|**title** | [**Title1**](Title1.md) |  |  [optional] |



