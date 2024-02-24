/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class HocDoWhile {
    public static void main(String[] args) {
        int n=1;
        int i=1;
        do {
            n*=i;
            i++;
            if (i>5)
                break;
        }while(true);
        
        System.out.print(i);
    }
}
