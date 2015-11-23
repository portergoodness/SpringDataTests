package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;

/**
 * Created by tporter on 11/22/15.
 */
public class FooAnnotation implements Annotation<String, String> {

    String id;
    String start;
    String end;
    User user;
    String security;

    public FooAnnotation() {
    }

    public FooAnnotation(String id, String start, String end, User user, String security) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.user = user;
        this.security = security;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getStart() {
        return start;
    }

    @Override
    public String getEnd() {
        return end;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public String getSecurity() {
        return security;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public void setUser(User u) {
        // do nothing
    }
}
