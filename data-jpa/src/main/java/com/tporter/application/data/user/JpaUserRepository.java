package com.tporter.application.data.user;



import java.util.List;

/**
 * Created by tporter on 11/14/15.
 */
public class JpaUserRepository implements UserRepository<Long> {

    private JpaCrudUserRepository repository;
    private JpaUserBuilder builder;

    public JpaUserRepository(JpaCrudUserRepository repository, JpaUserBuilder builder) {
        this.repository = repository;
        this.builder = builder;
    }

    @Override
    public List<? extends JpaUser> findUserByFirstName(String firstName) {
        return repository.findUserByFirstName(firstName);
    }

    @Override
    public JpaUser getById(Long aLong) {
        return repository.findOne(aLong);
    }

    @Override
    public void delete(User<Long> player) {
        repository.delete(player.getId());
    }

    @Override
    public JpaUser update(User<Long> player) {
        return repository.save(builder.fromUser(player).build());
    }

    @Override
    public JpaUser save(User<Long> player) {
        return null;
    }
}
