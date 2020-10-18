package bai3;

import java.util.Scanner;

public class hang {
    private String maHang;
    private String tenHang;
    private int donGia;
    public void nhap()
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap ma hang : ");
        maHang = sc.nextLine();
        System.out.println("nhap ten hang : ");
        tenHang = sc.nextLine();
        System.out.println("don gia : ");
        donGia = sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("ma hang : " + maHang + " ten hang : " + tenHang + " don gia "+ donGia);
    }

    public hang() {
    }

    public hang(String maHang, String tenHang, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getDonGia() {
        return donGia;
    }
}
