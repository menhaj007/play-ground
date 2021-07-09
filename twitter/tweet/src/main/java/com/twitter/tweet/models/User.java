package com.twitter.tweet.models;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Min(2)
    private String userName;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Tweets> tweets;

    public User() {}


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Tweets> getTweets() {
        return this.tweets;
    }

    public void setTweets(List<Tweets> tweets) {
        this.tweets = tweets;
    }

    public String toString () {
        return "ID " + id + " Tweet " + userName;
    }


    
    
}
