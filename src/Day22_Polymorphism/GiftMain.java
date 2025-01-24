package Day22_Polymorphism;

import java.util.Scanner;

public class GiftMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ml = sc.nextInt();
        int bk = sc.nextInt();
        Mobile mobile = new Mobile(ml);
        Laptop laptop = new Laptop(ml);
        Bike bike = new Bike(bk);
        int ans = mobile.getAmount()+laptop.getAmount()+ bike.getAmount();
        System.out.println(ans);
    }
}

class Gift{
    private int amount;

    Gift(int amount)
    {
        this.amount =amount;
    }

    public int getAmount() {
        return amount;
    }
}
class Bike extends Gift{

    Bike(int amount) {
        super(amount);
    }

}

class Laptop extends Gift{

    Laptop(int amount) {
        super(amount);
    }
}

class Mobile extends Gift{
    Mobile(int amount)
    {
        super(amount);
    }
}
