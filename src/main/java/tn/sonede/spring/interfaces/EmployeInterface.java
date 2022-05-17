package tn.sonede.spring.interfaces;

import tn.sonede.spring.entity.Employe;

import java.util.List;

public interface EmployeInterface {

    List<Employe> retrieveAllEmployes();

    Employe addEmploye(Employe e);

    Employe updateEmploye(Employe e);

    Employe retrieveEmploye(Long id);

    void removeEmploye(Long id);


    
}
