package bai4;

import java.util.Scanner;

public class quanLy {
    private String maQl,hoTen;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma quan li : ");
        maQl = sc.nextLine();
        System.out.println("nhap ho va ten quan li : ");
        hoTen= sc.nextLine();
    }
    public  void xuat()
    {
        System.out.println("ma quan li : " + maQl);
        System.out.println("ho va ten : " + hoTen);
    }
}
