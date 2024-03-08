/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import mh.javacore.KhachHang;

/**
 *
 * @author salen
 */
public class TestFileFactory {

    public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new FileWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (KhachHang kh : dsKH) {
                String line = kh.getMa() + "; " + kh.getTen();
                bw.write(line);
                bw.newLine();
            }

            bw.close();
            osw.close();
            fos.close();    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (false);
    }
}
