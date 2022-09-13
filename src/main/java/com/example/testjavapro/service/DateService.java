package com.example.testjavapro.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class DateService {

    public  int getDays(String date) throws ParseException {


        Calendar userDate = new GregorianCalendar();
        Calendar newYear = new GregorianCalendar();


        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date userDat = sdf.parse(date);
        userDate.setTime(userDat);

        int currentYear = userDate.get(Calendar.YEAR) + 1;
        newYear.set(currentYear, Calendar.JANUARY,0);

        return daysBetween(newYear.getTime(), userDate.getTime());
    }

    public int daysBetween(Date newYear, Date userDate){
        return (int)( (newYear.getTime() - userDate.getTime()) / (1000 * 60 * 60 * 24));
    }

}
