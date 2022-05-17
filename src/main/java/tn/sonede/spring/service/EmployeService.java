package tn.sonede.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.interfaces.EmployeInterface;
import tn.sonede.spring.entity.Employe;

import tn.sonede.spring.interfaces.EmployeInterface;
import tn.sonede.spring.repository.EmployeRepository;
import java.util.List;

@Service
@Slf4j
public class EmployeService implements EmployeInterface {


    @Autowired
    EmployeRepository employeRepository;
    
    @Override
    public List<Employe> retrieveAllEmployes() {
        List<Employe> EmployeList = employeRepository.findAll();
        for(Employe Employe : EmployeList) {

        }
        return EmployeList;
    }

    @Override
    public Employe addEmploye(Employe s) {
        return employeRepository.save(s);
    }

    @Override
    public Employe updateEmploye(Employe s) {
        return employeRepository.save(s);
    }

    @Override
    public Employe retrieveEmploye(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public void removeEmploye(Long id) {
        employeRepository.deleteById(id);
    }
    
}
