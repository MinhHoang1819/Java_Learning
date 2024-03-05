/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class MyThread2 implements Runnable{

    private int x=0;
    @Override
    public void run() {
       for (int i=0; i<5; i++) {
           System.out.println(Thread.currentThread().getName()+", i = "+i+"\n\tx = "+x);
           x++;
       }
    }
    
    public int getX() {
        return this.x;
    }
    
}
