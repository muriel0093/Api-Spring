package dev.las.weaponsSouls.controller;

import dev.las.weaponsSouls.model.WeaponModel;
import dev.las.weaponsSouls.service.WeaponsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class Controller {

    private final WeaponsService wepoS;

    public Controller(WeaponsService wepoS) {
        this.wepoS = wepoS;
    }

    @GetMapping("/Weapons/getWeapons")
    public List<WeaponModel> getAll(){
        return wepoS.getAll();
    }

    @PostMapping("/Weapons/creatWeapons")
    public WeaponModel save(@RequestBody WeaponModel wepo){return wepoS.setWeapon(wepo);}

}
