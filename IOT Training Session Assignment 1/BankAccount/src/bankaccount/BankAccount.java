package BankAccount;
public class BankAccount
{
    private int accNo;
    private double balance;
    BankAccount(int a, double b) {
        accNo = a;
        balance = b;
    }
    void deposit(double amt) {
        balance = balance + amt;
    }
    void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display() {
        System.out.println(accNo + " " + balance);
    }
}
public class main
{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1001, 5000);
        b.deposit(1000);
        b.withdraw(2000);
        b.display();
    }
}