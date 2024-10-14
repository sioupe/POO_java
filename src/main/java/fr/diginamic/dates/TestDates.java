package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(s.format(date));
        Date date2 = new Date(116,04,19,23,59,30);
        System.out.println(s2.format(date2));
    }
}
