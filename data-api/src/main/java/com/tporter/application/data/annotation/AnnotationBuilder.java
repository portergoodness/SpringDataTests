package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;

/**
 * Created by tporter on 11/13/15.
 */
public interface AnnotationBuilder<ID, SECURITY> {

    AnnotationBuilder<ID, SECURITY> fromAnnotation(Annotation<ID, SECURITY> annotation);

    AnnotationBuilder<ID, SECURITY> withStart(String start);

    AnnotationBuilder<ID, SECURITY> withEnd(String end);

    AnnotationBuilder<ID, SECURITY> withUser(User<ID> user);

    AnnotationBuilder<ID, SECURITY> withSecurity(SECURITY security);

    Annotation<ID, SECURITY> build();

}
