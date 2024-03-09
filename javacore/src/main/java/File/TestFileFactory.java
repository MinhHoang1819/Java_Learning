/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import Model.KhachHang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
                String line = kh.getMa() + "; " + kh.getTen();
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

    public static ArrayList<KhachHang> docFile(String path) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            String line = br.readLine();
            while (line != null) {
                String []arr = line.split(";");
                if (arr.length == 2) {
                    KhachHang kh = new KhachHang(arr[0], arr[1]);
                    dsKH.add(kh);
                }
                
                line = br.readLine();
            }
            
            br.close();
            isr.close();
            fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsKH;
    }
}
