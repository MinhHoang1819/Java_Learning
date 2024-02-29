/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestTamGiac {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(4, 5, 6);
        System.out.println(tg1);
        
        TamGiac tg2 = new TamGiac(1, 2, 3);
        System.out.println(tg2);
        
        System.out.println("Dien tich tam giac 1 = "+tg1.dienTich());
        System.out.println("Dien tich tam giac 2 = "+tg2.dienTich());
    }
}
