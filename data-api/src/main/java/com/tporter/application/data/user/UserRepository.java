package com.tporter.application.data.user;

import com.tporter.application.data.annotation.Annotation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/13/15.
 */
@NoRepositoryBean
public interface UserRepository<USER extends User<ID>, ID extends Serializable> extends CrudRepository<USER, ID> {

    List<USER> findUserByFirstName(String firstName);
}
