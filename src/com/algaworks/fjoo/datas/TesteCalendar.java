package com.algaworks.fjoo.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();

        c.set(Calendar.DAY_OF_MONTH, 31);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.YEAR, 2021);
        c.set(Calendar.HOUR_OF_DAY,10);
        c.set(Calendar.MINUTE,30);
        c.set(Calendar.SECOND,00);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(formatador.format(c.getTime()));

        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(formatador.format(c.getTime()));

        c.add(Calendar.DAY_OF_MONTH, -1);
        c.add(Calendar.MONTH, -1);
        System.out.println(formatador.format(c.getTime()));

        //roll s� mexe o dia, ignorando o pr�ximo m�s
        c.roll(Calendar.DAY_OF_MONTH, 2);
        System.out.println(formatador.format(c.getTime()));
    }


}
