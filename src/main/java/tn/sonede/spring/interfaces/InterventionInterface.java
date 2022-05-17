package tn.sonede.spring.interfaces;


import tn.sonede.spring.entity.Intervention;

import java.util.List;

public interface InterventionInterface {

    List<Intervention> retrieveAllInterventions();

    Intervention addIntervention(Intervention i);

    Intervention updateIntervention(Intervention i);

    Intervention retrieveIntervention(Long id);

    void removeIntervention(Long id);

}
