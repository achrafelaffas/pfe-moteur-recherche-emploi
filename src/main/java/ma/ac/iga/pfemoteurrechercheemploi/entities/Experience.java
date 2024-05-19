/***********************************************************************
 * Module:  Experience.java
 * Author:  Charaf
 * Purpose: Defines the Class Experience
 ***********************************************************************/
package ma.ac.iga.pfemoteurrechercheemploi.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="experiences")
public class Experience implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long idExperience;
   private String nomSociete;
   private String description;
   private int annee;
   private Date dateDebut;
   private Date dateFin;

   @ManyToOne
   private Candidats candidat;

   public Experience() {
   }

   public Long getIdExperience() {
      return idExperience;
   }

   public void setIdExperience(Long idExperience) {
      this.idExperience = idExperience;
   }

   public String getNomSociete() {
      return nomSociete;
   }

   public void setNomSociete(String nomSociete) {
      this.nomSociete = nomSociete;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getAnnee() {
      return annee;
   }

   public void setAnnee(int annee) {
      this.annee = annee;
   }

   public Date getDateDebut() {
      return dateDebut;
   }

   public void setDateDebut(Date dateDebut) {
      this.dateDebut = dateDebut;
   }

   public Date getDateFin() {
      return dateFin;
   }

   public void setDateFin(Date dateFin) {
      this.dateFin = dateFin;
   }
}