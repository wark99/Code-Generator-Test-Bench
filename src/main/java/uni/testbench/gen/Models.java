package uni.testbench.gen;

import java.util.List;

public class NumeroOM {
    private String type;
    private Data data;

    // getters and setters
}

class Data {
    private String numeroOm;
    // getter and setter
}

public class NumeroOMMotif {
    private String type;
    private DataMotif data;

    // getters and setters
}

class DataMotif {
    private String numeroOm;
    private String motif;
    // getters and setters
}

public class NumeroOMEmail {
    private String type;
    private DataEmail data;

    // getters and setters
}

class DataEmail {
    private String numeroOm;
    private String email;
    // getters and setters
}

public class PlanificationOM {
    private String type;
    private DataPlanification data;

    // getters and setters
}

class DataPlanification {
    private String numeroOm;
    private long dateAudit;
    // getters and setters
}

public class OrdreMission {
    private String type;
    private DataOrdreMission data;

    // getters and setters
}

class DataOrdreMission {
    private String numeroOM;
    private String categorieTravaux;
    private boolean estCategorieTravauxCritique;
    private String qualification;
    private String etat;
    private String objetAudit;
    private String dateLimiteAudit;
    private String dateEcheanceQualification;
    private List<String> omCombine;
    private Chantier chantier;
    private Identite referentRge;
    private ContactQualibat contactQualibat;
    private Entreprise entreprise;
    // getters and setters
}

public class Chantier {
    private String nomChantier;
    private String dateDebutTravaux;
    private String dateReceptionTravaux;
    private Adresse adresseChantier;
    private Identite responsableChantier;
    private double montantHtTravaux;
    private double montantHtTravauxSousTraite;
    private double surface;
    private IdentiteAdresse maitreOuvrage;
    private String natureTravaux;
    private String natureTravauxSousTraite;
    // getters and setters
}

public class ContactQualibat {
    private String chargeAffaire;
    private IdentiteAdresse agence;
    // getters and setters
}

public class Entreprise {
    private int identifiantQualibat;
    private String raisonSociale;
    private String siret;
    private String formeJuridique;
    private Adresse adresse;
    private Identite responsableEntreprise;
    private String telephone;
    private String email;
    private String codeDelegation;
    private String libDelegation;
    // getters and setters
}

public class Identite {
    private String nom;
    private String telephone;
    private String email;
    // getters and setters
}

public class IdentiteAdresse {
    private String nom;
    private String telephone;
    private String email;
    private Adresse adresse;
    // getters and setters
}

public class Adresse {
    private String adresse1;
    private String adresse2;
    private String adresse3;
    private String adresse4;
    private String codePostal;
    private String ville;
    // getters and setters
}

