package com.tporter.application.data.user;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by tporter on 11/24/15.
 */
@Component
public class FooUserRepository implements UserRepository<String> {
    @Override
    public List<? extends User<String>> findUserByFirstName(String firstName) {
        return null;
    }

    @Override
    public User<String> getById(String s) {
        return null;
    }

    @Override
    public void delete(User<String> value) {

    }

    @Override
    public User<String> update(User<String> value) {
        return null;
    }

    @Override
    public User<String> save(User<String> value) {
        return null;
    }
}
