package com.company;

public class DiaChi {
    private String soNha;
    private String duong;
    private String phuong;
    private String quan;

    public DiaChi() {
    }

    public DiaChi(String soNha, String duong, String phuong, String quan) {
        if (soNha == null){
            soNha = "xxx";
        } else
        this.soNha = soNha;
        if (duong == null){
            duong ="xxx";
        }
        this.duong = duong;
        if (phuong == null){
            phuong ="xxx";
        }
        this.phuong = phuong;
        if (quan == null){
            quan = "xxx";
        }
        this.quan = quan;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    @Override
    public String toString() {
        return soNha +", " +duong+ ", "+phuong + ", "+quan +" )";
    }
}
