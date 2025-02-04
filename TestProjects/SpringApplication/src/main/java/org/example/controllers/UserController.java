package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserDetailsDto;
import org.example.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserService authService;

    @GetMapping(path = "/{id}")
    public UserDetailsDto getById(@PathVariable Integer id) {
        return authService.getById(id);
    }

    @GetMapping
    public Collection<UserDetailsDto> getAll() {
        return authService.getAll();
    }

    @PostMapping
    public void create(@RequestBody UserDetailsDto authDetailsDto) {
        authService.create(authDetailsDto);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody UserDetailsDto authDetailsDto) {
        authDetailsDto.setId(id);
        authService.update(authDetailsDto);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) {
        authService.delete(id);
    }
}
