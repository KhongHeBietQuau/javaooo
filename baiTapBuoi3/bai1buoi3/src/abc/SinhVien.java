package abc;

public class SinhVien {
    String maSinhVien;
    String hoTen;
    public  void HienThi(){
        System.out.println("ten la : " + hoTen);
        System.out.println("ten la : " + maSinhVien);
}

    public SinhVien(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}