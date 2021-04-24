package com.company;

import java.text.DecimalFormat;

public class TaiKhoan {
    private int soTK;
    private KhachHang khachHang;
    private double sodu;

    public TaiKhoan() {
    }

    public TaiKhoan(int soTK, KhachHang khachHang, double sodu) {
        if (soTK >=0)
        this.soTK = soTK;
        this.khachHang = khachHang;
        if (sodu >=1000000)
        this.sodu = sodu;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }
    public boolean goiTien(double amount){
        if (amount >0){
            this.sodu = this.sodu + amount;
            System.out.println("Giao Dịch Thành Công, TK sau khi gởi tiền là: ");
            return true;
        } else
            return false;
    }
    public boolean rutTien(double amount){
        if (amount>0 && amount <sodu){
            this.sodu = this.sodu - amount;
            System.out.println("Giao Dịch Thành Công, TK sau khi rút tiền là: ");
            return true;
        }
        else
            System.out.println("Số tiền rút > Số tiền trong TK hoặc Số tiền rút <0");
            return false;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###,###.## VND");
        String stringbalance = df.format(getSodu()) ;
        return "Mr" + getKhachHang().getHoTen()+ "\t"+
                "("+  getKhachHang().getDiachi()+ "\t"+
                "[ SoTK= "+ soTK + "\t"+
                "Số dư hiện tại: " + stringbalance +
                '}';
    }
}
