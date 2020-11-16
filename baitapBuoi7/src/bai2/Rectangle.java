package bai2;

public class Rectangle implements Ishape{
    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (length+width ) * 2;
    }

    @Override
    public double getPerimeter() {
        return (length * width);
    }
}
