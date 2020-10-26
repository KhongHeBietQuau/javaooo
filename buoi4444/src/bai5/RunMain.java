package bai5;

public class RunMain {
    public static void main(String[] args) {
        lop p = new lop();
        System.out.println("\t\tTHONG TIN PHIEU :");
        p.nhap();
        p.xuat();
        System.out.println("\t\tKIEM TRA SO LUONG K14");
        p.check();
        System.out.println("\t\tTHONG TIN PHIEU SAU KHI SAP XEP THE THU TU TANG DAN CUA KHOA HOC ");
        p.sapXep();
        p.xuat();
    }
}
