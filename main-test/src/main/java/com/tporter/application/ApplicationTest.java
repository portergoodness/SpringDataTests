package com.tporter.application;

import com.tporter.application.components.printers.ValuePrinter;
import com.tporter.application.components.test.TestRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Serializable;

/**
 * Created by tporter on 11/13/15.
 */
public class ApplicationTest {


    public static <ID extends Serializable> void main(String[] args) {

        // Setup Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ValuePrinter printer = context.getBean(ValuePrinter.class);
        printer.printValue();

        context.getBean(TestRunner.class).run();

    }
}
