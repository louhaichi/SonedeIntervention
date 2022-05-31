package tn.sonede.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.Equipe;
import tn.sonede.spring.interfaces.EquipeInterface;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    EquipeInterface equipeInterface;

    // http://localhost:8089/SpringMVC/equipe/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    @ResponseBody
    public List<Equipe> getEquipes() {
        List<Equipe> listequipes = equipeInterface.retrieveAllEquipes();
        return listequipes;
    }


    // http://localhost:8089/SpringMVC/equipe/retrieve-equipe/8
    @GetMapping("/retrieve-equipe/{equipe-id}")
    @ResponseBody
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long idEquipe) {
        return equipeInterface.retrieveEquipe(idEquipe);
    }

    // http://localhost:8089/SpringMVC/equipe/add-equipe
    @PostMapping("/add-equipe")
    @ResponseBody
    public Equipe addEquipe(@RequestBody Equipe e)
    {

        return equipeInterface.addEquipe(e);
    }



    // http://localhost:8089/SpringMVC/equipe/remove-equipe/{equipe-id}
    @DeleteMapping("/remove-equipe/{equipe-id}")
    @ResponseBody
    public void removeEquipe(@PathVariable("equipe-id") Long idEquipe) {
        equipeInterface.removeEquipe(idEquipe);
    }


    // http://localhost:8089/SpringMVC/equipe/modify-equipe
    @PutMapping("/modify-equipe")
    @ResponseBody
    public Equipe modifyEquipe(@RequestBody Equipe e) {
        return equipeInterface.updateEquipe(e);
    }

}
