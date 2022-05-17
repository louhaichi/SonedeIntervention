package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.Intervention;

@Repository
public interface InterventionRepository extends JpaRepository<Intervention, Long> {
}
