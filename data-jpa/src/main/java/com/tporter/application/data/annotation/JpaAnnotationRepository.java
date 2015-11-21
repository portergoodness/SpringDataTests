package com.tporter.application.data.annotation;

import com.tporter.application.data.user.JpaUserBuilder;
import com.tporter.application.data.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by tporter on 11/14/15.
 */
@Component
public class JpaAnnotationRepository implements AnnotationRepository<Long, String> {

    private JpaCrudAnnotationRepository repository;
    private JpaAnnotationBuilder annotationBuilder = new JpaAnnotationBuilder();
    private JpaUserBuilder userBuilder = new JpaUserBuilder();

    @Autowired
    public JpaAnnotationRepository(JpaCrudAnnotationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<? extends JpaAnnotation> findAnnotationsByUser(User<Long> user) {
        return repository.findAnnotationsByUser(userBuilder.fromUser(user).build());
    }

    @Override
    public JpaAnnotation getById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public void delete(Annotation<Long, String> annotation) {
        repository.delete(annotation.getId());
    }

    @Override
    public JpaAnnotation update(Annotation<Long, String> annotation) {
        return repository.save(annotationBuilder.fromAnnotation(annotation).build());
    }

    @Override
    public JpaAnnotation save(Annotation<Long, String> annotation) {
        return repository.save(annotationBuilder.fromAnnotation(annotation).build());
    }
}
