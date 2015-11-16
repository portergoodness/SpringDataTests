package com.tporter.application.data.user;

/**
 * Created by tporter on 11/14/15.
 */
public abstract class AbstractUserBuilder<ID> implements UserBuilder<ID> {

    protected String firstName;
    protected String lastName;
    protected String userName;

    public AbstractUserBuilder() {
    }

    public AbstractUserBuilder(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    /**
     * Create a new UserBuilder with the current state of the variables
     * @return
     */
    protected abstract UserBuilder<ID> createBuilder();

    @Override
    public UserBuilder<ID> withFirstName(String firstName) {
        this.firstName = firstName;
        return createBuilder();
    }

    @Override
    public UserBuilder<ID> withLastName(String lastName) {
        this.lastName = lastName;
        return createBuilder();
    }

    @Override
    public UserBuilder<ID> withUserName(String userName) {
        this.userName = userName;
        return createBuilder();
    }
}
