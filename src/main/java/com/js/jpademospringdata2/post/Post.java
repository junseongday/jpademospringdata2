package com.js.jpademospringdata2.post;

import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post extends AbstractAggregateRoot {
    @Id @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String contents;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post publish() {
        this.registerEvent(new PostPublishedEvent(this));
        return this;
    }
}
