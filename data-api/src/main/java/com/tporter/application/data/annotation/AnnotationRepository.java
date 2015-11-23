package com.tporter.application.data.annotation;

import com.tporter.application.data.DefaultRepository;
import com.tporter.application.data.user.User;

import java.io.Serializable;
import java.util.List;

/**
 * Repository Specific to the Annotation Data Object
 * Created by tporter on 11/13/15.
 */

public interface AnnotationRepository<ID extends Serializable, SECURITY> extends DefaultRepository<Annotation<ID, SECURITY>, ID> {

    List<? extends Annotation<ID, SECURITY>> findAnnotationsByUser(User<ID> user);
}
