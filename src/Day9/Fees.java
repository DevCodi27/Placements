package Day9;

import java.util.Scanner;

public class Fees {
    public static void doctor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of patients");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the cost");
        for (int i = 0;i<n;i++) {
          arr[i]= sc.nextInt();
        }
        sc.close();
        int sum = 0;

        for(int i : arr)
            {
                if(i<17)
                {
                    sum+=200;
                }
                else if (i>17&&i<=40) {
                    sum += 400;
                }
                else if(i>40&&i<=120)
                {
                    sum+=300;
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
        System.out.println(sum);
        }
    }

