package com.tporter.application.data.annotation;

import com.tporter.application.data.user.User;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Created by tporter on 11/22/15.
 */
@Component
public class FooAnnotationRepository implements AnnotationRepository<String, String> {

    @Override
    public List<? extends Annotation<String, String>> findAnnotationsByUser(User<String> user) {
        System.out.println("Foo findAnnotationsByUser");
        return Collections.emptyList();
    }

    @Override
    public Annotation<String, String> getById(String s) {
        System.out.println("Foo Get By ID");
        return null;
    }

    @Override
    public void delete(Annotation<String, String> value) {
        System.out.println("Foo delete");

    }

    @Override
    public Annotation<String, String> update(Annotation<String, String> value) {
        System.out.println("Foo update");
        return null;
    }

    @Override
    public Annotation<String, String> save(Annotation<String, String> value) {
        System.out.println("Foo save");
        return null;
    }
}
