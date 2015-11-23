package com.tporter.application.data.annotation;

import com.tporter.application.data.user.JpaUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tporter on 11/20/15.
 */
public interface JpaCrudAnnotationRepository extends CrudRepository<JpaAnnotation, Long> {

    public List<JpaAnnotation> findAnnotationsByUser(JpaUser user);

}