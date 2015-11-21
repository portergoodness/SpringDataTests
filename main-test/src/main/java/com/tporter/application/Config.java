package com.tporter.application;

import com.tporter.application.components.test.TestRunner;
import com.tporter.application.config.RepositoryConfig;
import com.tporter.application.data.annotation.AnnotationBuilder;
import com.tporter.application.data.annotation.AnnotationRepository;
import com.tporter.application.data.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.Serializable;

/**
 * Created by tporter on 11/13/15.
 */
@Configuration
@ComponentScan("com.tporter.application.components")
@Import(RepositoryConfig.class)
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
