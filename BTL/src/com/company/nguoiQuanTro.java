package com.company;

import java.util.Scanner;

public class nguoiQuanTro extends nguoi {
    private String gioiTinh,soThich,maNV;

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public nguoiQuanTro() {
    }

    public nguoiQuanTro(String gioiTinh, String soThich, String maNV) {
        this.gioiTinh = gioiTinh;
        this.soThich = soThich;
        this.maNV = maNV;
    }

    public nguoiQuanTro(String ten, String diaChi, int tuoi, String gioiTinh, String soThich, String maNV) {
        super(ten, diaChi, tuoi);
        this.gioiTinh = gioiTinh;
        this.soThich = soThich;
        this.maNV = maNV;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("gioi tinh : ");
        gioiTinh = sc.nextLine();
        System.out.println("so thich : ");
        soThich = sc.nextLine();
        System.out.println("ma nhan vien : ");
        maNV = sc.nextLine();
    }

    @Override
    public String toString() {
        return "nguoiQuanTro{" + super.toString() +
                "gioiTinh='" + gioiTinh + '\'' +
                ", soThich='" + soThich + '\'' +
                ", maNV='" + maNV + '\'' +
                '}';
    }
}
