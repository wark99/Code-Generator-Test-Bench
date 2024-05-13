

# WorkspaceInvitation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shortUrl** | **String** | Invitation url   |  |
|**key** | **String** | Key   |  |
|**sentTo** | **String** | Invitation recipient email address   |  |
|**permissions** | [**List&lt;MailPermissions&gt;**](MailPermissions.md) |  |  |
|**expiredAt** | **Integer** | Expired date   |  |
|**isValid** | **Boolean** | True if still valid   |  |
|**isUsed** | **Boolean** | True if invitation has been accepted   |  |
|**mailbox** | [**MailboxBase**](MailboxBase.md) |  |  [optional] |
|**qrcode** | **String** | QR Code url  **This field is provided only if you have set with&#x3D;qrcode** |  [optional] |



