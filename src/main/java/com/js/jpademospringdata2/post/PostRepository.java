package com.js.jpademospringdata2.post;

import com.js.jpademospringdata2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends MyRepository<Post, Long>, QuerydslPredicateExecutor<Post> {
}
