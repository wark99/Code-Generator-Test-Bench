

# FilterSetsResponseAllOfData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Unique id for the set |  |
|**createdAt** | **Object** |  |  |
|**userId** | **Object** |  |  |
|**orgId** | **Object** | The ID of the organization the user who performed the set belongs to. |  |
|**exerciseId** | **Object** |  |  |
|**weight** | **Object** | The weight the lift was performed with. |  |
|**pct1rm** | **Object** | The percentage [0.0 - 1.0] this set\&quot;s weight is of the user\&quot;s One Rep Max (1RM) for this exercise. |  [optional] |
|**tracked** | **Object** | Delineates whether this set was tracked by a Perch camera (&#x60;true&#x60;) or manually entered into Perch. |  |
|**bandsUsed** | **Object** | Whether bands were used for this set. |  [optional] |
|**chainsUsed** | **Object** | Whether chains were used for this set. |  [optional] |
|**startTime** | [**BigDecimal**](BigDecimal.md) |  |  |
|**endTime** | [**BigDecimal**](BigDecimal.md) |  |  [optional] |
|**error** | [**SetError**](SetError.md) |  |  [optional] |
|**reps** | **Object** | Contains all reps the Perch device tracked. &#x60;Set.error.ghost_rep_indices&#x60; optionally contains indices into this array that were marked by the user as erroneous and should be ignored. |  [optional] |
|**numReps** | **Object** | The number of VALID reps on this set. This is the same as then length of the Reps array, unless the user marked an error and removed ghost reps. In that case, this count of reps reflects the removal of those ghost reps. |  [optional] |
|**numTrackedReps** | **Object** | The number of reps the Perch camera tracked for this set. This will always be exactly the length of the Reps array. |  [optional] |
|**firstLimb** | [**FirstLimbEnum**](#FirstLimbEnum) | In a unilateral exercise, this is the limb with which the athlete began their reps. |  [optional] |
|**limbPattern** | **LimbPattern** |  |  [optional] |
|**minMeanPower** | **Object** | The minimum of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * min_mean_power&#x60; |  [optional] |
|**avgMeanPower** | **Object** | The mean of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * avg_mean_power&#x60; |  [optional] |
|**maxMeanPower** | **Object** | The max of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * max_mean_power&#x60; |  [optional] |
|**minMeanVelocity** | **Object** | The minimum of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_mean_velocity&#x60; |  [optional] |
|**avgMeanVelocity** | **Object** | The mean of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_mean_velocity&#x60; |  [optional] |
|**maxMeanVelocity** | **Object** | The max of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_mean_velocity&#x60; |  [optional] |
|**avgEccMeanVelocity** | **Object** | The mean of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_ecc_mean_velocity&#x60; |  [optional] |
|**maxEccMeanVelocity** | **Object** | The max of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_ecc_mean_velocity&#x60; |  [optional] |
|**minEccMeanVelocity** | **Object** | The min of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_ecc_mean_velocity&#x60; |  [optional] |
|**minPeakPower** | **Object** | The minimum of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * min_peak_power&#x60; |  [optional] |
|**avgPeakPower** | **Object** | The mean of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * avg_peak_power&#x60; |  [optional] |
|**maxPeakPower** | **Object** | The max of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * max_peak_power&#x60; |  [optional] |
|**minPeakVelocity** | **Object** | The minimum of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_peak_velocity&#x60; |  [optional] |
|**avgPeakVelocity** | **Object** | The mean of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_peak_velocity&#x60; |  [optional] |
|**maxPeakVelocity** | **Object** | The max of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_peak_velocity&#x60; |  [optional] |
|**avgEccPeakVelocity** | **Object** | The mean of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_ecc_peak_velocity&#x60; |  [optional] |
|**maxEccPeakVelocity** | **Object** | The max of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_ecc_peak_velocity&#x60; |  [optional] |
|**minEccPeakVelocity** | **Object** | The min of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_ecc_peak_velocity&#x60; |  [optional] |
|**avgEccTime** | **Object** | The mean of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * avg_ecc_time&#x60; |  [optional] |
|**maxEccTime** | **Object** | The max of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * max_ecc_time&#x60; |  [optional] |
|**minEccTime** | **Object** | The min of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * min_ecc_time&#x60; |  [optional] |
|**maxVelocityAt100Ms** | **Object** | The maximum value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * max_velocity_at_100_ms&#x60; |  [optional] |
|**avgVelocityAt100Ms** | **Object** | The average value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_velocity_at_100_ms&#x60; |  [optional] |
|**minVelocityAt100Ms** | **Object** | The minimum value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * min_velocity_at_100_ms&#x60; |  [optional] |
|**maxTimeToPeakVelocity** | **Object** | The maximum value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**avgTimeToPeakVelocity** | **Object** | The average value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**minTimeToPeakVelocity** | **Object** | The minimum value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**maxTimeToPeakPower** | **Object** | The maximum value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |
|**avgTimeToPeakPower** | **Object** | The average value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |
|**minTimeToPeakPower** | **Object** | The minimum value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |



## Enum: FirstLimbEnum

| Name | Value |
|---- | -----|
| RIGHT | &quot;RIGHT&quot; |
| LEFT | &quot;LEFT&quot; |



