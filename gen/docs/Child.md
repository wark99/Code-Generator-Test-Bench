

# Child


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**childId** | **String** | Dieses Feld wird bei Bewerbungen vom erfassenden System, also vom Kita-Planer 2 selbst, vergeben und zur eindeutigen Identifizierung der Bewerbung/des Vertrags genutzt. Es handelt sich NICHT um eine ID des physischen Kindes. Die KIND_ID_EXTERN ist eindeutig für das Tripel: Kind, Bewerbungsprozess, Kita. Pro Kita und Bewerbungsprozess (z.B. andere Altersgruppe) gibt es also für das gleiche physische Kind eine unterschiedliche externe ID. [KITA_ID_EXTERN] |  |
|**firstName** | **String** | Vorname des Kindes [KIND_VORNAME] |  |
|**lastName** | **String** | Nachname des Kindes [KIND_NACHNAME] |  |
|**birthday** | **LocalDate** | Geburtstag des Kindes [KIND_GEBURTSDATUM] |  [optional] |
|**careStart** | **LocalDate** | Datum des Vertragsbeginns bzw. der aktuellen Vertragsänderung [VER_VERTRAG_AB] |  [optional] |
|**careEnd** | **LocalDate** | Datum zu dem der Vertrag gekündigt ist (wenn explizit gekündigt wurde) [VER_KUENDIGUNG_ZUM] |  [optional] |
|**address** | [**ChildAddress**](ChildAddress.md) |  |  [optional] |
|**parents** | [**List&lt;ChildParentsInner&gt;**](ChildParentsInner.md) | Array mit Sorgeberechtigten für das Kind. Liste wird aus SB1, SB2 und ABW berechnet. |  [optional] |



