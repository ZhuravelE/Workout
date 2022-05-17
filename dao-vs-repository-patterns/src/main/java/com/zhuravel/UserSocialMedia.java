package com.zhuravel;

import java.util.List;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public class UserSocialMedia extends User {
    private List<Tweet> tweets;

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}
