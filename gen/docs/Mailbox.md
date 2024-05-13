

# Mailbox


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailboxName** | **Object** | The username (that is the part before the @) of the email address   |  |
|**mailbox** | **Object** | Full email address   |  |
|**mailboxIdn** | **Object** | Full email address with internationalized domain name (IDN) format   |  |
|**isLimited** | **Boolean** | True if mailbox has rate limit   |  |
|**isFreeMail** | **Boolean** | True if mailbox belongs to free mail service   |  |
|**fullName** | **String** | Mailbox&#39;s fullname  **This field is provided only if you have set with&#x3D;full_name** |  [optional] |
|**hasAutoResponder** | **Boolean** | True if has_auto_responder is enabled  **This field is provided only if you have set with&#x3D;has_auto_responder** |  [optional] |
|**autoResponder** | [**MailboxAutoReply**](MailboxAutoReply.md) |  |  [optional] |
|**hasRedirection** | **Boolean** | True if has at least one redirection  **This field is provided only if you have set with&#x3D;redirection** |  [optional] |
|**redirections** | **List&lt;String&gt;** |  |  [optional] |
|**aliases** | **List&lt;String&gt;** |  |  [optional] |
|**fullAliases** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **Integer** | Creation date  **This field is provided only if you have set with&#x3D;created_at** |  [optional] |
|**passwordLastChangedAt** | **Integer** | Last password change date  **This field is provided only if you have set with&#x3D;password_last_changed_at** |  [optional] |
|**size** | **Integer** | Mailbox size in ko  **This field is provided only if you have set with&#x3D;size** |  [optional] |
|**sizeCheckedAt** | **Integer** | Last mailbox size verification date  **This field is provided only if you have set with&#x3D;last_login** |  [optional] |
|**imapLastLoginAt** | **Integer** | Last login date from imap protocol, unix timestamp  **This field is provided only if you have set with&#x3D;last_login** |  [optional] |
|**pop3LastLoginAt** | **Integer** | Last login date from imap protocol, unix timestamp  **This field is provided only if you have set with&#x3D;size** |  [optional] |
|**operationInProgress** | **Boolean** | True if blocking operation is currently in progress on this service  **This field is provided only if you have set with&#x3D;operation_in_progress** |  [optional] |
|**users** | [**List&lt;MailUser&gt;**](MailUser.md) |  |  [optional] |
|**hasMoveSpam** | **Boolean** | True if has at least one redirection  **This field is provided only if you have set with&#x3D;has_move_spam** |  [optional] |
|**authorizedSenders** | **List&lt;String&gt;** |  |  [optional] |
|**blockedSenders** | **List&lt;String&gt;** |  |  [optional] |
|**hasDkimSignature** | **Boolean** | True if dkim signature is activated  **This field is provided only if you have set with&#x3D;has_dkim_signature** |  [optional] |
|**isDkimUpdatable** | **Boolean** | True if dkim signature can be updated  **This field is provided only if you have set with&#x3D;is_dkim_updatable** |  [optional] |
|**hasMailFiltering** | **Boolean** | True if Commercial and SocialNetwork filters are activated  **This field is provided only if you have set with&#x3D;has_mail_filtering** |  [optional] |
|**mailFilteringFolderCommercials** | **String** | Folder for Commercial emails filter  **This field is provided only if you have set with&#x3D;mail_filtering_folder_commercials** |  [optional] |
|**mailFilteringFolderSocialNetworks** | **String** | Folder for SocialNetwork emails filter  **This field is provided only if you have set with&#x3D;mail_filtering_folder_social_networks** |  [optional] |
|**isAuth** | **Boolean** | True if user is authenticated with this mailbox  **This field is provided only if you have set with&#x3D;auth** |  [optional] |
|**isRemovable** | **Boolean** | True if mailbox is is_removable. Note: is always true  **This field is provided only if you have set with&#x3D;is_removable** |  [optional] |
|**permissions** | [**MailMailboxPermissions**](MailMailboxPermissions.md) |  |  [optional] |
|**mailboxId** | **Integer** | Identifier of this mailbox  **This field is provided only if you have set with&#x3D;mailbox_id** |  [optional] |



