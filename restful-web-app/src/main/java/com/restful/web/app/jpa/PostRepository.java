package com.restful.web.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.web.app.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
