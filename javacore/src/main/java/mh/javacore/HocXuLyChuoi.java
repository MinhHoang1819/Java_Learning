/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class HocXuLyChuoi {
    public static void main(String[] args) {
        String s = "5 Topica Education 3";
        System.out.print("Chieu dai chuoi la: "+s.length());
        
        //Dem xem chuoi co boa nhieu ki tu in hoa, in thuong, so.
        char []arr = s.toCharArray();
        int soInHoa = 0;
        int soInThuong = 0;
        int soChuSo = 0;
        for (int i=0; i<arr.length; i++) {
            char c = arr[i];
            if (Character.isUpperCase(c)) {
                soInHoa++;
            }
            if (Character.isLowerCase(c)) {
                soInThuong++;
            }
            if (Character.isDigit(c)) {
                soChuSo++;
            }
        }
        
        System.out.print("\nChuoi co "+soInHoa+" ky tu in hoa.");
        System.out.print("\nChuoi co "+soInThuong+" ky tu in thuong.");
        System.out.print("\nChuoi co "+soChuSo+" chu so.");
        
        String b1 = "D:/music/nhactrinh/riengmotgoctroi.mp3";
        int vtcuoi = b1.lastIndexOf("/");
        String tenBH = b1.substring(vtcuoi+1);
        System.out.print("\nTen bai hat: "+tenBH);
        
        int vtCuoiDauCham = b1.lastIndexOf(".");
        tenBH = b1.substring(vtcuoi+1, vtCuoiDauCham);
        System.out.print("\nTen bai hat khong co duoi: "+tenBH);
    }
}
