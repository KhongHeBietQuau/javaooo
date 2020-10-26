package bai1;

import java.util.Scanner;

public class dieuHoa extends sanPham{
    private float congSuat,giaBan;

    public dieuHoa() {
    }

    public dieuHoa(String maSanPham, String tenSanPham, String tenHangSanXuat, String ngayNgap, float congSuat, float giaBan) {
        super(maSanPham, tenSanPham, tenHangSanXuat, ngayNgap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cong suat : ");
        congSuat = sc.nextFloat();
        System.out.println("nhap gia ban : ");
        giaBan = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "dieuHoa{" +
                super.toString()+
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public float getGiaBan() {
        return giaBan;
    }
}
