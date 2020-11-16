package bai1;

public abstract class Person {
    private String name;
    private String address;
    public abstract void display();



    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
