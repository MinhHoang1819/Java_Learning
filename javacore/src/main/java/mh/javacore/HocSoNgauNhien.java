/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.Random;

/**
 *
 * @author salen
 */
public class HocSoNgauNhien {
    public static void main(String[] args) {
        int []M = new int[10];
        Random rd = new Random();
        for (int i=0; i<M.length; i++) {
            M[i] = rd.nextInt(100);
        }
        
        System.out.println("Mang ngau nhien la: ");
        for (int i=0; i<M.length; i++) {
            System.out.print(M[i]+"\t");
        }
    }
}
