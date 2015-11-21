package com.tporter.application.data.player;

import org.springframework.stereotype.Component;

/**
 * Created by tporter on 11/15/15.
 */
@Component
public class JpaPlayerBuilder implements PlayerBuilder<Long> {

    private Long id;
    private String firstName;
    private String lastName;
    private String team;

    public JpaPlayerBuilder() {
    }

    public JpaPlayerBuilder(Long id, String firstName, String lastName, String team) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    @Override
    public JpaPlayerBuilder fromPlayer(Player<Long> player) {
        return new JpaPlayerBuilder(player.getId(), player.getFirstName(), player.getLastName(), player.getTeam());
    }

    @Override
    public JpaPlayerBuilder withFirstName(String firstName) {
        return new JpaPlayerBuilder(id, firstName, lastName, team);
    }

    @Override
    public JpaPlayerBuilder withLastName(String lastName) {
        return new JpaPlayerBuilder(id, firstName, lastName, team);
    }

    @Override
    public JpaPlayerBuilder withTeam(String team) {
        return new JpaPlayerBuilder(id, firstName, lastName, team);
    }

    @Override
    public JpaPlayer build() {
        return new JpaPlayer(id, firstName, lastName, team);
    }
}
