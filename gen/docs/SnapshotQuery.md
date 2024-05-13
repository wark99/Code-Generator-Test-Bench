

# SnapshotQuery

Snapshot queries help populate an empty database. After the initial snapshot query, you would use incremental queries to get the most up-to-date version of the data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | **Format** | The format of the data to be returned. |  |
|**filter** | [**Filter**](Filter.md) | (Not implemented; this field must be omitted.) Any filters applied to the source, e.g. include specific columns, or omit specific rows. |  [optional] |



