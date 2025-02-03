package Day28_TrainingQuestions;

import java.util.Scanner;

public class NumbertoRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder s = new StringBuilder();
        String[] val = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0;i<arr.length;i++)
        {
            while (n>=arr[i])
            {
                n-=arr[i];
                s.append(val[i]);
            }
        }
        System.out.println(s);
    }
}
