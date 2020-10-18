package bai4;

import java.util.Scanner;

public class may {
    private String maMay,kieuMay,tinhTrang;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma may : ");
        maMay = sc.nextLine();
        System.out.println("nhap kieu may : ");
        kieuMay = sc.nextLine();
        System.out.println("tinh trang : ");
        tinhTrang = sc.nextLine();
    }
    public  void xuat()
    {
        System.out.println("=================================================");
        System.out.println("ma may : " + maMay);
        System.out.println("kieu may : " + kieuMay);
        System.out.println("tinh trang : " + tinhTrang);
        System.out.println("==================================================");
    }
}
