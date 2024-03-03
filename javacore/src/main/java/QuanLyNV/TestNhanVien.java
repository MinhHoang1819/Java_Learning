/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author salen
 */
public class TestNhanVien {

    public static void main(String[] args) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        ds.add(new NhanVien(1, "Teo"));
        ds.add(new NhanVien(2, "An"));
        ds.add(new NhanVien(3, "Hong"));
        ds.add(new NhanVien(4, "Binh"));
        ds.add(new NhanVien(5, "Tinh"));
        
        System.out.println("Danh sach nhan vien cua cong ty:");
        for (NhanVien nv : ds) {
            System.out.println(nv.getMa()+" "+nv.getTen());
        }
        
        Collections.sort(ds);
        
        System.out.println("Danh sach nhan vien da sort cua cong ty:");
        for (NhanVien nv : ds) {
            System.out.println(nv.getMa()+" "+nv.getTen());
        }
        
    }
}
