package com.tporter.application.data.annotation;

import com.tporter.application.data.user.JpaUser;
import com.tporter.application.data.user.User;

import javax.persistence.*;

/**
 * Created by tporter on 11/14/15.
 */
@Entity
@Table
public class JpaAnnotation implements Annotation<Long, String> {

    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String security;
    private String start;
    private String end;
    @OneToOne
    private JpaUser user;


    public JpaAnnotation() {
    }

    public JpaAnnotation(String start, String end, JpaUser user, Long id, String security) {
        this.id = id;
        this.security = security;
        this.start = start;
        this.user = user;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getSecurity() {
        return null;
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
    public JpaUser getUser() {
        return user;
    }

}
