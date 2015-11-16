package com.tporter.application.data.user;

/**
 * Created by tporter on 11/13/15.
 */
public interface User<ID> {

    ID getId();

    String getFirstName();

    String getLastName();

    String getUserName();
}
