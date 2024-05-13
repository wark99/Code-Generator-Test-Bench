

# Comment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Comment&#x60; |  |
|**parentId** | **Integer** | Comment parent identifier. If present, this comment is a response of another comment |  |
|**body** | **String** | Comment message |  |
|**isResolved** | **Boolean** | If a comment is set as resolved, solved. |  |
|**createdAt** | **Integer** | Timestamp &#x60;Comment&#x60; was created at |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Comment&#x60; was updated at |  |
|**liked** | **Boolean** | if the comment is liked |  |
|**likesCount** | **Integer** | Number of likes |  |
|**responsesCount** | **Integer** | Number of responses for this comment |  |
|**user** | [**User**](User.md) |  |  [optional] |
|**responses** | [**List&lt;Comment&gt;**](Comment.md) |  |  [optional] |
|**likes** | [**List&lt;User&gt;**](User.md) |  |  [optional] |



