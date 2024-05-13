

# Model1MailHostingsMailHostingIdMailboxesMailboxNameDelete400ResponseAllOfError

Error object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | Error code |  [optional] |
|**description** | [**DescriptionEnum**](#DescriptionEnum) | Description of the error |  [optional] |
|**errors** | **List&lt;String&gt;** | Error details |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |
| MAILBOX_CANNOT_DELETE_QUARANTINE | &quot;mailbox_cannot_delete_quarantine&quot; |
| MAILBOX_IS_LDAP_LOCKED | &quot;mailbox_is_ldap_locked&quot; |
| MAILBOX_IS_SMTPBAN | &quot;mailbox_is_smtpban&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| MAILBOX_CANNOT_DELETE_QUARANTINE | &quot;Mailbox cannot delete quarantine&quot; |
| MAILBOX_IS_LDAP_LOCKED | &quot;Mailbox is ldap locked&quot; |
| MAILBOX_IS_SMTPBAN | &quot;Mailbox is smtpban&quot; |



