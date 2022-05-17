package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.Intervention;
import tn.sonede.spring.entity.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {
}
