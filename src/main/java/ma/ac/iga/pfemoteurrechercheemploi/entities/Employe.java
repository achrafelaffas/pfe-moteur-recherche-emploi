package ma.ac.iga.pfemoteurrechercheemploi.entities;

import java.io.File;
import java.sql.Date;

public class Employe extends Utilisateur{
    String sexe;
    String addresseEmploye;
    Date dateNaissance;
    File cv;//format pdf

    //Constructeur par défaut
    public Employe() {

    }
    public Employe(int id, String email, String motPass, String nom, String position, int gsm, String sexe, String addresseEmploye, Date dateNaissance, File cv) {
        super(id, email, motPass, nom, position, gsm);
        this.sexe = sexe;
        this.addresseEmploye = addresseEmploye;
        this.dateNaissance = dateNaissance;
        this.cv = cv;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAddresseEmploye() {
        return addresseEmploye;
    }


    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAddresseEmploye(String addresseEmploye) {
        this.addresseEmploye = addresseEmploye;
    }

    public File getCv() {
        return cv;
    }

    public void setCv(File cv) {
        this.cv = cv;
    }


}
