package com.tporter.application.data.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by tporter on 11/14/15.
 */
public interface JpaUserRepository extends UserRepository<JpaUser, Long> {
}
