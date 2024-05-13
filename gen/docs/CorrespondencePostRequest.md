

# CorrespondencePostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Email &#x3D; Email, Phone &#x3D; Telephone, Comment &#x3D; General comment |  [optional] |
|**subCategory** | [**SubCategoryEnum**](#SubCategoryEnum) | 1 &#x3D; Arrears - contact to tenant, 2 &#x3D; Arrears - response from tenant, 3 &#x3D; Complaint - HMO, 4 &#x3D; Complaint - owner, 5 &#x3D; Complaint - tenant, 6 &#x3D; Complaint - neighbour, 7 &#x3D; Complaint - other, 8 &#x3D; HMO - licence application/renewal, 9 &#x3D; Owner - general enquiry, 10 &#x3D; Owner - change of details, 11 &#x3D; Owner - rent enquiry, 12 &#x3D; Owner - statement enquiry, 13 &#x3D; Owner - NTQ enquiry, 14 &#x3D; Owner - move out enquiry, 15 &#x3D; Owner - move in enquiry, 16 &#x3D; Neighbour/other agency enquiry, 17 &#x3D; New tenancy application - tenant enquiry, 18 &#x3D; New tenancy application - references, 19 &#x3D; Tenant  - general enquiry, 20 &#x3D; Tenant - change of details, 21 &#x3D; Tenant - rent enquiry, 22 &#x3D; Tenant - NTQ enquiry, 23 &#x3D; Tenant - move out enquiry, 24 &#x3D; Tenant - move in enquiry, 25 &#x3D; Tenant - deposit enquiry, 26 &#x3D; Tenant - guarantor enquiry, 27 &#x3D; TDS, 28 &#x3D; Utilities/Council Tax, 29 &#x3D; Owner - maintenance enquiry, 30 &#x3D; Tenant - maintenance enquiry, 31 &#x3D; Property - general, 32 &#x3D; Property - work recommendation, 33 &#x3D; Viewing - feedback, 34 &#x3D; Tenant - deposit deduction, 41 &#x3D; Generated document, 42 &#x3D; Property - maintenance general, 43 &#x3D; Property - advertising board, 45 &#x3D; Sales progression, 46 &#x3D; Owner - contract renewal, 60 &#x3D; Buyer - general enquiry, 61 &#x3D; Buyer - home report, 62 &#x3D; Buyer - note of interest, 63 &#x3D; Buyer - offer, 64 &#x3D; Buyer - sales progression, 65 &#x3D; Buyer - viewing feedback, 66 &#x3D; Seller - appraisal, 67 &#x3D; Seller - closing date, 68 &#x3D; Seller - general enquiry, 69 &#x3D; Seller - home report, 70 &#x3D; Seller - marketing approval, 71 &#x3D; Seller - offer, 72 &#x3D; Seller - viewing feedback, 73 &#x3D; Withdrawal reason, 74 &#x3D; Chain notes, 75 &#x3D; Seller - marketing update, 76 &#x3D; Seller - price change, 77 &#x3D; Seller - contract renewal, 78 &#x3D; Tenant - renewal, 79 &#x3D; Owner - offer, 80 &#x3D; Memorandum of sale, 81 &#x3D; Buyer - EPC, 82 &#x3D; Buyer - brochure / schedule sent, 83 &#x3D; Seller - brochure / schedule sent, 84 &#x3D; Buyer - Closing date |  [optional] |
|**property** | [**CorrespondencePostRequestProperty**](CorrespondencePostRequestProperty.md) |  |  [optional] |
|**contact** | [**CorrespondencePostRequestContact**](CorrespondencePostRequestContact.md) |  |  [optional] |
|**date** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**subject** | **String** | Subject line of a correspondence. |  [optional] |
|**description** | **String** | Description/Body of a correspondence. |  [optional] |
|**user** | [**CorrespondencePostRequestUser**](CorrespondencePostRequestUser.md) |  |  [optional] |
|**action** | [**CorrespondencePostRequestAction**](CorrespondencePostRequestAction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;Email&quot; |
| PHONE | &quot;Phone&quot; |
| COMMENT | &quot;Comment&quot; |



## Enum: SubCategoryEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |
| NUMBER_28 | 28 |
| NUMBER_29 | 29 |
| NUMBER_30 | 30 |
| NUMBER_31 | 31 |
| NUMBER_32 | 32 |
| NUMBER_33 | 33 |
| NUMBER_34 | 34 |
| NUMBER_41 | 41 |
| NUMBER_42 | 42 |
| NUMBER_43 | 43 |
| NUMBER_45 | 45 |
| NUMBER_46 | 46 |
| NUMBER_60 | 60 |
| NUMBER_61 | 61 |
| NUMBER_62 | 62 |
| NUMBER_63 | 63 |
| NUMBER_64 | 64 |
| NUMBER_65 | 65 |
| NUMBER_66 | 66 |
| NUMBER_67 | 67 |
| NUMBER_68 | 68 |
| NUMBER_69 | 69 |
| NUMBER_70 | 70 |
| NUMBER_71 | 71 |
| NUMBER_72 | 72 |
| NUMBER_73 | 73 |
| NUMBER_74 | 74 |
| NUMBER_75 | 75 |
| NUMBER_76 | 76 |
| NUMBER_77 | 77 |
| NUMBER_78 | 78 |
| NUMBER_79 | 79 |
| NUMBER_80 | 80 |
| NUMBER_81 | 81 |
| NUMBER_82 | 82 |
| NUMBER_83 | 83 |
| NUMBER_84 | 84 |



