package com.tporter.application;

import com.tporter.application.components.printers.ValuePrinter;
import com.tporter.application.components.test.TestRunner;
import com.tporter.application.config.RepositoryConfig;
import com.tporter.application.data.user.User;
import com.tporter.application.data.user.UserBuilder;
import com.tporter.application.data.user.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/13/15.
 */
public class ApplicationTest {


    public static <ID extends Serializable> void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ValuePrinter printer = context.getBean(ValuePrinter.class);
        printer.printValue();

        context.getBean(TestRunner.class).run();

    }
}
