package org.example.springexample.dto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springexample.entity.Author;
import org.example.springexample.entity.Comment;
import org.example.springexample.repository.AuthorRepository;
import org.example.springexample.repository.CommentRepository;
import org.example.springexample.services.CRUDService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Slf4j
@Service
public class CommentCRUDService implements CRUDService <CommentDto> {

    private final CommentRepository commentRepository;
    private final AuthorRepository authorRepository;

    @Override
    public CommentDto getByID(Integer id) {
        log.info("get by id - " + id);
        Comment comment = commentRepository.findById(id).orElseThrow();
        return mapToDto(comment);
    }

    @Override
    public Collection<CommentDto> getAll() {
        log.info("Get all");
        return commentRepository.findAll()
                .stream()
                .map(CommentCRUDService::mapToDto)
                .toList();
    }

    @Override
    public void create(CommentDto commentDto) {
        log.info("Create");
        Comment comment = mapToEntity(commentDto);
        Integer authorID = commentDto.getAuthorId();
        Author author = authorRepository.findById(authorID).orElseThrow();
        comment.setAuthor(author);
        commentRepository.save(comment);
    }

    @Override
    public void update(CommentDto commentDto) {
        log.info("update id");
        Comment comment = mapToEntity(commentDto);
        Integer authorID = commentDto.getAuthorId();
        Author author = authorRepository.findById(authorID).orElseThrow();
        comment.setAuthor(author);
        commentRepository.save(comment);

    }

    @Override
    public void delete(Integer id) {
        log.info("delete id - " + id);
        commentRepository.deleteById(id);
    }

    public static CommentDto mapToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setText(comment.getText());
        commentDto.setAuthorId(comment.getAuthor().getId());
        return commentDto;
    }

    public static Comment mapToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setText(commentDto.getText());
        return comment;
    }
}
