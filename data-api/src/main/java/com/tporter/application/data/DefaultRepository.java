package com.tporter.application.data;

import java.io.Serializable;

/**
 * The basic CRUD methods all repositories might want to include
 * Created by tporter on 11/20/15.
 */
public interface DefaultRepository<TYPE, ID extends Serializable> {

    TYPE getById(ID id);

    void delete(TYPE value);

    TYPE update(TYPE value);

    TYPE save(TYPE value);
}
