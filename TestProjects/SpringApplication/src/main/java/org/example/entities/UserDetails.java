package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "user_details")
@Getter
@Setter
public class UserDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "surname")
    private String surname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "age")
    private Integer age;

    @Column(name = "phone")
    private String phone = login;

    @Column(name = "email")
    private String email;

    @Column(name = "number_card")
    private String numberCard;

    @Column(name = "secre_code")
    private String secretCode;

    @Column(name = "number_score")
    private String numberScore;

    @Column(name = "validity_period")
    private String validityPeriod;

    @JoinColumn(name = "bank_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private BankDetails bank;
}
