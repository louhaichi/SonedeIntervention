package tn.sonede.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.entity.Intervention;
import tn.sonede.spring.interfaces.InterventionInterface;
import tn.sonede.spring.repository.InterventionRepository;

import java.util.List;

@Service
@Slf4j
public class InterventionService implements InterventionInterface {

    @Autowired
    InterventionRepository interventionRepository;

    @Override
    public List<Intervention> retrieveAllInterventions() {
        List<Intervention> InterventionList = interventionRepository.findAll();
        for(Intervention Intervention : InterventionList) {

        }
        return InterventionList;
    }

    @Override
    public Intervention addIntervention(Intervention s) {
        return interventionRepository.save(s);
    }

    @Override
    public Intervention updateIntervention(Intervention s) {
        return interventionRepository.save(s);
    }

    @Override
    public Intervention retrieveIntervention(Long id) {
        return interventionRepository.findById(id).orElse(null);
    }

    @Override
    public void removeIntervention(Long id) {
        interventionRepository.deleteById(id);
    }
}
