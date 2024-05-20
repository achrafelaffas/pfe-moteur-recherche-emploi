package ma.ac.iga.pfemoteurrechercheemploi.DAO;

import ma.ac.iga.pfemoteurrechercheemploi.entities.Categorie;

public class CategorieDaoImpl extends JpaDao<Categorie,Long> implements CategorieDao {
    public CategorieDaoImpl() {
        super(Categorie.class);
    }
}
