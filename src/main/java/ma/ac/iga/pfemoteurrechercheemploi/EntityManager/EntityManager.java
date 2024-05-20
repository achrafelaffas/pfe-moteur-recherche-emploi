package ma.ac.iga.pfemoteurrechercheemploi.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {

    public static javax.persistence.EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Recherche");
        javax.persistence.EntityManager em = emf.createEntityManager();
        return em;
    }
}
