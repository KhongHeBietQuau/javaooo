package bai2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class soPhuc {
    private float phanThuc,phanAo;
    public void nhap()
    {
        System.out.println("nhap phan thuc : ");
        Scanner sc = new Scanner(System.in);
        phanThuc = sc.nextFloat();
        System.out.println("phan ao : ");
        phanAo = sc.nextFloat();

    }

    public void setPhanThuc(float phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(float phanAo) {
        this.phanAo = phanAo;
    }

    public float getPhanThuc() {
        return phanThuc;
    }

    public float getPhanAo() {
        return phanAo;
    }

    public soPhuc() {
    }
    public soPhuc(float phanThuc, float phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public void in() {
        if(phanAo >=0)
            System.out.println(phanThuc + " + " + phanAo + "i");
        else {
            System.out.println(phanThuc + " " +phanAo + "i");
        }
    }
    public soPhuc cong(soPhuc a)
    {
        soPhuc s = new soPhuc();
        s.phanThuc = this.phanThuc + a.phanThuc;
        s.phanAo = this.phanAo + a.phanAo;
        return s;
    }
    public  soPhuc tru(soPhuc a)
    {
        soPhuc s = new soPhuc();
        s.phanThuc = this.phanThuc - a.phanThuc;
        s.phanAo = this.phanAo - a.phanAo;
        return s;
    }
}
