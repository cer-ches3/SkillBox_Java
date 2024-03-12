package org.example.springexample.services;

import java.util.Collection;

public interface CRUDService <T> {
    T getByID(Integer id);
    Collection<T> getAll();
    void create(T item);
    void update (Integer id, T item);
    void delete(Integer id);
}
