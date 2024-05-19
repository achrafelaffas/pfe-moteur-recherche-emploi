/***********************************************************************
 * Module:  Offres.java
 * Author:  Charaf
 * Purpose: Defines the Class Offres
 ***********************************************************************/
package ma.ac.iga.pfemoteurrechercheemploi.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
@Entity
@Table(name="offres")
public class Offres implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long idOffre;

   private String nomOffre;
   private String description;
   private String specialite;
   private String mission;
   private String villeTravail;



   private double salaire;
   private int nbRecruter;
   private int anneeExperience;

   @ManyToOne
   private Entreprise entreprise;

   @ManyToOne
   private Categorie categorie;

   @OneToMany(cascade= CascadeType.ALL,mappedBy="offre")
   private List<Demande> demandes;

   public Offres() {
   }

   public Categorie getCategorie() {
      return categorie;
   }

   public void setCategorie(Categorie categorie) {
      this.categorie = categorie;
   }

   public Long getIdOffre() {
      return idOffre;
   }

   public void setIdOffre(Long idOffre) {
      this.idOffre = idOffre;
   }

   public String getNomOffre() {
      return nomOffre;
   }

   public void setNomOffre(String nomOffre) {
      this.nomOffre = nomOffre;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getSpecialite() {
      return specialite;
   }

   public void setSpecialite(String specialite) {
      this.specialite = specialite;
   }

   public String getMission() {
      return mission;
   }

   public void setMission(String mission) {
      this.mission = mission;
   }

   public String getVilleTravail() {
      return villeTravail;
   }

   public void setVilleTravail(String villeTravail) {
      this.villeTravail = villeTravail;
   }

   public Double getSalaire() {
      return salaire;
   }

   public void setSalaire(Double salaire) {
      this.salaire = salaire;
   }

   public int getNbRecruter() {
      return nbRecruter;
   }

   public void setNbRecruter(int nbRecruter) {
      this.nbRecruter = nbRecruter;
   }

   public int getAnneeExperience() {
      return anneeExperience;
   }

   public void setAnneeExperience(int anneeExperience) {
      this.anneeExperience = anneeExperience;
   }
}