package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
