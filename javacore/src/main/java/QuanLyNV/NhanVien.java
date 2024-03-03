/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNV;

/**
 *
 * @author salen
 */
public class NhanVien implements Comparable<NhanVien> {

    private int ma;
    private String ten;

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMa() {
        return ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public NhanVien(int ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
    }

    public NhanVien() {
        super();
    }

    @Override
    public int compareTo(NhanVien o) {
        //return this.ten.compareToIgnoreCase(o.getTen());
        int ssTen = this.ten.compareToIgnoreCase(o.getTen());
        if (ssTen == 0) {

            if (this.ma == o.ma) {
                return 0;
            }
            if (this.ma > o.ma) {
                return -1;
            }
            return 1;

        }
        
        return ssTen;
    }
}
