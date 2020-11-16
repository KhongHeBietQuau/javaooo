package bai2;

public class RunMain {
    public static void main(String[] args) {
        Ishape[] a = new Ishape[3];
        a[0] = new Rectangle(3,3);
        a[1] = new Circle(3);
        a[2]  = new Rectangle(1,3);
        for(int i=0;i<3;i++)
        {
            System.out.println("chu vi : " + a[i].getArea());
            System.out.println("dien tich : " + a[i].getPerimeter());
        }
    }
}
