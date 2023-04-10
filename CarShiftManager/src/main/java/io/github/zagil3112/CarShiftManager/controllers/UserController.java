package io.github.zagil3112.CarShiftManager.controllers;

import io.github.zagil3112.CarShiftManager.model.User;
import io.github.zagil3112.CarShiftManager.repositories.UserRepository;
import io.github.zagil3112.CarShiftManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;
/*
    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }*/

    @GetMapping()
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user)  {
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }


}