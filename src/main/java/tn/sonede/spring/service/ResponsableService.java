package tn.sonede.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.entity.Responsable;
import tn.sonede.spring.interfaces.ResponsableInterface;
import tn.sonede.spring.repository.ResponsableRepository;

import java.util.List;

@Service
@Slf4j
public class ResponsableService implements ResponsableInterface {

    @Autowired
    ResponsableRepository responsableRepository;

    @Override
    public List<Responsable> retrieveAllResponsables() {
        List<Responsable> ResponsableList = responsableRepository.findAll();
        for(Responsable Responsable : ResponsableList) {

        }
        return ResponsableList;
    }

    @Override
    public Responsable addResponsable(Responsable s) {
        return responsableRepository.save(s);
    }

    @Override
    public Responsable updateResponsable(Responsable s) {
        return responsableRepository.save(s);
    }

    @Override
    public Responsable retrieveResponsable(Long id) {
        return responsableRepository.findById(id).orElse(null);
    }

    @Override
    public void removeResponsable(Long id) {
        responsableRepository.deleteById(id);
    }
}
