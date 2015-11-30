package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;
import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/22/15.
 */
@Component
public class FooAnnotationBuilder implements AnnotationBuilder<String, String> {

    private String id;
    private String start;
    private String end;
    private User user;
    private String security;

    public FooAnnotationBuilder() {
    }

    public FooAnnotationBuilder(String id, String start, String end, User user, String security) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.user = user;
        this.security = security;
    }

    @Override
    public FooAnnotationBuilder fromAnnotation(Annotation<String, String> annotation) {
        return new FooAnnotationBuilder(
                annotation.getId(),
                annotation.getStart(),
                annotation.getEnd(),
                annotation.getUser(),
                annotation.getSecurity());
    }

    @Override
    public FooAnnotationBuilder withStart(String start) {
        return new FooAnnotationBuilder(
                id,
                start,
                end,
                user,
                security);
    }

    @Override
    public FooAnnotationBuilder withEnd(String end) {
        return new FooAnnotationBuilder(
                id,
                start,
                end,
                user,
                security);
    }

    @Override
    public FooAnnotationBuilder withUser(User<String> user) {
        return new FooAnnotationBuilder(
                id,
                start,
                end,
                user,
                security);
    }

    @Override
    public FooAnnotationBuilder withSecurity(String s) {
        return new FooAnnotationBuilder(
                id,
                start,
                end,
                user,
                security);
    }

    @Override
    public FooAnnotation build() {
        return new FooAnnotation(
                id,
                start,
                end,
                user,
                security);
    }
}
