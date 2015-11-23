package com.tporter.application.config.foo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tporter on 11/22/15.
 */
@Configuration
@ComponentScan("com.tporter.application.data")
public class RepositoryConfig {
}
