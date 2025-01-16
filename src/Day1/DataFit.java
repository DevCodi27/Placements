package Day1;

public class DataFit {
    public void fit(long data) throws NumberFormatException
    {
        try{
            if(data>Byte.MIN_VALUE && data<=Byte.MAX_VALUE )
            {
                System.out.println(data+" can be fitted in:");
                System.out.println("byte");
                System.out.println("short");
                System.out.println("integer");
                System.out.println("long");
            } else if (data>Short.MIN_VALUE && data<=Short.MAX_VALUE) {
                System.out.println(data+" can be fitted in:");
                System.out.println("short");
                System.out.println("integer");
                System.out.println("long");
            } else if (data>=Integer.MIN_VALUE && data<=Integer.MAX_VALUE) {
                System.out.println(data+" can be fitted in:");
                System.out.println("integer");
                System.out.println("long");
            } else if (data >Long.MIN_VALUE && data<=Long.MAX_VALUE) {
                System.out.println(data+" can be fitted in:");
                System.out.println("long");
            }
        }catch (NumberFormatException e)
        {
            System.err.println("can't fit");
        }

    }
}
