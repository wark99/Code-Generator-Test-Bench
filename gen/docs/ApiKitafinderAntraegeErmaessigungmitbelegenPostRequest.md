

# ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Eindeutige ID des Events |  |
|**timestamp** | **OffsetDateTime** | Zeitstempel des Events (ISO 8601) |  |
|**kfKindId** | **Integer** | eindeutige ID für das Kind, KindmappenID aus Kita-Planer |  |
|**nachname** | **String** |  |  |
|**vorname** | **String** |  |  |
|**geburtsdatum** | **String** | Geburstdatum des Kindes |  |
|**kfKitaId** | **Integer** | Einrichtungs-ID aus Kita-Planer |  |
|**kindKibigId** | **String** | KiBiG-ID des Kindes |  [optional] |
|**kitaKibigId** | **String** | KiBiG-ID der Einrichtung |  |
|**einrichtungsjahr** | **String** | erste Jahreszahl des Kitajahre, z.B. 2021 bei 2021/2022 |  |
|**antragsdatum** | **String** | Datum der Antragsstellung |  |
|**antragsnummer** | **Integer** |  |  |
|**zeitraumVon** | **String** | Wenn Standardantrag oder Folgeantrag, dann 1.9. des aktuellen Einrichungsjahres Datumseingabe der Eltern |  |
|**berechnungsartBesuch** | **String** | Arten der Berechnung der Besuchsgebühren. Werden von K@RL definiert und müssen im Antragsmodul konfigurierbar hinterlegt werden können. |  [optional] |
|**berechnungsartVerpflegung** | **String** | Arten der Berechnung der Verpflegungsgebühren. Werden von K@RL definiert und müssen im Antragsmodul konfigurierbar hinterlegt werden können. |  [optional] |
|**einkommenInCent** | **Integer** | Einkommenshöhe, anhand dessen die Gebührenhöhe in K@RL berechnet wird. |  [optional] |
|**einkommensjahr** | **String** | vom SB je nach Antragsart, bei Ermäßigung aufgrund des Einkommens das Kalendervorvorjahr, bei Sozialleistungen das aktuelle Einrichtungsjahr |  [optional] |
|**unterlagenstatus** | **Unterlagenstatus** |  |  |
|**bemerkung** | **String** |  |  [optional] |
|**kennzeichenIndividuelleFestsetzung** | **Boolean** | false - automatisch, true - individuelle Festsetzung durch SB in K@RL |  |
|**geschwisterkinder** | [**List&lt;AntragErmMitBelegenGeschwisterkinderInner&gt;**](AntragErmMitBelegenGeschwisterkinderInner.md) | Pflicht bei Antrag auf Geschwisterermäßigung |  [optional] |



