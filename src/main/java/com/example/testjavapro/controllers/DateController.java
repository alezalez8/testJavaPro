package com.example.testjavapro.controllers;

import com.example.testjavapro.service.DateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class DateController {

    private final DateService dateService;



    public DateController(DateService dateService) {
        this.dateService = dateService;
    }


    @PostMapping("/")
    public String dayToNewYear(@RequestBody String date) throws ParseException {
        return "До нового года осталось: " + dateService.getDays(date);
    }
}
