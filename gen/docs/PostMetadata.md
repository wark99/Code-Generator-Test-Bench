

# PostMetadata

Additional information used to display a post.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**embeds** | [**List&lt;PostMetadataEmbedsInner&gt;**](PostMetadataEmbedsInner.md) | Information about content embedded in the post including OpenGraph previews, image link previews, and message attachments. This field will be null if the post does not contain embedded content.  |  [optional] |
|**emojis** | [**List&lt;Emoji&gt;**](Emoji.md) | The custom emojis that appear in this point or have been used in reactions to this post. This field will be null if the post does not contain custom emojis.  |  [optional] |
|**files** | [**List&lt;FileInfo&gt;**](FileInfo.md) | The FileInfo objects for any files attached to the post. This field will be null if the post does not have any file attachments.  |  [optional] |
|**images** | **Object** | An object mapping the URL of an external image to an object containing the dimensions of that image. This field will be null if the post or its embedded content does not reference any external images.  |  [optional] |
|**reactions** | [**List&lt;Reaction&gt;**](Reaction.md) | Any reactions made to this point. This field will be null if no reactions have been made to this post.  |  [optional] |



