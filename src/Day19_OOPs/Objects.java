package Day19_OOPs;

import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][3];
        System.out.println("Enter id, name, salary");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<3;j++)
            {
                arr[i][j] =sc.next();
            }
        }
        int limit = sc.nextInt();
        Employee[] emp = new Employee[n];
        for(int i = 0;i<n;i++)
        {
            emp[i] = new Employee(arr[i][0],arr[i][1],arr[i][2],limit);
        }
    }
}

class Employee{
     private String id;
     private  String name;
     private  String salary;
     private  int limit;

     Employee(String id, String name,String salary,int limit)
     {
         this.id = id;
         this.name = name;
         this.salary = salary;
         this.limit = limit;
         int sal = Integer.valueOf(salary);

         if(sal<limit)
         {
             System.out.println("Id: "+id);
             System.out.println("Name: "+name);
             System.out.println("Salary: "+salary);
         }
     }


}

