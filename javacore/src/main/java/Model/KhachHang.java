/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author salen
 */
public class KhachHang {
    private String ma;
    private String ten;

    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public KhachHang(String ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
    }

    public KhachHang() {
        super();
    }
    
    @Override
    public String toString() {
        return this.ma+"\t"+this.ten; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
