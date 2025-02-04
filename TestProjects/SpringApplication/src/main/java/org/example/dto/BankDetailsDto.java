package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BankDetailsDto {

    private Integer id;
    private String bankName;
    private String bik;
    private String corScore;
    private List<UserDetailsDto> usersList;
}
