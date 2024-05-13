

# ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest


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
|**zeitraumVon** | **String** | Vertragsbeginn |  |
|**einkommenInCent** | **Integer** | Falls im Antrag Ermäßigung nach Einkommen beantragt wurde |  [optional] |
|**einkommensjahr** | **String** | Kalendervorvorjahr |  [optional] |
|**bezugSozialleistungen** | **Boolean** | false - kein Bezug / keine Angabe, true - Bezug Sozialleistungen |  [optional] |
|**anzahlAeltererGeschwisterkinder** | **Integer** | Falls im Antrag Geschwisterkindermäßigung beantragt wurde |  [optional] |



