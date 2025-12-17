package com.TesteAndroid.TesteAndroid.repository;

import com.TesteAndroid.TesteAndroid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);
}
