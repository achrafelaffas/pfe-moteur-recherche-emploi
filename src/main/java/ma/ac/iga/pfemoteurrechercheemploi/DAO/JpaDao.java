package ma.ac.iga.pfemoteurrechercheemploi.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public abstract class JpaDao<T,D> implements Dao<T,D> {
    protected EntityManager em;

    public JpaDao() {
        this.em = Persistence.createEntityManagerFactory("Recherche").createEntityManager();
    }

    private Class<T> entityClass;

    public JpaDao(Class<T> entityClass) {
        this();
        this.entityClass = entityClass;
    }

    @Override
    public void save(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    @Override
    public void update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    @Override
    public T find(D id) {
        return em.find(entityClass, id);
    }

    @Override
    public void delete(D id) {
        em.getTransaction().begin();
        T entity = em.find(entityClass, id);
        if (entity != null) {
            em.remove(entity);
        }
        em.getTransaction().commit();
    }

    @Override
    public List<T> getAll() {
        return em.createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();
    }

}
