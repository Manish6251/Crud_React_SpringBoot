package com.Tata.Strive.repository;

import com.Tata.Strive.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
