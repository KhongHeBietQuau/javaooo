package bai5;

import java.util.Scanner;

public class nguoi {
    private String hoTen,ngaySinh,queQuan;

    public nguoi() {
        hoTen = ngaySinh = queQuan = "";
    }

    public nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
    public void  nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ho ten : ");
        hoTen = sc.nextLine();
        System.out.println("ngay sinh ");
        ngaySinh = sc.nextLine();
        System.out.println("que quan ");
        queQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        return "nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
