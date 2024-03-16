package org.example.springexample.dto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springexample.entity.Comment;
import org.example.springexample.repository.CommentRepository;
import org.example.springexample.services.CRUDService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;

@RequiredArgsConstructor
@Slf4j
@Service
public class CommentCRUDService implements CRUDService <CommentDto> {

    private final CommentRepository repository;

    @Override
    public CommentDto getByID(Integer id) {
        log.info("get by id - " + id);
        Comment comment = repository.findById(id).orElseThrow();
        return mapToDto(comment);
    }

    @Override
    public Collection<CommentDto> getAll() {
        log.info("Get all");
        return repository.findAll()
                .stream()
                .map(CommentCRUDService::mapToDto)
                .toList();
    }

    @Override
    public void create(CommentDto item) {
        log.info("Create");
        Comment comment = mapToEntity(item);
        repository.save(comment);
    }

    @Override
    public void update(CommentDto item) {
        log.info("update id");
        Comment comment = mapToEntity(item);
        repository.save(comment);

    }

    @Override
    public void delete(Integer id) {
        log.info("delete id - " + id);
        repository.deleteById(id);
    }

    private static CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setText(comment.getText());
        commentDto.setAuthor(comment.getAuthor());
        return commentDto;
    }

    public static Comment mapToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setText(commentDto.getText());
        comment.setAuthor(commentDto.getAuthor());
        return comment;
    }
}
