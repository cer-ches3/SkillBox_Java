package org.example.SocialNetworkUsers.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.SocialNetworkUsers.Dto.UserDto;
import org.example.SocialNetworkUsers.Services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable Integer id, @RequestBody UserDto userDto) {
        return userService.update(id, userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUserById(@PathVariable Integer id) {
        return userService.deleteById(id);
    }

    @DeleteMapping
    public ResponseEntity clearCollectionUsers() {
        return userService.clear();
    }
}
