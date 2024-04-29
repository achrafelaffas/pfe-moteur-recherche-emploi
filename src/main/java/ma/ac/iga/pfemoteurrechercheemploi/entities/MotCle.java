package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class MotCle {
    int id;
    String nom;

    //Constructeur par défaut
    public MotCle() {

    }
    public MotCle(int id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
