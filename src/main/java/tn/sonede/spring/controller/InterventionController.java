package tn.sonede.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.Intervention;
import tn.sonede.spring.interfaces.InterventionInterface;

import java.util.List;

@RestController
@RequestMapping("/intervention")
public class InterventionController {

    @Autowired
    InterventionInterface interventionInterface;

    // http://localhost:8089/SpringMVC/intervention/retrieve-all-interventions
    @GetMapping("/retrieve-all-interventions")
    @ResponseBody
    public List<Intervention> getInterventions() {
        List<Intervention> listinterventions = interventionInterface.retrieveAllInterventions();
        return listinterventions;
    }


    // http://localhost:8089/SpringMVC/intervention/retrieve-intervention/8
    @GetMapping("/retrieve-intervention/{intervention-id}")
    @ResponseBody
    public Intervention retrieveIntervention(@PathVariable("intervention-id") Long idIntervention) {
        return interventionInterface.retrieveIntervention(idIntervention);
    }

    // http://localhost:8089/SpringMVC/intervention/add-intervention
    @PostMapping("/add-intervention")
    @ResponseBody
    public Intervention addIntervention(@RequestBody Intervention s)
    {

        return interventionInterface.addIntervention(s);
    }



    // http://localhost:8089/SpringMVC/intervention/remove-intervention/{intervention-id}
    @DeleteMapping("/remove-intervention/{intervention-id}")
    @ResponseBody
    public void removeIntervention(@PathVariable("intervention-id") Long idIntervention) {
        interventionInterface.removeIntervention(idIntervention);
    }


    // http://localhost:8089/SpringMVC/intervention/modify-intervention
    @PutMapping("/modify-intervention")
    @ResponseBody
    public Intervention modifyIntervention(@RequestBody Intervention s) {
        return interventionInterface.updateIntervention(s);
    }

}
