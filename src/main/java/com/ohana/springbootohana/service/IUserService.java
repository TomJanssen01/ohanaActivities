package com.ohana.springbootohana.service;

import com.ohana.springbootohana.model.User;

import java.util.Optional;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
