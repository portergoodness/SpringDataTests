package com.tporter.application.data.user;

/**
 * Created by tporter on 11/13/15.
 */
public interface UserBuilder<ID> {

    UserBuilder<ID> fromUser(User<ID> user);

    UserBuilder<ID> withFirstName(String firstName);

    UserBuilder<ID> withLastName(String lastName);

    UserBuilder<ID> withUserName(String userName);

    User<ID> build();

}
