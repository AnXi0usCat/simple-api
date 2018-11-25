package com.misha.cs.service.impl;

import com.misha.cs.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.misha.cs.persistence.dao.UserRepository;
import com.misha.cs.persistence.model.User;
import com.misha.cs.service.UserService;
import com.misha.cs.service.GenerateRandom;


@Service
public class UserServiceImpl implements UserService {

    private GenerateRandom randomGenerator;
    private UserRepository userRepository;
    @Override
    public UserDto createRandomTestUser() {

        User user = new User(
                randomGenerator.generateRandomString(20),
                randomGenerator.generateRandomString(15),
                randomGenerator.generateRandomBoolean(),
                randomGenerator.generateRandomString(50)
        );
        return new UserDto(user);
    }
    @Override
    public UserDto findUser(Long id) {
        return new UserDto(userRepository.findById(id).get());
    }
    @Override
    public void saveUser(UserDto dto) {
        userRepository.save(new User(dto));
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public boolean userExists(Long id) {
        return userRepository.existsById(id);
    }
    @Autowired
    public void setRandomGenerator(GenerateRandom randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
