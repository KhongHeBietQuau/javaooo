package bai3;

import java.util.Scanner;

public class sanPham {
    private String maSanPham,tenSanPham;
    private int soLuong;
    private float donGia;

    public sanPham() {
    }

    public sanPham(String maSanPham, String tenSanPham, int soLuong, float donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }
    public  void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma san pham :");
        maSanPham = sc.nextLine();
        System.out.println("ten san pham ");
        tenSanPham = sc.nextLine();
        System.out.println("so luong :");
        soLuong = sc.nextInt();
        System.out.println("don gia : ");
        donGia = sc.nextFloat();
    }
    public void xuat()
    {
        System.out.println("ma san pham " + maSanPham);
        System.out.println("ten san pham " + tenSanPham);
        System.out.println("so luong " + soLuong);
        System.out.println("don gia : " + donGia);
        System.out.println("thanh tien : " + (donGia*soLuong));
    }
}
