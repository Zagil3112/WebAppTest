package io.github.zagil3112.CarShiftManager.services;

import io.github.zagil3112.CarShiftManager.model.User;
import io.github.zagil3112.CarShiftManager.repositories.UserRepository;
import io.github.zagil3112.CarShiftManager.util.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional= userRepository.findByUsername(username);

        return userOptional.orElseThrow(() -> new UsernameNotFoundException("Invalid credentials"));

    }
}
