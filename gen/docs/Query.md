

# Query


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | **Format** | The format of the data to be returned. |  |
|**filter** | [**Filter**](Filter.md) | (Not implemented; this field must be omitted.) Any filters applied to the source, e.g. include specific columns, or omit specific rows. |  [optional] |
|**since** | **Object** | Start timestamp (in UTC); only those records are returned that have been persisted since the specified date and time. This typically equals &#x60;at&#x60; returned by a previous snapshot query job, or &#x60;until&#x60; returned by a previous incremental query job. |  |
|**until** | **Object** | End timestamp (in UTC); only those records are returned that have not been changed after the specified date and time. If omitted (recommended), defaults to the commit time of the latest record. |  [optional] |



