package Day13_Online_Class;

import java.util.Scanner;

public class NumberManipulation {
    public static void isbe() throws InvalidInputException
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            if(str.length() !=9)
            {
                throw new InvalidInputException("ISBN must be exactly 9 digits");
            }
            String add = extractDigit(str);
            str+=add;
            System.out.println(str);
        }
        catch (InvalidInputException e)
        {
            System.out.println(e);
        }


    }
    public static String extractDigit(String str)
    {
        long num = Long.parseLong(str);
        int i = 0;
        long sum = 0;
        long[] arr = new long[9];
        while (num>0)
        {
            long rem = num%10;
            arr[i]=rem;
            i++;
            num=num/10;
        }
       String ans = findLast(arr);
        return ans;
    }
    public static String findLast(long[]arr)
    {
        int sum = 0;
        for (int i = 0;i< arr.length;i++)
        {
            long mul = arr[i]*(i+1);
            sum+=mul;
        }
        if(sum%11 == 10)
        {
            return "X";
        }
        else {
            return String.valueOf(sum%11);
        }
    }
}

class InvalidInputException extends Exception{
    InvalidInputException(String message)
    {
        super(message);
    }
}
