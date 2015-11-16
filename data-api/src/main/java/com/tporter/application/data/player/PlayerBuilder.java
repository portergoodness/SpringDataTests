package com.tporter.application.data.player;

/**
 * Created by tporter on 11/15/15.
 */
public interface PlayerBuilder<ID> {

    PlayerBuilder<ID> fromPlayer(Player<ID> player);

    PlayerBuilder<ID> withFirstName(String firstName);

    PlayerBuilder<ID> withLastName(String lastName);

    PlayerBuilder<ID> withTeam(String team);

    Player<ID> build();
}
