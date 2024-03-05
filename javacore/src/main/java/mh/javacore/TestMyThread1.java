/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestMyThread1 {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        th1.setName("Tien trinh 1");
        th1.start();    //kich hoat tien trinh (goi la tieu trinh)
        
        MyThread1 th2 = new MyThread1();
        th2.setName("Tien trinh 2");
        th2.start();
    }
}
