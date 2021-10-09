package com.ohana.springbootohana.service;

import com.ohana.springbootohana.model.Role;
import com.ohana.springbootohana.model.User;
import com.ohana.springbootohana.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class Usersvervice implements IUserService {
    @Autowired
    private IUserRepository IUserRepository;

    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return IUserRepository.save(user);

    }

    @Override
    public Optional<User> findByUsername(String username)
    {
        return IUserRepository.findByUsername(username);
    }

    @Override
    @Transactional //TransactionalRequired when executing an update/delete query
    public void makeAdmin(String username)
    {
        IUserRepository.updateUserRole(username, Role.ADMIN);
    }
}
