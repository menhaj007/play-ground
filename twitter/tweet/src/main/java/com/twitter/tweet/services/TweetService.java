package com.twitter.tweet.services;

import com.twitter.tweet.repositories.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;
}
