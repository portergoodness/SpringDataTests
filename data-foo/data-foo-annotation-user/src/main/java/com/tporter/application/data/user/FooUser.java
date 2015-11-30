package com.tporter.application.data.user;

/**
 * Created by tporter on 11/24/15.
 */
public class FooUser implements User<String> {

    private String id;
    private String firstName;
    private String lastName;
    private String userName;

    public FooUser() {
    }

    public FooUser(String id, String firstName, String lastName, String userName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
