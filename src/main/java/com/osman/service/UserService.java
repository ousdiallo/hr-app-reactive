package com.osman.service;

import com.osman.domain.User;
import com.osman.exception.domain.EmailExistException;
import com.osman.exception.domain.UserNotFoundException;
import com.osman.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstname, String lastname, String username, String email) throws EmailExistException, UsernameExistException, UserNotFoundException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
