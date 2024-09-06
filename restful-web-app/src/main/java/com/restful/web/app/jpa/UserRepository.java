package com.restful.web.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.web.app.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}