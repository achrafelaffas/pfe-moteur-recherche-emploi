/***********************************************************************
 * Module:  Offres.java
 * Author:  Charaf
 * Purpose: Defines the Class Offres
 ***********************************************************************/
package ma.ac.iga.pfemoteurrechercheemploi.entities;
import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="offres")
public class Offres {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int idOffre;
   private String description;
   private String specialite;
   private String mission;
   private String villeTravail;
   private String salaire;
   private int nbRecruter;
   private int anneeExperience;

   @ManyToOne
   private Entreprise entreprise;

   @OneToMany(cascade= CascadeType.ALL,mappedBy="offre")
   private List<Demande> demandes;

   public Offres() {
   }

   public int getIdOffre() {
      return idOffre;
   }

   public void setIdOffre(int idOffre) {
      this.idOffre = idOffre;
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

   public String getSalaire() {
      return salaire;
   }

   public void setSalaire(String salaire) {
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