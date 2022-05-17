package tn.sonede.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.Employe;
import tn.sonede.spring.interfaces.EmployeInterface;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeController {

    @Autowired
    EmployeInterface employeInterface;

    // http://localhost:8089/SpringMVC/employe/retrieve-all-employes
    @GetMapping("/retrieve-all-employes")
    @ResponseBody
    public List<Employe> getEmployes() {
        List<Employe> listemployes = employeInterface.retrieveAllEmployes();
        return listemployes;
    }


    // http://localhost:8089/SpringMVC/employe/retrieve-employe/8
    @GetMapping("/retrieve-employe/{employe-id}")
    @ResponseBody
    public Employe retrieveEmploye(@PathVariable("employe-id") Long idEmploye) {
        return employeInterface.retrieveEmploye(idEmploye);
    }

    // http://localhost:8089/SpringMVC/employe/add-employe
    @PostMapping("/add-employe")
    @ResponseBody
    public Employe addEmploye(@RequestBody Employe e)
    {

        return employeInterface.addEmploye(e);
    }



    // http://localhost:8089/SpringMVC/employe/remove-employe/{employe-id}
    @DeleteMapping("/remove-employe/{employe-id}")
    @ResponseBody
    public void removeEmploye(@PathVariable("employe-id") Long idEmploye) {
        employeInterface.removeEmploye(idEmploye);
    }


    // http://localhost:8089/SpringMVC/employe/modify-employe
    @PutMapping("/modify-employe")
    @ResponseBody
    public Employe modifyEmploye(@RequestBody Employe e) {
        return employeInterface.updateEmploye(e);
    }

}
