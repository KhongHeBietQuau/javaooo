package bai3;

import java.util.Scanner;

public class phieu {
    private String maPhieu,tenPhieu;
    private date a;
    private int n;
    private sanPham [] x;

    public phieu(String maPhieu, String tenPhieu, date a, int n, sanPham[] x) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.n = n;
        this.x = x;
    }

    public phieu() {
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public void setA(date a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setX(sanPham[] x) {
        this.x = x;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public date getA() {
        return a;
    }

    public int getN() {
        return n;
    }

    public sanPham[] getX() {
        return x;
    }
    public  void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma phieu :");
        maPhieu = sc.nextLine();
        System.out.println("ten phieu : ");
        tenPhieu = sc.nextLine();
        a = new date();
        a.nhap();
        System.out.println("nhap so luong san pham :");
        n = sc.nextInt();
        x = new sanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\t\t NHAP THONG TIN SAN PHAM THU " + (i+1));
            x[i] = new sanPham();
            x[i].nhap();
        }

    }
    public void xuat()
    {
        System.out.println("ma phieu : " + maPhieu);
        System.out.println("ten phieu: " + tenPhieu);
        a.xuat();
        System.out.println("Thong tin " + n + "san pham ");
        for(int i=0;i<n;i++) {
            System.out.println("\t\tTHONG TIN SAN PHAM THU " + (i+1));
            x[i].xuat();
        }
    }

}
