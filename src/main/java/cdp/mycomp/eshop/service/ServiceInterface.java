package cdp.mycomp.eshop.service;

import java.util.List;

public interface ServiceInterface<T> {
    String getType();
    void save(T obj);
    void update(T obj, String objID);
    void delete(String objID);
    List<T> getAll();
    T findByID(String objID);
}
