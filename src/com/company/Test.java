package com.company;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaChi diachi1 = new DiaChi("194","Le Duc Tho","9","Go Vap");
        KhachHang khachHang1 = new KhachHang("Nguyen Van A",true);
        khachHang1.setDiachi(diachi1);
        TaiKhoan taikhoan1 = new TaiKhoan(111,khachHang1,10000000);
        System.out.println(taikhoan1.toString());
        System.out.println("Nhập số tiền gửi: ");
        taikhoan1.goiTien(sc.nextDouble());
        System.out.println(taikhoan1.toString());
        System.out.println("Mời Nhập số tiền rút");
        taikhoan1.rutTien(sc.nextDouble());
        System.out.println(taikhoan1.toString());
    }
}
