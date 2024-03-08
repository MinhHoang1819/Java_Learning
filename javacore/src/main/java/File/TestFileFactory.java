/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import Model.KhachHang;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author salen
 */
public class TestFileFactory {

    public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) throws IOException {
        try {
            
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (KhachHang kh : dsKH) {
                String line = kh.getMa()+"; "+kh.getTen();
                bw.write(line);
                bw.newLine();
            }
            
            bw.close();
            osw.close();
            fos.close();
            
            return true;
            
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
        }

        return false;

    }
}
