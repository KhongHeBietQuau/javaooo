package com.company;

import java.awt.*;
import java.util.Scanner;

public class nguoiChoi extends  nguoi {
    private String gioiTinh,soThich,mucDich;

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

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public nguoiChoi() {
    }

    public nguoiChoi(String gioiTinh, String soThich, String mucDich) {
        this.gioiTinh = gioiTinh;
        this.soThich = soThich;
        this.mucDich = mucDich;
    }

    public nguoiChoi(String ten, String diaChi, int tuoi, String gioiTinh, String soThich, String mucDich) {
        super(ten, diaChi, tuoi);
        this.gioiTinh = gioiTinh;
        this.soThich = soThich;
        this.mucDich = mucDich;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("gioi tinh : ");
        gioiTinh = sc.nextLine();
        System.out.println("so thich : ");
        soThich = sc.nextLine();
        System.out.println("muc dich : ");
        mucDich = sc.nextLine();
    }

    @Override
    public String toString() {
        return "nguoiChoi{" + super.toString()+
                "gioiTinh='" + gioiTinh + '\'' +
                ", soThich='" + soThich + '\'' +
                ", mucDich='" + mucDich + '\'' +
                '}';
    }
}
