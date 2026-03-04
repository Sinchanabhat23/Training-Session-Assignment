package module4;
interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
class PaymentDemo {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        UPIPayment u = new UPIPayment();
        c.pay();
        u.pay();
    }
}