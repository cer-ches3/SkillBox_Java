package org.example.SocialNetworkUsers.Services;

import org.springframework.http.ResponseEntity;

import java.util.Collection;

public interface CRUDService <T>{
    ResponseEntity getAll();
    ResponseEntity getById(Integer id);
    ResponseEntity create(T t);
    ResponseEntity update(Integer id, T t);
    ResponseEntity deleteById(int id);
    ResponseEntity clear();
}
