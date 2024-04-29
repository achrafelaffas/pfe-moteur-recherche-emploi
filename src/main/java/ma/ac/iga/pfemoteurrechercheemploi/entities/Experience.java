package ma.ac.iga.pfemoteurrechercheemploi.entities;


import java.time.LocalDate;

public class Experience {
    int id;
    String titre;
    String employeur;
    String description;
    LocalDate debut;
    LocalDate fin;

    public Experience() {

    }

    public Experience(int id, String titre, String employeur, String description, LocalDate debut, LocalDate fin) {
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

    public LocalDate getDebut() {
        return debut;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
}
