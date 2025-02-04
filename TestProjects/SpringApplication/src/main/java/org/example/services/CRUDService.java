package org.example.services;

import java.util.Collection;

public interface CRUDService<T> {
    T getById(int id);
    Collection<T> getAll();
    void create(T item);
    void update(T item);
    void delete(Integer id);

}
