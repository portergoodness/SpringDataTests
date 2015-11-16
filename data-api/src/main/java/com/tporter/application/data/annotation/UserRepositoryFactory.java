package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;
import com.tporter.application.data.user.UserRepository;

import java.io.Serializable;

/**
 * Created by tporter on 11/15/15.
 */
public interface UserRepositoryFactory<ID extends Serializable> {

    UserRepository<User<ID>, ID> getRepository();
}
