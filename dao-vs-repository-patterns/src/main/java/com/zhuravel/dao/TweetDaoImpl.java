package com.zhuravel.dao;

import com.zhuravel.Tweet;

import java.util.ArrayList;
import java.util.List;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public class TweetDaoImpl implements TweetDao {
    @Override
    public List<Tweet> fetchTweets(String email) {
        List<Tweet> tweets = new ArrayList<>();

        //call Twitter API and prepare Tweet object

        return tweets;
    }
}
