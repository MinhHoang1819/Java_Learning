/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_1;

import Model_1.KhachHang;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salen
 */
public class TestKhachHang {

    static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();

    public static void menu() {
        System.out.println("1. Nhap khach hang");
        System.out.println("2. Xuat khach hang");
        System.out.println("3. Tim kiem khach hang");
        System.out.println("4. Sap xep khach hang");
        System.out.println("5. Luu khach hang");
        System.out.println("6. Doc khach hang");
        System.out.println("7. Thong ke theo nha mang");
        System.out.println("8. Thoat");

        int chon = 0;

        System.out.println("Bn chon chuc nang[1...8]: ");

        chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                xuLyNhap();
                break;
            case 2:
                xuLyXuat();
                break;
            case 3:
                xuLyTim();
                break;
            case 4:
                xuLySapXep();
                break;
            case 5:
                xuLyLuu();
                break;
            case 6:
                xuLyDoc();
                break;
            case 7:
                xuLyThongKe();
                break;
            case 8:
                xuLyThoat();
                break;
            default:
                throw new AssertionError();
        }
    }

    private static void xuLyNhap() {
        KhachHang kh = new KhachHang();

        System.out.println("Moi ban nhap ma: ");
        int ma = new Scanner(System.in).nextInt();

        System.out.println("Moi ban nhap ten: ");
        String ten = new Scanner(System.in).nextLine();

        System.out.println("Moi ban nhap so dien thoai: ");
        String phone = new Scanner(System.in).nextLine();

        kh.setMa(ma);
        kh.setTen(ten);
        kh.setPhone(phone);

        dsKH.add(kh);
    }

    private static void xuLyXuat() {
        System.out.println("===================");

        System.out.println("Ma\tTen\tPhone");
        for (KhachHang kh : dsKH) {
            System.out.println(kh);
        }

        System.out.println("===================");
    }

    private static void xuLyTim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xuLySapXep() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xuLyLuu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xuLyDoc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xuLyThongKe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xuLyThoat() {
        System.out.println("Cam on ban da dung phan mem!");
        System.exit(0);
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

}
