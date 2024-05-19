/***********************************************************************
 * Module:  Entreprise.java
 * Author:  Charaf
 * Purpose: Defines the Class Entreprise
 ***********************************************************************/
package ma.ac.iga.pfemoteurrechercheemploi.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="Entreprises")
public class Entreprise implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long idEntreprise;
   private String nomEntreprise;
   private String email;
   private String telephone;
   private String adresse;
   private String login;
   private String motDePasse;
   private String specialite;
   private String site;

   @OneToMany(cascade= CascadeType.ALL,mappedBy="entreprise")
   private List<Offres> offres;

   public Entreprise() {
   }

   public Long getIdEntreprise() {
      return idEntreprise;
   }

   public void setIdEntreprise(Long idEntreprise) {
      this.idEntreprise = idEntreprise;
   }

   public String getNomEntreprise() {
      return nomEntreprise;
   }

   public void setNomEntreprise(String nomEntreprise) {
      this.nomEntreprise = nomEntreprise;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public String getAdresse() {
      return adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
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

   public String getSpecialite() {
      return specialite;
   }

   public void setSpecialite(String specialite) {
      this.specialite = specialite;
   }

   public String getSite() {
      return site;
   }

   public void setSite(String site) {
      this.site = site;
   }

   public int publierOffre() {
      // TODO: implement
      return 0;
   }
   
   public int annulerOffre() {
      // TODO: implement
      return 0;
   }
   
   public int modifierOffre() {
      // TODO: implement
      return 0;
   }
   
   public int consulterOffre() {
      // TODO: implement
      return 0;
   }
   
   public int consulterDemandes() {
      // TODO: implement
      return 0;
   }
   
   public int annulerDemande() {
      // TODO: implement
      return 0;
   }

}