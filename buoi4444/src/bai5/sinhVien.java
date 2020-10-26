package bai5;

import java.util.Scanner;

public class sinhVien extends nguoi{

    private String maSV,nganh;
    private int khoa;

    public sinhVien() {
        khoa =0;
        maSV = nganh = "";
    }

    public sinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoa) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoa = khoa;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("ma sinh vien ");
        maSV = sc.nextLine();
        System.out.println("nganh hoc ");
        nganh = sc.nextLine();
        System.out.println("khoa hoc ");
        khoa = sc.nextInt();
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                super.toString()+
                "maSV='" + maSV + '\'' +
                ", nganh='" + nganh + '\'' +
                ", khoa=" + khoa +
                '}';
    }
}
