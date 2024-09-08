package org.example.SocialNetworkUsers.repositories;

import org.example.SocialNetworkUsers.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
