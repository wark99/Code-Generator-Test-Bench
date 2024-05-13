

# ShareLink


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | Share link url |  |
|**fileId** | **Integer** |  |  |
|**right** | [**RightEnum**](#RightEnum) | Rights required to view the share link.&lt;note&gt;&lt;strong&gt;inherit&lt;/strong&gt;: Share link is accessible only by users of the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;password&lt;/strong&gt;: Share link is public but protected by a password.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;public&lt;/strong&gt;: Share link is public, no restriction set.&lt;/note&gt; |  |
|**validUntil** | **Integer** | Until when the share link is valid |  |
|**createdBy** | **Integer** | Unique identifier of the creator of the resource &#x60;Share Link&#x60; |  |
|**createdAt** | **Integer** | Timestamp &#x60;Share Link&#x60; was created at |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Share Link&#x60; was updated at |  |
|**capabilities** | [**Capabilities3**](Capabilities3.md) |  |  |
|**accessBlocked** | **Boolean** | If the share link is blocked |  |
|**views** | **Integer** | Number of views of share link (last 180 days only) |  [optional] |



## Enum: RightEnum

| Name | Value |
|---- | -----|
| INHERIT | &quot;inherit&quot; |
| PASSWORD | &quot;password&quot; |
| PUBLIC | &quot;public&quot; |



