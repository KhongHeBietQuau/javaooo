package buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class sinhVIen {
    private String HoTen;
    private String MaSinhVien;
    private Date ngaySinh;
    public void InputInfor()
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("nhap ma sv :");
        sc.nextLine();
        ngaySinh = new Date();
        ngaySinh.Input();
    }
    public sinhVIen() {
    }
    public sinhVIen(String hoTen, String maSinhVien,Date ng) {
        HoTen = hoTen;
        MaSinhVien = maSinhVien;
        ngaySinh  = ng;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void setMaSinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }
    public void HienThi()
    {
        System.out.println(HoTen);
        System.out.println(MaSinhVien);
//        ngaySinh.HienThi();
    }
    public void HienThi(int stt)
    {
        System.out.println(HoTen);
        System.out.println(MaSinhVien);
        System.out.println(stt);
    }

    public static class date {
        private int day,month,year;
        public void nhap()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ngay : ");
            //ArrayList<String>
        }
    }
}
