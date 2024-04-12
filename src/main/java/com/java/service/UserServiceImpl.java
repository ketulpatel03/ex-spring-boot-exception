package com.java.service;

import com.java.dto.UserRequest;
import com.java.entity.User;
import com.java.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserRequest userRequest) {
        User user = new User(userRequest.getFirstName(),
                userRequest.getLastName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getAge(),
                userRequest.getGender(),
                userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getAnUser(int id) {
        return userRepository.findById(id).orElseThrow();
    }
}
