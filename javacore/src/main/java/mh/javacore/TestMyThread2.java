/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestMyThread2 {
    public static void main(String[] args) {
        Thread th3 = new Thread(new MyThread2());
        th3.setName("Tien trinh 3");
        th3.start();
        
        Thread th4 = new Thread(new MyThread2());
        th4.setName("Tien trinh 4");
        th4.start();
    }
}
