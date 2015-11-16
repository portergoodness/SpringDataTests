package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;

/**
 * Created by tporter on 11/14/15.
 */
public interface MutableAnnotation<ID, SECURITY> extends Annotation<ID, SECURITY> {

    void setId(ID id);

    void setStart(String start);

    void setEnd(String end);

    void setUser(User<ID> user);

    void setSecurity(SECURITY security);
}
