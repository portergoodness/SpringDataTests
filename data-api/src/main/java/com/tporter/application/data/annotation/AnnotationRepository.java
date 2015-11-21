package com.tporter.application.data.annotation;

import com.tporter.application.data.DefaultRepository;
import com.tporter.application.data.user.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/13/15.
 */

public interface AnnotationRepository<ID, SECURITY> extends DefaultRepository<Annotation<ID, SECURITY>, ID> {

    List<? extends Annotation<ID, SECURITY>> findAnnotationsByUser(User<ID> user);
}
