package bai2;

import java.util.Scanner;

public class date {
    private int d,m,y;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay : ");
        d = sc.nextInt();
        System.out.println("nhap thang : ");
        m = sc.nextInt();
        System.out.println("nhap nam :");
        y = sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("ngay/thang/nam : " + d + "/" + m + "/" + y);
    }

    public date() {
    }
}
