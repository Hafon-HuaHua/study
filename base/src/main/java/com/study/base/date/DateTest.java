package com.study.base.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //1.5000 2.12500 3.20000 4.26500 5.34000 6.41500
        String dateStr = "2021-01-25 11:30:27";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime pre = LocalDateTime.parse(dateStr,formatter);
        //LocalDateTime pre = now.minusHours(48);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse(dateStr);
        LocalDateTime l1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(l1);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(l1,now);
        long differ = duration.toHours();
        System.out.println(differ >= 48);
    }
}
