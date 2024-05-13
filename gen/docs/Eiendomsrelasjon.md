

# Eiendomsrelasjon

Relasjon mellom fast eiendom som formuesobjekt hvor en fast eiendom kan være enten forelder i relasjonen eller barn. Eksempel: Relasjonen samlet hvor flere formuesobjekt som fast eiendom skal ses på som et formuesobjekt, og har en hovedeiendom (forelder) og tilleggseiendommer (barn)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**relasjonstype** | **String** | Kodeliste som beskriver type relasjon mellom eiendommer, for eksempel en splittet relasjon eller seksjonert (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/kodeliste/af719f1a-2ba5-4f54-92f7-26334a92c200&#39;&gt;Kodelistereferanse&lt;/a&gt;) |  [optional] |
|**relasjonsrolle** | **String** | Kodeliste som beskriver roller en fast eiendom som formuesobjekt har i en eiendomsrelasjon til en eller flere andre fast eiendom som formuesobjekt, da i enten rollen forelder (parent) eller barn (child) (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/kodeliste/6ea96ba6-c118-4c40-a077-3723ef719a19&#39;&gt;Kodelistereferanse&lt;/a&gt;) |  [optional] |
|**relasjonsmedlemmer** | [**List&lt;Eiendomsidentifikator&gt;**](Eiendomsidentifikator.md) | Angir hvilke eiendommer som har en søsken-relasjon til denne eiendommen |  [optional] |
|**forelder** | [**Eiendomsidentifikator**](Eiendomsidentifikator.md) |  |  [optional] |



