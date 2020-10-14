package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Guns a1 = new Guns("cuong",200);
        Guns a2 = new Guns("dinh",100);
      while(true)
      {
          a1.shoot(10);
          a2.shoot(10);
          if(a1.getAmmoNumber() == 0) {
              System.out.println("cuong thua ");
                      break;
          }
          if(a2.getAmmoNumber() == 0)
          {
              System.out.println("dinh thua ");
              break;
          }
      }
    }
}
