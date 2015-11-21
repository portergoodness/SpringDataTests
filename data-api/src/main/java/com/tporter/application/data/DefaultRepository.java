package com.tporter.application.data;

/**
 * Created by tporter on 11/20/15.
 */
public interface DefaultRepository<TYPE, ID> {

    TYPE getById(ID id);

    void delete(TYPE player);

    TYPE update(TYPE player);

    TYPE save(TYPE player);
}
