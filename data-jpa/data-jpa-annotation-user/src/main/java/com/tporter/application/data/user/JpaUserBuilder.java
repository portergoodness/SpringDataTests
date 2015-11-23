package com.tporter.application.data.user;

import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/14/15.
 */
@Component
public class JpaUserBuilder implements UserBuilder<Long> {

    private Long id;
    protected String firstName;
    protected String lastName;
    protected String userName;

    public JpaUserBuilder() {
    }

    public JpaUserBuilder(Long id, String firstName, String lastName, String userName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public JpaUserBuilder fromUser(User<Long> user) {
        return new JpaUserBuilder(user.getId(), user.getFirstName(), user.getLastName(), user.getUserName());
    }

    @Override
    public UserBuilder<Long> withFirstName(String firstName) {
        return new JpaUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public UserBuilder<Long> withLastName(String lastName) {
        return new JpaUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public UserBuilder<Long> withUserName(String userName) {
        return new JpaUserBuilder(id, firstName, lastName, userName);
    }

    public JpaUserBuilder withId(Long id) {
        return new JpaUserBuilder(id, firstName, lastName, userName);
    }

    @Override
    public JpaUser build() {
        return new JpaUser(firstName, lastName, userName, id);
    }
}
