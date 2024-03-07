package org.example.springexample.dto;

import org.example.springexample.services.CRUDServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;

@Service
public class CommentCRUDService implements CRUDServices <CommentDto> {
    private final TreeMap<Integer, CommentDto> storage = new TreeMap<>();
    @Value("${comment.length.max}")
    private Integer maxLength;

    @Override
    public CommentDto getById(Integer id) {
        System.out.println("Get by id - " + id);
        return storage.get(id);
    }

    @Override
    public Collection<CommentDto> getAll() {
        System.out.println("Get All!");
        return storage.values();
    }

    @Override
    public void create(CommentDto item) {
        if (item.getText().length() > maxLength) {
            throw new RuntimeException("Comment is too long");
        }
        System.out.println("Create!");
        int nextId = storage.isEmpty() ? 1 : storage.lastKey() + 1;
        item.setId(nextId);
        storage.put(nextId, item);
    }

    @Override
    public void update(Integer id, CommentDto item) {
        if (!storage.containsKey(id)) {
            return;
        }
        System.out.println("Update id - " + id);
        item.setId(id);
        storage.put(id, item);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Remove id - " + id);
        storage.remove(id);
    }
}
