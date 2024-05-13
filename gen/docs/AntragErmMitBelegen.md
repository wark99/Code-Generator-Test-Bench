

# AntragErmMitBelegen


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**zeitraumVon** | **String** | Wenn Standardantrag oder Folgeantrag, dann 1.9. des aktuellen Einrichungsjahres Datumseingabe der Eltern |  |
|**berechnungsartBesuch** | **String** | Arten der Berechnung der Besuchsgebühren. Werden von K@RL definiert und müssen im Antragsmodul konfigurierbar hinterlegt werden können. |  [optional] |
|**berechnungsartVerpflegung** | **String** | Arten der Berechnung der Verpflegungsgebühren. Werden von K@RL definiert und müssen im Antragsmodul konfigurierbar hinterlegt werden können. |  [optional] |
|**einkommenInCent** | **Integer** | Einkommenshöhe, anhand dessen die Gebührenhöhe in K@RL berechnet wird. |  [optional] |
|**einkommensjahr** | **String** | vom SB je nach Antragsart, bei Ermäßigung aufgrund des Einkommens das Kalendervorvorjahr, bei Sozialleistungen das aktuelle Einrichtungsjahr |  [optional] |
|**unterlagenstatus** | **Unterlagenstatus** |  |  |
|**bemerkung** | **String** |  |  [optional] |
|**kennzeichenIndividuelleFestsetzung** | **Boolean** | false - automatisch, true - individuelle Festsetzung durch SB in K@RL |  |
|**geschwisterkinder** | [**List&lt;AntragErmMitBelegenGeschwisterkinderInner&gt;**](AntragErmMitBelegenGeschwisterkinderInner.md) | Pflicht bei Antrag auf Geschwisterermäßigung |  [optional] |



