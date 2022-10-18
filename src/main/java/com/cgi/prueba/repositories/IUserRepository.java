package com.cgi.prueba.repositories;

import com.cgi.prueba.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
