package ma.ac.iga.pfemoteurrechercheemploi.entities;

import java.io.File;

public class Employeur extends Utilisateur{
    String nomEntreprise;
    String addresseEntreprise;
    int nbrEmployes;
    String site;

    public Employeur() {

    }
    public Employeur(int id, String email, String motPass, String nom, String position, int gsm, String nomEntreprise, String addresseEntreprise, int nbrEmployes, String site) {
        super(id, email, motPass, nom, position, gsm);
        this.nomEntreprise = nomEntreprise;
        this.addresseEntreprise = addresseEntreprise;
        this.nbrEmployes = nbrEmployes;
        this.site = site;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getAddresseEntreprise() {
        return addresseEntreprise;
    }

    public void setAddresseEntreprise(String addresseEntreprise) {
        this.addresseEntreprise = addresseEntreprise;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
