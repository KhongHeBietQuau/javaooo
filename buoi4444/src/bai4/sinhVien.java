package bai4;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class sinhVien {
    private String name,address,id;
    private int age;
    private float gpa;

    public sinhVien() {
    }

    public sinhVien(String name, String address, String id, int age, float gpa) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ten :");
        name = sc.nextLine();
        System.out.println("dia chi :");
        address = sc.nextLine();
        System.out.println("id :");
        id = sc.nextLine();
        System.out.println("nhap tuoi : ");
        age = sc.nextInt();
        System.out.println("nhap diem trung binh :");
        gpa = sc.nextFloat();
    }
    public void xuat()
    {
        System.out.println(" ten : " + name + " tuoi : " + age + "  dia chi " + address+ " id " + id +" diem trung binh " + gpa);
    }
}
