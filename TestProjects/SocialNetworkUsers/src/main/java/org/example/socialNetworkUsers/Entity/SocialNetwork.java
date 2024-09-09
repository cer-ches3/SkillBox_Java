package org.example.socialNetworkUsers.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "social_networks")
@Data
public class SocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;
}
