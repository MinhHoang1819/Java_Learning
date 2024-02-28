/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class HocXuLyToanHoc {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("Can bac 2 cua 25 la: "+Math.sqrt(n));
        
        int x = 8;
        int y = 3;
        System.out.println(x+"^"+y+" = "+Math.pow(x, y));
        
        int k = -113;
        System.out.println("|"+k+"| = "+Math.abs(k));
        
        int bk = 5;
        double cv = 2*Math.PI*bk;
        double dt = Math.PI*Math.pow(bk, 2);
        System.out.println("C = "+cv+"; S = "+dt);
        
        int goc = 30;
        double rad = Math.PI*goc/180;
        System.out.println("sin("+goc+") = "+Math.sin(rad));
        System.out.println("cos("+goc+") = "+Math.cos(rad));
        System.out.println("tan("+goc+") = "+Math.tan(rad));
        System.out.println("cotan("+goc+") = "+Math.cos(rad)/Math.sin(rad));
        System.out.println("cotan("+goc+") = "+1/Math.tan(rad));
    }
}
