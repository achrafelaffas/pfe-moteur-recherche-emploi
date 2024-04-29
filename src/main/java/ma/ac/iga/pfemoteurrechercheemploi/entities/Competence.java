package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class Competence {
    int id;
    String nom;
    String description;

    //Constructeur par défaut
    public Competence() {

    }

    public Competence(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
