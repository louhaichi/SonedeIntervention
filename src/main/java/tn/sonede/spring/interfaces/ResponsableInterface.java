package tn.sonede.spring.interfaces;
import  tn.sonede.spring.entity.Responsable;


import java.util.List;

public interface ResponsableInterface {

    List<Responsable> retrieveAllResponsables();

    Responsable addResponsable(Responsable r);

    Responsable updateResponsable(Responsable r);

    Responsable retrieveResponsable(Long id);

    void removeResponsable(Long id);
}
