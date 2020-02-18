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

    @Override
    public int calcularEdad(GregorianCalendar fechaNac){

        Calendar fechaActual = Calendar.getInstance();
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH)
        
if (months < 0 || (months==0 && days < 0)){

    years = years -1;

}

return years;

 



    }







}