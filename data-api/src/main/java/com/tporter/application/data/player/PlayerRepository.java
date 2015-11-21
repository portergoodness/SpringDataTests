package com.tporter.application.data.player;

import com.tporter.application.data.DefaultRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Repository Specific to the Player Data Object
 * Created by tporter on 11/15/15.
 */
public interface PlayerRepository<ID extends Serializable> extends DefaultRepository<Player<ID>, ID> {

    List<? extends Player<ID>> getByFirstName(String name);

}
