package io.github.zagil3112.CarShiftManager.repositories;

import io.github.zagil3112.CarShiftManager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long>{

    public Optional<User> findByUsername(String name);

}
