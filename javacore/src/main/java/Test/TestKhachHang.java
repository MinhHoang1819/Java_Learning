/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import File.TestFileFactory;
import java.util.ArrayList;
import Model.KhachHang;
import java.io.IOException;

/**
 *
 * @author salen
 */
public class TestKhachHang {

    public static void luuFile(String[] args) throws IOException {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        dsKH.add(new KhachHang("KH01", "Nguyen Van A"));
        dsKH.add(new KhachHang("KH02", "Tran Van Binh"));
        dsKH.add(new KhachHang("KH03", "Ho Thi C"));
        dsKH.add(new KhachHang("KH04", "Hoang Ngoc D"));
        
        boolean kt = TestFileFactory.luuFile(dsKH, "D:\\dulieu.txt");
        if (kt == true) {
            System.out.println("Da luu file thanh cong!");
        } else {
            System.out.println("Luu file that bai!");
        }
    }

    public static void main(String[] args) {

    }
}
