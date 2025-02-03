package Day26_Online_Class;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentMethod creditcard = new CreditCard();
        PaymentMethod debitcard = new DebitCard();
        PaymentMethod netBanking = new NetBanking();
        double ans  = sc.nextDouble();
        creditcard.processPayment(ans);
        debitcard.processPayment(ans);
        netBanking.processPayment(ans);
    }
}

class CreditCard implements PaymentMethod{

    @Override
    public  void processPayment(double amount) {
        System.out.println("Processing credit card payment of $"+amount);
    }
}

class DebitCard implements PaymentMethod{
    @Override
    public  void processPayment(double amount) {
        System.out.println("Processing debit card payment of $"+amount);
    }
}

class NetBanking implements PaymentMethod{

    @Override
    public  void processPayment(double amount) {
        System.out.println("Processing net banking payment of $"+amount);
    }
}


