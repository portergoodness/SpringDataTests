package com.tporter.application.data.user;

import com.tporter.application.data.DefaultRepository;
import com.tporter.application.data.annotation.Annotation;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/13/15.
 */
public interface UserRepository<ID extends Serializable> extends DefaultRepository<User<ID>, ID> {

    List<? extends User<ID>> findUserByFirstName(String firstName);
}
