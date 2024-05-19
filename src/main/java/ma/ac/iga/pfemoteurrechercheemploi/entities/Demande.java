package ma.ac.iga.pfemoteurrechercheemploi.entities; /***********************************************************************
 * Module:  Demande.java
 * Author:  Charaf
 * Purpose: Defines the Class Demande
 ***********************************************************************/

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="demande")
public class Demande implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long idDemande;
   private Date dateDemande;
   private int statutDemande;

   //@Embedded
   //private DemandeCle demandeCle;

   @ManyToOne
   @JoinColumn(name="idCandidat")
   private Candidats candidat;

   @ManyToOne
   @JoinColumn(name="idOffre")
   private Offres offre;


   public Demande() {
   }

   public Candidats getCandidat() {
      return candidat;
   }

   public void setCandidat(Candidats candidat) {
      this.candidat = candidat;
   }

   public Offres getOffre() {
      return offre;
   }

   public void setOffre(Offres offre) {
      this.offre = offre;
   }

   public Long getIdDemande() {
      return idDemande;
   }

   public void setIdDemande(Long idDemande) {
      this.idDemande = idDemande;
   }

   public Date getDateDemande() {
      return dateDemande;
   }

   public void setDateDemande(Date dateDemande) {
      this.dateDemande = dateDemande;
   }

   public int getStatutDemande() {
      return statutDemande;
   }

   public void setStatutDemande(int statutDemande) {
      this.statutDemande = statutDemande;
   }
}