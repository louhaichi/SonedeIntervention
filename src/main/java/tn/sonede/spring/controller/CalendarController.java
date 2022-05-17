package tn.sonede.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.sonede.spring.entity.Calendar;
import tn.sonede.spring.interfaces.CalendarInterface;
import tn.sonede.spring.interfaces.InterventionInterface;

import java.util.List;

@CrossOrigin("*")
@Validated
@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    CalendarInterface calendarInterface;

    // http://localhost:8089/SpringMVC/demenagement/
    @GetMapping("/retrieve-all-calendar")
    @ResponseBody
    public List<Calendar> getCalendar() {
        List<Calendar> list = calendarInterface.retrieveAllCalendars();

        return list;
    }

    // http://localhost:8089/SpringMVC/demenagement/retrieve-demenagement/8
    @GetMapping("/retrieve-calendar/{calendar-id}")
    @ResponseBody
    public Calendar retrieveCalendar(@PathVariable("calendar-id") Long calendarId) {
        //return calendarInterface.retrieveCalendar(calendarId);
        return calendarInterface.retrieveCalendar(calendarId);
    }

    // http://localhost:8089/SpringMVC/demenagement/add-demenagement
    @PostMapping("/add-calendar")
    @ResponseBody
    public Calendar addCalendar(@RequestBody Calendar d) {
        Calendar calendar = calendarInterface.addCalendar(d);
        return calendar;
    }

    // http://localhost:8089/SpringMVC/demenagement/remove-demenagement/{demenagement-id}
    @DeleteMapping("/remove-calendar/{calendar-id}")
    @ResponseBody
    public void removeCalendar(@PathVariable("calendar-id") Long calendarId) {
        calendarInterface.deleteCalendar(calendarId);
    }

    // http://localhost:8089/SpringMVC/demenagement/modify-demenagement
    @PutMapping("/modify-calendar")
    @ResponseBody
    public Calendar modifyDemenagement(@RequestBody Calendar calendar) {
        return calendarInterface.updateCalendar(calendar);
    }


}
