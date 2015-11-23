package com.tporter.application.data.player;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tporter on 11/15/15.
 */
public interface JpaCrudPlayerRepository extends CrudRepository<JpaPlayer, Long> {

    List<JpaPlayer> findPlayersByFirstName(String firstName);
}
