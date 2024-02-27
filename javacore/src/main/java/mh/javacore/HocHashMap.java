/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.HashMap;

/**
 *
 * @author salen
 */
public class HocHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> ds = new HashMap<Integer, String>();
        ds.put(113, "Nguyen Van Teo, Que o Truong Sa");
        ds.put(114, "Tran Thi Met, Que o Hoang Sa");
        ds.put(115, "Nguyen Van Tun, Que o Ca Mau");
        
        String nv = ds.get(114);
        
        System.out.println(nv);
        System.out.println("Nhan vien cua toan bo cong ty: ");
        for (String ten : ds.values()) {
            System.out.println(ten);
        }
        
        ds.remove(115);
        System.out.println("Nhan vien sau khi xoa: ");
        for (String ten : ds.values()) {
            System.out.println(ten);
        }
    }
}
