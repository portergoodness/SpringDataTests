package com.tporter.application.data.player;

import java.util.List;

/**
 * Created by tporter on 11/15/15.
 */
public class JpaPlayerRepository implements PlayerRepository<Long> {

    private JpaCrudPlayerRepository crudRepository;
    private JpaPlayerBuilder builder;

    @Override
    public Player<Long> getById(Long aLong) {
        return crudRepository.findOne(aLong);
    }

    @Override
    public List<JpaPlayer> getByFirstName(String name) {
        return crudRepository.findPlayersByFirstName(name);
    }

    @Override
    public void delete(Player<Long> player) {
        crudRepository.delete(player.getId());
    }

    @Override
    public Player<Long> update(Player<Long> player) {
        return crudRepository.save(builder.fromPlayer(player).build());
    }

    @Override
    public Player<Long> save(Player<Long> player) {
        return crudRepository.save(builder.fromPlayer(player).build());
    }
}
