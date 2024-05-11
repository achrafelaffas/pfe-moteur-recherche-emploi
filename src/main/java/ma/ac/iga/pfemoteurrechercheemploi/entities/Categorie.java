package ma.ac.iga.pfemoteurrechercheemploi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCat;
    private  String nomCat;

    @OneToMany(cascade= CascadeType.ALL,mappedBy="categorie")
    private List<Offres> offres;

    public Categorie(String nomCat) {
        this.nomCat = nomCat;
    }

    public Categorie() {
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
}
