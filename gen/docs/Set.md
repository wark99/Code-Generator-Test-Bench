

# Set

An object representing a set tracked by or entered into Perch.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique id for the set |  |
|**createdAt** | **BigDecimal** |  |  |
|**userId** | **Integer** |  |  |
|**orgId** | **Integer** | The ID of the organization the user who performed the set belongs to. |  |
|**exerciseId** | **Integer** |  |  |
|**weight** | **BigDecimal** | The weight the lift was performed with. |  |
|**pct1rm** | **BigDecimal** | The percentage [0.0 - 1.0] this set\&quot;s weight is of the user\&quot;s One Rep Max (1RM) for this exercise. |  [optional] |
|**tracked** | **Boolean** | Delineates whether this set was tracked by a Perch camera (&#x60;true&#x60;) or manually entered into Perch. |  |
|**bandsUsed** | **Boolean** | Whether bands were used for this set. |  [optional] |
|**chainsUsed** | **Boolean** | Whether chains were used for this set. |  [optional] |
|**startTime** | [**BigDecimal**](BigDecimal.md) |  |  |
|**endTime** | [**BigDecimal**](BigDecimal.md) |  |  [optional] |
|**error** | [**SetError**](SetError.md) |  |  [optional] |
|**reps** | [**List&lt;Rep&gt;**](Rep.md) | Contains all reps the Perch device tracked. &#x60;Set.error.ghost_rep_indices&#x60; optionally contains indices into this array that were marked by the user as erroneous and should be ignored. |  [optional] |
|**numReps** | **Integer** | The number of VALID reps on this set. This is the same as then length of the Reps array, unless the user marked an error and removed ghost reps. In that case, this count of reps reflects the removal of those ghost reps. |  [optional] |
|**numTrackedReps** | **Integer** | The number of reps the Perch camera tracked for this set. This will always be exactly the length of the Reps array. |  [optional] |
|**firstLimb** | [**FirstLimbEnum**](#FirstLimbEnum) | In a unilateral exercise, this is the limb with which the athlete began their reps. |  [optional] |
|**limbPattern** | **LimbPattern** |  |  [optional] |
|**minMeanPower** | **BigDecimal** | The minimum of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * min_mean_power&#x60; |  [optional] |
|**avgMeanPower** | **BigDecimal** | The mean of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * avg_mean_power&#x60; |  [optional] |
|**maxMeanPower** | **BigDecimal** | The max of &#x60;Rep.concentric_mean_velocity_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * N/lbs * max_mean_power&#x60; |  [optional] |
|**minMeanVelocity** | **BigDecimal** | The minimum of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_mean_velocity&#x60; |  [optional] |
|**avgMeanVelocity** | **BigDecimal** | The mean of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_mean_velocity&#x60; |  [optional] |
|**maxMeanVelocity** | **BigDecimal** | The max of &#x60;Rep.concentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_mean_velocity&#x60; |  [optional] |
|**avgEccMeanVelocity** | **BigDecimal** | The mean of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_ecc_mean_velocity&#x60; |  [optional] |
|**maxEccMeanVelocity** | **BigDecimal** | The max of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_ecc_mean_velocity&#x60; |  [optional] |
|**minEccMeanVelocity** | **BigDecimal** | The min of &#x60;Rep.eccentric_mean_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_ecc_mean_velocity&#x60; |  [optional] |
|**minPeakPower** | **BigDecimal** | The minimum of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * min_peak_power&#x60; |  [optional] |
|**avgPeakPower** | **BigDecimal** | The mean of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * avg_peak_power&#x60; |  [optional] |
|**maxPeakPower** | **BigDecimal** | The max of &#x60;Rep.concentric_peak_power_per_mass_z * Set.weight&#x60; across all reps. Convert to watts: &#x60;m/in * m/in * kg/lbs * max_peak_power&#x60; |  [optional] |
|**minPeakVelocity** | **BigDecimal** | The minimum of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_peak_velocity&#x60; |  [optional] |
|**avgPeakVelocity** | **BigDecimal** | The mean of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_peak_velocity&#x60; |  [optional] |
|**maxPeakVelocity** | **BigDecimal** | The max of &#x60;Rep.concentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_peak_velocity&#x60; |  [optional] |
|**avgEccPeakVelocity** | **BigDecimal** | The mean of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_ecc_peak_velocity&#x60; |  [optional] |
|**maxEccPeakVelocity** | **BigDecimal** | The max of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * max_ecc_peak_velocity&#x60; |  [optional] |
|**minEccPeakVelocity** | **BigDecimal** | The min of &#x60;Rep.eccentric_peak_velocity_z&#x60; across all reps. Convert to m/s: &#x60;m/in * min_ecc_peak_velocity&#x60; |  [optional] |
|**avgEccTime** | **BigDecimal** | The mean of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * avg_ecc_time&#x60; |  [optional] |
|**maxEccTime** | **BigDecimal** | The max of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * max_ecc_time&#x60; |  [optional] |
|**minEccTime** | **BigDecimal** | The min of &#x60;(Rep.eccentric_end_time - Rep.eccentric_end_time)&#x60; across all reps. Convert to seconds: &#x60;us/s * min_ecc_time&#x60; |  [optional] |
|**maxVelocityAt100Ms** | **BigDecimal** | The maximum value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * max_velocity_at_100_ms&#x60; |  [optional] |
|**avgVelocityAt100Ms** | **BigDecimal** | The average value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * avg_velocity_at_100_ms&#x60; |  [optional] |
|**minVelocityAt100Ms** | **BigDecimal** | The minimum value of &#x60;Rep.concentric_velocity_at_100_ms&#x60; across all reps. Convert to m/s: &#x60;m/in * min_velocity_at_100_ms&#x60; |  [optional] |
|**maxTimeToPeakVelocity** | **BigDecimal** | The maximum value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**avgTimeToPeakVelocity** | **BigDecimal** | The average value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**minTimeToPeakVelocity** | **BigDecimal** | The minimum value of &#x60;Rep.concentric_time_to_peak_velocity&#x60; across all reps. |  [optional] |
|**maxTimeToPeakPower** | **BigDecimal** | The maximum value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |
|**avgTimeToPeakPower** | **BigDecimal** | The average value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |
|**minTimeToPeakPower** | **BigDecimal** | The minimum value of &#x60;Rep.concentric_time_to_peak_power&#x60; across all reps. |  [optional] |



## Enum: FirstLimbEnum

| Name | Value |
|---- | -----|
| RIGHT | &quot;RIGHT&quot; |
| LEFT | &quot;LEFT&quot; |



