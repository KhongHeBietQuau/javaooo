package com.company;

import java.util.Scanner;

public class cauHoi {
    private String vanDe,paA,paB,paC,DA,id;
    private int doKho,diem;
    public String getVanDe() {
        return vanDe;
    }
    public void setVanDe(String vanDe) {
        this.vanDe = vanDe;
    }

    public String getPaA() {
        return paA;
    }

    public void setPaA(String paA) {
        this.paA = paA;
    }

    public String getPaB() {
        return paB;
    }

    public void setPaB(String paB) {
        this.paB = paB;
    }

    public String getPaC() {
        return paC;
    }

    public void setPaC(String paC) {
        this.paC = paC;
    }

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        this.DA = DA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDoKho() {
        return doKho;
    }

    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public cauHoi(String vanDe, String paA, String paB, String paC, String DA, String id, int doKho, int diem) {
        this.vanDe = vanDe;
        this.paA = paA;
        this.paB = paB;
        this.paC = paC;
        this.DA = DA;
        this.id = id;
        this.doKho = doKho;
        this.diem = diem;
    }

    public cauHoi() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("van de dat ra :");
        vanDe = sc.nextLine();
        System.out.println("phuong an A :");
        paA = sc.nextLine();
        System.out.println("phuong an B");
        paB = sc.nextLine();
        System.out.println("phuong an C : ");
        paC = sc.nextLine();
        System.out.println("dap an cau hoi(chi nhap A,B,C)");
        DA = sc.nextLine();
        System.out.println("do kho :");
        doKho = sc.nextInt();
        System.out.println("diem : ");
        diem = sc.nextInt();
        sc.nextLine();
        System.out.println("ma Id cau hoi ");
        id = sc.nextLine();
    }

    @Override
    public String toString() {
        return "cauHoi{" +
                "vanDe='" + vanDe + '\'' +
                ", paA='" + paA + '\'' +
                ", paB='" + paB + '\'' +
                ", paC='" + paC + '\'' +
                ", DA='" + DA + '\'' +
                ", id='" + id + '\'' +
                ", doKho=" + doKho +
                ", diem=" + diem +
                '}';
    }
    public void bieuMau()
    {
        System.out.println("CÂU HỎI : " + vanDe);
        System.out.println("Phương án A: " +paA);
        System.out.println("Phương án B: " + paB);
        System.out.println("Phương án C: " + paC);
        System.out.println("Độ Khó :" + doKho);
        System.out.println("Điểm : " + diem);
        System.out.println("ID : " + id);
    }
}
