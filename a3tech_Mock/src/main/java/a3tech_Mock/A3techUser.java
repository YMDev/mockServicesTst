package a3tech_Mock;

import java.util.List;

public class A3techUser {


    //technique
    private Long id;
    private Long dateCreation;
    private A3techUserStatut statut;
    private Boolean isEmailVerified;
    private Boolean isPhoneVerified;
    private A3techModeConnexion modeConnexion;

    //information user
    private String nom;
    private String prenom;
    private String password;
    private String email;
    private String facebookId;
    private String id_photo_profil;
    private Float rating; // calculé
    private String adresse;
    private Double longitude;
    private Double latitude;
    private Categorie categorie;
    private String pseudo;
    private String telephone;
    private Integer nbrMission;
    private Long dateNaissance;
    private Ville ville;
    private List<A3techReviewMission> listAvis;
    private A3techUserType typeUser;
    private Integer nbrReview;


    public A3techUser(Long id) {
        this.id = id;
    }

    public A3techUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public A3techUserStatut getStatut() {
        return statut;
    }

    public void setStatut(A3techUserStatut statut) {
        this.statut = statut;
    }

    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public Boolean getPhoneVerified() {
        return isPhoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        isPhoneVerified = phoneVerified;
    }

    public A3techModeConnexion getModeConnexion() {
        return modeConnexion;
    }

    public void setModeConnexion(A3techModeConnexion modeConnexion) {
        this.modeConnexion = modeConnexion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getId_photo_profil() {
        return id_photo_profil;
    }

    public void setId_photo_profil(String id_photo_profil) {
        this.id_photo_profil = id_photo_profil;
    }

    public Float getRating() {
//        if (rating == null) rating = 0f;
//
//        if(getListAvis() == null || getListAvis().size() == 0){
//            return 0f;
//        }
//        Float ratingCalcule = 0f;
//        for (A3techReviewMission review : getListAvis()
//                ) {
//            if (review != null) {
//                ratingCalcule = ratingCalcule + review.getRating();
//            }
//        }
//        rating = ratingCalcule / getListAvis().size();
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getNbrMission() {
        return nbrMission;
    }

    public void setNbrMission(Integer nbrMission) {
        this.nbrMission = nbrMission;
    }

    public Long getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Long dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public List<A3techReviewMission> getListAvis() {
        return listAvis;
    }

    public void setListAvis(List<A3techReviewMission> listAvis) {
        this.listAvis = listAvis;
    }

    public A3techUserType getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(A3techUserType typeUser) {
        this.typeUser = typeUser;
    }

    public Integer getNbrReview() {
        nbrReview = 0;
        if (getListAvis() != null) {
            nbrReview = getListAvis().size();
        }
        return nbrReview;
    }

    public void setNbrReview(Integer nbrReview) {
        this.nbrReview = nbrReview;
    }
}
