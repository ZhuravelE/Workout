package com.zhuravel;

import java.util.Date;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public class Tweet {
    private String email;
    private String tweetText;
    private Date dateCreated;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
