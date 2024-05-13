

# RegPrivilegeInfo

브랜드의 권한 정보 객체입니다. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**privilegeType** | [**PrivilegeTypeEnum**](#PrivilegeTypeEnum) | 권한은 다음과 같이 구분됩니다.      - Manager : 대표운영자     - SubManager : 운영자(기업의 마스터 또는 매니저)   - Agency : 운영자(대행사)  |  |
|**id** | **String** | 마스터, 매니저 또는 대행사의 ID입니다.  |  |



## Enum: PrivilegeTypeEnum

| Name | Value |
|---- | -----|
| AGENCY | &quot;Agency&quot; |
| SUBMANAGER | &quot;SubManager&quot; |
| MANAGER | &quot;Manager&quot; |



