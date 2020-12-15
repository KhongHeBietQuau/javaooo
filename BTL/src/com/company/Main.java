package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<cauHoi> a = new ArrayList<>();
    public static void main(String[] args) {
        nguoiQuanTro nv = new nguoiQuanTro();
        nv.nhap();
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong cau hoi ban dau :");
            try {
                n = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Bạn nhập sai và tôi quy ước không có câu hỏi nào cả !");
                n=0;
            }


       for(int i=1;i<=n;i++)
       {
           cauHoi x = new cauHoi();
           x.nhap();
           a.add(x);
       }
        System.out.println("nhập thông tin người chơi");
       nguoiChoi nc =new nguoiChoi();
       nc.nhap();
       sc.nextLine();
       int m;
       while(true)
       {
           System.out.println(" 1: sắp xếp câu hỏi theo độ khó tăng dần");
           System.out.println("2: sắp xếp câu hỏi theo độ khó giảm dần");
           System.out.println("3: sắp xếp câu hỏi theo điểm tăng dần");
           System.out.println("4: sắp xếp câu hỏi theo điểm giảm dần");
           System.out.println("5 : sắp xếp câu hỏi theo tang dần của id");
           System.out.println("6 : tiến hành chơi");
           System.out.println("7: in thông tin tất cả câu hỏi");
           System.out.println("8 :in thông tin người quản tro");
           System.out.println("9 : thông tin người chơi");
           System.out.println("10 : nạp thêm n câu hỏi ");
           System.out.println("11:thoát trò chơi");
           m = sc.nextInt();
           if(m<=0 || m>=12)
               System.out.println("nhap khong hop le");
           if(m == 1) sapXep1();
           if(m== 2) sapXep2();
           if(m== 3) sapXep3();
           if(m== 4) sapXep4();
           if(m == 5) sapXep5();
           if(m == 6) tienHanh();
           if(m== 7) inFoCauHoi();
           if(m== 8) inFoNguoiQuantro(nv);
           if(m== 9) inFoNguoiChoi(nc);
           if(m==10 ) napThemCauHoi();
           if(m == 11) break;
       }
    }
    public static void sapXep1()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getDoKho() > a.get(j).getDoKho())
                {
                    cauHoi tmp = new cauHoi();
                    tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
    }
    public static void sapXep2()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getDoKho() < a.get(j).getDoKho())
                {
                    cauHoi tmp = new cauHoi();
                    tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
    }
    public static void sapXep3()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getDiem() > a.get(j).getDiem())
                {
                    cauHoi tmp = new cauHoi();
                    tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
    }
    public static void sapXep4()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getDiem() < a.get(j).getDiem())
                {
                    cauHoi tmp = new cauHoi();
                    tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
    }
    public static void sapXep5()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getId().compareTo(a.get(j).getId()) >=1)
                {
                    cauHoi tmp = new cauHoi();
                    tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
    }
    public static void tienHanh()
    {
        long tong =0;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<a.size();i++)
        {
            String ans;
            a.get(i).bieuMau();
            ans = sc.nextLine();
            if(ans.equals(a.get(i).getDA()))
                tong+= a.get(i).getDiem();
            else
                tong-=a.get(i).getDiem();
            if(tong < 0){
                System.out.println("BẠN ĐÃ THUA VỚI " + tong + " điểm");
                return;
            }
        }
        System.out.println("Bạn đã thắng với " + tong  + "điểm");
    }
    public static void inFoCauHoi()
    {
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).toString());
        }
    }
    public static void inFoNguoiQuantro(nguoiQuanTro x)
    {
        System.out.println("Thông tin người quản trò : " + x.toString());
    }
    public  static void inFoNguoiChoi(nguoiChoi y)
    {
        System.out.println("thông tin người chơi" + y.toString());
    }
    public static void napThemCauHoi()
    {
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng câu hỏi muốn thêm :");
        l = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            cauHoi x = new cauHoi();
            x.nhap();
            a.add(x);
        }
    }
}
