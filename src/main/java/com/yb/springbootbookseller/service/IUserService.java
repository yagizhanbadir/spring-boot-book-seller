package com.yb.springbootbookseller.service;

import com.yb.springbootbookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
