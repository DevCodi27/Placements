package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegMobile {
    public static void removalidate() throws IllegalArgumentException,NumberFormatException,NoSuchElementException
    {
        Scanner sc = new Scanner(System.in);
        String reg = sc.nextLine();
        String mno = sc.nextLine();
        boolean r = false;
        boolean m = false;
        try {
            if(reg.length()!=9)
            {
                throw new IllegalArgumentException("Register Number does not contain exactly 9");
            }
            if(mno.length() != 10)
            {
                throw new IllegalArgumentException("Mobile Number does not contain exactly 10");
            }
            if(!Pattern.matches("[0-9]{10}",mno))
            {
                throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
            }
            else {
                m = true;
            }
            if(!Pattern.matches("\\d{2}+[A-Za-z]{3}+\\d{4}+",reg))
            {
                throw  new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets in format specified");
            }
             System.out.println("Valid");

        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }




    }
}

class IllegalArgumentException extends Exception{
    IllegalArgumentException(String message)
    {
        super(message);
    }
}

class NumberFormatException extends Exception{
    NumberFormatException(String message)
    {
        super(message);
    }
}

class NoSuchElementException extends  Exception{
    NoSuchElementException(String message)
    {
        super(message);
    }
}
