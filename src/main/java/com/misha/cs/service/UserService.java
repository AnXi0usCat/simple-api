package com.misha.cs.service;

import com.misha.cs.persistence.model.User;
import com.misha.cs.web.dto.UserDto;

public interface UserService {

    // simple method to test the API functionality
    public UserDto createRandomTestUser();

    // find user
    public UserDto findUser(Long id);

    // save user
    public void saveUser(UserDto user);

    // delete user
    public void deleteUser(Long id);

    //
    public boolean userExists(Long id);
}
