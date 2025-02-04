package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "bank_details")
@Getter
@Setter
public class BankDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bik")
    private String bik;

    @Column(name = "cor_score")
    private String corScore;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    List<UserDetails> usersList;
}
