package br.com.abc.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;


//datas moedas localizacao -> 5 Classes: NumberFormat, Locale, Calendar, Date, DateFormat
public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime()+ 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("domingo eh o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);
        c.roll(Calendar.MONTH, 11);
        Date date2 = c.getTime();
        System.out.println(date2);
    }
}
