package com.company;

public class HangHoa {
    private String maHang,tenHang;
    private int donGia,soLuong;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, int donGia, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
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

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

   
    public void xuat()
    {
        System.out.println("ten hang : " + tenHang);
        System.out.println("ma hang : " + maHang);
        System.out.println("so luong : " + soLuong);
        System.out.println("don gia : " + donGia);
        System.out.println("thanh tien : " + soLuong*donGia);
    }
}
