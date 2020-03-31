package com.js.jpademospringdata2.post;

import java.util.List;

public interface PostCustomeRepository<T> {
    List<Post> findMyPost();
    void delete(T entity);
}
