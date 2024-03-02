/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public abstract class NhanVien {
    private String ten;
    private String cmnd;
    public abstract int xuatLuong();

    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getCmnd() {
        return cmnd;
    }

    public NhanVien(String ten, String cmnd) {
        this.ten = ten;
        this.cmnd = cmnd;
    }

    public NhanVien() {
        super();
    }

    @Override
    public String toString() {
        return this.ten+"==>"+xuatLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
