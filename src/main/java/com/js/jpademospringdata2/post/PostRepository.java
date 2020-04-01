package com.js.jpademospringdata2.post;

import com.js.jpademospringdata2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long>{
}
