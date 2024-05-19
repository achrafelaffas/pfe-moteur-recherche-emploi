package ma.ac.iga.pfemoteurrechercheemploi.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DemandeCle implements Serializable {

    @Column(name="idCandidat")
    private Long idCandidat;
    @Column(name="idOffre")
    private Long idOffre;

    public DemandeCle() {
    }

    public Long getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(Long idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Long getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(Long idOffre) {
        this.idOffre = idOffre;
    }
}
