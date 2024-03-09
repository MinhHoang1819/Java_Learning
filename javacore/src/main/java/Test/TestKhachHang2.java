/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import File.SerializeFileFactory;
import File.TestFileFactory;
import Model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author salen
 */
public class TestKhachHang2 {

    public static void testluuFile() {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        dsKH.add(new KhachHang("KH01", "Nguyen Van A"));
        dsKH.add(new KhachHang("KH02", "Tran Van Binh"));
        dsKH.add(new KhachHang("KH03", "Ho Thi C"));
        dsKH.add(new KhachHang("KH04", "Hoang Ngoc D"));

        boolean kt = SerializeFileFactory.luuFile(dsKH, "D:\\dulieu2.txt");
        if (kt == true) {
            System.out.println("Da luu file thanh cong!");
        } else {
            System.out.println("Luu file that bai!");
        }
    }

    public static void main(String[] args) {
        //testluuFile();
        ArrayList<KhachHang> dsKH = SerializeFileFactory.docFile("D:\\dulieu2.txt");

        System.out.println("Danh sach khach hang dc them vao may la: ");
        System.out.println("Ma\nTen");
        for (KhachHang kh : dsKH) {
            System.out.println(kh);
        }
    }
}
