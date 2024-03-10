/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_1;

import Model.KhachHang;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author salen
 */
public class SerializeFileFactory {

    public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsKH);
            oos.close();
            fos.close();

            return true;
        } catch (Exception e) {
        }

        return false;
    }

    public static ArrayList<KhachHang> docFile(String path) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            dsKH = (ArrayList<KhachHang>) data;
            ois.close();
            fis.close();
        } catch (Exception e) {
        }

        return dsKH;
    }
}
