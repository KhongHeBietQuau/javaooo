package bai1;

public class Customer extends Person{
    private int  balance;
    @Override
    public void display() {
        System.out.println("name " + getName());
        System.out.println("address " + getAddress());
        System.out.println("balance " + balance);
    }

    public Customer() {
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
