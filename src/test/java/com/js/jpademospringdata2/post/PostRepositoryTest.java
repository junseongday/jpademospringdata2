package com.js.jpademospringdata2.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PostRepositoryTestConfig.class)
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Autowired
    ApplicationContext context;

    @Test
    public void event() {
        Post post = new Post();
        post.setTitle(("evnet"));
        PostPublishedEvent event = new PostPublishedEvent(post);

        context.publishEvent(event);
    }

    @Before
    public void setUp() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Test
    public void crud() {
        Post post = new Post();
        post.setTitle("hibernare");
        assertThat(postRepository.contains(post)).isFalse();
        postRepository.save(post.publish());
//        postRepository.findMyPost();
        assertThat(postRepository.contains(post)).isTrue();
        postRepository.delete(post);
        postRepository.flush();
    }
}