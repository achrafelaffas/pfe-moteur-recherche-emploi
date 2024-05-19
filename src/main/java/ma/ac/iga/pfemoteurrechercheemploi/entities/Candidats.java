package ma.ac.iga.pfemoteurrechercheemploi.entities; /***********************************************************************
 * Module:  Candidats.java
 * Author:  Charaf
 * Purpose: Defines the Class Candidats
 ***********************************************************************/

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="candidats")
public class Candidats implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long idCandidat;
   private String nom;
   private String prenom;
   private String email;
   private String adresse;
   private String telephone;
   private int anneeNaissance;
   private String login;
   private String motDePasse;
   private String cv;
   private int nbAneeExperiences;


   @OneToMany(cascade= CascadeType.ALL,mappedBy="candidat")
   private List<Diplomes> diplomes;

   @OneToMany(cascade=CascadeType.ALL,mappedBy="candidat")
   private List<Experience> experiences;

   @OneToMany(cascade=CascadeType.ALL,mappedBy="candidat")
   private List<Competences> competences;

   @OneToMany(cascade=CascadeType.ALL,mappedBy="candidat")
   private List<Demande> demandes;


   public Candidats() {
   }

   public Long getIdCandidat() {
      return idCandidat;
   }

   public void setIdCandidat(Long idCandidat) {
      this.idCandidat = idCandidat;
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

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAdresse() {
      return adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public int getAnneeNaissance() {
      return anneeNaissance;
   }

   public void setAnneeNaissance(int anneeNaissance) {
      this.anneeNaissance = anneeNaissance;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getMotDePasse() {
      return motDePasse;
   }

   public void setMotDePasse(String motDePasse) {
      this.motDePasse = motDePasse;
   }

   public String getCv() {
      return cv;
   }

   public void setCv(String cv) {
      this.cv = cv;
   }

   public int getNbAneeExperiences() {
      return nbAneeExperiences;
   }

   public void setNbAneeExperiences(int nbAneeExperiences) {
      this.nbAneeExperiences = nbAneeExperiences;
   }

   public void consulterOffre() {
      // TODO: implement
   }
   
   public void deposerDemande() {
      // TODO: implement
   }
   
   public void modifierDemande() {
      // TODO: implement
   }
   
   public void annulerDemande() {
      // TODO: implement
   }
   
   public void modifierProfil() {
      // TODO: implement
   }
   
   public void suivreDemande() {
      // TODO: implement
   }

}