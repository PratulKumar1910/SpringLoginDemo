package com.lowes.login.repository;

import com.lowes.login.repository.model.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepositoriesAutoConfiguration {
    User findByUserName(String userName);

    User findByEmailId(String email);
}
