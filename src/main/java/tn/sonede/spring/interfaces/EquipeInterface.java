package tn.sonede.spring.interfaces;


import tn.sonede.spring.entity.Equipe;

import java.util.List;

public interface EquipeInterface {

    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe(Equipe e);

    Equipe retrieveEquipe(Long id);

    void removeEquipe(Long id);

}
