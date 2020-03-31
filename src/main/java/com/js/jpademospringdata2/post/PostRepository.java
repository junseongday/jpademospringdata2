package com.js.jpademospringdata2.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> , PostCustomeRepository<Post>{
}
