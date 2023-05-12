package com.competition.numbers;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class FindDay {

    // Learn about format
    // Calendar
    // Date etc.

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        LocalDate day = LocalDate.of(2015,8,5);
        DayOfWeek dd = day.getDayOfWeek();
        //System.out.println(dd.getValue());
        //
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyy");
        //Date d =  sd.parse("5-8-2015");
        int i = 2015;
        int j = 2015;
        int k = 2015;
        String sp = String.valueOf(i)+"-"+String.valueOf(j)+"-"+String.valueOf(k);
        Date d = sd.parse(sp);

        sd.format(d);
        Format df = new SimpleDateFormat("EEEE");
        System.out.println(df.format(d).toUpperCase());
    }

}
