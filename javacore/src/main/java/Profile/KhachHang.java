/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import java.io.Serializable;

/**
 *
 * @author salen
 */
public class KhachHang implements Serializable {

    private int ma;
    private String ten;
    private String phone;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public KhachHang(int ma, String ten, String phone) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.phone = phone;
    }

    public KhachHang() {
        super();
    }

    @Override
    public String toString() {
        return this.ma + "\t" + this.ten + "\t" + this.phone;
    }

}
