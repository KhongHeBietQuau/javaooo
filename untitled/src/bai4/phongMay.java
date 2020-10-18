package bai4;

import sun.security.rsa.RSAUtil;

import java.util.Scanner;

public class phongMay {
    private String maPhong,tenPhong;
    private float dienTich;
    private quanLy x;
    private may y[];
    private int n;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma phong : ");
        maPhong = sc.nextLine();
        System.out.println("ten phong : ");
        tenPhong = sc.nextLine();
        System.out.println("dien tich : ");
        dienTich = sc.nextInt();
        x = new quanLy();
        x.nhap();
        System.out.println("nhap so luong may :");
        n = sc.nextInt();
        y = new may[n];
        for(int i=0;i<n;i++){
            y[i] = new may();
            y[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.println("ma phong : " + maPhong);
        System.out.println("ten phong " + tenPhong);
        System.out.println("dien tich " + dienTich);
        x.xuat();
        System.out.println("\t\tthong tin cua " + n + " may ");
        for(int i=0;i<n;i++)
            y[i].xuat();
    }
}
