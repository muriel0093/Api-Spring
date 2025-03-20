package dev.las.weaponsSouls.repository;

import dev.las.weaponsSouls.model.WeaponModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryWeapons extends JpaRepository<WeaponModel, Long> {
}
