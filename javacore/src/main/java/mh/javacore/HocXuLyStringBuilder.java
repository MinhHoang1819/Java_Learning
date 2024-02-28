/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class HocXuLyStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<100; i++) {
            builder.append("Phan tu thu "+i);
            builder.append("\n");
        }
        
        System.out.println(builder.toString());
    }
}
