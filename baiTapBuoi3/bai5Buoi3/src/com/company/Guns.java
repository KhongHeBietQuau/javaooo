package com.company;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public void Load(int x)
    {
        ammoNumber+=x;
    }
    public void shoot(int x)
    {
        if(ammoNumber-x>=0)
        {
            ammoNumber-=x;
        }
        else
        {
            System.out.println(weaponName + "het dan");
        }
    }

    public Guns() {
    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }
}
