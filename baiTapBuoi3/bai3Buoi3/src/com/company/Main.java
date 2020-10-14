package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HangHoa hang1 = new HangHoa();
        HangHoa hang2 = new HangHoa("m01","tivi",4000,3);
        hang1.setMaHang("m02");
        hang1.setTenHang("o to");
        hang1.setDonGia(5000);
        hang1.setSoLuong(8);
        System.out.println("thong tin hang hoa 1");
        hang1.xuat();
        System.out.println("thong tin hang hoa 2");
        hang2.xuat();
    }
}
