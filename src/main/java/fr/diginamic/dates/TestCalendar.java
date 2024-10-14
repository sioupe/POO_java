package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        calendar.set(2016,4,19,23,59,30);
        Date date = calendar.getTime();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(s.format(date));
    }
}
