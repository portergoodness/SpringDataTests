package com.tporter.application;

import com.tporter.application.components.test.TestRunner;
import com.tporter.application.data.annotation.AnnotationBuilder;
import com.tporter.application.data.annotation.AnnotationRepository;
import com.tporter.application.data.user.*;
import org.springframework.context.annotation.*;

import java.io.Serializable;

/**
 * Created by tporter on 11/13/15.
 */
@Configuration
@ComponentScan("com.tporter.application.components")
//@Import(RepositoryConfig.class)
@ImportResource("classpath*:data/data-*-config.xml")
// can import xml config with @ImportXml("classpath:location")
public class Config<ID extends Serializable, SECURITY> {

    /**
     * This runs simple repository tests with the implementations found in spring
     * @param userRepository
     * @param userBuilder
     * @return
     */
    @Bean
    public TestRunner testRunner(UserRepository<ID> userRepository, UserBuilder<ID> userBuilder,
                                 AnnotationRepository<ID, SECURITY> annotationRepository,
                                 AnnotationBuilder<ID, SECURITY> annotationBuilder) {
        return new TestRunner(userRepository, userBuilder, annotationRepository, annotationBuilder);
    }
}
