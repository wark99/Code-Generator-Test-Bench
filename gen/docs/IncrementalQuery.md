

# IncrementalQuery

If only a *since* timestamp is given (recommended), the operation returns all changes since the specified point in time. If multiple updates took place to a record since the specified time, only the most recent version of the record is returned.  If both a *since* and an *until* timestamp is given, the operation returns all records that have changed since the start timestamp of the interval but have not been altered after the end timestamp of the interval. Any records that have been updated after the *until* timestamp are not included in the query result. This functionality is useful to break up larger batches of changes but cannot be reliably used as a means of reconstructing a database state in the past (i.e. a point-in-time query or a backup of a previous state).  The range defined by *since* and *until* is inclusive for the *since* timestamp but exclusive for the *until* timestamp.  You would normally use incremental queries to fetch changes since a snapshot query or a previous incremental query. If issued as a follow-up to a snapshot query, the *since* timestamp of the incremental query would be equal to the *at* timestamp of the snapshot query. If issued as a follow-up to an incremental query, you would chain the *until* timestamp returned by the previous query job with the *since* timestamp of the new query request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | **Format** | The format of the data to be returned. |  |
|**filter** | [**Filter**](Filter.md) | (Not implemented; this field must be omitted.) Any filters applied to the source, e.g. include specific columns, or omit specific rows. |  [optional] |
|**since** | **OffsetDateTime** | Start timestamp (in UTC); only those records are returned that have been persisted since the specified date and time. This typically equals &#x60;at&#x60; returned by a previous snapshot query job, or &#x60;until&#x60; returned by a previous incremental query job. |  |
|**until** | **OffsetDateTime** | End timestamp (in UTC); only those records are returned that have not been changed after the specified date and time. If omitted (recommended), defaults to the commit time of the latest record. |  [optional] |



