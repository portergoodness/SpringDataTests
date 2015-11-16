package com.tporter.application.data.player;

import java.util.List;

/**
 * Created by tporter on 11/15/15.
 */
public interface PlayerRepository<ID> {

    Player<ID> getPlayerById(ID id);

    List<? extends Player<ID>> getPlayersByFirstName(String name);

    void deletePlayer(Player<ID> player);

    Player<ID> updatePlayer(Player<ID> player);

    Player<ID> savePlayer(Player<ID> player);
}
