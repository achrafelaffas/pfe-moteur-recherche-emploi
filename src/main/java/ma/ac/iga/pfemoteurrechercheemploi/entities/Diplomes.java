package ma.ac.iga.pfemoteurrechercheemploi.entities; /***********************************************************************
 * Module:  Diplomes.java
 * Author:  Charaf
 * Purpose: Defines the Class Diplomes
 ***********************************************************************/

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="produit")
public class Diplomes {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int idDiplome;
   private String diplome;
   private String intitule;
   private Date anneeObtention;
   private String mention;
   private int nbAnneeDiplome;

   @ManyToOne
   private Candidats candidat;

   public Diplomes() {
   }

   public int getIdDiplome() {
      return idDiplome;
   }

   public void setIdDiplome(int idDiplome) {
      this.idDiplome = idDiplome;
   }

   public String getDiplome() {
      return diplome;
   }

   public void setDiplome(String diplome) {
      this.diplome = diplome;
   }

   public String getIntitule() {
      return intitule;
   }

   public void setIntitule(String intitule) {
      this.intitule = intitule;
   }

   public Date getAnneeObtention() {
      return anneeObtention;
   }

   public void setAnneeObtention(Date anneeObtention) {
      this.anneeObtention = anneeObtention;
   }

   public String getMention() {
      return mention;
   }

   public void setMention(String mention) {
      this.mention = mention;
   }

   public int getNbAnneeDiplome() {
      return nbAnneeDiplome;
   }

   public void setNbAnneeDiplome(int nbAnneeDiplome) {
      this.nbAnneeDiplome = nbAnneeDiplome;
   }
}