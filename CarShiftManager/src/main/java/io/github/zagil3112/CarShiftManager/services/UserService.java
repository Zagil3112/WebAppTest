package io.github.zagil3112.CarShiftManager.services;

import io.github.zagil3112.CarShiftManager.model.User;
import io.github.zagil3112.CarShiftManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(User user){

        Optional<User> usuarioEncontrado = userRepository.findByUsername(user.getUsername());

        if (!usuarioEncontrado.isPresent()){
            return userRepository.save(user);
        }

        else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Usuario %s ya existe ", user.getUsername()));
        }


    }

}
