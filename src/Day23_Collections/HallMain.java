package Day23_Collections;

import java.util.Scanner;

public class HallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hall[] halls = new Hall[3];
        for(int i = 0;i<n;i++)
        {
            halls[i] = new Hall();
            halls[i].setHall_name(sc.nextLine());
            halls[i].setCapacity(sc.nextLong());
            halls[i].setCost(sc.nextDouble());
            halls[i].setOwner_name(sc.nextLine());
        }
    }
}
class Hall{
    private String Hall_name;
    private long capacity;
    private double cost;
    private String owner_name;
     Hall()
     {
         this.Hall_name = null;
         this.capacity = 0;
         this.cost = 0;
         this.owner_name = null;
     }
     Hall(String Hall_name,long capacity,double cost,String owner_name)
     {
         this.Hall_name = Hall_name;
         this.capacity = capacity;
         this.cost = cost;
         this.owner_name = owner_name;
     }
    public void setHall_name(String hall_name) {
        Hall_name = hall_name;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getHall_name() {
        return Hall_name;
    }

    public long getCapacity() {
        return capacity;
    }

    public double getCost() {
        return cost;
    }

    public String getOwner_name() {
        return owner_name;
    }

    @Override
    public String toString() {
        return String.format("%s %d %f %s",Hall_name,capacity,cost,owner_name);
    }
}
