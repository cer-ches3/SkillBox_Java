package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.dto.BankDetailsDto;
import org.example.services.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/bank")
@RequiredArgsConstructor
public class BankController {
    private final BankService bankService;

    @PostMapping
    public void createBank() {
        bankService.initBank();
    }

    @GetMapping
    public Collection<BankDetailsDto> getAll() {
        return bankService.getAll();
    }
}
