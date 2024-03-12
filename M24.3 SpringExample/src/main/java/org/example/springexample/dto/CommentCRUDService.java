package org.example.springexample.dto;

import org.example.springexample.services.CRUDService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;

@Service
public class CommentCRUDService implements CRUDService <CommentDto> {
    private TreeMap<Integer, CommentDto> storage = new TreeMap<>();

    @Value("${comment.length.max}")
    private Integer maxLength;

    @Override
    public CommentDto getByID(Integer id) {
        System.out.println("get by id - " + id);
        return storage.get(id);
    }

    @Override
    public Collection<CommentDto> getAll() {
        System.out.println("Get all");
        return storage.values();
    }

    @Override
    public void create(CommentDto item) {
        if (item.getText().length() > maxLength) {
            throw  new RuntimeException("Comment is too long");
        }
        int lastId = storage.isEmpty() ? 1 : storage.lastKey() + 1;
        item.setId(lastId);
        storage.put(lastId, item);
        System.out.println("Create");
    }

    @Override
    public void update(Integer id, CommentDto item) {
        if (!storage.containsKey(id)) {
            return;
        }
        item.setId(id);
        storage.put(id, item);
        System.out.println("update id - " + id);

    }

    @Override
    public void delete(Integer id) {
        storage.remove(id);
        System.out.println("delete id - " + id);

    }
}
