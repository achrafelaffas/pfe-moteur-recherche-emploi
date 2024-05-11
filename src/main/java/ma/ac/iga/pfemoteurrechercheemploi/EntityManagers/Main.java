package ma.ac.iga.pfemoteurrechercheemploi.EntityManagers;


import ma.ac.iga.pfemoteurrechercheemploi.entities.Candidats;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
        public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Recherche");
            EntityManager em = emf.createEntityManager();
            Candidats p=new Candidats();
            p.setNom("achraf");
            em.persist(p);

            em.getTransaction().begin();
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
    }

