package dev.las.weaponsSouls.service;

import dev.las.weaponsSouls.model.WeaponModel;
import dev.las.weaponsSouls.repository.RepositoryWeapons;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponsService {
    private final RepositoryWeapons repo;

    public WeaponsService(RepositoryWeapons repo) {
        this.repo = repo;
    }

    public List<WeaponModel> getAll(){
        return repo.findAll();
    }

    public WeaponModel setWeapon(WeaponModel wepo){
        return repo.save(wepo);
    }
}
