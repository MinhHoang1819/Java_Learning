/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_1;

import File_1.SerializeFileFactory;
import Model_1.KhachHang;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        String phone = "090";

        System.out.println("===================");
        System.out.println("Khach hang co dau so 090: ");
        System.out.println("Ma\tTen\tPhone");

        for (KhachHang kh : dsKH) {
            if (kh.getPhone().startsWith(phone)) {
                System.out.println(kh);
            }

        }

        System.out.println("===================");
    }

    private static void xuLySapXep() {
        Collections.sort(dsKH);

        System.out.println("Da sap xep so dien thoai.");
    }

    private static void xuLyLuu() {
        boolean kt = new SerializeFileFactory.luuFile(dsKH, "D:\\dulieukhachhang.db");
        if (kt == true) {
            System.out.println("Da luu file thanh cong!");
        } else {
            System.out.println("Da luu file that bai!");
        }
    }

    private static void xuLyDoc() {
        dsKH = SerializeFileFactory.docFile("D:\\dulieukhachhang.db");
        System.out.println("Da doc file thanh cong!");
    }

    private static void xuLyThongKe() {
        int n = 0;
        for (KhachHang kh : dsKH) {
            if (kh.getPhone().startsWith("098")) {
                n++;
            }

        }

        System.out.println("Co" + n + "khach hang Viettel.");
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
