package ma.ac.iga.pfemoteurrechercheemploi.entities; /***********************************************************************
 * Module:  Competences.java
 * Author:  Charaf
 * Purpose: Defines the Class Competences
 ***********************************************************************/

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="competences")
public class Competences implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long idCompetence;
   private String competence;
   private String domaine;
   private String description;

   @ManyToOne
   private Candidats candidat;

   public Competences() {
   }

   public Long getIdCompetence() {
      return idCompetence;
   }

   public void setIdCompetence(Long idCompetence) {
      this.idCompetence = idCompetence;
   }

   public String getCompetence() {
      return competence;
   }

   public void setCompetence(String competence) {
      this.competence = competence;
   }

   public String getDomaine() {
      return domaine;
   }

   public void setDomaine(String domaine) {
      this.domaine = domaine;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}