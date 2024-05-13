

# SensorState


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idSite** | **String** | The ID of the site, if this status is associated with a fixed site or platform. |  [optional] |
|**siteType** | **String** | Optional site type or further detail of type.  Intended for, but not limited to, Link-16 site type specifications (e.g. ADOC, GACC, SOC, TACC, etc.). |  [optional] |
|**instStatus** | [**InstStatusEnum**](#InstStatusEnum) | The status of the installation.  FMC - Fully Mission Capable   PMC - Partially Mission Capable  NMC - Non Mission Capable  UNK - Unknown. |  [optional] |
|**fpcon** | [**FpconEnum**](#FpconEnum) | Force Protection Condition (FPCON).    NORMAL - Applies when a general global threat of possible terrorist activity exists and warrants a routine security posture.  ALPHA - Applies when an increased general threat of possible terrorist activity against personnel or facilities. Nature and extent of threat are unpredictable.  BRAVO - Applies when an increased or predictable threat of terrorist activity exists.  CHARLIE - Applies when an incident occurs or intelligence is received indicating some form of terrorist action against personnel and facilities is imminent.  DELTA - Applies in the immediate area where an attack has occurred or when intelligence is received indicating terrorist action against a location is imminent. |  [optional] |
|**hpcon** | [**HpconEnum**](#HpconEnum) | Health Protection Condition (HPCON).    0 - Routine no community transmission.  ALPHA - Limited community transmission beginning.  BRAVO - Moderate increased community transmission.  CHARLIE - Substantial sustained community transmission.  DELTA - Severe widespread community transmission. |  [optional] |
|**cpcon** | [**CpconEnum**](#CpconEnum) | Cyberspace Protection Condition (CPCON).    1 - VERY HIGH - Critical functions.  2 - HIGH - Critical and essential functions.  3 - MEDIUM - Critical essential and support functions.  4 - LOW - All functions.  5 - VERY LOW - All functions. |  [optional] |
|**reportTime** | **OffsetDateTime** | Time of report in ISO8601 UTC format. |  [optional] |
|**weatherMessage** | **String** | Description of the current weather conditions over a site. |  [optional] |



## Enum: InstStatusEnum

| Name | Value |
|---- | -----|
| FMC_PMC_NMC_UNK | &quot;FMC PMC NMC UNK&quot; |



## Enum: FpconEnum

| Name | Value |
|---- | -----|
| NORMAL_ALPHA_BRAVO_CHARLIE_DELTA | &quot;NORMAL ALPHA BRAVO CHARLIE DELTA&quot; |



## Enum: HpconEnum

| Name | Value |
|---- | -----|
| _0_ALPHA_BRAVO_CHARLIE_DELTA | &quot;0 ALPHA BRAVO CHARLIE DELTA&quot; |



## Enum: CpconEnum

| Name | Value |
|---- | -----|
| _1_2_3_4_5 | &quot;1 2 3 4 5&quot; |



