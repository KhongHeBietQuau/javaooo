package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static ArrayList<sinhVien> a = new ArrayList<>();
    public static void main(String[] args) {
        int n;
        while (true)
        {
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort students by gpa.");
            System.out.println("5. Sort students by name.");
            System.out.println("6. Show students.");
            System.out.println("0. Exit.");
            System.out.println();
            System.out.println("\t\tCHON 1 thao tac ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n<0)
                System.out.println("so vua nhap khong thoa man , nhap lai");
            else if(n==0) break;
            else if (n==1) add();
            else if(n==2) edit();
            else if(n==3) delete();
            else if(n==4) sapXep1();
            else if (n==6) show();
            else if(n==5) sapXep2();
        }
    }
    public static void add()
    {
        System.out.println("ban muon them bao nhieu sinh vien");
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int cnt=1;
        for(int i=0;i<m;i++)
        {
            System.out.println("\t\tThong tin sinh vien thu : " + cnt);
            cnt++;
           sinhVien x = new sinhVien();
           x.nhap();
           a.add(x);
        }

    }
    public static void edit()
    {
        System.out.println("nhap id can chinh sua ");
        Scanner sc = new Scanner(System.in);
        String s;
        int cnt=1;
        s= sc.nextLine();
        for(int i=0;i<a.size();i++)
            if(a.get(i).getId().compareTo(s)== 0)
            {
                System.out.println("\t\tchinh sua lai thong tin cho sinh vien thu " + cnt + "co id la " + s);
                cnt++;
               sinhVien t = new sinhVien();
               t.nhap();
               a.set(i,t);
            }

    }
    public static void delete()
    {
        System.out.println("nhap id can xoa ");
        Scanner sc = new Scanner(System.in);
        String s;
        s= sc.nextLine();
        for(int i=0;i<a.size();i++)
            if(a.get(i).getId().compareTo(s)== 0)
            {
                a.remove(i);
            }

    }
    public static void sapXep1()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
            if(a.get(i).getGpa()>a.get(j).getGpa())
            {
                sinhVien tg = new sinhVien();
                tg = a.get(i);
                a.set(i,a.get(j));
                a.set(j,tg);
            }

    }
    public static void sapXep2()
    {
        for(int i=0;i<a.size();i++)
            for(int j=i+1;j<a.size();j++)
                if(a.get(i).getName().compareTo(a.get(j).getName())>=1)
                {
                    sinhVien tg = new sinhVien();
                    tg = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tg);
                }
    }
    public static void show()
    {
       for(int i=0;i<a.size();i++)
           a.get(i).xuat();
    }
}
