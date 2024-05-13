

# CreateRequestProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfPurchase** | **String** |  |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) |  |  |
|**brand** | [**BrandEnum**](#BrandEnum) |  |  |
|**serialNumber** | **String** | If unknown, please use value VERIFY_SERIAL |  |
|**serialNumber2** | **String** | Optional second serial number. |  [optional] |
|**modelNumber** | **String** | If unknown, please use value VERIFY_MODEL |  |
|**modelVersion** | **String** |  |  [optional] |
|**sellingDealer** | **String** |  |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| ADJUSTABLE_BED_BASE | &quot;ADJUSTABLE BED BASE&quot; |
| AIR_CONDITIONER | &quot;AIR CONDITIONER&quot; |
| AIR_HANDLER | &quot;AIR HANDLER&quot; |
| AIR_PURIFIER | &quot;AIR PURIFIER&quot; |
| ANTENNA | &quot;ANTENNA&quot; |
| AUDIO | &quot;AUDIO&quot; |
| BASEBOARD_HEATER | &quot;BASEBOARD HEATER&quot; |
| BOILER | &quot;BOILER&quot; |
| BUILT_IN_GRILL | &quot;BUILT-IN GRILL&quot; |
| BUSINESS_SERVER_CHASSIS | &quot;BUSINESS SERVER CHASSIS&quot; |
| CAMERA_SYSTEM | &quot;CAMERA SYSTEM&quot; |
| CELL_PHONE | &quot;CELL PHONE&quot; |
| CHAIR | &quot;CHAIR&quot; |
| CLOTHES_DRYER_ELECTRIC | &quot;CLOTHES DRYER - ELECTRIC&quot; |
| CLOTHES_DRYER_GAS | &quot;CLOTHES DRYER - GAS&quot; |
| CLOTHES_WASHER | &quot;CLOTHES WASHER&quot; |
| COOKTOP_ELECTRIC | &quot;COOKTOP - ELECTRIC&quot; |
| COOKTOP_GAS | &quot;COOKTOP - GAS&quot; |
| DEHUMIDIFER | &quot;DEHUMIDIFER&quot; |
| DESKTOP | &quot;DESKTOP&quot; |
| DISHWASHER | &quot;DISHWASHER&quot; |
| DUCTWORK | &quot;DUCTWORK&quot; |
| ELECTRICAL_BATTERIES | &quot;ELECTRICAL - BATTERIES&quot; |
| ELECTRICAL_DOORBELL | &quot;ELECTRICAL - DOORBELL&quot; |
| ELECTRICAL_INDOORS | &quot;ELECTRICAL - INDOORS&quot; |
| ELECTRICAL_OUTDOORS | &quot;ELECTRICAL - OUTDOORS&quot; |
| EVAPORATOR_COIL | &quot;EVAPORATOR COIL&quot; |
| EXHAUST_HOOD | &quot;EXHAUST - HOOD&quot; |
| EXHAUST_TELESCOPING | &quot;EXHAUST - TELESCOPING&quot; |
| FIREPLACE | &quot;FIREPLACE&quot; |
| FURNACE | &quot;FURNACE&quot; |
| GARAGE_DOOR_MECHANICAL | &quot;GARAGE DOOR MECHANICAL&quot; |
| GARAGE_DOOR_OPENER | &quot;GARAGE DOOR OPENER&quot; |
| GLYCOL_BOILER | &quot;GLYCOL BOILER&quot; |
| HEAT_PUMP | &quot;HEAT PUMP&quot; |
| HEAT_PUMP_GEOTHERMAL | &quot;HEAT PUMP GEOTHERMAL&quot; |
| HUMIDIFER | &quot;HUMIDIFER&quot; |
| HVAC | &quot;HVAC&quot; |
| LAPTOP | &quot;LAPTOP&quot; |
| MAJOR_APPLIANCE | &quot;MAJOR APPLIANCE&quot; |
| MICROWAVE | &quot;MICROWAVE&quot; |
| MINI_SPLIT_AC | &quot;MINI SPLIT AC&quot; |
| MINI_SPLIT_AIR_HANDLER | &quot;MINI SPLIT AIR HANDLER&quot; |
| MINI_SPLIT_HP | &quot;MINI SPLIT HP&quot; |
| NETWORKING_CABLE | &quot;NETWORKING CABLE&quot; |
| OTHER | &quot;OTHER&quot; |
| PACKAGE_AC | &quot;PACKAGE AC&quot; |
| PACKAGE_GE_GAS_ELECTRIC_ | &quot;PACKAGE GE (GAS ELECTRIC)&quot; |
| PACKAGE_HP_HEAT_PUMP_ | &quot;PACKAGE HP (HEAT PUMP)&quot; |
| PHONE | &quot;PHONE&quot; |
| PLUMBING_EXTERNAL_SEWER_LINES | &quot;PLUMBING - EXTERNAL SEWER LINES&quot; |
| PLUMBING_INDOOR_LEAK | &quot;PLUMBING - INDOOR LEAK&quot; |
| PLUMBING_INDOOR_WATER_LINES | &quot;PLUMBING - INDOOR WATER LINES&quot; |
| PLUMBING_OUTDOOR_WATER_LINES | &quot;PLUMBING - OUTDOOR WATER LINES&quot; |
| PLUMBING_STOPPAGE | &quot;PLUMBING - STOPPAGE&quot; |
| PLUMBING_SUMP_PUMP | &quot;PLUMBING - SUMP PUMP&quot; |
| PLUMBING_WATER_FILTER | &quot;PLUMBING - WATER FILTER&quot; |
| PLUMBING_WATER_HEATER | &quot;PLUMBING - WATER HEATER&quot; |
| PLUMBING_WELL_PUMP | &quot;PLUMBING - WELL PUMP&quot; |
| POOL | &quot;POOL&quot; |
| POOL_HOTTUB_COMBO | &quot;POOL HOTTUB COMBO&quot; |
| POOL_VENTS | &quot;POOL VENTS&quot; |
| POWER_ACCESSORIES | &quot;POWER ACCESSORIES&quot; |
| PTAC | &quot;PTAC&quot; |
| PTAC_EXCHANGE | &quot;PTAC - EXCHANGE&quot; |
| PTAC_SEALED_SYSTEM | &quot;PTAC - SEALED SYSTEM&quot; |
| RANGE_ELECTRIC | &quot;RANGE - ELECTRIC&quot; |
| RANGE_GAS | &quot;RANGE - GAS&quot; |
| REFRIGERATOR | &quot;REFRIGERATOR&quot; |
| REFRIGERATOR_SEALED_SYSTEM | &quot;REFRIGERATOR - SEALED SYSTEM&quot; |
| REFRIGERATOR_SEALED_SYSTEM_R134A | &quot;REFRIGERATOR - SEALED SYSTEM - R134A&quot; |
| REFRIGERATOR_SEALED_SYSTEM_R600 | &quot;REFRIGERATOR - SEALED SYSTEM/R600&quot; |
| REFRIGERATORRV | &quot;REFRIGERATORRV&quot; |
| SPA_HOTTUB | &quot;SPA-HOTTUB&quot; |
| STAND_ALONE_FREEZER | &quot;STAND ALONE FREEZER&quot; |
| TABLET | &quot;TABLET&quot; |
| THERMOSTAT | &quot;THERMOSTAT&quot; |
| TRASH_COMPACTOR | &quot;TRASH COMPACTOR&quot; |
| TV | &quot;TV&quot; |
| WALL_OVEN_ELECTRIC | &quot;WALL OVEN - ELECTRIC&quot; |
| WALL_OVEN_GAS | &quot;WALL OVEN - GAS&quot; |
| WINECOOLER | &quot;WINECOOLER&quot; |
| WOOD_STOVE | &quot;WOOD STOVE&quot; |



## Enum: BrandEnum

| Name | Value |
|---- | -----|
| ADMIRAL | &quot;ADMIRAL&quot; |
| AKAI | &quot;AKAI&quot; |
| ALPINE | &quot;ALPINE&quot; |
| AMANA | &quot;AMANA&quot; |
| APPLE | &quot;APPLE&quot; |
| ASKO | &quot;ASKO&quot; |
| AVANTI | &quot;AVANTI&quot; |
| BERTAZZONI | &quot;BERTAZZONI&quot; |
| BLOMBERG | &quot;BLOMBERG&quot; |
| BLUE_STAR | &quot;BLUE STAR&quot; |
| BOSCH | &quot;BOSCH&quot; |
| BRITELITE | &quot;BRITELITE&quot; |
| BROAN | &quot;BROAN&quot; |
| BROOKSTONE | &quot;BROOKSTONE&quot; |
| BROTHER | &quot;BROTHER&quot; |
| CROSLEY | &quot;CROSLEY&quot; |
| CROWN | &quot;CROWN&quot; |
| CUSTOMATIC | &quot;CUSTOMATIC&quot; |
| DACOR | &quot;DACOR&quot; |
| DANBY | &quot;DANBY&quot; |
| DCS | &quot;DCS&quot; |
| ELECTROLUX | &quot;ELECTROLUX&quot; |
| ELEMENT | &quot;ELEMENT&quot; |
| EMERSON_TV | &quot;EMERSON TV&quot; |
| ERGOMOTION | &quot;ERGOMOTION&quot; |
| ESTATE | &quot;ESTATE&quot; |
| FISHER | &quot;FISHER&quot; |
| FISHER_PAYKEL | &quot;FISHER &amp; PAYKEL&quot; |
| FRIGIDAIRE | &quot;FRIGIDAIRE&quot; |
| FUNAI | &quot;FUNAI&quot; |
| FURRION | &quot;FURRION&quot; |
| GAGGENAU | &quot;GAGGENAU&quot; |
| GE | &quot;GE&quot; |
| GREE | &quot;GREE&quot; |
| HAIER | &quot;HAIER&quot; |
| HISENSE | &quot;HISENSE&quot; |
| HITACHI | &quot;HITACHI&quot; |
| HORIZON_FITNESS | &quot;HORIZON FITNESS&quot; |
| HOTPOINT | &quot;HOTPOINT&quot; |
| HTC | &quot;HTC&quot; |
| INSIGNIA | &quot;INSIGNIA&quot; |
| JANOME | &quot;JANOME&quot; |
| JENN_AIR | &quot;JENN-AIR&quot; |
| JENSEN | &quot;JENSEN&quot; |
| JVC | &quot;JVC&quot; |
| KATERRA | &quot;KATERRA&quot; |
| KENMORE | &quot;KENMORE&quot; |
| KENWOOD_ELECTRONICS | &quot;KENWOOD ELECTRONICS&quot; |
| KITCHENAID | &quot;KITCHENAID&quot; |
| KOVA | &quot;KOVA&quot; |
| LG_ELECTRONICS | &quot;LG ELECTRONICS&quot; |
| LIEBHERR | &quot;LIEBHERR&quot; |
| MAGICCHEF | &quot;MAGICCHEF&quot; |
| MAGNAVOX | &quot;MAGNAVOX&quot; |
| MARVEL | &quot;MARVEL&quot; |
| MAYTAG | &quot;MAYTAG&quot; |
| MIDEA | &quot;MIDEA&quot; |
| MIELE_APPLIANCE | &quot;MIELE APPLIANCE&quot; |
| MITSUBISHI | &quot;MITSUBISHI&quot; |
| MONOPRICE | &quot;MONOPRICE&quot; |
| MOTOROLA | &quot;MOTOROLA&quot; |
| NEC | &quot;NEC&quot; |
| OCTANE_FITNESS | &quot;OCTANE FITNESS&quot; |
| OLIVIA | &quot;OLIVIA&quot; |
| ONN | &quot;ONN&quot; |
| OPAL | &quot;OPAL&quot; |
| OSIM | &quot;OSIM&quot; |
| OTHER | &quot;OTHER&quot; |
| PANASONIC | &quot;PANASONIC&quot; |
| PERLICK | &quot;PERLICK&quot; |
| PHILIPS | &quot;PHILIPS&quot; |
| PIONEER | &quot;PIONEER&quot; |
| POLAROID | &quot;POLAROID&quot; |
| PROSCAN | &quot;PROSCAN&quot; |
| RCA | &quot;RCA&quot; |
| ROPER | &quot;ROPER&quot; |
| SAMSUNG | &quot;SAMSUNG&quot; |
| SANSUI | &quot;SANSUI&quot; |
| SANYO | &quot;SANYO&quot; |
| SCEPTRE | &quot;SCEPTRE&quot; |
| SCOTSMAN | &quot;SCOTSMAN&quot; |
| SEARS | &quot;SEARS&quot; |
| SHARP | &quot;SHARP&quot; |
| SONY | &quot;SONY&quot; |
| SPEED_QUEEN | &quot;SPEED QUEEN&quot; |
| SPIRIT_FITNESS | &quot;SPIRIT FITNESS&quot; |
| SUBZERO | &quot;SUBZERO&quot; |
| SUPERIORE | &quot;SUPERIORE&quot; |
| TAPPAN | &quot;TAPPAN&quot; |
| TCL | &quot;TCL&quot; |
| THERMADOR | &quot;THERMADOR&quot; |
| THOMPSON | &quot;THOMPSON&quot; |
| TMGCORE | &quot;TMGCORE&quot; |
| TOSHIBA | &quot;TOSHIBA&quot; |
| TRIANGLE_TUBE | &quot;TRIANGLE TUBE&quot; |
| U_LINE | &quot;U-LINE&quot; |
| VIKING | &quot;VIKING&quot; |
| VIKING_APPLIANCE | &quot;VIKING APPLIANCE&quot; |
| VIZIO | &quot;VIZIO&quot; |
| WESTINGHOUSE | &quot;WESTINGHOUSE&quot; |
| WHIRLPOOL | &quot;WHIRLPOOL&quot; |
| WINE_ENTHUSIAST | &quot;WINE ENTHUSIAST&quot; |
| WOLF_RANGE | &quot;WOLF RANGE&quot; |
| ZENITH | &quot;ZENITH&quot; |



