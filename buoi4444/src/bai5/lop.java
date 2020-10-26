package bai5;

import java.util.Scanner;

public class lop {
    private String maLop,tenLop,ngayMo,giaoVien;
    private sinhVien  []x ;
    private int n;

    public lop() {
        maLop = tenLop = ngayMo = giaoVien = "";
        n = 0;
        x= null;
    }

    public lop(String maLop, String tenLop, String ngayMo, String giaoVien, sinhVien[] x, int n) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.x = x;
        this.n = n;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public void setX(sinhVien[] x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public sinhVien[] getX() {
        return x;
    }

    public int getN() {
        return n;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma lop ");
        maLop = sc.nextLine();
        System.out.println("ten lop");
        tenLop = sc.nextLine();
        System.out.println("ngay mo ");
        ngayMo = sc.nextLine();
        System.out.println("so luong sinh vien ");
        n = sc.nextInt();
        x = new sinhVien[n];
        for(int i=0;i<n;i++){
            x[i] = new sinhVien();
            System.out.println("\t\tNHAP THONG TIN SINH VIEN THU  " + (i+1));
            x[i].nhap();
        }
        sc.nextLine();
        System.out.println("giao vien ");
        giaoVien = sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("ma lop " + maLop);
        System.out.println("ten lop "+tenLop);
        System.out.println("ngay mo " + ngayMo);
        System.out.println("\t\tTHONG TIN CUA " + n + "  SINH VIEN");
        for(int i=0;i<n;i++) {
            System.out.println(x[i]);
        }
        System.out.println("giao vien " + giaoVien);
    }
    public void check()
    {
        int dem =0;
        for(int i=0;i<n;i++)
            if(x[i].getKhoa() == 14)
            {
                dem+=1;
            }
        System.out.println("so sinh vien khoa 14 la : " + dem);
    }
    public void sapXep()
    {
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                if(x[i].getKhoa()>x[j].getKhoa())
                {
                   sinhVien o = new sinhVien();
                   o = x[i];
                   x[i] = x[j];
                   x[j] = o;
                }
            }
    }
}
