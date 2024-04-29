package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class Postuler {
    int id;
    Employeur employeur;
    Offre offre;

    public Postuler() {

    }

    public Postuler(Employeur employeur, Offre offre) {
        this.employeur = employeur;
        this.offre = offre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employeur getEmployeur() {
        return employeur;
    }

    public void setEmployeur(Employeur employeur) {
        this.employeur = employeur;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }
}
