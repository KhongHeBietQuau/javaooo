package com.company;

import java.util.Scanner;

public class nguoi {
    private String ten,diaChi;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public nguoi() {
    }

    public nguoi(String ten, String diaChi, int tuoi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ten : ");
        ten = sc.nextLine();
        System.out.println("tuoi : ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("dia chi : ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "nguoi{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
