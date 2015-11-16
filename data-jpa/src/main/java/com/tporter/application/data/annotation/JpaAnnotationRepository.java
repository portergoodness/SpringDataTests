package com.tporter.application.data.annotation;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by tporter on 11/14/15.
 */
public interface JpaAnnotationRepository extends AnnotationRepository<JpaAnnotation, Long> {
}
