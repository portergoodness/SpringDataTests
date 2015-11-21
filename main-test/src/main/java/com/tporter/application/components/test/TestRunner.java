package com.tporter.application.components.test;

import com.tporter.application.data.user.User;
import com.tporter.application.data.user.UserBuilder;
import com.tporter.application.data.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tporter on 11/14/15.
 */
public class TestRunner<ID extends Serializable, SECURITY> {

    UserRepository<ID> userRepository;

    UserBuilder<ID> userBuilder;

    public TestRunner(UserRepository<ID> userRepository, UserBuilder<ID> userBuilder) {
        this.userBuilder = userBuilder;
        this.userRepository = userRepository;
    }

    public void run() {
//        UserRepository<User<ID>, ID> userRepository = context.getBean(UserRepository.class);

//        UserBuilder<ID> userBuilder = context.getBean(UserBuilder.class);

        User<ID> user = userBuilder.withFirstName("Tim").withLastName("Porter").withUserName("tporter").build();

        User<ID> savedUser = userRepository.save(user);

        List<? extends User<ID>> userList = userRepository.findUserByFirstName("Tim");


        System.out.println("Id: "+savedUser.getId());
        System.out.println("Users Found: "+userList.size());
    }
}
