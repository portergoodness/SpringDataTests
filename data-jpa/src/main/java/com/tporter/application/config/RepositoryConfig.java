package com.tporter.application.config;

import com.tporter.application.data.annotation.AnnotationBuilder;
import com.tporter.application.data.annotation.JpaAnnotationBuilder;
import com.tporter.application.data.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.Serializable;
import java.util.Properties;

/**
 * Created by tporter on 11/13/15.
 */
@Configuration
@ComponentScan("com.tporter.application.data")
@EnableJpaRepositories("com.tporter.application.data")
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class RepositoryConfig {

    @Autowired
    private Environment environment;

    @Bean
    DataSource dataSource() {

        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.HSQL).build();
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.tporter.application.data");
        factory.setDataSource(dataSource);
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

//    @Bean
//    public UserRepository<Long> userRepository(JpaCrudUserRepository jpaCrudUserRepository, JpaUserBuilder userBuilder) {
//        return new JpaUserRepository(jpaCrudUserRepository, userBuilder);
//    }

//    @Bean
//    public AnnotationBuilder<Long, String> annotationBuilder() {
//        return new JpaAnnotationBuilder();
//    }

//    @Bean
//    public JpaUserBuilder userBuilder() {
//        return new JpaUserBuilder();
//    }
}
