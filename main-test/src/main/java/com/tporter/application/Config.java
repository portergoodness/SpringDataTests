package com.tporter.application;

import com.tporter.application.components.test.TestRunner;
import com.tporter.application.config.RepositoryConfig;
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
public class Config<ID extends Serializable> {

//    @Autowired
//    private JpaUserBuilder userRepository;
//
//    @Autowired
//    private JpaUserBuilder userBuilder;

    @Bean
    public TestRunner testRunner(JpaUserRepository userRepository, JpaUserBuilder userBuilder) {
        return new TestRunner(userRepository, userBuilder);
    }
}
