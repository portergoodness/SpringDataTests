package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/13/15.
 */
@NoRepositoryBean
public interface AnnotationRepository<ANNOTATION, ID extends Serializable> extends CrudRepository<ANNOTATION, ID> {

    List<ANNOTATION> findAnnotationsByUser(User<ID> user);
}
