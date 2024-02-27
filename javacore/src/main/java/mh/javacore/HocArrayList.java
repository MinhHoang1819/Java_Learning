/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.ArrayList;

/**
 *
 * @author salen
 */
public class HocArrayList {
    public static void main(String[] args) {
        ArrayList ds = new ArrayList();
        ds.add("x");
        ds.add(9+"");
        
        ArrayList ds2 = new ArrayList();
        ds2.add("1.5");
        
        ArrayList ds3 = new ArrayList();
        ds3.add("An");
        ds3.add("Binh");
        ds3.add("Giai");
        ds3.add("Thoat");
        
        for (int i=0; i<ds3.size(); i++) {
            String x = ds3.get(i)+"";
            System.out.println(x);
        }
        
        System.out.println("================");
        for (Object data : ds3) {
            System.out.println(data);
        }
        
        ArrayList<Double> ds4 = new ArrayList<Double>();
        for (int i=0; i<10; i++) {
            ds4.add(i*2.0);
        }
        
        System.out.println("Gia tri cua ds4 la: ");
        for (double x : ds4) {
            System.out.println(x);
        }
        
        ArrayList<Float> ds5 = new ArrayList<Float>();
        ds5.add(1.5f);
        ds5.add(1.8f);
        System.out.println("So phan tu cua ds5 la: "+ds5.size());
        
        ds5.add(113.114f);
        System.out.println("So phan tu cau ds5 la: "+ds5.size());
        
        ds5.remove(1.5f);
        System.out.println("So phan tu cua ds5 la: "+ds5.size());
        
        System.out.println("Cac phan tu trong ArrayList ds5 la: ");
        for (float x : ds5) {
            System.out.println(x);
        }
        
        ds5.set(0, 78.99f);
        System.out.println("Cac phan tu trong ArrayList sau khi sua doi: ");
        for (float x : ds5) {
            System.out.println(x);
        }
    }
}
