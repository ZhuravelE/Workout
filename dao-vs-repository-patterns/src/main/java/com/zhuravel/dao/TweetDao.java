package com.zhuravel.dao;

import com.zhuravel.Tweet;

import java.util.List;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public interface TweetDao {
    List<Tweet> fetchTweets(String email);
}
