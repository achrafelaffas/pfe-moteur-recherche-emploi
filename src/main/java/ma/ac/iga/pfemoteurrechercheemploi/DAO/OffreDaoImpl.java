package ma.ac.iga.pfemoteurrechercheemploi.DAO;

import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Offres;

public class OffreDaoImpl extends JpaDao<Offres,Long> implements OffreDao{

    public OffreDaoImpl() {
        super(Offres.class);
    }

}
