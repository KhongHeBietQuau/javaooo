package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array a1 = new Array();
        Array  a2 = new Array();
        a1.InputData();
        a2.InputData();
        if(a1.avg() >a2.avg())
            System.out.println("a1 > a2");
        else if(a1.avg()<a2.avg())
            System.out.println("a1 < a2 ");
        else
            System.out.println("Hi");
    }
}
