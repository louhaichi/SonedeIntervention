package tn.sonede.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.Responsable;
import tn.sonede.spring.interfaces.ResponsableInterface;

import java.util.List;

@RestController
@RequestMapping("/responsable")
public class ResponsableController {

    @Autowired
    ResponsableInterface responsableInterface;

    // http://localhost:8089/SpringMVC/responsable/retrieve-all-responsables
    @GetMapping("/retrieve-all-responsables")
    @ResponseBody
    public List<Responsable> getResponsables() {
        List<Responsable> listresponsables = responsableInterface.retrieveAllResponsables();
        return listresponsables;
    }


    // http://localhost:8089/SpringMVC/responsable/retrieve-responsable/8
    @GetMapping("/retrieve-responsable/{responsable-id}")
    @ResponseBody
    public Responsable retrieveResponsable(@PathVariable("responsable-id") Long idResponsable) {
        return responsableInterface.retrieveResponsable(idResponsable);
    }

    // http://localhost:8089/SpringMVC/responsable/add-responsable
    @PostMapping("/add-responsable")
    @ResponseBody
    public Responsable addResponsable(@RequestBody Responsable s)
    {

        return responsableInterface.addResponsable(s);
    }



    // http://localhost:8089/SpringMVC/responsable/remove-responsable/{responsable-id}
    @DeleteMapping("/remove-responsable/{responsable-id}")
    @ResponseBody
    public void removeResponsable(@PathVariable("responsable-id") Long idResponsable) {
        responsableInterface.removeResponsable(idResponsable);
    }


    // http://localhost:8089/SpringMVC/responsable/modify-responsable
    @PutMapping("/modify-responsable")
    @ResponseBody
    public Responsable modifyResponsable(@RequestBody Responsable s) {
        return responsableInterface.updateResponsable(s);
    }


}
