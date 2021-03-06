package a3tech_Mock;


public class Categorie {

	private String identifiant;
	private String service;
	private String srvcType  ;

	private boolean selected;
	private String libelle;
	private String logo;
	private String type;
	private String parentId;
	private String ordre;
	private String description;


	public Categorie(String identifiant, String libelle, String description,String type, String ordre) {
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.type = type;
		this.ordre = ordre;
		this.description = description;
	}
	public Categorie() {
	}
	public String getSrvcType() {
		return srvcType;
	}

	public void setSrvcType(String srvcType) {
		this.srvcType = srvcType;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getOrdre() {
		return ordre;
	}

	public void setOrdre(String ordre) {
		this.ordre = ordre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	 

}
