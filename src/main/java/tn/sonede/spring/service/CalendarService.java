package tn.sonede.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.sonede.spring.entity.Calendar;
import tn.sonede.spring.interfaces.CalendarInterface;
import tn.sonede.spring.repository.CalendarRepository;

import java.util.List;

@Service
@Slf4j
public class CalendarService implements CalendarInterface {


    @Autowired
    CalendarRepository calendarRepository;


    @Override
    public List<Calendar> retrieveAllCalendars() {
        List<Calendar> listCalendar = (List<Calendar>) calendarRepository.findAll();
        for(Calendar d : listCalendar) {
            //	System.out.println(D);
            log.info(d.toString());
        }
        return listCalendar;
    }

    @Override
    public Calendar addCalendar(Calendar d) {
        calendarRepository.save(d);
        return d;
    }


    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);

    }

    @Override
    public Calendar updateCalendar(Calendar d) {
        calendarRepository.save(d);
        return d;
    }
    @Override
    public Calendar retrieveCalendar(Long id) {
        return calendarRepository.findById(id).orElse(null);

    }

}
