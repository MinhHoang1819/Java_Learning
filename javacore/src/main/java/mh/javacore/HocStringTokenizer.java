/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.StringTokenizer;

/**
 *
 * @author salen
 */
public class HocStringTokenizer {
    public static void main(String[] args) {
        String s = "hoc, hoc, hoc nua, ..., hoc mai";
        StringTokenizer token = new StringTokenizer(s);
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
        
        System.out.println("===================");
        StringTokenizer token2 = new StringTokenizer(s, ",");
        while (token2.hasMoreTokens()) {
            System.out.println(token2.nextToken());
        }
        
        StringTokenizer token3 = new StringTokenizer(s, ", ");
        System.out.println("====================");
        while (token3.hasMoreTokens()) {
            System.out.println(token3.nextToken());
        }
    }
}
