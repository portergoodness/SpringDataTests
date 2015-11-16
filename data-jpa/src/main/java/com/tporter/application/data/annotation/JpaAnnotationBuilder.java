package com.tporter.application.data.annotation;

import com.tporter.application.data.user.JpaUser;
import com.tporter.application.data.user.JpaUserBuilder;
import com.tporter.application.data.user.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tporter on 11/14/15.
 */
public class JpaAnnotationBuilder extends AbstractAnnotationBuilder<Long, String> {

    private Long id;
    private JpaUser user;


    JpaUserBuilder userBuilder = new JpaUserBuilder();

    public JpaAnnotationBuilder() {
    }

    public JpaAnnotationBuilder(String start, String end, User<Long> user, Long id, String security) {
        super(start, end, user, security);
        this.id = id;
    }

    @Override
    protected JpaAnnotationBuilder createBuilder() {
        return new JpaAnnotationBuilder(this.start,
                this.end,
                this.user,
                this.id,
                this.security);
    }

    public JpaAnnotationBuilder withId(Long id) {
        this.id = id;
        return createBuilder();
    }

    @Override
    public JpaAnnotationBuilder fromAnnotation(Annotation<Long, String> annotation) {
        return new JpaAnnotationBuilder(annotation.getStart(),
                annotation.getEnd(),
                annotation.getUser(),
                annotation.getId(),
                annotation.getSecurity());
    }

    // overriding this to create Jpa User instances form User
    @Override
    public JpaAnnotationBuilder withUser(User<Long> user) {
        if (user instanceof JpaUser) {
            this.user = (JpaUser)user;
        } else {
            this.user = userBuilder.fromUser(user).build();
        }
        return createBuilder();
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
