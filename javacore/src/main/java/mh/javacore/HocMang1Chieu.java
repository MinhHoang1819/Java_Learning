/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.Arrays;

/**
 *
 * @author salen
 */
public class HocMang1Chieu {
    public static void main(String[] args) {
        int M[] = new int[4];
        M[0] = 7;
        M[1] = 0;
        M[2] = 3;
        M[3] = 9;
        System.out.println("Mang cua ban la: ");
        for (int i=0; i<M.length; i++) {
            System.out.print(M[i]+"\t");
        }
        
        Arrays.sort(M);
        System.out.println("\nMang sau khi sap xep la: ");
        for (int i=0; i<M.length; i++) {
            System.out.print(M[i]+"\t");
        }
        
        System.out.println("\nCac so nguyen to la: ");
        for (int i=0; i<M.length; i++) {
            int dem=0;
            for (int j=1; j<=M[i]; j++) {
                if (M[i]%j == 0) {
                    dem++;
                }
            }
            
            if (dem == 2) {
                System.out.print(M[i]+"\t");
            }
        }
    }
}
