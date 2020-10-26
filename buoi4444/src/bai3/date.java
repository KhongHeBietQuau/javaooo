package bai3;

import java.util.Scanner;

public class date {
    private  int  d,m,y;

    public date() {
        d = m = y =0;
    }

    public date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public int getM() {
        return m;
    }

    public int getY() {
        return y;
    }
    public void nhap()
    {
        System.out.println("nhap ngay : ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        System.out.println("nhap thang : ");
        m = sc.nextInt();
        System.out.println("nhap nam : ");
        y = sc.nextInt();
    }
    public void xuat()
    {
        System.out.println(d + "/" + m + "/" + y);
    }
}
