package com.tporter.application.data.player;

/**
 * Created by tporter on 11/15/15.
 */
public interface Player<ID> {

    ID getId();

    String getFirstName();

    String getLastName();

    String getTeam();
}
