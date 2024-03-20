package org.example.springexample.controllers;

import lombok.RequiredArgsConstructor;
import org.example.springexample.dto.AuthorCRUDService;
import org.example.springexample.dto.AuthorDto;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/author")
@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorCRUDService authorService;

    @GetMapping
    public Collection<AuthorDto> getAll() {
        return authorService.getAll();
    }

    @PostMapping
    public void create(@RequestBody AuthorDto authorDto) {
        authorService.create(authorDto);
    }

    @PutMapping("/{id}")
    public void update (@PathVariable Integer id, @RequestBody AuthorDto authorDto) {
        authorDto.setId(id);
        authorService.update(authorDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        authorService.delete(id);
    }


}
