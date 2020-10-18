package bai1;

import java.util.Scanner;

public class sach {
    private String maSach,tenSach,nhaXb;
    private int soTrang;
    private float donGia;
    public void nhap()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap ma sach :");
        maSach = sc.next();
        System.out.println("nhap ten sach : ");
        tenSach = sc.next();
        System.out.println("nhap nha san xuat : ");
        nhaXb = sc.next();
        System.out.println("nhap so trang :");
        soTrang = sc.nextInt();
        System.out.println("nhap don gia : ");
        donGia = sc.nextFloat();
    }
    public void xuat()
    {
        System.out.println("ma sach : "+ maSach + " ten sach : " + tenSach + " nha san xuat : " + nhaXb + " so trang : " + soTrang +" don gia : " + donGia);
    }


}

