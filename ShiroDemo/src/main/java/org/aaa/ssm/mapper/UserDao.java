package org.aaa.ssm.mapper;
import java.util.List;

import org.aaa.ssm.model.User;


public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}