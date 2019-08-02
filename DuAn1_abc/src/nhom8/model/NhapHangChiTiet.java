/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom8.model;

/**
 *
 * @author COMPUTER
 */
public class NhapHangChiTiet {
    String maPN;
    String soKhung;
    double giaNhap;
    public NhapHangChiTiet()
    {}

    public NhapHangChiTiet(String maPN, String soKhung, double giaNhap) {
        this.maPN = maPN;
        this.soKhung = soKhung;
        this.giaNhap = giaNhap;
    }

    public String getMaPN() {
        return maPN;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    

    
    
}
