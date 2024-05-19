package ma.ac.iga.pfemoteurrechercheemploi.DAO;

import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;
import ma.ac.iga.pfemoteurrechercheemploi.entities.Demande;

public class DemandeDaoImpl extends JpaDao<Demande,Long> implements DemandeDao {
    public DemandeDaoImpl() {
        super(Demande.class);
    }

}
