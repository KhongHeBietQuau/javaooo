package bai2;

public class RunMian {
    public static void main(String[] args) {
        soPhuc a = new soPhuc();
        soPhuc b = new soPhuc();
        System.out.println("nhap so phuc thu 1");
        a.nhap();
        System.out.println("nhap so phuc 2 ");
        b.nhap();
        soPhuc c = new soPhuc();
        c = a.cong(b);
        System.out.print("KET QUA CONG 2 SO PHUC : ");
        c.in();
        soPhuc d = new soPhuc();
        d = a.tru(b);
        System.out.println("KET QUA SO PHUC SAU KHI TRU LA : ");
        d.in();
    }
}
