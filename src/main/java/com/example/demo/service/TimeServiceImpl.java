package com.example.demo.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class TimeServiceImpl implements TimeService {

    Calendar c;

    @Override
    public String time() {

        GregorianCalendar time = new GregorianCalendar();

        time.getTime().toString();

        return "la fecha de hoy es " + time;

    }

    public TimeServiceImpl() {
        c = new GregorianCalendar();
    }

}