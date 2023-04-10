package io.github.zagil3112.CarShiftManager.config;

import io.github.zagil3112.CarShiftManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtFilter {

    @Autowired
    private UserRepository userRepository;



}
