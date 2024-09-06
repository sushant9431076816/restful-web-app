package com.restful.web.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.web.app.login.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    // Define custom queries here if needed
}
