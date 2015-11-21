package com.tporter.application.components.test;

import com.tporter.application.data.annotation.Annotation;
import com.tporter.application.data.annotation.AnnotationBuilder;
import com.tporter.application.data.annotation.AnnotationRepository;
import com.tporter.application.data.user.User;
import com.tporter.application.data.user.UserBuilder;
import com.tporter.application.data.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/14/15.
 */
public class TestRunner<ID extends Serializable, SECURITY> {

    UserRepository<ID> userRepository;

    UserBuilder<ID> userBuilder;

    AnnotationBuilder<ID, SECURITY> annotationBuilder;

    AnnotationRepository<ID, SECURITY> annotationRepository;

    public TestRunner(UserRepository<ID> userRepository, UserBuilder<ID> userBuilder,
                      AnnotationRepository<ID, SECURITY> annotationRepository,
                      AnnotationBuilder<ID, SECURITY> annotationBuilder) {
        this.userBuilder = userBuilder;
        this.userRepository = userRepository;
        this.annotationRepository = annotationRepository;
        this.annotationBuilder = annotationBuilder;
    }

    public void run() {


        User<ID> user = userBuilder.withFirstName("Tim").withLastName("Porter").withUserName("tporter").build();

        User<ID> savedUser = userRepository.save(user);

        List<? extends User<ID>> userList = userRepository.findUserByFirstName("Tim");


        System.out.println("Id: "+savedUser.getId());
        System.out.println("Users Found: "+userList.size());

        Annotation<ID, SECURITY> annotation = annotationBuilder
                .withStart("Start")
                .withEnd("End")
                .withUser(savedUser)
                .build();

        Annotation<ID,SECURITY> savedAnnotation = annotationRepository.save(annotation);

        List<? extends Annotation<ID,SECURITY>> annotationList = annotationRepository.findAnnotationsByUser(savedUser);

        System.out.println("Id: "+savedAnnotation.getId());
        System.out.println("Annotations Found: " + annotationList.size());
    }
}
