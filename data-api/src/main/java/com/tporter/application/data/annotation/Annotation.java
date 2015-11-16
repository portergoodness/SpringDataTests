package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;

/**
 * Created by tporter on 11/13/15.
 */
public interface Annotation<ID, SECURITY> {

    ID getId();

    String getStart();

    String getEnd();

    User getUser();

    SECURITY getSecurity();
}
