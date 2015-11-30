package com.tporter.application.data.user;

import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/24/15.
 */
@Component
public class FooUserBuilder implements UserBuilder<String> {

    private String id;
    private String firstName;
    private String lastName;
    private String userName;

    public FooUserBuilder() {
    }

    public FooUserBuilder(String id, String firstName, String lastName, String userName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public FooUserBuilder fromUser(User<String> user) {
        return new FooUserBuilder(user.getId(), user.getFirstName(), user.getLastName(), user.getUserName());
    }

    @Override
    public FooUserBuilder withFirstName(String firstName) {
        return new FooUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public FooUserBuilder withLastName(String lastName) {
        return new FooUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public FooUserBuilder withUserName(String userName) {
        return new FooUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public FooUser build() {
        return new FooUser(id, firstName, lastName, userName);
    }
}
