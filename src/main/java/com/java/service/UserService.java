package com.java.service;

import com.java.dto.UserRequest;
import com.java.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(UserRequest userRequest);

    List<User> getAllUsers();

    User getAnUser(int id);

}
