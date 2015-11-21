package com.tporter.application.data.user;

import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/14/15.
 */
public class JpaUserBuilder extends AbstractUserBuilder<Long> {

    private Long id;

    public JpaUserBuilder() {
    }

    public JpaUserBuilder(String firstName, String lastName, String userName, Long id) {
        super(firstName, lastName, userName);
        this.id = id;
    }

    @Override
    protected JpaUserBuilder createBuilder() {
        return new JpaUserBuilder(firstName, lastName, userName, id);
    }

    @Override
    public JpaUserBuilder fromUser(User<Long> user) {
        return new JpaUserBuilder(user.getFirstName(), user.getLastName(), user.getUserName(), user.getId());
    }

    public JpaUserBuilder withId(Long id) {
        this.id = id;
        return createBuilder();
    }

    @Override
    public JpaUser build() {
        return new JpaUser(firstName, lastName, userName, id);
    }
}
