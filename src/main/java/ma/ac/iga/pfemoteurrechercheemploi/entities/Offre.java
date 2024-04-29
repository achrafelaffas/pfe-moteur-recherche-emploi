package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class Offre {
    int id;
    String description;
    String modeTravail; //mot clés

    //Constructeur par défaut
    public Offre() {

    }
    public Offre(int id, String description, String modeTravail) {
        this.id = id;
        this.description = description;
        this.modeTravail = modeTravail;
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
}
