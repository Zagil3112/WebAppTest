package io.github.zagil3112.CarShiftManager.repositories;

import io.github.zagil3112.CarShiftManager.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift,Long> {
}
