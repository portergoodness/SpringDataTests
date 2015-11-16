package com.tporter.application.data.user;


import javax.persistence.*;

/**
 * Created by tporter on 11/14/15.
 */
@Entity
@Table
public class JpaUser implements User<Long> {

    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    @TableGenerator(name="TABLE_GEN",table="T_GENERATOR",pkColumnName="GEN_KEY",pkColumnValue="TEST",valueColumnName="GEN_VALUE",initialValue=1,allocationSize=1)
//    @GeneratedValue(strategy=GenerationType.TABLE, generator="TABLE_GEN")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    public JpaUser() {
    }

    public JpaUser(String firstName, String lastName, String userName, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
    }

//    @Override
//    public void setId(Long s) {
//
//    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

//    @Override
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    @Override
    public String getLastName() {
        return lastName;
    }

//    @Override
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    @Override
    public String getUserName() {
        return userName;
    }

//    @Override
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
}
