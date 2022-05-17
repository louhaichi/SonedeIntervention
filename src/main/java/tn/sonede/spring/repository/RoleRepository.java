package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.ERole;
import tn.sonede.spring.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}