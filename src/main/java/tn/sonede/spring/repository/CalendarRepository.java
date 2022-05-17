package tn.sonede.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sonede.spring.entity.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
