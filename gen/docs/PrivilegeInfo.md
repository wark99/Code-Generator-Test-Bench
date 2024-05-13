

# PrivilegeInfo

브랜드의 권한 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**privilegeType** | [**PrivilegeTypeEnum**](#PrivilegeTypeEnum) | 권한은 다음과 같이 구분됩니다.  - Manager : 브랜드 관리자(&#x3D;마스터) - SubManager : 브랜드 부관리자(&#x3D;마스터, 매니저) - Agency : 브랜드 대행사  |  |
|**id** | **String** | 마스터, 매니저 또는 대행사의 ID입니다.  |  |
|**status** | [**StatusEnum**](#StatusEnum) | 권한 처리 상태를 표시합니다.  - Waiting : RCS Biz Center 웹에서 제공되는 기능인 &#39;브랜드 운영권한 신청&#39;을 이용하여 신청 후 대기 브랜드 관리자의 승인을 대기 중인 상태입니다.   Waiting 상태의 대상은 POST를 이용하여 등록하면 승인이 되고 Ok 상태로 변경됩니다.  - Processing : 권한 정보를 이통3사에 동기화 중인 경우 processing 상태로 표시됩니다.   Processing 상태가 짧은 시간 동안 발생할 수 있으며 지속될 경우 RCS Biz Center에 문의하시기 바랍니다.   - Ok : 권한 상태가 정상적인 경우 표시됩니다.  |  |



## Enum: PrivilegeTypeEnum

| Name | Value |
|---- | -----|
| AGENCY | &quot;Agency&quot; |
| SUBMANAGER | &quot;SubManager&quot; |
| MANAGER | &quot;Manager&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;Ok&quot; |
| PROCESSING | &quot;Processing&quot; |
| WAITING | &quot;Waiting&quot; |



