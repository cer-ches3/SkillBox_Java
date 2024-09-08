package org.example.SocialNetworkUsers.repositories;

import org.example.SocialNetworkUsers.Entity.SocialNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Integer> {
}
