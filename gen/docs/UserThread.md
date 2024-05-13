

# UserThread

a thread that user is following

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the post that is this thread&#39;s root |  [optional] |
|**replyCount** | **Integer** | number of replies in this thread |  [optional] |
|**lastReplyAt** | **Long** | timestamp of the last post to this thread |  [optional] |
|**lastViewedAt** | **Long** | timestamp of the last time the user viewed this thread |  [optional] |
|**participants** | [**List&lt;Post&gt;**](Post.md) | list of users participating in this thread. only includes IDs unless &#39;extended&#39; was set to &#39;true&#39; |  [optional] |
|**post** | [**Post**](Post.md) |  |  [optional] |



