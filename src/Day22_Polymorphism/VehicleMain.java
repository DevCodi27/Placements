package Day22_Polymorphism;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mk = sc.nextLine();
        String vh = sc.nextLine();
        Vehicle vehicle = new Vehicle();
        vehicle.move(vh);
        vehicle = new Motorbike();
        vehicle.move(mk);
    }

}

class Vehicle{
    public void move(String str)
    {
        System.out.println(str);
    }
}

class Motorbike extends Vehicle{
    @Override
    public void move(String str) {
        System.out.println(str);
    }
}
