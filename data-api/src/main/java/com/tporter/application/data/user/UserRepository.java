package com.tporter.application.data.user;

import com.tporter.application.data.DefaultRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Repository Specific to the User Data Object
 * Created by tporter on 11/13/15.
 */
public interface UserRepository<ID extends Serializable> extends DefaultRepository<User<ID>, ID> {

    List<? extends User<ID>> findUserByFirstName(String firstName);
}
