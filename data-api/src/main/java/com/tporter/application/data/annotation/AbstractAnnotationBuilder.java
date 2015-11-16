package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;

/**
 * Created by tporter on 11/14/15.
 */
public abstract class AbstractAnnotationBuilder<ID, SECURITY> implements AnnotationBuilder<ID, SECURITY> {

    protected String start;
    protected String end;
    protected User<ID> user;
    protected SECURITY security;

    public AbstractAnnotationBuilder() {
    }

    public AbstractAnnotationBuilder(String start, String end, User<ID> user, SECURITY security) {
        this.start = start;
        this.end = end;
        this.user = user;
        this.security = security;
    }

    /**
     * Create a new AnnotationBuilder with the current state of the variables
     * @return
     */
    abstract protected AnnotationBuilder<ID, SECURITY> createBuilder();

    @Override
    public AnnotationBuilder<ID, SECURITY> withStart(String start) {
        this.start = start;
        return createBuilder();
    }

    @Override
    public AnnotationBuilder<ID, SECURITY> withEnd(String end) {
        this.end = end;
        return createBuilder();
    }

    @Override
    public AnnotationBuilder<ID, SECURITY> withSecurity(SECURITY security) {
        this.security = security;
        return createBuilder();
    }

    public AnnotationBuilder<ID, SECURITY> withUser(User<ID> user) {
        this.user = user;
        return createBuilder();
    }
}
