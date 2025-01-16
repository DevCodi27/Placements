package Day15_Online_Class;

import java.util.Scanner;

public class DuplicateMobileNumber  {
    public static void mno() throws DuplicateMobileNumberException
    {
        Scanner sc = new Scanner(System.in);
        String mno = sc.nextLine();
        String amno = sc.nextLine();
        String tno = sc.nextLine();
        String email = sc.nextLine();
        String address = sc.nextLine();
        try {
            if(mno.equals(amno))
            {
                throw new DuplicateMobileNumberException("Mobile number and Alternate Mobile numbers are same");
            }
            System.out.println("Mobile: "+mno);
            System.out.println("Alternate mobile: "+amno);
            System.out.println("Telephone "+tno);
            System.out.println("Email: "+email);
            System.out.println("Address: "+address);
        }catch (DuplicateMobileNumberException e)
        {
            System.out.println(e);
        }



    }
}

class DuplicateMobileNumberException extends Exception
{
    DuplicateMobileNumberException(String message)
    {
        super(message);
    }
}
