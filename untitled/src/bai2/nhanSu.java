package bai2;

import java.util.Scanner;

public class nhanSu {
    private String maNhanSu, hoTen;
    private date a;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien : ");
        maNhanSu = sc.nextLine();
        //sc.nextLine();
        System.out.println("nhap ho ten : ");
        hoTen = sc.nextLine();
        //sc.nextLine();
        a = new date();
        a.nhap();
    }

    public void xuat() {
        System.out.println("ma sinh vien :" + maNhanSu);
        System.out.println("ho ten : " + hoTen);
        a.xuat();
    }
    public nhanSu() {
        }
}
