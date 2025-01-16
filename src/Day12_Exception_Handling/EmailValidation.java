package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void validation() throws DotException,AtTheRateException,DomainException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Pattern p = Pattern.compile("[a-z]@[a-z]");
            Matcher m = p.matcher(str);
            if(m.find())
            {
                p = Pattern.compile("\\.[a-z]");
                m = p.matcher(str);
                if(m.find())
                {
                    p = Pattern.compile("\\.com$|\\.net$|\\.org$");
                    m = p.matcher(str);
                    if(m.find())
                    {
                        System.out.println(str);
                    }
                    else{
                        throw new DomainException("No legal Domain");
                    }
                }
                else {
                    throw new DotException("No Dot Present");
                }
            }
            else
            {
                throw new AtTheRateException("No legal Symbol");
            }
        }
        catch (AtTheRateException e)
        {
            System.out.println(e);
        }
        catch (DotException e){
            System.out.println(e);
        }
        catch (DomainException e)
        {
            System.out.println(e);
        }



    }
}

class DotException extends Exception {
    DotException(String message)
    {
        super(message);
    }
}

class  AtTheRateException extends Exception{
    AtTheRateException(String message)
    {
        super(message);
    }
}

class DomainException extends Exception{
    DomainException(String message)
    {
        super(message);
    }
}

