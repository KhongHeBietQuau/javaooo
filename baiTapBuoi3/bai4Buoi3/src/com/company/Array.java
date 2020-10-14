package com.company;
import java.util.Scanner;
public class Array {
    private int a [];
    private int n;
    static Scanner s = new Scanner(System.in);
    public void InputData()
    {
        System.out.println("nhap n : ");
        n = s.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("a[" +i+"] = ");
            a[i] = s.nextInt();
        }
    }
    public void show()
    {
        for(int i=0;i<n;i++)
            System.out.println(a[i] + " ");
    }
    public  double sum()
    {
        double tong =0;
        for(int i=0;i<n;i++)
            tong += a[i];
        //System.out.println("tong : "+ tong);
        return tong;
    }
    public double avg()
    {
        double tong =0;
        for(int i=0;i<n;i++)
            tong += a[i];
        return tong/n;
    }
    public Array() {
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }
}
