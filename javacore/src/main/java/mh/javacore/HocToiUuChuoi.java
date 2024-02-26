/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class HocToiUuChuoi {
    public static void main(String[] args) {
        String s = "  Nguyen    Van   Teo  ";
        System.out.println(s);
        //s = "Nguyen Van Teo
        s = s.trim();
        String []arr = s.split(" ");
        String sToiUu = "";
        for (String tu : arr) {
            sToiUu += tu + " ";
        }
        
        sToiUu = sToiUu.trim();
        System.out.println(sToiUu);
    }
}
