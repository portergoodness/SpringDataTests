package com.tporter.application.data.annotation;

import com.tporter.application.data.user.JpaUser;
import com.tporter.application.data.user.JpaUserBuilder;
import com.tporter.application.data.user.User;
import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/14/15.
 */
@Component
public class JpaAnnotationBuilder implements AnnotationBuilder<Long, String> {

    private Long id;
    private JpaUser user;
    private String security;
    private String start;
    private String end;


    JpaUserBuilder userBuilder = new JpaUserBuilder();

    public JpaAnnotationBuilder() {
    }

    public JpaAnnotationBuilder(Long id, User<Long> user, String security, String start, String end) {
        this.id = id;
        this.user = convertUser(user);
        this.security = security;
        this.start = start;
        this.end = end;
    }

    protected JpaUser convertUser(User<Long> user) {
        if (user == null) return null;
        if (user instanceof JpaUser) {
            return (JpaUser)user;
        } else {
            return userBuilder.fromUser(user).build();
        }
    }

    public JpaAnnotationBuilder withId(Long id) {
        return new JpaAnnotationBuilder(id, user, security, start, end);
    }

    @Override
    public JpaAnnotationBuilder fromAnnotation(Annotation<Long, String> annotation) {
        if (annotation == null) return new JpaAnnotationBuilder();
        return new JpaAnnotationBuilder(annotation.getId(),
                annotation.getUser(),
                annotation.getSecurity(),
                annotation.getStart(),
                annotation.getEnd());
    }

    @Override
    public AnnotationBuilder<Long, String> withStart(String start) {
        return new JpaAnnotationBuilder(id, user, security, start, end);
    }

    @Override
    public AnnotationBuilder<Long, String> withEnd(String end) {
        return new JpaAnnotationBuilder(id, user, security, start, end);
    }

    // overriding this to create Jpa User instances form User
    @Override
    public JpaAnnotationBuilder withUser(User<Long> user) {
        return new JpaAnnotationBuilder(id, user, security, start, end);
    }

    @Override
    public JpaAnnotationBuilder withSecurity(String security) {
        return new JpaAnnotationBuilder(id, user, security, start, end);
    }

    @Override
    public JpaAnnotation build() {
        return new JpaAnnotation(this.start,
                this.end,
                this.user,
                this.id,
                this.security);
    }

}
