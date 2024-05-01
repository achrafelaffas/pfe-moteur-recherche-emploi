package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class Offre {
    int id;
    String description;
    String modeTravail; //mot clés
    String ville;

    //Constructeur par défaut
    public Offre() {

    }
    public Offre(int id, String description, String modeTravail, String ville) {
        this.id = id;
        this.description = description;
        this.modeTravail = modeTravail;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModeTravail() {
        return modeTravail;
    }

    public void setModeTravail(String modeTravail) {
        this.modeTravail = modeTravail;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
