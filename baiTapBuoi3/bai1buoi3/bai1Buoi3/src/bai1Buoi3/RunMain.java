package bai1Buoi3;

public class RunMain {

    public static void main(String[] args) {
        Person DoanXinhGai = new Person(),DiepBueDe = new Person();
        DoanXinhGai.setName("toku Doan");
        DoanXinhGai.setGender("nam");
        DoanXinhGai.setDateOfBirth("chua biet");
        DoanXinhGai.setHobby("orama ora Khanh");
        DiepBueDe.setHobby("gai");
        DiepBueDe.setDateOfBirth("chua biet");
        DiepBueDe.setGender("nam");
        DiepBueDe.setName("Diep");
        System.out.println("===================================");
        System.out.println("ten : " + DoanXinhGai.getName());
        System.out.println("gioi tinh : " + DoanXinhGai.getGender());
        System.out.println("so thich : " + DoanXinhGai.getHobby());
        System.out.println("sinh nhat :" + DoanXinhGai.getDateOfBirth());
        System.out.println("ten : " + DiepBueDe.getName());
        System.out.println("gioi tinh : " + DiepBueDe.getGender());
        System.out.println("so thich : " + DiepBueDe.getHobby());
        System.out.println("sinh nhat : " + DiepBueDe.getDateOfBirth());
    }
}
