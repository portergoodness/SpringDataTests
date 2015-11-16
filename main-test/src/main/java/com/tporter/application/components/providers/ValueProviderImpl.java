package com.tporter.application.components.providers;

import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/13/15.
 */
@Component
public class ValueProviderImpl implements ValueProvider {

    private String val = "Value 1";

    public String getValue() {
        return val;
    }
}
