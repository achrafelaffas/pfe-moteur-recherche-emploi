package ma.ac.iga.pfemoteurrechercheemploi.entities;


import java.sql.Date;

public class Experience {
    int id;
    String titre;
    String employeur;
    String description;
    Date debut;
    Date fin;

    public Experience() {

    }

    public Experience(int id, String titre, String employeur, String description, Date debut, Date fin) {
        this.id = id;
        this.titre = titre;
        this.employeur = employeur;
        this.description = description;
        this.debut = debut;
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEmployeur() {
        return employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
