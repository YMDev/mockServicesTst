package a3tech_Mock;

public enum A3techEvenementMissionType {
		CREATION("Création", 1, "USER"),
		MODIFICATION("Modification", 2, "USER"),
	    ARRET("Arrêt", 3, "USER"),
	    REPRISE("Reprise", 4, "USER"),
	    FIN("Fin", 5, "USER"),
	    DEBUT("Début", 6, "USER"),
	    VALIDATION("Validation", 6, "USER");


    private String discreptionEnum;
    private String typeEnum;
    private int id;
    A3techEvenementMissionType(String discreption, int identifiant, String typeStatut) {
        discreptionEnum = discreption;
        typeEnum = typeStatut;
        id = identifiant;

    }

    public String getDiscreptionEnum() {
        return discreptionEnum;
    }

    public void setDiscreptionEnum(String discreptionEnum) {
        this.discreptionEnum = discreptionEnum;
    }

    public String getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(String typeEnum) {
        this.typeEnum = typeEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
