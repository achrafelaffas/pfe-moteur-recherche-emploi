package ma.ac.iga.pfemoteurrechercheemploi.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DemandeCle implements Serializable {

    @Column(name="idCandidat")
    private int idCandidat;
    @Column(name="idOffre")
    private int idOffre;

    public DemandeCle() {
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }
}
