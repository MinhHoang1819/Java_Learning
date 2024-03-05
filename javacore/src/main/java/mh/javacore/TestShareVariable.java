/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestShareVariable {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread th1 = new Thread(mt);
        th1.setName("[TT 1]");
        th1.start();
        
        Thread th2 = new Thread(mt);
        th2.setName("[TT 2]");
        th2.start();
        
        Thread th3 = new Thread(mt);
        th3.setName("[TT 3]");
        th3.start();
        
        System.out.println("x hien tai lay ra: "+mt.getX());
    }
}
