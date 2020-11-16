package bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Trung", "Ha Noi", 3300);
        Person person2 = new Customer("cuong","Ha Nam", 4234);
        person1.display();
        person2.display();
    }
}
