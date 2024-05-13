

# Rep

The object representing an individual rep tracked by a Perch camera. You'll notice the lack of mean power stats, which are calculated simply by converting the corresponding mean velocity to `m/s` and multiplying by the weight in `kg`. Peak power stats are given in strange units. This is to make those fields independent from the `Set.weight`, which is an editable field required to calculate the actual power (i.e. in units of watts). Equations to convert these stats to watts are provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**concentricMeanVelocityZ** | **BigDecimal** | The average vertical component of velocity for the concentric phase of the rep. |  [optional] |
|**eccentricMeanVelocityZ** | **BigDecimal** | The average vertical component of velocity for the eccentric phase of the rep. |  [optional] |
|**concentricPeakVelocityZ** | **BigDecimal** | The maximum instantaneous vertical component of velocity for the concentric phase of the rep. |  [optional] |
|**concentricTimeToPeakVelocityZ** | **BigDecimal** | The time (in seconds) the athelete took to achieve peak velocity (on the Z axis) during the concentric phase of the movement. |  [optional] |
|**concentricTimeToPeakPowerZ** | **BigDecimal** | The time (in seconds) the athelete took to achieve peak power during the concentric phase of the movement. |  [optional] |
|**concentricVelocityAt100MsZ** | **BigDecimal** | The instantaneous velocity at 100ms into the concentric phase of the movement. |  [optional] |
|**eccentricPeakVelocityZ** | **BigDecimal** | The maximum instantaneous vertical component of velocity for the eccentric phase of the rep. |  [optional] |
|**concentricPeakPowerPerMassZ** | **BigDecimal** | Convert to peak power in watts: &#x60;(m/in)**2 * concentric_peak_power_per_mass_z * kg/lbs * Set.weight&#x60; |  [optional] |



