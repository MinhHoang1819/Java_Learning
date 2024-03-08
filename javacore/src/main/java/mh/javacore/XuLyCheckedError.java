/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class XuLyCheckedError {
    public static void main(String[] args) {
        try {
            int x=1/0;
            
            System.out.println("Day la loi thuc thi (cu the la chia cho 0)");
        } catch (Exception e) {
            //xuat chi tiet loi de kiem tra
            e.printStackTrace();
        }
        
        System.out.println("Tam biet!");
    }
}
