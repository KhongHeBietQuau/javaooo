package bai1;

import java.util.Scanner;

public class sanPham {
    private String maSanPham,tenSanPham,tenHangSanXuat,ngayNgap;

    public sanPham() {
    }

    public sanPham(String maSanPham, String tenSanPham, String tenHangSanXuat, String ngayNgap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNgap = ngayNgap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public String getNgayNgap() {
        return ngayNgap;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public void setNgayNgap(String ngayNgap) {
        this.ngayNgap = ngayNgap;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma san pham :");
        maSanPham = sc.nextLine();
        System.out.println("ten san pham : ");
        tenSanPham = sc.nextLine();
        System.out.println("ten hang san xuat : ");
        tenHangSanXuat = sc.nextLine();
        System.out.println("ngay nhap : ");
        ngayNgap = sc.nextLine();
    }

    @Override
    public String toString() {
        return "sanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", ngayNgap='" + ngayNgap + '\'' +
                '}';
    }
}
