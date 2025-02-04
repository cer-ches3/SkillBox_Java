package org.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserDetailsDto {
    private Integer id;
    private String login;
    private String password;
    private String surname;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private Integer age;
    private String phone;
    private String email;
    private String numberCard;
    private String secretCode;
    private String numberScore;
    private String validityPeriod;
    private Integer bankId;
}
