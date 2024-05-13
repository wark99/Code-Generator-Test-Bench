

# Filter

(This feature is not currently implemented.)  Filter encompasses column-level (`select`) and row-level (`where`) filters.  Column-level filters allow clients to include only those columns in the output they are interested in. Row-level filters let clients specify a condition that is applied to each record; if the condition is true, the record is included in the output, otherwise omitted. Row-level filters are inspired by the [where argument](https://hasura.io/docs/latest/queries/postgres/query-filters/#the-where-argument) in Hasura.  Consider a table with the following columns:  * `family_name` of type `string`, * `given_name` of type `string`, * `birth_date` of type `datetime`, * `height` of type `number`, representing a person's height in meters, * `status`, which is an enumeration that can take the values `active`, `inactive`, `pending`.  Include only those people whose family name is `Smith`:  ```json { \"family_name\": { \"_eq\": \"Smith\" } } ```  Return people born in the 21st century:  ```json { \"birth_date\": { \"_gte\": \"2001-01-01\" } } ```  Include only those people whose height is between 1.6 and 1.7 meters:  ```json { \"height\": { \"_gt\": 1.6, \"_lt\": 1.7 } } ```  Return people whose status is `active` or `pending`:  ```json { \"status\": { \"_in\": [\"active\", \"pending\"] } } ```  Find people whose family name is `Smith` and given name starts with `L` or `K`:  ```json { \"family_name\": { \"_eq\": \"Smith\" }, \"given_name\": { \"_match\": \"^[LK]\" } } ```  Find people whose family name is `Smith` *or* whose given name starts with `L` or `K`:  ```json { \"_or\": [     { \"family_name\": { \"_eq\": \"Smith\" } },     { \"given_name\": { \"_match\": \"^[LK]\" } } ] } ```  The type of the value matched in the condition must be compatible with the type of the column.  The following operators are generally available for all types:  * `_eq` (equal to) * `_neq` (not equal to)  Comparison operators for strings:  * `_match` (value matches regular expression)  Comparison operators for numbers, dates and timestamps:  * `_gt` (greater than) * `_lt` (less than) * `_gte` (greater than or equal to) * `_lte` (less than or equal to)  Comparison operators for enumerations:  * `_in` (value in set of values) * `_nin` (value not in set of values)  Operators to build composite Boolean expressions:  * `_and` * `_or` * `_not`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**select** | **List&lt;String&gt;** | A list of column names to include in the data set returned; other columns are excluded. If omitted, return all columns. |  [optional] |
|**where** | **Object** | A filter condition to apply to records; only records that meet the condition are included. If omitted, return all records. |  [optional] |



