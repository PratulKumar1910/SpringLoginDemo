package com.lowes.demo.login.repository;

import com.lowes.demo.login.model.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepositoriesAutoConfiguration {
    User findByUserName(String userName);

    User findByEmailId(String email);
}
