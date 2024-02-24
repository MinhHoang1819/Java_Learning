/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

import java.util.Scanner;

/**
 *
 * @author salen
 */
public class HocSwitch {
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tháng: ");
        thang = sc.nextInt();
        switch(thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng "+thang+" có 31 ngày");
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng "+thang+" có 30 ngày");
                break;
                
            case 2:
                System.out.print("Nếu nhuần thì tháng có 29 ngày, ngược lại");
                break;
            default:
                System.out.print("Bạn nhập lụi rồi.");
                break;
        }
    }
}
