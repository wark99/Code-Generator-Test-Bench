

# OwnerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**callingName** | **String** |  |  [optional] |
|**contact** | [**ContactResponse**](ContactResponse.md) |  |  [optional] |
|**addresses** | [**List&lt;OwnerAddressResponse&gt;**](OwnerAddressResponse.md) |  |  [optional] |
|**initialPresentationDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**contractSignDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**residency** | [**ResidencyEnum**](#ResidencyEnum) | Is the owner resident in the UK or abroad. 0 &#x3D; UK, 1 &#x3D; Abroad |  [optional] |
|**consent** | [**ConsentResponse**](ConsentResponse.md) |  |  [optional] |
|**properties** | [**List&lt;ExtendedLinkedPropertyResponse&gt;**](ExtendedLinkedPropertyResponse.md) |  |  [optional] |
|**created** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**updated** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**enquirySource** | **String** | 1 &#x3D; 118 118, 2 &#x3D; Accountant, 51 &#x3D; Advertising board, 99 &#x3D; Agent Comparison Site, 3 &#x3D; Airbnb, 83 &#x3D; allAgents, 4 &#x3D; Applicant conversion, 5 &#x3D; Bing, 6 &#x3D; Blog, 7 &#x3D; BNI, 81 &#x3D; Boomin, 8 &#x3D; Branded car, 70 &#x3D; BT phonebook, 10 &#x3D; Canvassing, 11 &#x3D; Chamber of Commerce, 12 &#x3D; Citylets, 85 &#x3D; Commercial People, 13 &#x3D; Conveyancing referral, 14 &#x3D; Door knock, 18 &#x3D; Employee, 15 &#x3D; Facebook, 16 &#x3D; Facebook paid adverts, 76 &#x3D; feefo, 17 &#x3D; Financial advisor referral, 72 &#x3D; Friend, 19 &#x3D; Google, 20 &#x3D; Google Adwords, 21 &#x3D; Gumtree, 98 &#x3D; Homesearch, 66 &#x3D; Instagram, 22 &#x3D; Instant online valuation, 64 &#x3D; Lawyer, 23 &#x3D; Leaflet campaign, 24 &#x3D; Lettings referral, 25 &#x3D; Lettingweb, 26 &#x3D; LinkedIn, 65 &#x3D; LinkedIn paid adverts, 27 &#x3D; Local newspaper, 28 &#x3D; Maintenance contractor, 29 &#x3D; National newspaper, 30 &#x3D; Networking event, 31 &#x3D; New homes part exchange (NHPX), 9 &#x3D; Newsletter mailer, 32 &#x3D; Not asked, 33 &#x3D; Office location, 35 &#x3D; On The Market, 82 &#x3D; OneDome, 100 &#x3D; Open Rent, 36 &#x3D; Other, 37 &#x3D; Other branch referral, 63 &#x3D; Other search engine, 38 &#x3D; Our website, 39 &#x3D; Part exchange, 67 &#x3D; Pintrest, 61 &#x3D; Planning applications, 40 &#x3D; Previous client, 42 &#x3D; Prime location, 62 &#x3D; Property auctions, 91 &#x3D; Propertynews, 43 &#x3D; Radio advert, 44 &#x3D; Recommendation, 45 &#x3D; Referral, 46 &#x3D; Repossession, 97 &#x3D; Residential People, 47 &#x3D; rightmove, 48 &#x3D; s1homes, 49 &#x3D; Sales referral, 50 &#x3D; Seminar, 101 &#x3D; Spectre, 52 &#x3D; Sponsorship, 53 &#x3D; Tradeshow, 54 &#x3D; Twitter, 94 &#x3D; UKHomesearch, 79 &#x3D; Unknown, 96 &#x3D; Valpal, 55 &#x3D; Vendor, 56 &#x3D; Walk past, 57 &#x3D; Yahoo, 58 &#x3D; Yell.com, 68 &#x3D; Yellow Pages, 60 &#x3D; Zoopla |  [optional] |



## Enum: ResidencyEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



