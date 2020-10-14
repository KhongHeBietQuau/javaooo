package com.company;

import com.sun.istack.internal.localization.NullLocalizable;

public class Dog {
    private String name;
    private int MP = 100;
    public void InPutName(String name)
    {
        this.name = name;
    }
    public void ShowMP()
    {
        System.out.println("MP : " + MP);

    }
    public  void Bark()
    {
        //System.out.println("ten :" + name);
        if(!name.equals("")){
            System.out.println(name + " gau gau");
            MP-=20;
        }
        else {
            System.out.println("xin nhap ten : ");
        }
    }


}
