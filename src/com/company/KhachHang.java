package com.company;

public class KhachHang {
    private String hoTen;
    private DiaChi diachi;
    private boolean phaiNam;

    public KhachHang() {
    }

    public KhachHang(String hoTen, boolean phaiNam) {
        this.hoTen = hoTen;
        this.phaiNam = phaiNam;
    }

    public KhachHang(String hoTen, DiaChi diachi, boolean phaiNam) {
        if (hoTen == null){
            hoTen = "xxx";
        } else
        this.hoTen = hoTen;
        this.diachi = diachi;
        this.phaiNam = phaiNam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public DiaChi getDiachi() {
        return diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public boolean isPhaiNam() {
        return phaiNam;
    }

    public void setPhaiNam(boolean phaiNam) {
        this.phaiNam = phaiNam;
    }

}
