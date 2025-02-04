package org.example.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.BankDetailsDto;
import org.example.entities.BankDetails;
import org.example.repositories.BankRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Slf4j
@RequiredArgsConstructor
public class BankService {
    private final BankRepository bankRepository;

    public void initBank() {
        log.info("bank init");
        BankDetailsDto dto = new BankDetailsDto();
        dto.setBankName("ПАО \"СберБанк\"");
        dto.setBik("042809679");
        dto.setCorScore("30101810700000000679");
        dto.setUsersList(new ArrayList<>());
        bankRepository.save(mapToEntity(dto));
    }

    public Collection<BankDetailsDto> getAll() {
        log.info("Get all");
        return bankRepository.findAll()
                .stream()
                .map(BankService::mapToDto)
                .toList();
    }

    public static BankDetailsDto mapToDto (BankDetails bankDetails) {
        BankDetailsDto dto = new BankDetailsDto();
        dto.setId(bankDetails.getId());
        dto.setBankName(bankDetails.getBankName());
        dto.setBik(bankDetails.getBik());
        dto.setCorScore(bankDetails.getCorScore());
        dto.setUsersList(bankDetails.getUsersList()
                .stream()
                .map(UserService::mapToDto)
                .toList());
        return dto;
    }

    public static BankDetails mapToEntity (BankDetailsDto dto) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setId(dto.getId());
        bankDetails.setBankName(dto.getBankName());
        bankDetails.setBik(dto.getBik());
        bankDetails.setCorScore(dto.getCorScore());
        bankDetails.setUsersList(dto.getUsersList()
                .stream()
                .map(UserService::mapToEntity)
                .toList());
        return bankDetails;
    }
}
