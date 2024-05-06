package ma.ac.iga.pfemoteurrechercheemploi.entities; /***********************************************************************
 * Module:  Demande.java
 * Author:  Charaf
 * Purpose: Defines the Class Demande
 ***********************************************************************/

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="demande")
public class Demande {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int idDemande;
   private Date dateDemande;
   private int statutDemande;

   @Embedded
   private DemandeCle demandeCle;

   @ManyToOne
   @JoinColumn(name="idCandidat")
   private Candidats candidat;

   @ManyToOne
   @JoinColumn(name="idOffre")
   private Offres offre;


   public Demande() {
   }

   public int getIdDemande() {
      return idDemande;
   }

   public void setIdDemande(int idDemande) {
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