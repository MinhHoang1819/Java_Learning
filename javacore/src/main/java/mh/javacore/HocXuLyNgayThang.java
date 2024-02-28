/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author salen
 */
public class HocXuLyNgayThang {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int nam = cal.get(Calendar.YEAR);
        System.out.println("Nam nay la nam: "+nam);
        
        int thang = cal.get(Calendar.MONTH);
        System.out.println("Hom nay la thang: "+(thang+1));
        
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hom nay la ngay: "+ngay);
        
        Date t = cal.getTime();
        //26/2/2016
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //d(day): ngay
        //M(Month): thang
        //y(year): nam
        System.out.println("Hom nay: "+sdf.format(t));
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/yyyy");
        System.err.println("Hom nay: "+sdf2.format(t));
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Hom nay: "+sdf3.format(t));
        
        SimpleDateFormat sdf4 = new SimpleDateFormat("hh:mm:ss aaa");
        System.out.println("Bay gio la: "+sdf4.format(t));
    }
}
