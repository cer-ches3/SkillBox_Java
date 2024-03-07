package org.example.springexample.controllers;

import org.example.springexample.dto.CommentCRUDService;
import org.example.springexample.dto.CommentDto;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/comment")
public class CommentsController {
    private final CommentCRUDService commentService;

    public CommentsController(CommentCRUDService commentService) {
        this.commentService = commentService;
    }

    @GetMapping(path = "/{id}")
    public CommentDto getCommentById(@PathVariable Integer id) {
        return commentService.getById(id);
    }

    @GetMapping
    public Collection <CommentDto> getAllComments() {
        return commentService.getAll();
    }

    @PostMapping
    public void createComment(@RequestBody CommentDto commentDto) {
        commentService.create(commentDto);
    }

    @PutMapping(path = "/{id}")
    public void updateComment(@PathVariable Integer id, @RequestBody CommentDto commentDto) {
        commentService.update(id, commentDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteComment(@PathVariable Integer id) {
        commentService.delete(id);
    }
}
