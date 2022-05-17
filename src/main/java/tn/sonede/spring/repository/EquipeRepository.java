package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
