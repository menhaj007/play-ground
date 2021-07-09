package com.twitter.tweet.repositories;

import com.twitter.tweet.models.Tweets;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CrudRepository<Tweets, Long>{
    
}
