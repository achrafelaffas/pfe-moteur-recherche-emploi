package ma.ac.iga.pfemoteurrechercheemploi.DAO;

import java.util.List;

public interface Dao<T,D> {

    void save(T entity);
    void update(T entity);
    T find(D id);
    void delete(D id);
    List<T> getAll();


}
