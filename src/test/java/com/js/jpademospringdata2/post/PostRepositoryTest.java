package com.js.jpademospringdata2.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Before
    public void setUp() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Test
    public void crud() {
        Post post = new Post();
        post.setTitle("hibernare");
        postRepository.save(post);
        postRepository.findMyPost();
        postRepository.delete(post);
        postRepository.flush();
    }
}