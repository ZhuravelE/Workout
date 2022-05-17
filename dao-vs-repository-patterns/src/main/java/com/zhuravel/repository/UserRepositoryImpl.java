package com.zhuravel.repository;

import com.zhuravel.Tweet;
import com.zhuravel.User;
import com.zhuravel.UserSocialMedia;
import com.zhuravel.dao.TweetDao;
import com.zhuravel.dao.UserDao;

import java.util.List;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public class UserRepositoryImpl implements UserRepository {

    private UserDao userDao;
    private TweetDao tweetDao;

    public UserRepositoryImpl(UserDao userDao, TweetDao tweetDao) {
        this.userDao = userDao;
        this.tweetDao = tweetDao;
    }

    @Override
    public User get(Long id) {
        UserSocialMedia user = (UserSocialMedia) userDao.read(id);

        List<Tweet> tweets = tweetDao.fetchTweets(user.getEmail());
        user.setTweets(tweets);

        return user;
    }

    @Override
    public void add(User user) {
        userDao.create(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void remove(User user) {
        userDao.delete(user.getUserName());
    }
}
