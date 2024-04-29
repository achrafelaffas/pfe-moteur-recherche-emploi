package ma.ac.iga.pfemoteurrechercheemploi.entities;

public class OffreMotCle {
    int id;
    Offre offre;
    MotCle motCle;

    public OffreMotCle() {

    }

    public OffreMotCle(Offre offre, MotCle motCle) {
        this.offre = offre;
        this.motCle = motCle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public MotCle getMotCle() {
        return motCle;
    }

    public void setMotCle(MotCle motCle) {
        this.motCle = motCle;
    }
}
