/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.text.DecimalFormat;

/**
 *
 * @author salen
 */
public class HocXuLyDinhDang {
    public static void main(String[] args) {
        double toan=5;
        double ly=6;
        double hoa=9;
        double dtb=(toan+ly+hoa)/3;
        System.out.println("Diem trung binh = "+dtb);
        
        DecimalFormat dcf = new DecimalFormat("#.##");
        System.out.println("Diem trung binh = "+dcf.format(dtb));
    }
}
