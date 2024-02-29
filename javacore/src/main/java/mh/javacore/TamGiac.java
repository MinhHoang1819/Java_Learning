/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mh.javacore;

/**
 *
 * @author salen
 */
public class TamGiac {
    private int canhA;
    private int canhB;
    private int canhC;
    private int camhC;

    public int getCanhA() {
        return canhA;
    }
    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }
    
    public int getCanhB() {
        return canhB;
    }
    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }
    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    public TamGiac(int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }    

    @Override
    public String toString() {
        String s =  "Tam giac [Canh = "+canhA+", canhB = "+canhB+", canhC = "+canhC+"]"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (kiemTraHopLe() == false) {
            return s+" ==> Tam giac ko dung!";
        } else {
            return s+"\nChu Vi = "+chuVi()+"; Dien tich = "+dienTich();
        }
    }
    
    private boolean kiemTraHopLe() {
        boolean kt = this.canhA > 0 && this.canhB > 0 && this.camhC > 0 &&
                (this.canhA+this.canhB) > this.canhC &&
                (this.canhA+this.canhC) > this.canhB &&
                (this.canhB+this.canhC) > this.canhA;
        return kt;
        
    }
    
    public double chuVi() {
        return this.canhA+this.canhB+this.canhC;
    }
    
    public double dienTich() {
        double p = chuVi();
        double dt = Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
        return dt;
    }
}
