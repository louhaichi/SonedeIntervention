package tn.sonede.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.entity.Equipe;
import tn.sonede.spring.interfaces.EquipeInterface;
import tn.sonede.spring.repository.EquipeRepository;

import java.util.List;

@Service
@Slf4j
public class EquipeService implements EquipeInterface {

    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        List<Equipe> EquipeList = equipeRepository.findAll();
        for(Equipe Equipe : EquipeList) {

        }
        return EquipeList;
    }

    @Override
    public Equipe addEquipe(Equipe s) {
        return equipeRepository.save(s);
    }

    @Override
    public Equipe updateEquipe(Equipe s) {
        return equipeRepository.save(s);
    }

    @Override
    public Equipe retrieveEquipe(Long id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void removeEquipe(Long id) {
        equipeRepository.deleteById(id);
    }
    
}
