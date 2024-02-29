/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TestKhachHang {
    public static void main(String[] args) {
        KhachHang teo = new KhachHang();
        teo.setMa("NV1");
        teo.setTen("Tran Van Teo");
        teo.setTuoi(30);
        teo.setDiaChi("Ca Mau");
        
        System.out.println(teo);
        System.out.println("Lay dia chi: "+teo.getDiaChi());
        
        KhachHang ty = new KhachHang();
        ty.setTen("Ho Thi Ty");
        
        System.out.println("Ten cua Teo: "+teo.getTen());
        System.out.println("Ten cua Ty: "+ty.getTen());
        
        teo = ty;
        teo.setTen("Ho Van Do");
        System.out.println("Ten cua Ty: "+ty.getTen());
        
        System.out.println("x = "+teo.layThongTin());
        KhachHang an = new KhachHang();
        an.doiThongTinCuaX(100);
        
        System.out.println("x = "+teo.layThongTin());
        
        KhachHang binh = new KhachHang();
        System.out.println("x cua binh la: "+binh.layThongTin());
    }
    
}
