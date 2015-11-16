package com.tporter.application.data.user;

/**
 * Created by tporter on 11/14/15.
 */
public interface MutableUser<ID> extends User<ID> {

    void setId(ID id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setUserName(String userName);
}
