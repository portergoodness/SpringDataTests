package com.tporter.application.data.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tporter on 11/20/15.
 */
public interface JpaCrudUserRepository extends CrudRepository<JpaUser, Long> {

    List<JpaUser> findUserByFirstName(String firstName);
}
