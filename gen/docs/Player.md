

# Player


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**playerId** | **Integer** | Unique identifier of the &#x60;player&#x60; that is related to the resource &#x60;Player&#x60; |  |
|**name** | **String** | Name of the ressource &#x60;Player&#x60; visible by final customer |  |
|**title** | **String** | Name of the video stream |  |
|**description** | **String** | Description of the stream |  |
|**buffer** | **String** | Buffer memory enables the reduction of video interruptions if yours viewers connections become unstable by preloading |  |
|**autoStart** | **Boolean** | Start the video automatically (does not function on Android and iOS) |  |
|**allowFullScreen** | **Boolean** | Authorise full-screen mode |  |
|**is360** | **Boolean** | This option is required to display your 360 video streaming |  |
|**showControls** | **Boolean** | Display the playback bar |  |
|**autoHideControls** | **Boolean** | Hide the playback bar after a few seconds |  |
|**timeBeforeHideCb** | **Integer** |  |  |
|**showViewers** | **Boolean** | Display the number of viewers |  |
|**showViewersAfter** | **Integer** | Display from the following number after {number} viewers |  |
|**ratio** | **String** | Ratio of the player |  |
|**width** | **Integer** | The width used for render the &#x60;Player&#x60; (px) |  |
|**height** | **Integer** | The height used for render the &#x60;Player&#x60; (px) |  |
|**showLogo** | **Boolean** | Is the logo Infomaniak enabled? |  |
|**logoImg** | **String** | The logo url of the &#x60;Player&#x60; |  |
|**logoAnchor** | [**LogoAnchorEnum**](#LogoAnchorEnum) | is the position of logo |  |
|**logoPercentage** | **Integer** | The logo size in &#x60;Player&#x60; |  |
|**logoMarginTop** | **Integer** | The margin top log in &#x60;Player&#x60; |  |
|**logoMarginLeft** | **Integer** | The margin left log in &#x60;Player&#x60; |  |
|**controlColor** | **String** | The background color used in the &#x60;Player&#x60; |  |
|**controlbarColor** | **String** | The button color used in the &#x60;Player&#x60; |  |
|**controlActiveColor** | **String** | The secondary color color used in the &#x60;Player&#x60; |  |
|**extractPreloadImg** | **Boolean** |  |  |
|**usePreloadImg** | **Boolean** | This image is displayed before the video is played. |  |
|**preloadImg** | **String** |  |  |
|**useGeoIpImg** | **Boolean** |  |  |
|**geoIpImg** | **String** |  |  |
|**useInterruptImg** | **Boolean** |  |  |
|**interruptImg** | **String** | This image is displayed if the viewer is not authorised to view the broadcast (IP, domain, unique hash code, etc.) |  |
|**useRestrictImg** | **Boolean** | This image is displayed if the viewer is located in an unauthorised geographic |  |
|**restrictImg** | **String** | This image is displayed if the viewer is not authorised to view the broadcast (IP, domain, unique hash code, etc.) |  |
|**countdown** | **Boolean** | Is the countdown enabled? |  |
|**countdownTxt** | **String** | Description of the countdown of the &#x60;Player&#x60; visible by final customer |  |
|**countdownDays** | **String** | countdown days |  |
|**countdownHours** | **String** | hours days |  |
|**countdownMinutes** | **String** | countdown minutes |  |
|**countdownSeconds** | **String** | countdown seconde |  |
|**enableEmbedCode** | **Boolean** | Authorise other users to intergrate your live event on their sites |  |
|**enableFacebook** | **Boolean** | Is the facebook embed link visible? |  |
|**facebookBackLink** | **String** | The Twitter backlink used to facebook embed |  |
|**facebookPlayerEmbed** | **Boolean** |  |  |
|**enableTwitter** | **Boolean** | Is the Twitter embed link visible? |  |
|**twitterVia** | **String** |  |  |
|**twitterBackLink** | **String** | The Twitter backlink used to twitter embed |  |
|**twitterRelated** | **String** | The Twitter hashtag used to Twitter embed |  |
|**createdAt** | **Integer** | Timestamp &#x60;Player&#x60; has been created |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Player&#x60; has been updated |  |
|**adsEnabled** | **Boolean** | Is the ads enabled? |  |
|**soundEnabled** | **Boolean** | Is the sound enabled? |  |
|**soundPercentage** | **Integer** | The volume used in the &#x60;Player&#x60; |  |
|**showViewersOnlyAfter** | **Boolean** |  |  |
|**chromecast** | **Boolean** | you need to use a player that supports https in order for chromecast to work correctly |  |
|**stereoProjection360** | **String** |  |  |
|**adsUrl** | **String** | The ads url |  |
|**channel** | [**Channel**](Channel.md) |  |  [optional] |
|**integrations** | **String** | List all the raw integrations supported for the given channel. |  [optional] |
|**countdownStopsAt** | **String** |  |  [optional] |
|**thumbnailUrl** | **String** |  |  [optional] |
|**restrictions** | **String** |  |  [optional] |



## Enum: LogoAnchorEnum

| Name | Value |
|---- | -----|
| BOTTOM_LEFT | &quot;bottom left&quot; |
| BOTTOM_RIGHT | &quot;bottom right&quot; |
| TOP_LEFT | &quot;top left&quot; |
| TOP_RIGHT | &quot;top right&quot; |



