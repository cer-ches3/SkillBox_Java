package org.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.TreeMap;

@RestController
public class DefaultController {

    private TreeMap<Integer, String> authorizationDetails;

    public DefaultController() {
        authorizationDetails = new TreeMap<>();
        authorizationDetails.put(1, "Cthsq30896!");
        authorizationDetails.put(2, "Pass1Word!");
        authorizationDetails.put(3, "pa$$w0rd!");
    }

    @GetMapping(path = "/todo")
    public TreeMap<Integer, String> getAllAuthorizationDetails() {
        return authorizationDetails;
    }

    @PostMapping(path = "/todo")
    public ResponseEntity createAuthorizationDetail(@RequestParam String logPass) {
        if (logPass == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        authorizationDetails.put(authorizationDetails.lastKey() + 1, logPass);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(path = "/todo/{id}")
    public ResponseEntity updateAuthorizationDetail(@PathVariable int id, @RequestParam String logPass) {
        if (logPass == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        authorizationDetails.put(id, logPass);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity deleteAuthorizationDetail(@PathVariable int id) {
        authorizationDetails.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
