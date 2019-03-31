package br.edu.ifms.dao;

import javax.persistence.EntityManager;
import br.edu.ifms.connection.ConnectionFactory;
import br.edu.ifms.model.EntidadeBase;

public class DaoGenerico<T extends EntidadeBase> {

    private static EntityManager manager = ConnectionFactory.getEntityManager();

    public T findById(Class<T> clazz, Long id) {
        return manager.find(clazz, id);
    }

    public void saveOrUpdate(T obj) {
        try {
            manager.getTransaction().begin();
            if (obj.getId() == null) {
                manager.persist(obj);
            } else {
                manager.merge(obj);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

    public void remove(Class<T> clazz, Long id) {
        T t = findById(clazz, id);
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

}
