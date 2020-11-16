package bai1;

public class Employee extends Person {
    private float salary;
    @Override
    public void display() {
        System.out.println("name : " + getName());
        System.out.println("address : " + getAddress());
        System.out.println("salary : " + salary);
    }

    public Employee() {
    }

    public Employee(float salary) {
        this.salary = salary;
}
    public Employee(String name, String address, float salary) {
        super(name, address);
        this.salary = salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}
