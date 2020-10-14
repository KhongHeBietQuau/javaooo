package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Dog a = new Dog();
        System.out.print("Nhập tên: ");
        a.InPutName(scanner.nextLine());
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
    }
}
