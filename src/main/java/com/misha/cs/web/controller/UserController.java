package com.misha.cs.web.controller;

import com.misha.cs.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.misha.cs.service.UserService;

import javax.validation.Valid;

@RestController
public class UserController {

    UserService service;

    @RequestMapping(value = "/api/v1/RandomUser", method = RequestMethod.GET)
    @ResponseBody
    public UserDto findRandomUser() {
        return service.createRandomTestUser();
    }

    @RequestMapping(value = "/api/v1/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    @Secured({ "ROLE_ADMIN", "ROLE_USER" })
    public UserDto findUser(@PathVariable("id") final Long id) {return service.findUser(id);}

    @RequestMapping(value = "/api/v1/user", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @Secured({ "ROLE_ADMIN" })
    public void createUser(@RequestBody @Valid final UserDto user) { service.saveUser(user); }

    @RequestMapping(value = "/api/v1/user/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Secured({ "ROLE_ADMIN" })
    public void deleteUser(@PathVariable("id") final Long id) { service.deleteUser(id); }

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

}
