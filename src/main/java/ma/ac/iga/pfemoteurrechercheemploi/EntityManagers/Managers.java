package ma.ac.iga.pfemoteurrechercheemploi.EntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Managers {

    public static EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Recherche");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
