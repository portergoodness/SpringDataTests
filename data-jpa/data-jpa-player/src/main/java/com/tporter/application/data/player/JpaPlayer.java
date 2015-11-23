package com.tporter.application.data.player;

import javax.persistence.*;

/**
 * Created by tporter on 11/15/15.
 */
@Entity
@Table
public class JpaPlayer implements Player<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String firstName;
    private String lastName;
    private String team;

    public JpaPlayer() {
    }

    public JpaPlayer(Long id, String firstName, String lastName, String team) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JpaPlayer jpaPlayer = (JpaPlayer) o;

        if (id != null ? !id.equals(jpaPlayer.id) : jpaPlayer.id != null) return false;
        if (firstName != null ? !firstName.equals(jpaPlayer.firstName) : jpaPlayer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(jpaPlayer.lastName) : jpaPlayer.lastName != null) return false;
        return !(team != null ? !team.equals(jpaPlayer.team) : jpaPlayer.team != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (team != null ? team.hashCode() : 0);
        return result;
    }
}
