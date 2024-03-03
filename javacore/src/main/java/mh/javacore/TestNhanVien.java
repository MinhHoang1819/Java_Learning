/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien teo = new NhanVienChinhThuc();
        teo.setTen("Nguyen Van Teo");
        System.out.println(teo);
        
        NhanVienChinhThuc ty = new NhanVienChinhThuc();
        ty.setTen("Tran Thi Ty");
        System.out.println(ty);
        
        teo = new NhanVienThoiVu();
        teo.setTen("Nguyen Van Teo");
        System.out.println(teo);
    }
}
