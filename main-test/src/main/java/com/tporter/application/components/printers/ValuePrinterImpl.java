package com.tporter.application.components.printers;

import com.tporter.application.components.providers.ValueProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/13/15.
 */
@Component
public class ValuePrinterImpl implements ValuePrinter {

    private ValueProvider provider;

    @Autowired
    public ValuePrinterImpl(ValueProvider provider) {
        this.provider = provider;
    }

    public void printValue() {
        System.out.println(provider.getValue());
    }
}
