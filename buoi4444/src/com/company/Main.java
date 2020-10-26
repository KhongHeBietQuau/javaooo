package com.company;

import java.util.ArrayList;

public class Main {
    public static <T> void show(T a)
    {
        System.out.println("a" + a);
    }
    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        list.add(2);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        list.remove(1);
        list.set(0,10);
        for(Integer integer : list)
        {
            System.out.println(integer + " ");
        }
    }
}
