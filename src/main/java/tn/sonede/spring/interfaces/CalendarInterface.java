package tn.sonede.spring.interfaces;

import tn.sonede.spring.entity.Calendar;

import java.util.List;

public interface CalendarInterface {

    List<Calendar> retrieveAllCalendars();

    Calendar addCalendar (Calendar c);

    void deleteCalendar (Long id);

    Calendar updateCalendar (Calendar c);
    Calendar retrieveCalendar (Long id);


}
