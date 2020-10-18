package bai3;

import java.util.Scanner;

public class phieu {
    private  String MaPhieu;
    private int n;
    private hang x[];
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma phieu : ");
        MaPhieu = sc.nextLine();
        System.out.println("nhap so luong ");
        n = sc.nextInt();
        x = new hang[n];
        for(int i=0;i<x.length;i++){
            x[i] = new hang();
            x[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.println("ma phieu: " + MaPhieu);
        System.out.println("so luong : "+ n);
        for(int i=0;i<x.length;i++)
            x[i].xuat();
    }

    public phieu() {
    }
}
